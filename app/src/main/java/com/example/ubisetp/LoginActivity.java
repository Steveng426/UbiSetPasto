package com.example.ubisetp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    private FirebaseAuth firebaseAuth;
    private EditText email;
    private EditText password;
    private Button registrar;
    private Button iniciar;
    private ProgressDialog progressDialog;
    private TextView olvidoContrasña;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //inicializar el objeto de firevase
        firebaseAuth = FirebaseAuth.getInstance();
        // referenciar los view
        email=(EditText) findViewById(R.id.TxtEmail);
        password=(EditText)findViewById(R.id.TxtPassword);

        registrar=(Button)findViewById(R.id.BtnRegistrar);
        iniciar=(Button)findViewById(R.id.BtnInicio);
        olvidoContrasña=(TextView) findViewById(R.id.TxtOlvidar);

        progressDialog= new ProgressDialog(this);

        registrar.setOnClickListener((View.OnClickListener) this);
        iniciar.setOnClickListener((View.OnClickListener) this);

        olvidoContrasña.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,CambioContraActivity.class));
            }
        });
    }

    public void registrarConductor(){
        //obtener datos de las cajas de texto
        String email2 = email.getText().toString().trim();
        String password2 = password.getText().toString().trim();

        //verificacion si las cajas de texto no estan vacias
        if (TextUtils.isEmpty(email2)){
            Toast.makeText(this,"Ingrese su correo electronico",Toast.LENGTH_LONG).show();
            return;
        }

        if (TextUtils.isEmpty(password2)){
            Toast.makeText(this,"Ingrese su contraseña",Toast.LENGTH_LONG).show();
            return;
        }

        progressDialog.setMessage("Relizando registro en linea...");
        progressDialog.show();

        //crear usuario
        firebaseAuth.createUserWithEmailAndPassword(email2,password2).
                addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                          Toast.makeText(LoginActivity.this,"Se ha registrado el usuario: " + email.getText(), Toast.LENGTH_LONG).show();
                        }else {
                            if (task.getException() instanceof FirebaseAuthUserCollisionException){
                                Toast.makeText(LoginActivity.this,"El correo electronico que ingreso ya existe", Toast.LENGTH_LONG).show();
                            }else {
                                Toast.makeText(LoginActivity.this,"No se pudo registrar el usuario", Toast.LENGTH_LONG).show();
                            }
                        }
                        progressDialog.dismiss();
                    }
                });
    }

    private void iniciarSesion() {
        //obtener datos de las cajas de texto
        final String email2 = email.getText().toString().trim();
        String password2 = password.getText().toString().trim();

        //verificacion si las cajas de texto no estan vacias
        if (TextUtils.isEmpty(email2)){
            Toast.makeText(this,"Ingrese su correo electronico",Toast.LENGTH_LONG).show();
            return;
        }

        if (TextUtils.isEmpty(password2)){
            Toast.makeText(this,"Ingrese su contraseña",Toast.LENGTH_LONG).show();
            return;
        }

        progressDialog.setMessage("Iniciando Sesion...");
        progressDialog.show();

        //login usuario
        firebaseAuth.signInWithEmailAndPassword(email2,password2).
                addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            int pos = email2.indexOf("@");
                            String user =email2.substring(0,pos);
                            Toast.makeText(LoginActivity.this,"BIENVENIDO " + email.getText(), Toast.LENGTH_LONG).show();
                            //mensaje de bienvenida de usuario
                            Intent intencion = new Intent(getApplicationContext(),ConductorActivity.class);
                            intencion.putExtra(ConductorActivity.user,user);
                            startActivity(intencion);
                    }else {
                                Toast.makeText(LoginActivity.this,"Verifique sus datos", Toast.LENGTH_LONG).show();
                            }
                        progressDialog.dismiss();
                    }
                });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.BtnRegistrar:
                registrarConductor();
                break;
            case R.id.BtnInicio:
                iniciarSesion();
        }
    }


}
