package com.pwpb.gojek;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class goFoodAct extends AppCompatActivity {

    TextInputEditText namaEDT;
    TextInputEditText pesanEDT;
    TextInputEditText alamatEDT;
    Button btnPesan;

    public void initUI(){
        namaEDT = findViewById(R.id.NamaEDT);
        pesanEDT = findViewById(R.id.PesananEDT);
        alamatEDT = findViewById(R.id.AlamatEDT);
        btnPesan = findViewById(R.id.btnPesan);
    }

    public void initButtonFun(){
        btnPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = namaEDT.getText().toString();
                String pesan = pesanEDT.getText().toString();
                String alamat = alamatEDT.getText().toString();
                Intent intent = new Intent(getApplicationContext(), Deliv.class);
                intent.putExtra("nama", nama);
                intent.putExtra("pesan", pesan);
                intent.putExtra("alamat", alamat);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_food);
        initUI();
        initButtonFun();
    }
}
