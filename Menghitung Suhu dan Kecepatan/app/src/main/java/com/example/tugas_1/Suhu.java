package com.example.tugas_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Suhu extends AppCompatActivity {
    private EditText editSuhu;
    private TextView hasilSuhu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suhu);
        editSuhu = (EditText) findViewById(R.id.txtSuhu);
        hasilSuhu = (TextView) findViewById(R.id.txtHasilSuhu);
    }

    public void hitungSuhu(View view){
        float f = Float.parseFloat(editSuhu.getText().toString());
        BacknSuhu sh = new BacknSuhu(f);
        hasilSuhu.setText(String.format("Suhu dalam Kelvin : %.2fK\nSuhu dalam Farenheit %.2fF\nSuhu dalam Reamur %.2fR", sh.getKelvin(), sh.getFarenheit(), sh.getReamur() ));
    }

    public void onClick(View v){
        this.finish();
    }
}