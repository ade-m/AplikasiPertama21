package edu.uph.duasatusi.aplikasipertama21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ButtonActivity extends AppCompatActivity {

    Button supabutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        supabutton = (Button) findViewById(R.id.supabutton);
        supabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("BUTTONS", "Buttun supa di klik");
            }
        });

    }
}