package ru.nesterenko.part01.lesson03.task02;

import java.math.BigDecimal;

/**
 * Класс создает профиль сотрудника с обязательным указанием имени, а также возраст, стаж работы, должность
 * размер, установленной заработной платы
 *
 * @version 13 June 2020
 * @author  Igor Nesterenko
 */
public class Person {
    private String name = "notAssigned";
    private String position = "notAssigned";
    private int age = 0;
    private int workingExperience = 0;
    private BigDecimal salary  = new BigDecimal("0");

    Person() {

    }

    Person(String nameOfPerson) {
        name = nameOfPerson;
    }

    Person(String nameOfPerson, String duringPosition) {
        name = nameOfPerson;
        position = duringPosition;
    }

    Person(String nameOfPerson, String duringPosition, int ageOfPerson) {
        name = nameOfPerson;
        position = duringPosition;
        age = ageOfPerson;
    }

    Person(String nameOfPerson, String duringPosition, int ageOfPerson, int workingExperienceOfPerson) {
        name = nameOfPerson;
        position = duringPosition;
        age = ageOfPerson;
        workingExperience = workingExperienceOfPerson;
    }

    Person(String nameOfPerson, String duringPosition, int ageOfPerson, int workingExperienceOfPerson, BigDecimal salary) {
        name = nameOfPerson;
        position = duringPosition;
        age = ageOfPerson;
        workingExperience = workingExperienceOfPerson;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWorkingExperience(int workingExperience) {
        this.workingExperience = workingExperience;
    }

    public int getWorkingExperience() {
        return workingExperience;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}
