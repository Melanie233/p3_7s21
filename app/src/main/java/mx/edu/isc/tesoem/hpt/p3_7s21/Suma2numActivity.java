package mx.edu.isc.tesoem.hpt.p3_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Suma2numActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma2num);

      txtnum1 = findViewById(R.id.txtnum1p3);
      txtnum1 = findViewById(R.id.txtnum2p3);
      txtnum1 = findViewById(R.id.txtnum3p3);


          public void clacular(view v){
          int num1  = Integer.parseInt(txtnum1.getTex().toString());
          int num2  = Integer.parseInt(txtnum1.getTex().toString());
                  lblrest.setText(String.valueOf(i num1+num2));
        }
    }
}