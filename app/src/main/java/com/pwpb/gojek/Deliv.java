package com.pwpb.gojek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Deliv extends AppCompatActivity {

    TextView tvNama;
    TextView tvPesan;
    TextView tvAlamat;
    Button btnCancel;

    public void initUI(){
        tvNama = findViewById(R.id.txtNama);
        tvPesan = findViewById(R.id.txtPesanan);
        tvAlamat = findViewById(R.id.txtAlamat);
        btnCancel = findViewById(R.id.cancelBtn);
    }

    public void initTxt(){
        Bundle extras = getIntent().getExtras();
        tvNama.setText("Nama = "+extras.getString("nama"));
        tvPesan.setText("Pesan = "+extras.getString("pesan"));
        tvAlamat.setText("Alamat = "+extras.getString("alamat"));
    }

    public void initBtnFun(){
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deliv);
        initUI();
        initBtnFun();
        initTxt();
    }
}
