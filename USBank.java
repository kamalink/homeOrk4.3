package module4.homeOrk3;

import module4.homeOrk1.Bank;
import module4.homeOrk2.Currency;

public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployee,
                  double avrSalaryOfEmployee, long rating, long totalCapital) {

        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapital);
    }



    @Override
    public int getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.USD)
            return 1000;

       else
            return 1200;

    }

    @Override
    public int getLimitOfFunding(){
        if(this.getCurrency() == Currency.USD)
            return Integer.MAX_VALUE;

        else
            return 10000;

    }

    @Override
    public int getMonthlyRate(){
        if(this.getCurrency() == Currency.USD)
            return 1;

        else
            return 2;
    }

    @Override
    public int getCommission(int summ){
        if(this.getCurrency() == Currency.USD)
            if(summ<1000)
                return 5;

            else{
                return 7;}

        else
            if(summ<1000)
                return 6;

            else
                return 8;

    }
}
