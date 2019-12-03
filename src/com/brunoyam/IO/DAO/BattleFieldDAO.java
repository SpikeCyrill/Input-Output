package com.brunoyam.IO.DAO;

import com.brunoyam.IO.models.BattleField;

/**
 * Интерфейс предоставляющий возможность сохранения и загрузки данных игры
 */
public interface BattleFieldDAO {

    /**
     * Сохраняет состояние поля битвы BattleField.
     * @param battleField поле битвы.
     */
    void saveBattleField(BattleField battleField);

    /**
     * Загружает состояние поля битвы из файла.
     * @return новый экземпляр поля битвы BattleField с загруженным состояние.
     */
    BattleField loadBattleField();

}
