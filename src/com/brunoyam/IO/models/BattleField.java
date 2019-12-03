package com.brunoyam.IO.models;

import com.brunoyam.IO.models.army.AbstractUnit;

/**
 * Класс представляет поле битвы.
 */
public class BattleField {

    /**
     * Армия игрока 1
     */
    private AbstractUnit[] army1;
    /**
     * Армия игрока 2
     */
    private AbstractUnit[] army2;

    public BattleField(AbstractUnit[] army1, AbstractUnit[] army2) {
        this.army1 = army1;
        this.army2 = army2;
    }

    public AbstractUnit[] getArmy1() {
        return army1;
    }

    public void setArmy1(AbstractUnit[] army1) {
        this.army1 = army1;
    }

    public AbstractUnit[] getArmy2() {
        return army2;
    }

    public void setArmy2(AbstractUnit[] army2) {
        this.army2 = army2;
    }
}
