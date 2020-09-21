package com.example.ubisetp;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapaRutaActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Marker marcador;
    private Button mTypeButton, mTypeButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_mapa_ruta);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        mTypeButton = findViewById(R.id.Idbtnmapasatelite);
        mTypeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
            }
        });
        mTypeButton = findViewById(R.id.IdbtnmapaHibri);
        mTypeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
        mMap.getUiSettings().setIndoorLevelPickerEnabled(true);
        mMap.getUiSettings().setZoomGesturesEnabled(true);
        marcadores(googleMap);


    }
    public void marcadores(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng pasto = new LatLng(1.2146286, -77.2782516);

        LatLng briseño = new LatLng(1.239770, -77.306443);
        LatLng villa  = new LatLng(1.235285, -77.3006193);
        LatLng colegio  = new LatLng(1.23316,-77.29762);
        LatLng udenar  = new LatLng(1.23086,-77.29354);
        LatLng cope  = new LatLng(1.22933,-77.29028);
        LatLng vmaria  = new LatLng(1.22852,-77.28885);
        LatLng dorado  = new LatLng(1.2264868,-77.2868794);
        LatLng pana16  = new LatLng(1.2238911,-77.2861112);
        LatLng nogales  = new LatLng(1.2216336,-77.2869373);
        LatLng LosExagonos  = new LatLng(1.218921,-77.2884911);
        LatLng Unicentro  = new LatLng(1.2169878,-77.2896245);
        LatLng LaCastellana  = new LatLng(1.21624,-77.29011);
        LatLng LiceoUDENAR  = new LatLng(1.21435,-77.2918);
        LatLng SanDiego  = new LatLng(1.2134515,-77.2945146);
        LatLng Rosales  = new LatLng(1.21277,-77.29741);
        LatLng RosalesIII  = new LatLng(1.2119318,-77.2991654);
        LatLng VirgendeAnganoy  = new LatLng(1.20702,-77.29935);
        LatLng BienestarSocial  = new LatLng(1.2050409,-77.2950926);
        LatLng Calle6SurCarrera25  = new LatLng(1.205049,-77.2934628);
        LatLng Calle6SurTamasagra  = new LatLng(1.2028978,-77.2918283);
        LatLng TamasagraIIManzana1  = new LatLng(1.2014485,-77.2900164);
        LatLng SumatamboCalle4  = new LatLng(1.203148,-77.2879358);
        LatLng Calle4SurCarrera22A  = new LatLng(1.2040484,-77.2867908);
        LatLng Calle1ASur  = new LatLng(1.2002764,-77.2861233);
        LatLng Calle1SurCarrera13  = new LatLng(1.1985725,-77.2860288);
        LatLng JardínesdelasMercedes  = new LatLng(1.1972087,-77.2856928);
        LatLng Granada  = new LatLng(1.1982575,-77.2842206);
        LatLng Carrera13Calle6A  = new LatLng(1.1994437,-77.2815886);
        LatLng InstituciónEducativaLibertad  = new LatLng(1.200927,-77.2801217);
        LatLng EstadioLibertad  = new LatLng(1.1977481,-77.2788427);
        LatLng ChapalCarrera6  = new LatLng(1.1959341,-77.2789893);
        LatLng ChapalCarrera4  = new LatLng(1.193251,-77.2792946);
        LatLng Carrera4Calle12A = new LatLng (1.1927523, -77.2778964);
        LatLng Carrera4Calle12E = new LatLng (1.192753, -77.277897);
        LatLng Carrera4Calle12C = new LatLng (1.1934523, -77.2738964);
        LatLng ColegioCiudaddePasto = new LatLng (1.193194, -77.270333);
        LatLng CAICCP = new LatLng (1.194303, -77.269211);
        LatLng PuertasdelSol = new LatLng (1.194236, -77.267281);
        LatLng Carrera2EDiagonal16D = new LatLng (1.194358, -77.266225);
        LatLng Carrera2ECalle16 = new LatLng (1.196125, -77.265381);
        LatLng Calle17ACarrera2E = new LatLng (1.196653, -77.265167);
        LatLng Carrera6ECalle17 = new LatLng (1.196058, -77.263297);
        LatLng SanJuandelosPastos = new LatLng (1.198328, -77.262314);
        LatLng VillaFlorIICarrera5E = new LatLng (1.20122,-77.25896);
        LatLng Calle21BCarrera5E = new LatLng (1.20256,-77.25873);
        LatLng VillaFlorIIManzana12 = new LatLng (1.203289, -77.255853);
        LatLng VillaFlorIIManzana10 = new LatLng (1.201444, -77.255969);
        LatLng VillaFlorIICarrera9E = new LatLng (1.20166,-77.25534);
        LatLng SantaMonica = new LatLng (1.202997, -77.257058);
        LatLng Caicedonia = new LatLng (1.205269, -77.257644);
        LatLng NuevaSantaMonica = new LatLng (1.204936, -77.254922);
        LatLng SantaCatalina = new LatLng (1.20581,-77.25724);
        LatLng Unico = new LatLng (1.205458, -77.260458);
        LatLng ParquedeBaviera = new LatLng (1.20613,-77.26326);
        LatLng VillaAdrianaMaria = new LatLng (1.207467, -77.260461);
        LatLng Gualcala = new LatLng (1.208033, -77.260436);
        LatLng LaCarolinaCalle24 = new LatLng (1.210356, -77.261078);
        LatLng VillaRecreo = new LatLng (1.210697, -77.263778);
        LatLng Ancianato = new LatLng (	1.213367, -77.263842);
        LatLng CarlosPizarro = new LatLng (1.216422, -77.266128);
        LatLng SanDiegoNorte	= new LatLng (1.217164, -77.266281);
        LatLng VillaColombia = new LatLng (1.219850, -77.265672);
        LatLng Altavista = new LatLng (1.219522, -77.267336);
        LatLng Alcazares = new LatLng (	1.216514, -77.268761);
        LatLng Corporacion = new LatLng (1.212108, -77.272303);
        LatLng ParquedelosPeriodistas	 = new LatLng (1.210747, -77.274033);
        LatLng Carrera22AvSantander = new LatLng (	1.213447, -77.274856);
        LatLng Calle20Carrera22 = new LatLng (1.213031, -77.276133);
        LatLng CristoRey = new LatLng (	1.214908, -77.276772);
        LatLng PoliciaCalle20 = new LatLng (1.217081, -77.277708);
        LatLng Calle20Carrera28 = new LatLng (1.218247, -77.278358);
        LatLng LasCuadrasCalle20Cra31B = new LatLng (1.221200, -77.279681);
        LatLng AvLosEstudiantesCarrera32 = new LatLng (1.222558, -77.280311);
        LatLng cedenar = new LatLng (1.2265,-77.28216);
        LatLng AvLosEstudiantesCastilla = new LatLng (1.227044, -77.282622);
        LatLng Morasurco = new LatLng (1.231464, -77.284242);
        LatLng Manaca = new LatLng (1.228653, -77.286306);
        LatLng ValledeAtriz = new LatLng (1.227461, -77.286308);
        LatLng VilladelParque = new LatLng (1.227664, -77.287656);
        LatLng VillaMaria = new LatLng (1.228586, -77.288592);
        LatLng UniversidadCooperativa	 = new LatLng (1.229753, -77.290317);
        LatLng UDENARTorobajo = new LatLng (1.231519, -77.293533);
        LatLng ColegioSeminario = new LatLng (	1.233592, -77.297997);
        LatLng VillaCampestre = new LatLng (	1.235278, -77.301081);
        LatLng  Briceño	= new LatLng (1.240331, -77.306908);


        mMap.addMarker(new MarkerOptions().position(pasto).title("Pasto-Nariño"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(pasto, 14));

        mMap.addMarker(new MarkerOptions().position(briseño).title("Briseño"));
        mMap.addMarker(new MarkerOptions().position(villa).title("Villa Campestre"));
        mMap.addMarker(new MarkerOptions().position(colegio).title("Colegio Seminario"));
        mMap.addMarker(new MarkerOptions().position(udenar).title("Universidad de Nariño sede Toro Bajo"));
        mMap.addMarker(new MarkerOptions().position(cope).title("Universidad Cooperativa"));
        mMap.addMarker(new MarkerOptions().position(vmaria).title("Villa María"));
        mMap.addMarker(new MarkerOptions().position(dorado).title("El Dorado"));
        mMap.addMarker(new MarkerOptions().position(pana16).title("Panamericana Calle 16"));
        mMap.addMarker(new MarkerOptions().position(nogales).title("Los Nogales"));
        mMap.addMarker(new MarkerOptions().position(LosExagonos).title("Los Exagonos"));
        mMap.addMarker(new MarkerOptions().position(Unicentro).title("Unicentro"));
        mMap.addMarker(new MarkerOptions().position(LaCastellana).title("La Castellana"));
        mMap.addMarker(new MarkerOptions().position(LiceoUDENAR).title("Liceo UDENAR"));
        mMap.addMarker(new MarkerOptions().position(SanDiego).title("San Diego"));
        mMap.addMarker(new MarkerOptions().position(Rosales).title("Rosales"));
        mMap.addMarker(new MarkerOptions().position(RosalesIII).title("Rosales III"));
        mMap.addMarker(new MarkerOptions().position(VirgendeAnganoy).title("Vírgen de Anganoy"));
        mMap.addMarker(new MarkerOptions().position(BienestarSocial).title("Bienestar Social"));
        mMap.addMarker(new MarkerOptions().position(Calle6SurCarrera25).title("Calle 6 Sur Carrera 25"));
        mMap.addMarker(new MarkerOptions().position(Calle6SurTamasagra).title("Calle 6 Sur Tamasagra"));
        mMap.addMarker(new MarkerOptions().position(TamasagraIIManzana1).title("Tamasagra II Manzana 1"));
        mMap.addMarker(new MarkerOptions().position(SumatamboCalle4).title("Sumatambo Calle 4"));
        mMap.addMarker(new MarkerOptions().position(Calle4SurCarrera22A).title("Calle 4 Sur Carrera 22A"));
        mMap.addMarker(new MarkerOptions().position(Calle1ASur).title("Calle 1A Sur"));
        mMap.addMarker(new MarkerOptions().position(Calle1SurCarrera13).title("Calle 1 Sur Carrera 13"));
        mMap.addMarker(new MarkerOptions().position(JardínesdelasMercedes).title("Jardínes de las Mercedes"));
        mMap.addMarker(new MarkerOptions().position(Granada).title("Granada"));
        mMap.addMarker(new MarkerOptions().position(Carrera13Calle6A).title("Carrera 13 Calle 6A"));
        mMap.addMarker(new MarkerOptions().position(InstituciónEducativaLibertad).title("Institución Educativa Libertad"));
        mMap.addMarker(new MarkerOptions().position(EstadioLibertad).title("Estadio Libertad"));
        mMap.addMarker(new MarkerOptions().position(ChapalCarrera6).title("Chapal Carrera 6"));
        mMap.addMarker(new MarkerOptions().position(ChapalCarrera4).title("Chapal Carrera 4"));
        mMap.addMarker(new MarkerOptions().position(Carrera4Calle12A).title("Carrera 4 Calle 12A"));
        mMap.addMarker(new MarkerOptions().position(Carrera4Calle12E).title("Carrera 4 Calle 12E"));
        mMap.addMarker(new MarkerOptions().position(Carrera4Calle12C).title("Carrera 4 Calle 12C"));
        mMap.addMarker(new MarkerOptions().position(ColegioCiudaddePasto).title("Colegio Ciudad de Pasto"));
        mMap.addMarker(new MarkerOptions().position(CAICCP).title("CAI CCP"));
        mMap.addMarker(new MarkerOptions().position(PuertasdelSol).title("Puertas del Sol"));
        mMap.addMarker(new MarkerOptions().position(Carrera2EDiagonal16D).title("Carrera 2 Este Diagonal 16D"));
        mMap.addMarker(new MarkerOptions().position(Carrera2ECalle16).title("Carrera 2 Este Calle 16"));
        mMap.addMarker(new MarkerOptions().position(Calle17ACarrera2E).title("Calle 17A Carrera 2 Este"));
        mMap.addMarker(new MarkerOptions().position(Carrera6ECalle17).title("Carrera 6E Calle 17"));
        mMap.addMarker(new MarkerOptions().position(SanJuandelosPastos).title("San Juan de los Pastos"));
        mMap.addMarker(new MarkerOptions().position(VillaFlorIICarrera5E).title("Villa Flor II Carrera 5E"));
        mMap.addMarker(new MarkerOptions().position(Calle21BCarrera5E).title("Calle 21B Carrera 5E"));
        mMap.addMarker(new MarkerOptions().position(VillaFlorIIManzana12).title("Villa Flor II Manzana 12"));
        mMap.addMarker(new MarkerOptions().position(VillaFlorIIManzana10).title("Villa Flor II Manzana 10"));
        mMap.addMarker(new MarkerOptions().position(VillaFlorIICarrera9E).title("Villa Flor II Carrera 9E"));
        mMap.addMarker(new MarkerOptions().position(SantaMonica).title("Santa Mónica"));
        mMap.addMarker(new MarkerOptions().position(Caicedonia).title("Caicedonia"));
        mMap.addMarker(new MarkerOptions().position(NuevaSantaMonica).title("Nuevo Santa Mónica"));
        mMap.addMarker(new MarkerOptions().position(SantaCatalina).title("Santa Catalina"));
        mMap.addMarker(new MarkerOptions().position(Unico).title("Unico"));
        mMap.addMarker(new MarkerOptions().position(ParquedeBaviera).title("Parque de Baviera"));
        mMap.addMarker(new MarkerOptions().position(VillaAdrianaMaria).title("Villa Adriana María"));
        mMap.addMarker(new MarkerOptions().position(Gualcala).title("Gualcalá"));
        mMap.addMarker(new MarkerOptions().position(LaCarolinaCalle24).title("La Carolina Calle 24"));
        mMap.addMarker(new MarkerOptions().position(VillaRecreo).title("Villa Recreo"));
        mMap.addMarker(new MarkerOptions().position(Ancianato).title("Ancianato"));
        mMap.addMarker(new MarkerOptions().position(CarlosPizarro).title("Carlos Pizarro"));
        mMap.addMarker(new MarkerOptions().position(SanDiegoNorte).title("San Diego Norte"));
        mMap.addMarker(new MarkerOptions().position(VillaColombia).title("Villa Colombia"));
        mMap.addMarker(new MarkerOptions().position(Altavista).title("Altavista"));
        mMap.addMarker(new MarkerOptions().position(Alcazares).title("Alcázares"));
        mMap.addMarker(new MarkerOptions().position(Corporacion).title("Corporación"));
        mMap.addMarker(new MarkerOptions().position(ParquedelosPeriodistas).title("Parque de los Periodistas"));
        mMap.addMarker(new MarkerOptions().position(Carrera22AvSantander).title("Carrera 22 Av. Santander"));
        mMap.addMarker(new MarkerOptions().position(Calle20Carrera22).title("Calle 20 Carrera 22"));
        mMap.addMarker(new MarkerOptions().position(CristoRey).title("Cristo Rey"));
        mMap.addMarker(new MarkerOptions().position(PoliciaCalle20).title("Policía Calle 20"));
        mMap.addMarker(new MarkerOptions().position(Calle20Carrera28).title("Calle 20 Carrera 28"));
        mMap.addMarker(new MarkerOptions().position(LasCuadrasCalle20Cra31B).title("Las Cuadras Calle 20 Cra 31B"));
        mMap.addMarker(new MarkerOptions().position(AvLosEstudiantesCarrera32).title("Av. Los Estudiantes Carrera 32"));
        mMap.addMarker(new MarkerOptions().position(cedenar).title("CEDENAR"));
        mMap.addMarker(new MarkerOptions().position(AvLosEstudiantesCastilla).title("Av. Los Estudiantes - Castilla"));
        mMap.addMarker(new MarkerOptions().position(Morasurco).title("Morasurco"));
        mMap.addMarker(new MarkerOptions().position(Manaca).title("Manacá"));
        mMap.addMarker(new MarkerOptions().position(ValledeAtriz).title("Valle de Atríz"));
        mMap.addMarker(new MarkerOptions().position(VilladelParque).title("Villa del Parque"));
        mMap.addMarker(new MarkerOptions().position(VillaMaria).title("Villa María"));
        mMap.addMarker(new MarkerOptions().position(UniversidadCooperativa).title("Universidad Cooperativa"));
        mMap.addMarker(new MarkerOptions().position(UDENARTorobajo).title("UDENAR Torobajo"));
        mMap.addMarker(new MarkerOptions().position(ColegioSeminario).title("Colegio Seminario"));
        mMap.addMarker(new MarkerOptions().position(VillaCampestre).title("Villa Campestre"));
        mMap.addMarker(new MarkerOptions().position(Briceño).title("Briceño"));
    }
}
