package module4.homeOrk3;

import module4.homeOrk1.Bank;
import module4.homeOrk2.Currency;

public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployee,
                  double avrSalaryOfEmployee, long rating, long totalCapital) {

        super(id,bankCountry,currency,numberOfEmployee,avrSalaryOfEmployee,rating,totalCapital);
}

    @Override
    public int getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.USD)
            return 2000;

       else
            return 2200;

    }

    @Override
    public int getLimitOfFunding(){
        if(this.getCurrency() == Currency.USD)
            return 10000;

       else
            return 20000;

    }

    @Override
    public int getMonthlyRate(){
        if(this.getCurrency() == Currency.USD)
            return 0;

        else
            return 1;
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
                return 2;
             else
                return 4;


    }
}
