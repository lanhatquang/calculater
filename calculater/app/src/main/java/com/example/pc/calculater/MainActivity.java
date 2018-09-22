package com.example.pc.calculater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText m_editnumber;
    private TextView m_tvRenult;
    private Button btnNumber1;
    private Button btnNumber2;
    private Button btnNumber3;
    private Button btnNumber4;
    private Button btnNumber5;
    private Button btnNumber6;
    private Button btnNumber7;
    private Button btnNumber8;
    private Button btnNumber9;
    private Button btnNumber0;


    private Button btncong;
    private Button btntru;
    private Button btnnhan;
    private Button btnchia;


    private Button btnpoint;
    private Button btnresult;
    private Button btnclear;
    private Button btnclearall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void initwidget(){
        m_editnumber=findViewById(R.id.input);
        m_tvRenult=findViewById(R.id.te);
        btnNumber0=findViewById(R.id.so0);
        btnNumber0=findViewById(R.id.so1);
        btnNumber0=findViewById(R.id.so2);
        btnNumber0=findViewById(R.id.so3);
        btnNumber0=findViewById(R.id.so4);
        btnNumber0=findViewById(R.id.so5);
        btnNumber0=findViewById(R.id.so6);
        btnNumber0=findViewById(R.id.so7);
        btnNumber0=findViewById(R.id.so8);
        btnNumber0=findViewById(R.id.so9);

        btncong=findViewById(R.id.add);
        btntru=findViewById(R.id.sub);
        btnchia=findViewById(R.id.div);
        btnnhan=findViewById(R.id.mul);

        btnpoint=findViewById(R.id.cham);
        btnclear=findViewById(R.id.xoa1);
        btnclearall=findViewById(R.id.xoa2);
        btnresult=findViewById(R.id.same);
    }

}
