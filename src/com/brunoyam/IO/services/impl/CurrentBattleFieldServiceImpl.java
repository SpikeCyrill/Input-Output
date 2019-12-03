package com.brunoyam.IO.services.impl;

import com.brunoyam.IO.DAO.BattleFieldDAO;
import com.brunoyam.IO.models.BattleField;
import com.brunoyam.IO.models.army.AbstractUnit;
import com.brunoyam.IO.services.CurrentBattleFieldService;

/**
 * Реализация интерфейса com.brunoyam.IO.services.CurrentBattleFieldService
 */
public class CurrentBattleFieldServiceImpl implements CurrentBattleFieldService {

    private BattleFieldDAO battleFieldDAO;
    private BattleField currentBattleField;

    public CurrentBattleFieldServiceImpl() {}

    public CurrentBattleFieldServiceImpl(BattleFieldDAO battleFieldDAO) {
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
