package com.brunoyam.IO.models.army.soldiers;

import com.brunoyam.IO.models.army.AbstractUnit;

abstract class AbstractSoldier extends AbstractUnit {

    int health;

    AbstractSoldier(int maxSpeed, int armor, int health){
        super(maxSpeed,armor);
        this.health = health;
    }

}
