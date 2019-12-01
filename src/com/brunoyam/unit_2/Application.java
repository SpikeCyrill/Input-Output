package com.brunoyam.unit_2;


import com.brunoyam.unit_2.models.army.Shootable;
import com.brunoyam.unit_2.models.army.Shooter;
import com.brunoyam.unit_2.models.army.machines.Tank;
import com.brunoyam.unit_2.models.army.machines.Transport;
import com.brunoyam.unit_2.models.army.soldiers.Medic;
import com.brunoyam.unit_2.models.army.soldiers.Sniper;
import com.brunoyam.unit_2.models.army.soldiers.Trooper;
import com.brunoyam.unit_2.controllers.ConsoleController;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class Application {

    public static final Properties APP_PROPERTIES = new Properties();

    public static void main(String[] args) throws IOException {

        APP_PROPERTIES.load(new FileInputStream("resources/application.properties"));

        ResourceBundle resources =
                ResourceBundle.getBundle("multilang/names", Locale.ENGLISH);

        ConsoleController controller = new ConsoleController();
        controller.listenConsole();

        Shooter[] shooters = new Shooter[3];
        shooters[0] = new Tank(100, 1000, 200);
        shooters[1] = new Sniper(20, 10, 150);
        shooters[2] = new Trooper(10, 30, 100);

        Shootable[] targets = new Shootable[4];
        targets[0] = new Transport(70, 100, 50);
        targets[1] = new Sniper(20, 10, 150);
        targets[2] = new Trooper(10, 30, 100);
        targets[3] = new Medic(15, 10, 200);

        for(Shooter unit : shooters) {
            for(Shootable target : targets){
                unit.shoot(target);
            }
        }

    }

}
