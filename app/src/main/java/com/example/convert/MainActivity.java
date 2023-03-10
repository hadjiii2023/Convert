package com.example.convert;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
     EditText edittext1;
     Button buttonSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }

    public void addListenerOnButton() {
        edittext1 = findViewById(R.id.editText1);
        RadioButton rb1 = findViewById(R.id.radio1);
        RadioButton rb2 = findViewById(R.id.radio2);
        buttonSum = (Button) findViewById(R.id.button);

        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=edittext1.getText().toString();
                int a=Integer.parseInt(value1);
                double sum = 0;
                if (rb1.isChecked()) {
                     sum=a*0.30;
                }
                else if (rb2.isChecked()) {
                     sum=a* 3.33;
                }
                Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });
    }
}