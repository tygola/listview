package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Integer[] moviesImages = new Integer[]{
            R.drawable.ameri,R.drawable.bb,
            R.drawable.black,R.drawable.boys,
            R.drawable.dark,R.drawable.dracula,R.drawable.freud,
            R.drawable.grimm,R.drawable.last,R.drawable.lu,R.drawable.mr,R.drawable.peaky,R.drawable.s15,R.drawable.slee,R.drawable.sons,R.drawable.titans,R.drawable.viks,R.drawable.vinci,R.drawable.wi};
    private String[] titulos = new String[]{
            "american gods","breaking bad","black list",
            "the boys","dark","drucula","freud","grimm","the last kingdom","lucifer","mr.robot","peaky blinders","supernatural","sleepy hollow","sons of anarchy","titans","vikings","da vinci demons","the witcher"};
    private String[] ano = new String[]{
            "2017","2008","2013","2019","2017","2020","2020","2013","2015","2016","2015","2013","2005","2013","2008","2018","2013","2013","2019"};
    private String[] genero = new String[]{
            "Drama","Drama","Drama","Drama","Drama","Terror","Suspense","Terror","Historia","Misterio","Drama","Drama","Terror","Terror","Drama","Drama","Drama","Drama","drama"};
    private String[] estrela = new String[]{
            "9,3","9,2","9,0","8,9","8,8","8,8","8,8","8,1","-,-"};
    private Object Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("lista de filme");
        View listView = findViewById(R.id.listView);
        Adapter movieListAdapter = new Adapter(
                moviesImages,titulos,ano,genero,estrela,this);
        listView.setX((Float) Adapter);
    }
}
