package ru.nesterenko.part01.lesson09.task01.Animals;

import ru.nesterenko.part01.lesson09.task01.Fly;
import ru.nesterenko.part01.lesson09.task01.Run;
import ru.nesterenko.part01.lesson09.task01.Swim;

public class Duck extends Animals implements Run, Swim, Fly {

    public Duck(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String run() {
        return "Утка бежит";
    }

    @Override
    public String swim() {
        return "Утка плывет";
    }

    @Override
    public String fly() {
        return "Утка летит";
    }
}
