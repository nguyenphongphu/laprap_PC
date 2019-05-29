package com.example.laprap_pc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class trang2 extends AppCompatActivity {
    Button laprap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang2);
        laprap=findViewById(R.id.laprap);
        laprap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(trang2.this,LapRap.class);
                startActivity(intent);
            }
        });
    }
}
