package com.vaibhavmojidra.dagger2stateofmodulejava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerSmartPhoneComponent.builder()
                .batteryModule(new BatteryModule(25))
                .build()
                .getSmartPhone()
                .startCallRecording();// Injecting via dagger 2
    }
}