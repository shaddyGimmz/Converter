package com.example.carol.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView converter,mill,inch;
    EditText millText,inchText;
    Button convertBtn,exitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        converter = (TextView) findViewById(R.id.converter);
        mill = findViewById(R.id.mill);
        inch = findViewById(R.id.inch);
        millText = findViewById(R.id.millText);
        inchText = findViewById(R.id.inchText);
        convertBtn = findViewById(R.id.convertBtn);
        exitBtn = findViewById(R.id.exitBtn);

        convertBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                double millValue = Double.parseDouble(millText.getText().toString());
                double inchResult = millValue/25.4;
                inchText.setText(""+inchResult);
            }
        });

        exitBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                finish();
                System.exit(0);
            }

        });
    }


}
