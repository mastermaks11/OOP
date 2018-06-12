package by.itacademy.atm;

import by.itacademy.atm.by.itacademy.atm.interfaceATM.NameManufactureATM;

/**
 * Created by user on 08.06.2018.
 */
public class BelarusBankATM extends BaseAtm implements NameManufactureATM {
    private double exchangeDollars;
    private double exchangeEvro;

    public BelarusBankATM(int numberBillsOfTwenty, int numberBillsOfFifty, int numberBillsOfHundred) {
        super("GosCorparation", "BelarusBank", numberBillsOfTwenty, numberBillsOfFifty, numberBillsOfHundred);
        this.exchangeDollars = 2.05;
        this.exchangeEvro = 2.35;
    }

    public void totalManeyDollars() {
        System.out.println("Общая сумма в банкомате в доллорах " + this.totalAmount() / this.exchangeDollars + "$");
    }

    public void totalManeyEvro() {
        System.out.println("Общая сумма в банкомате в евро " + this.totalAmount() / this.exchangeEvro + "evro");
    }

    @Override
    public void nameManufactureATM() {
        System.out.println("Производитель банкомата - " + this.getManufacturerATM());
    }
}

