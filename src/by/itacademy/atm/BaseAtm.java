package by.itacademy.atm;

import by.itacademy.atm.by.itacademy.atm.interfaceATM.AmountOfMoney;
import by.itacademy.atm.by.itacademy.atm.interfaceATM.NameBankATM;
import by.itacademy.atm.by.itacademy.atm.interfaceATM.QuantityIsBought;

/**
 * Created by user on 08.06.2018.
 */
public abstract class BaseAtm implements AmountOfMoney, QuantityIsBought, NameBankATM {
    private String manufacturerATM;
    private String nameBankeATM;
    private int numberBillsOfTwenty;
    private int numberBillsOfFifty;
    private int numberBillsOfHundred;

    public BaseAtm(String manufacturerATM, String nameBankeATM, int numberBillsOfTwenty, int numberBillsOfFifty, int numberBillsOfHundred) {
        this.manufacturerATM = manufacturerATM;
        this.nameBankeATM = nameBankeATM;
        this.numberBillsOfTwenty = numberBillsOfTwenty;
        this.numberBillsOfFifty = numberBillsOfFifty;
        this.numberBillsOfHundred = numberBillsOfHundred;
    }

    public int totalAmount() {
        return this.numberBillsOfTwenty * 20 + this.numberBillsOfFifty * 50 + this.numberBillsOfHundred * 100;
    }

    @Override
    public void outputQuantityIsBought() {
        System.out.println("Количество купюр наминалом 20 - " + this.numberBillsOfTwenty + "штук");
        System.out.println("Количество купюр наминалом 50 - " + this.numberBillsOfFifty + "штук");
        System.out.println("Количество купюр наминалом 100 - " + this.numberBillsOfHundred + "штук");

    }

    @Override
    public void outputAmountOfMoney() {
        System.out.println("Общая сумма в банкомате - " + this.totalAmount());
    }

    @Override
    public void nameBankATM() {
        System.out.println("Название банка - " + this.nameBankeATM);
    }


    public int getNumberBillsOfTwenty() {
        return this.numberBillsOfTwenty;
    }

    public int getNumberBillsOfFifty() {
        return this.numberBillsOfFifty;
    }

    public int getNumberBillsOfHundred() {
        return this.numberBillsOfHundred;
    }

    public void setNumberBillsOfTwenty(int numberBillsOfTwenty) {
        this.numberBillsOfTwenty = numberBillsOfTwenty;
    }

    public void setNumberBillsOfFifty(int numberBillsOfFifty) {
        this.numberBillsOfFifty = numberBillsOfFifty;
    }

    public void setNumberBillsOfHundred(int numberBillsOfHundred) {
        this.numberBillsOfHundred = numberBillsOfHundred;
    }

    public String getManufacturerATM() {
        return manufacturerATM;
    }
}
