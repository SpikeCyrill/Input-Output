package com.brunoyam.unit_2.services.impl;

import com.brunoyam.unit_2.DAO.BattleFieldDAO;
import com.brunoyam.unit_2.models.BattleField;
import com.brunoyam.unit_2.models.army.AbstractUnit;
import com.brunoyam.unit_2.services.CurrentBattleField;

public class CurrentBattleFieldImpl implements CurrentBattleField {

    private BattleFieldDAO battleFieldDAO;
    private BattleField currentBattleField;

    public CurrentBattleFieldImpl(BattleFieldDAO battleFieldDAO) {
        this.battleFieldDAO = battleFieldDAO;
    }

    @Override
    public void newGame() {
        AbstractUnit[] army1 = new AbstractUnit[4];
        AbstractUnit[] army2 = new AbstractUnit[4];
        BattleField newBattleField = new BattleField(army1, army2);
        currentBattleField = newBattleField;
        System.out.println("new game");
    }

    @Override
    public void saveGame() {
        battleFieldDAO.saveBattleField(currentBattleField);
        System.out.println("save game");
    }

    @Override
    public void loadGame() {
        currentBattleField = battleFieldDAO.loadBattleField();
        System.out.println("load game");
    }

    @Override
    public void nextMove() {
        System.out.println("next move");
    }

}
