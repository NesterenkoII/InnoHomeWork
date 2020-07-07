package ru.stc.examples.boiler;

import java.util.Scanner;

public class Application {
    private final Boiler boiler;

    public Application() {
        boiler = new Boiler();
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        listCommands();
        while (scanner.hasNext()) {
            try {
                switch (scanner.next()) {
                    case "status":
                        boiler.printStatus();
                        break;
                    case "on":
                        boiler.start();
                        break;
                    case "off":
                        boiler.stop();
                        break;
                    case "water":
                        boiler.invertWater();
                        break;
                    case "gas":
                        boiler.invertGas();
                        break;
                    case "power":
                        boiler.invertElectricity();
                        break;
                    case "exit":
                        return;
                    default:
                        System.out.println("не известная комманда!");
                        listCommands();
                        break;
                }
            } catch (BoilerException ex) {
                System.out.println(ex.getMessage());
            }
            boiler.process();
        }
    }

    private void listCommands() {
        System.out.println("Введите одну из существующих команд:");
        System.out.println("on     - включить котел системы");
        System.out.println("off    - выключить котел системы");
        System.out.println("status - ссостояние системы");
        System.out.println("water  - включить/выключить воду");
        System.out.println("gas    - включить/выключить газ");
        System.out.println("power  - включить/выключить электричество");
        System.out.println("exit   - выйти из программы");
    }

    public static void main(String args[]) {
        new Application().run();
    }
}
