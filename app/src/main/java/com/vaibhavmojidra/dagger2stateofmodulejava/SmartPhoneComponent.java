package com.vaibhavmojidra.dagger2stateofmodulejava;

import dagger.Component;

@Component(modules={BatteryModule.class})
public interface SmartPhoneComponent {
    public SmartPhone getSmartPhone();
}
