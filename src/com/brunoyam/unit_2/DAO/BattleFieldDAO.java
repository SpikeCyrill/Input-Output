package com.brunoyam.unit_2.DAO;

import com.brunoyam.unit_2.models.BattleField;

public interface BattleFieldDAO {

    void saveBattleField(BattleField battleField);

    BattleField loadBattleField();

}
