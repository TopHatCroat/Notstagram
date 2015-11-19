package com.tophatcroat.notstagram;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tinoba on 19.11.2015..
 */
public class CustomAdapterListaSlika extends ArrayAdapter<Instagram>{
    private final Context context;
    private final ArrayList<Instagram> listaSlika;
    public CustomAdapterListaSlika(Context context, ArrayList<Instagram> listaSlika){
        super(context,R.layout.listitem,listaSlika);
        this.context = context;
        this.listaSlika = listaSlika;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View customView = layoutInflater.inflate(R.layout.listitem, parent, false);

        TextView textslike = (TextView) customView.findViewById(R.id.textslike);
        ImageView slika = (ImageView)customView.findViewById(R.id.slika);
        slika.setImageBitmap(listaSlika.get(position).getSlika());
        textslike.setText(listaSlika.get(position).getText());



        return customView;
    }

}
