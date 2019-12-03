package com.brunoyam.IO.models.army.machines;

import com.brunoyam.IO.models.army.AbstractUnit;

abstract class AbstractMachine extends AbstractUnit {

    int fuel;

    AbstractMachine(int maxSpeed, int armor, int fuel) {
        super(maxSpeed, armor);
        this.fuel = fuel;
    }


}
