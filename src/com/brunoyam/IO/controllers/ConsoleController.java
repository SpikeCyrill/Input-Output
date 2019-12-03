package com.brunoyam.IO.controllers;

import com.brunoyam.IO.services.impl.CurrentBattleFieldServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Класс-контроллер, перехватывающий и обрабатывающий сообщения пользователя в консоли.
 */
public class ConsoleController {

    public void listenConsole() throws IOException {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        while (true) {
            String command = br.readLine();
            System.out.println("есть " + command);
            switch (command) {
                case "new":
                    new CurrentBattleFieldServiceImpl().newGame();
                    break;
                case "save":
                    new CurrentBattleFieldServiceImpl().saveGame();
                    break;
                case "load":
                    new CurrentBattleFieldServiceImpl().loadGame();
                    break;
                case "exit":
                    return;
            }
        }
    }

}
