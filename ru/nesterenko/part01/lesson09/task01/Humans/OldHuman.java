package ru.nesterenko.part01.lesson09.task01.Humans;

public class OldHuman extends Humans {

    @Override
    public String jump() {
        return "Старым людям тяжело прыгать";
    }

    @Override
    public String run() {
        return "Старый человек бежит";
    }

    @Override
    public String swim() {
        return "Старый человек плывет";
    }
}
