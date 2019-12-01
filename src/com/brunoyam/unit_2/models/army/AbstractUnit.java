package com.brunoyam.unit_2.models.army;

public abstract class AbstractUnit {

    private int maxSpeed;
    private int armor;

    public AbstractUnit(int maxSpeed, int armor) {
        this.maxSpeed = maxSpeed;
        this.armor = armor;
    }

}
