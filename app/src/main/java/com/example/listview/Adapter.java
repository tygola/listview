package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter<inflter> implements Adapterfilmes {
    private Integer[] filmeimg;
    private String[] titulo, ano, genero, estrela;
    private LayoutInflater inflter;
    private Context context;
    private ImageView fimlmeimg;
    private TextView movieTitle, yearMovie, genresMovie, moviesRates;

    public Adapter(Integer[] filmeimg, String[] titulo, String[] ano,
                   String[] genero, String[] estrela, LayoutInflater inflater, Context context) {
        this.filmeimg = filmeimg;
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.estrela = estrela;
        this.inflter = inflater;
        this.context = context;
        LayoutInflater inflter = (LayoutInflater.from(context));
    }

    public Adapter(Integer[] filmeimg, String[] titulos, String[] ano, String[] genero, String[] estrela, MainActivity mainActivity) {
    }

    @Override
    public int getCount() {

        return titulo.length;
    }

    @Override
    public Object getItem(int position) {

        return null;
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = inflter.inflate(R.layout.listview, null);
       filmeimg = view.findViewById(R.id.filmeimg);
        titulo = view.findViewById(R.id.titulo);
        ano = view.findViewById(R.id.ano);
        genero = view.findViewById(R.id.genero);
        estrela = view.findViewById(R.id.estrela);
        fimlmeimg.setImageResource(filmeimg[position]);
        movieTitle.setText(titulo[position]);
        yearMovie.setText(ano[position]);
        genresMovie.setText(genero[position]);
        moviesRates.setText(estrela[position]);
        return view;
    }
}
