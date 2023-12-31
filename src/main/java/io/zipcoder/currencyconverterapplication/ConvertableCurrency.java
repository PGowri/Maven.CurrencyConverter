package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        return  currencyType.getRate()/CurrencyType.getTypeOfCurrency(this).getRate(); //Double.MAX_VALUE;
    }
}
