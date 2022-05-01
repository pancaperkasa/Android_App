package com.example.tugas_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Jarak extends AppCompatActivity {
    private EditText editKec;
    private EditText editWaktu;
    private TextView hasilJarak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jarak);
        editKec = (EditText) findViewById(R.id.txtKec);
        editWaktu = (EditText) findViewById(R.id.txtWaktu);
        hasilJarak = (TextView) findViewById(R.id.txtHasilJarak);
    }

    public void hitungJarak(View view) {
        float i = Float.parseFloat(editKec.getText().toString());
        float j = Float.parseFloat(editWaktu.getText().toString());
        BacknJarak jr = new BacknJarak(i,j);
        hasilJarak.setText(String.format("Jaraknya Sebesar : %.2fKM", jr.getJarak()));
    }

    public void onClick(View v){
        this.finish();
    }
}