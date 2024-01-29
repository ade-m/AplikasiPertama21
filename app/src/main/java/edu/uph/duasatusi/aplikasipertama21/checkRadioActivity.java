package edu.uph.duasatusi.aplikasipertama21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class checkRadioActivity extends AppCompatActivity {

    CheckBox checkbox_meat, checkbox_cheese;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_radio);

        checkbox_meat = (CheckBox) findViewById(R.id.checkbox_meat);
        checkbox_cheese = (CheckBox) findViewById(R.id.checkbox_cheese);
        checkbox_cheese.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Logika yang akan dieksekusi saat status CheckBox berubah

                if (isChecked) {
                    // Checkbox dicentang
                    // Tambahkan logika yang diperlukan di sini
                    Log.d("CheckBox", "Cheese is selected");
                } else {
                    // Checkbox tidak dicentang
                    // Tambahkan logika yang diperlukan di sini
                    Log.d("CheckBox", "Cheese is not selected");
                }
            }
        });
        checkbox_meat.setOnCheckedChangeListener(
            new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    // Logika yang akan dieksekusi saat status CheckBox berubah
                    if (isChecked) {
                        // Checkbox dicentang
                        // Tambahkan logika yang diperlukan di sini
                        Log.d("CheckBox", "Meat is selected");
                    } else {
                        // Checkbox tidak dicentang
                        // Tambahkan logika yang diperlukan di sini
                        Log.d("CheckBox", "Meat is not selected");

                    }
                }
            });

        RadioButton radio_pirates = findViewById(R.id.radio_pirates);
        RadioButton radio_ninjas = findViewById(R.id.radio_ninjas);

        radio_pirates.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // RadioButton1 dipilih
                    // Tambahkan logika yang diperlukan di sini
                    Log.d("RadioButton", "RadioButton1 is selected");
                }
            }
        });

        radio_ninjas.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // RadioButton2 dipilih
                    // Tambahkan logika yang diperlukan di sini
                    Log.d("RadioButton", "RadioButton2 is selected");
                }
            }
        });

    }
}