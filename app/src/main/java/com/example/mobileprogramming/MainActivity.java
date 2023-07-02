package com.example.mobileprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button linear,relative,login,view,negara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linear = findViewById(R.id.btnLinear);
        relative = findViewById(R.id.btnRelative);
        login = findViewById(R.id.btnLogin);
        view = findViewById(R.id.btnView);
//        negara = findViewById(R.id.btnNegara);
        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linearlayout = new Intent(MainActivity.this,LinearLayout.class);
                startActivity(linearlayout);
            }
        });
        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent relativelayout = new Intent(MainActivity.this, RelativeLayout.class);
                startActivity(relativelayout);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menulogin = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(menulogin);
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewData = new Intent(MainActivity.this, ListDataActivity.class);
                startActivity(viewData  );
            }
        });
//        negara.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent menuNegara = new Intent(MainActivity.this, NegaraAdapter.class);
//                startActivity(menuNegara);
//            }
//        });
    }
}