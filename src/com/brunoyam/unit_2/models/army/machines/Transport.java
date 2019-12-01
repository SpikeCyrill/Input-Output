package com.brunoyam.unit_2.models.army.machines;

import com.brunoyam.unit_2.models.army.Shootable;

public class Transport extends AbstractMachine implements Shootable {

    public Transport (int maxSpeed, int armor, int fuel){
        super(maxSpeed, armor, fuel);
    }


    @Override
    public void getShot(int damage) {
        this.fuel = this.fuel - damage;
    }
}
