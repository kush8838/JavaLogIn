package com.example.shree.loginappj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         final Button btnRes=findViewById(R.id.BtnOk);
         final EditText Uname=findViewById(R.id.etUsername);
         final EditText pass=findViewById(R.id.editText2);
         final TextView txt=findViewById(R.id.textView);


        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=Uname.getText().toString();
                String pswd=pass.getText().toString();
                if(user.equals(pswd))
                    txt.setText("Success");
                else
                    txt.setText("fail");
            }
        });
    }
}
