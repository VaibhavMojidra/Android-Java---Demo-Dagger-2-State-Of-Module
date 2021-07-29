package com.vaibhavmojidra.dagger2stateofmodulejava;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class BatteryModule {
    private int batteryLife;

    public BatteryModule(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Provides
    Battery provideBattery(){
        Log.i("MyInfo","Battery life is "+batteryLife);
        return new Battery();
    }
}
