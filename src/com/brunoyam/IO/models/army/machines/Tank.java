package com.brunoyam.IO.models.army.machines;

import com.brunoyam.IO.models.army.Shooter;

public class Tank extends AbstractMachine implements Shooter {

    private final static int POWER = 1000;

    public Tank (int maxSpeed, int armor, int fuel){
        super(maxSpeed, armor, fuel);
    }

    @Override
    public int getPower() {
        return POWER;
    }
}
