package com.pattern.example.demo.gof.structural.adapter.src;

public class PowerPlugAdapter extends TwoPinPowerPlug {

    private PowerPlug threePinPowerPlug;

    PowerPlugAdapter(PowerPlug threePinPowerPlug) {
        this.threePinPowerPlug = threePinPowerPlug;
    }

    @Override
    public void powerPlug() {
        this.threePinPowerPlug.powerPlug();
    }
}
