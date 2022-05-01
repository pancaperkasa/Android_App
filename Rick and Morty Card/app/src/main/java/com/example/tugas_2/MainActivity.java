package com.example.tugas_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    EditText etNomor;
    TextView tvResult;
    private final String url = "https://rickandmortyapi.com/api/character/";

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNomor = findViewById(R.id.etNomor);
        tvResult = findViewById(R.id.tvResult);
        imageView = findViewById(R.id.imageView);

        //TUGAS 2
        //PEMROGRAMAN APLIKASI MOBILE
        //NAMA : PANCA RIZKI PERKASA
        //NIM : 672019023

    }

    public void getNomorDetails(View view) {
        String tempUrl = "";
        String nomor = etNomor.getText().toString().trim();
        if(nomor.equals("")){
            tvResult.setText("Tidak Boleh Kosong");
        }else{
            tempUrl = url + nomor;

            StringRequest stringRequest = new StringRequest(Request.Method.GET, tempUrl, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
//                    Log.d("response", response);
                    String output = "";
                    try {
                        JSONObject jsonresponse = new JSONObject(response);

                        //langsung dalam object JSON
                        String name = jsonresponse.getString("name");
                        String status = jsonresponse.getString("status");
                        String species = jsonresponse.getString("species");
                        String gender = jsonresponse.getString("gender");

                        //dibungkus object lagi
                        JSONObject jsonObjectOrigin = jsonresponse.getJSONObject("origin");
                        String asal = jsonObjectOrigin.getString("name");

                        String image = jsonresponse.getString("image");

                        loadImage(image);

                        output = "Nama Karakter = " + name
                                + "\nStatus Karakter = " + status
                                + "\nSpesies Karakter = " + species
                                + "\nGender Karakter = " + gender
                                + "\nAsal Karakter = " + asal;


                        tvResult.setText(output);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }


                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(getApplicationContext(), error.toString(), Toast.LENGTH_SHORT).show();

                }
            });
            RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
            requestQueue.add(stringRequest);

        }
    }

    private void loadImage(String image) {
        Glide.with(MainActivity.this)
                .load(image)
                .centerCrop()
                .into(imageView);

    }
}