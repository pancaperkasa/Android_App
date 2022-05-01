package com.example.menghitungnilaimahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ednama, edevaluasi1, edevaluasi2, edevaluasi3, edhadir, edakhir, edhuruf;
    Button bthitung;
    Double vevaluasi1, vevaluasi2, vevaluasi3, vhadir, vakhir;
    String vnama, vhuruf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ednama = (EditText)findViewById(R.id.ednama);
        edevaluasi1 = (EditText)findViewById(R.id.edevaluasi1);
        edevaluasi2 = (EditText)findViewById(R.id.edevaluasi2);
        edevaluasi3 = (EditText)findViewById(R.id.edevaluasi3);
        edhadir = (EditText)findViewById(R.id.edhadir);
        edakhir = (EditText)findViewById(R.id.edakhir);
        edhuruf = (EditText)findViewById(R.id.edhuruf);
        bthitung = (Button)findViewById(R.id.bthitung);



    }

    public void hitung(View view) {
        vevaluasi1 = Double.parseDouble(edevaluasi1.getText().toString());
        vevaluasi2 = Double.parseDouble(edevaluasi2.getText().toString());
        vevaluasi3 = Double.parseDouble(edevaluasi3.getText().toString());
        vhadir = Double.parseDouble(edhadir.getText().toString());

        vakhir = (0.15 * vhadir) + (0.25 * vevaluasi1) + (0.25 * vevaluasi2) + (0.35 * vevaluasi3);

        if(vakhir >=90 && vakhir <=100){
            vhuruf = "A";
        }
        else if(vakhir >=80 && vakhir <=89){
            vhuruf = "B";
        }
        else if(vakhir >=70 && vakhir <=79){
            vhuruf = "C";
        }
        else if(vakhir >=60 && vakhir <=69){
            vhuruf = "D";
        }
        else{
            vhuruf = "E";
        }

        edakhir.setText(""+vakhir);
        edhuruf.setText(""+vhuruf);
    }
}