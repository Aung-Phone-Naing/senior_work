package seedu.moneygowhere.data.currency;

import seedu.moneygowhere.common.Configurations;
import seedu.moneygowhere.common.Messages;
import seedu.moneygowhere.data.expense.Expense;
import seedu.moneygowhere.exceptions.CurrencyInvalidException;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 * Stores and manages a HashMap of currencies.
 */
public class CurrencyManager {
    private HashMap<String, BigDecimal> exchangeRates;

    public CurrencyManager() {
        exchangeRates = new HashMap<>();
    }

    public void addCurrency(Currency currency) {
        String currencyCode = currency.getCurrencyCode();
        BigDecimal rate = currency.getRate();
        exchangeRates.put(currencyCode, rate);
    }

    public boolean hasCurrency(String currency) throws CurrencyInvalidException {
        if (exchangeRates.containsKey(currency)) {
            return true;
        }
        throw new CurrencyInvalidException(Messages.CURRENCY_MANAGER_CURRENCY_NOT_FOUND);
    }

    private BigDecimal getRate(String currency) {
        return exchangeRates.get(currency);
    }

    private BigDecimal convertToSgd(String currency, BigDecimal amount) {
        BigDecimal rate = getRate(currency);
        return (amount.divide(rate));
    }

    private BigDecimal convertToNewCurrency(BigDecimal amountInSgd, String newCurrency) {
        BigDecimal rate = getRate(newCurrency);
        return (amountInSgd.multiply(rate));
    }

    public BigDecimal exchangeCurrency(Expense expense, String newCurrency) {
        String oldCurrency = expense.getCurrency();
        BigDecimal amountInSgd = expense.getAmount();
        if (!(oldCurrency.equals(Configurations.CURRENCY_SINGAPORE_DOLLARS))) {
            amountInSgd = convertToSgd(oldCurrency, amountInSgd);
        }
        if (newCurrency.equals(Configurations.CURRENCY_SINGAPORE_DOLLARS)) {
            return amountInSgd;
        }
        BigDecimal amountInNewCurrency = convertToNewCurrency(amountInSgd, newCurrency);
        return amountInNewCurrency;
    }
}