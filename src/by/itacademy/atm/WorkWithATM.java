package by.itacademy.atm;

import by.itacademy.atm.by.itacademy.atm.interfaceATM.AddMoneyForATM;
import by.itacademy.atm.by.itacademy.atm.interfaceATM.CashWithdrawalWithATM;

/**
 * Created by user on 08.06.2018.
 */
public class WorkWithATM implements CashWithdrawalWithATM, AddMoneyForATM {

    @Override
    public void addMoneyForATM(int summ, BaseAtm baseAtm) {
        int numberBillsOfFifty = baseAtm.getNumberBillsOfFifty();
        int numberBillsOfTwenty = baseAtm.getNumberBillsOfTwenty();
        int numberBillsOfHundred = baseAtm.getNumberBillsOfHundred();

        int i = 0;
        for (; 100 <= summ; i++) {
            summ = summ - 100;
        }
        if (i != 0)
            System.out.println("Банкамат принял " + i + " купюры по 100 рублей");
        numberBillsOfHundred = numberBillsOfHundred + i;
        baseAtm.setNumberBillsOfHundred(numberBillsOfHundred);
        i = 0;
        for (; 50 <= summ; i++) {
            summ = summ - 50;
        }
        if (i != 0)
            System.out.println("Банкамат принял " + i + " купюры по 50 рублей");
        numberBillsOfFifty = numberBillsOfFifty + i;
        baseAtm.setNumberBillsOfFifty(numberBillsOfFifty);
        i = 0;
        for (; 20 <= summ; i++) {
            summ = summ - 20;
        }
        if (i != 0)
            System.out.println("Банкамат принял " + i + " купюры по 20 рублей");
        numberBillsOfTwenty = numberBillsOfTwenty + i;
        baseAtm.setNumberBillsOfTwenty(numberBillsOfTwenty);

        if (summ != 0)
            System.out.println("Оставшуюся сумму - " + summ + " руб. банкоман не сможет принять");
    }

    @Override
    public void cashWithdrawalWithATM(int summ, BaseAtm baseAtm) {
        int numberBillsOfFifty = baseAtm.getNumberBillsOfFifty();
        int numberBillsOfTwenty = baseAtm.getNumberBillsOfTwenty();
        int numberBillsOfHundred = baseAtm.getNumberBillsOfHundred();
        if (summ > (numberBillsOfTwenty * 20 + numberBillsOfFifty * 50 + numberBillsOfHundred * 100))
            System.out.println("В банкомате нету такой суммы денег, попробуйте ввести меньше сумму");
        else {
            int i = 0;
            for (; 100 <= summ; i++) {
                if (i < numberBillsOfHundred)
                    summ = summ - 100;
                else
                    break;
            }
            if (i != 0)
                System.out.println("Банкамат выдаст " + i + " купюры по 100 рублей");
            numberBillsOfHundred = numberBillsOfHundred - i;

            baseAtm.setNumberBillsOfHundred(numberBillsOfHundred);
            i = 0;
            for (; 50 <= summ; i++) {
                if (i < numberBillsOfFifty)
                    summ = summ - 50;
                else
                    break;
            }
            if (i != 0)
                System.out.println("Банкамат выдаст " + i + " купюры по 50 рублей");
            numberBillsOfFifty = numberBillsOfFifty - i;
            baseAtm.setNumberBillsOfFifty(numberBillsOfFifty);
            i = 0;
            for (; 20 <= summ; i++) {
                if (i < numberBillsOfTwenty)
                    summ = summ - 20;
                else
                    break;
            }
            if (i != 0)
                System.out.println("Банкамат выдаст " + i + " купюры по 20 рублей");
            numberBillsOfTwenty = numberBillsOfTwenty - i;
            baseAtm.setNumberBillsOfTwenty(numberBillsOfTwenty);

            if (summ != 0)
                System.out.println("Оставшуюся сумму " + summ + " руб. банкоман не сможет выдать");
        }
    }
}
