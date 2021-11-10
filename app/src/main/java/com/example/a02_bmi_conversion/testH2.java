package com.example.a02_bmi_conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class testH2 extends AppCompatActivity {

    EditText h;
    EditText w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_h2);

        h = (EditText)findViewById(R.id.EditText1);
        w = (EditText)findViewById(R.id.EditText2);
        Button submit = (Button)findViewById(R.id.button4);


        submit.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {

                if ( !("".equals(h.getText().toString())
                        || "".equals(w.getText().toString())) )
                {
                    float fh = Float.parseFloat(h.getEditableText().toString());
                    float fw = Float.parseFloat(w.getEditableText().toString());
                    float fresult;
                    TextView result = (TextView)findViewById(R.id.TextView3);
                    fh = fh/100;
                    fh = fh*fh;

                    NumberFormat nf = NumberFormat.getInstance();
                    nf.setMaximumFractionDigits(2);
                    fresult = fw/fh;
                    result.setText("BMI:"+nf.format(fw/fh) );

                }
            }
        });
    }
}