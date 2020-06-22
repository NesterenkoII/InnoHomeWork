package ru.nesterenko.part01.lesson08.task03;

/**
 * Класс реализует конвертацию различных документов
 *
 * @version 1.0 22 June 2020
 * @author  NII
 */
public class DocumentConverter {

    public static Act contractToAct(Contract contract, Act act) {

        act.setContractNumber(contract.getContractNumber());
        act.setContractDate(contract.getContractDate());
        act.setActObject(contract.getContractObject());

        return act;
    }
}
