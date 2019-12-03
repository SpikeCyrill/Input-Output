package com.brunoyam.IO.models.army.soldiers;

import com.brunoyam.IO.models.army.Shootable;
import com.brunoyam.IO.models.army.Shooter;

public class Trooper extends AbstractSoldier implements Shootable, Shooter {

    private final static int POWER = 50;

    public Trooper (int maxSpeed, int armor, int health){
        super(maxSpeed, armor, health);

    }

    @Override
    public void getShot(int damage) {
        this.health = this.health - damage;
    }

    @Override
    public int getPower() {
        return POWER;
    }
}
