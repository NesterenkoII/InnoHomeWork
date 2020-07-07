package ru.nesterenko.part01.lesson09.task01.Humans;

public class YoungHuman extends Humans {

    @Override
    public String jump() {
        return "Подпрыгнул очень высоко";
    }

    @Override
    public String run() {
        return "Молодой человек бежит";
    }

    @Override
    public String swim() {
        return "Молодой человек плывет";
    }
}
