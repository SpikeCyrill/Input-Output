package com.brunoyam.IO.models.army.soldiers;

import com.brunoyam.IO.models.army.Shootable;

public class Medic extends AbstractSoldier implements Shootable {

    public Medic(int maxSpeed, int armor, int health) {
        super(maxSpeed, armor, health);
    }

    @Override
    public void getShot(int damage) {
        this.health = this.health - damage;
    }

}
