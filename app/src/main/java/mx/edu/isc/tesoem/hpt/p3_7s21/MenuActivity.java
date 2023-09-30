package mx.edu.isc.tesoem.hpt.p3_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MenuActivity extends AppCompatActivity {

    button btnsuma2nump2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnsuma2nump2 = findViewById(R.id.btnsumap2);
    }
}