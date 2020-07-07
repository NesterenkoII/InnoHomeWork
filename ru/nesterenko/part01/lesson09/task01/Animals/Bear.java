package ru.nesterenko.part01.lesson09.task01.Animals;

import ru.nesterenko.part01.lesson09.task01.Run;
import ru.nesterenko.part01.lesson09.task01.Swim;

public class Bear extends Animals implements Run, Swim {

    public Bear(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String run() {
        return "Медведь бежит";
    }

    @Override
    public String swim() {
        return "Медведь плывет";
    }
}
