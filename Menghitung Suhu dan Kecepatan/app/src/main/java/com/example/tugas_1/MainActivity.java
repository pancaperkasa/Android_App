package com.example.tugas_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //TUGAS KE- 1
    //NAMA : PANCA RIZKI PERKASA
    //NIM : 672019023


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.buttonGoSuhu:
                Toast.makeText(MainActivity.this, "Lets go Kimia", Toast.LENGTH_SHORT).show();
                Intent suhu = new Intent(this, Suhu.class);
                this.startActivity(suhu);
                break;

            case R.id.buttonGoKec:
                Toast.makeText(MainActivity.this, "Lets go Fisika", Toast.LENGTH_SHORT).show();
                Intent kec = new Intent(this, Jarak.class);
                this.startActivity(kec);
                break;
        }



    }




}