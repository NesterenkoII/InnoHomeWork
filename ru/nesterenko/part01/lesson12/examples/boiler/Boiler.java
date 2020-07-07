package ru.stc.examples.boiler;

import java.util.Random;

public class Boiler {
    private boolean water;
    private boolean gas;
    private boolean electricity;
    private float temperature = 33;
    private Random rnd = new Random();

    private boolean enabled;

    public void start() throws BoilerException {
        enabled = true;
    }

    public void stop() {
        enabled = false;
    }

    public void process() {
        if (enabled && water && (gas || electricity)) {
            temperature = Math.min(temperature + rnd.nextFloat() * 20 * 1f, 150);
        } else {
            temperature = Math.max(temperature - rnd.nextFloat() * 2 * 0.5f, 20);
        }
        System.out.printf("Температура %2.2f\n", temperature);

        assert temperature < 90 : "Внимание! Бойлер перегрелся!";
    }

    public void printStatus() {
        System.out.printf("бойлер %s, вода %s, газ %s, электричество %s\n",
                enabled ? "включен": "выключен",
                water ? "подается": "перекрыта",
                gas ? "подается": "перекрыт",
                electricity ? "есть": "нет");
    }

    public void invertWater() throws BoilerException {
        checkState(!water, gas, electricity);
        water = !water;
    }

    public void invertGas() throws BoilerException {
        checkState(water, !gas, electricity);
        gas = !gas;
    }

    public void invertElectricity() throws BoilerException {
        checkState(water, gas, !electricity);
        this.electricity = !electricity;
    }

    public void checkState(boolean water, boolean gas, boolean electricity) throws BoilerException {
        if (enabled) {
            if (!water && (gas || electricity)) {
                throw new BoilerException("Нельзя нагревать бойлер при выключенной подаче воды!");
            }
        }
    }
}
