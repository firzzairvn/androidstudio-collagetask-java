package com.example.mobileprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    ListView LvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view2);

        LvResult = findViewById(R.id.lvResult);

        String[][] dataNegara = new String[][]{{"Indonesia", "ASIA", "indonesia"},
                {"Malaysia", "ASIA", "malaysia"},{"Singapore","ASIA","singapore"},
                {"Italia","EUROPE","italia"},{"Inggris","EUROPE","inggris"},
                {"Belanda","EUROPE","belanda"},{"Argentina","AMERICA","argentina"},
                {"Chile","AMERICA","chile"},{"Mesir","AFRICA","mesir"},
                {"Uganda","AFRICA","uganda"}};

        NegaraAdapter adapter = new NegaraAdapter(ListViewActivity.this, dataNegara);
        LvResult.setAdapter(adapter);

    }
}