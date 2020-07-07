package ru.nesterenko.part01.lesson08.task03;

import java.util.Date;


/**
 * Класс реализует Акт с полями: ссылки на номер, дату и предмет контракта, приложением которого является Акт
 *
 * @version 1.0 22 June 2020
 * @author  NII
 */
public class Act {

    private String contractNumber;
    private Date contractDate;
    private String actObject;
// TODO вынести
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setActObject(String actObject) {
        this.actObject = actObject;
    }

    public String getActObject() {
        return actObject;
    }
}
