package com.brunoyam.IO.models.army;

public interface Shooter {

    int getPower();

    default void shoot(Shootable target) {
        int power = getPower();
        target.getShot(power);
    }
}
