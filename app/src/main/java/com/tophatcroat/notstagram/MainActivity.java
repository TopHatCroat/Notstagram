package com.tophatcroat.notstagram;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ListAdapter;
import android.widget.ListView;


import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView lista;
    ArrayList<Instagram> listaSlika;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaSlika = new ArrayList<>();
        Bitmap icon;
        Integer[] id = {R.drawable.bakalar, R.drawable.baklava,R.drawable.banana_split,R.drawable.caj};
        for(Integer broj:id){
            icon = BitmapFactory.decodeResource(this.getResources(),
                    broj);
            listaSlika.add(new Instagram("text broj "+broj,icon));
        }


        lista = (ListView) findViewById(R.id.lista);
        ListAdapter customAdapter = new CustomAdapterListaSlika(this, listaSlika);
        lista.setAdapter(customAdapter);

    }
}
