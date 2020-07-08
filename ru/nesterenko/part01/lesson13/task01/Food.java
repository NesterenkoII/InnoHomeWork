package ru.nesterenko.part01.lesson13.task01;

public enum Food {
    CARROT(true),
    PORRIDGE(false),
    APPLE(true);

    boolean preference;

    Food(boolean preference) {
        this.preference = preference;
    }

    public boolean getPreference() {
        return this.preference;
    }
}
