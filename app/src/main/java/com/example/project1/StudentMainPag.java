package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentMainPag extends AppCompatActivity {
    Button proBtn;
    Intent t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_main_pag);
        proBtn=(Button)findViewById(R.id.profile);

        proBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t=new Intent(StudentMainPag.this,MainActivity.class);
                startActivity(t);
            }
        });
    }
}