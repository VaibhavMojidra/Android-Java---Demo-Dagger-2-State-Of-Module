package com.vaibhavmojidra.dagger2stateofmodulejava;

import android.util.Log;
import javax.inject.Inject;

public class MemoryCard {
    @Inject
    public MemoryCard() {

    }

    protected void getSpaceAvailability(){
        Log.i("MyInfo","Space is available");
    }
}
