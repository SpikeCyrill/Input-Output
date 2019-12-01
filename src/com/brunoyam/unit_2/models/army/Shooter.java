package com.brunoyam.unit_2.models.army;

public interface Shooter {

    int getPower();

    default void shoot(Shootable target) {
        int power = getPower();
        target.getShot(power);
    }
}
