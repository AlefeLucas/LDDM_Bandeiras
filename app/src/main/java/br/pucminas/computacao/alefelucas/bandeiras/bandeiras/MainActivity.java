package br.pucminas.computacao.alefelucas.bandeiras.bandeiras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Pais> paises;
    GridView gridView;
    private static CountryAdapter adapter;
    TextView selectedTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] imageIDs = {R.drawable.bra, R.drawable.soviet, R.drawable.usa, R.drawable.jap, R.drawable.spain, R.drawable.china, R.drawable.fra, R.drawable.ger, R.drawable.italy, R.drawable.ned, R.drawable.nk};

        String[] nadas = {"Nada", "Нада", "Nothing", "何も", "Nada", "沒有", "Rien", "Nichts", "Niente", "Niets", "아무것도"};

        paises = new ArrayList<>(nadas.length);
        for (int i = 0; i < nadas.length; i++) {
            paises.add(new Pais(nadas[i], imageIDs[i]));
        }


        selectedTextView = (TextView) findViewById(R.id.selectedTextView);

        gridView = (GridView) findViewById(R.id.grid);
        adapter = new CountryAdapter(getApplicationContext(), paises, selectedTextView);

        gridView.setAdapter(adapter);


    }
}
