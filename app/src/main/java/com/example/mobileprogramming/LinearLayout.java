package com.example.mobileprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LinearLayout extends AppCompatActivity {
    Button btntampilkan;
    EditText nama, alamat;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        btntampilkan = findViewById(R.id.btntampilkan);
        nama = findViewById(R.id.edtnama);
        alamat = findViewById(R.id.edtalamat);
        hasil = findViewById(R.id.txthasil);

        btntampilkan.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                hasil.setText("Hello Nama Saya " + nama.getText().toString()
                + " dan Alamat Saya di " + alamat.getText().toString());
            }
        });
    }
}