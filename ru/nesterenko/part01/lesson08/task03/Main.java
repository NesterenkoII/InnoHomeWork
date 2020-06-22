package ru.nesterenko.part01.lesson08.task03;

import java.util.Date;

/**
 * Реализовать два класса: договор и акт. В каждом сделать поля: номер, дата, список товаров (массив строк).
 * Написать класс со статическим методом конвертации договора в акт (на вход передавать договор, на выходе получаем акт).
 *
 * @version 1.0 22 June 2020
 * @author  NII
 */
public class Main {

    public static void main(String[] args) {

        Act act;
        Contract contract;

        contract = new Contract("175/22", new Date(), "Boxes with goods");
        act = DocumentConverter.contractToAct(contract,new Act());

        System.out.println("Act by Contract № "
                + act.getContractNumber()
                + " from (" + act.getContractDate()
                + ")\nabout " + act.getActObject());

    }
}
