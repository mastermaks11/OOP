package by.itacademy.atm;

import by.itacademy.atm.WorkWithATM;

/**
 * Created by user on 08.06.2018.
 */
public class MainATM {
    public static void main(String[] args) {
        BelarusBankATM belarusBankATM = new BelarusBankATM(5, 5, 5);
        WorkWithATM workWithATM = new WorkWithATM();
        belarusBankATM.outputAmountOfMoney();
        belarusBankATM.outputQuantityIsBought();
        System.out.println("-------------------снимаем сумму -  75 рублем-----------");
        workWithATM.cashWithdrawalWithATM(75, belarusBankATM);
        belarusBankATM.outputAmountOfMoney();
        belarusBankATM.outputQuantityIsBought();
        System.out.println("----------------добавляем сумму-----  1050 рублем------------");
        workWithATM.addMoneyForATM(1050, belarusBankATM);
        belarusBankATM.outputAmountOfMoney();
        belarusBankATM.outputQuantityIsBought();
        System.out.println("-------------описание нашего банкомата-----------------");
        belarusBankATM.nameBankATM();
        belarusBankATM.nameManufactureATM();
        belarusBankATM.totalManeyDollars();
        belarusBankATM.totalManeyEvro();

    }
}
