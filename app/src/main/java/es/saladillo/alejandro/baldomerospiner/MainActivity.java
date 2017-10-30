package es.saladillo.alejandro.baldomerospiner;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> colores = new ArrayList<>();
    private ArrayAdapter Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        Spinner spColor = (Spinner) findViewById(R.id.spColor);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, colores);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spColor.setAdapter(adaptador);
        Adapter = new ArrayAdapter<>(this, R.layout.equipo_adapter, R.id.lblAdapterEquipo,
                getEquipos());
       lv.setAdapter(mAdapter);
        lstAnswers.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

    }
    @NonNull
    private ArrayList<String> getEquipos() {
        ArrayList<String> equipos = new ArrayList<>();
        equipos.add("Real madrid");
        equipos.add("Barcelona");
        equipos.add("Valencia");
        return equipos;
    }


}
