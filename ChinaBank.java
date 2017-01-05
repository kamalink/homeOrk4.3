package module4.homeOrk3;

import module4.homeOrk1.Bank;
import module4.homeOrk2.Currency;

public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployee,
                     double avrSalaryOfEmployee, long rating, long totalCapital) {

        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.USD)
            return 100;

        else
            return 150;


    }

    @Override
    public int getLimitOfFunding() {
        if (this.getCurrency() == Currency.USD)
            return 10000;

        else
            return 5000;

    }

    @Override
    public int getMonthlyRate() {
        if (this.getCurrency() == Currency.USD)
            return 1;

        else
            return 0;


    }

    @Override
    public int getCommission(int summ) {
        if (this.getCurrency() == Currency.USD)
            if (summ < 1000)
                return 3;
            else{
                return 5;}



        else
            if (summ < 1000)
                return 10;
            else
                return 11;


    }
}




