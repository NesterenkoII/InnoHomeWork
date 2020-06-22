package ru.nesterenko.part01.lesson08.task03;

import java.util.Date;

/**
 * Класс реализует контракт с полями: номер, дата, предмет контракта
 *
 * @version 1.0 22 June 2020
 * @author  NII
 */
public class Contract {

    private String contractNumber;
    private Date contractDate;
    private String contractObject;

    public Contract(String contractNumber, Date contractDate, String contractObject) {
        this.contractNumber = contractNumber;
        this.contractDate = contractDate;
        this.contractObject = contractObject;
    }

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

    public void getContractObject(String contractObject) {
        this.contractObject = contractObject;
    }

    public String getContractObject() {
        return contractObject;
    }
}
