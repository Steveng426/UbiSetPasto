package com.example.ubisetp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class CambioContraActivity extends AppCompatActivity {
    private EditText CeditTextEmail;
    private Button CBtnReset;
    private String email;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambio_contra);

        firebaseAuth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);
        CeditTextEmail = (EditText) findViewById(R.id.editTextEmail);
        CBtnReset = (Button) findViewById(R.id.btnCambio);

        CBtnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email=CeditTextEmail.getText().toString();

                if (!email.isEmpty()){
                    progressDialog.setMessage("Espere un momento");
                    progressDialog.setCanceledOnTouchOutside(false);
                    progressDialog.show();
                    resetPassword();
                }else {
                    Toast.makeText(CambioContraActivity.this, "Debe ingresar su correo electronico",Toast.LENGTH_SHORT).show();
                }

            }

            private void resetPassword() {
                firebaseAuth.setLanguageCode("es");
                firebaseAuth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(CambioContraActivity.this, "Se ha enviado la solicitud de restablecimiento de contraseñña a su correo electronico", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(CambioContraActivity.this, "No se pudo enviar el correo de restablecimiento de contrasea", Toast.LENGTH_SHORT).show();
                        }
                        progressDialog.dismiss();
                    }
                });
            }
        });
    }
}
