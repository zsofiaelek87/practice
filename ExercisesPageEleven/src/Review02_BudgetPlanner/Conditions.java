package Review02_BudgetPlanner;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class Conditions {
    private Instant from = Instant.MIN;
    private Instant to = Instant.MAX;
    private List<TransactionSubType> transactionSubTypes = Arrays.asList(TransactionSubType.values());
    private List<Currency> currencies = Arrays.asList(Currency.values());
    private List<TransactionType> transactionTypes = Arrays.asList(TransactionType.values());

    public void setFrom(Instant from) {
        this.from = from;
    }

    public void setTo(Instant to) {
        this.to = to;
    }

    public void setTransactionSubTypes(List<TransactionSubType> transactionSubTypes) {
        this.transactionSubTypes = transactionSubTypes;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

    public void setTransactionTypes(List<TransactionType> transactionTypes) {
        this.transactionTypes = transactionTypes;
    }

    public Instant getFrom() {
        return from;
    }

    public Instant getTo() {
        return to;
    }

    public List<TransactionSubType> getTransactionSubTypes() {
        return transactionSubTypes;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public List<TransactionType> getTransactionTypes() {
        return transactionTypes;
    }

    @Override
    public String toString() {
        return "Conditions{" +
                "from=" + from +
                ", to=" + to +
                ", transactionSubTypes=" + transactionSubTypes +
                ", currencies=" + currencies +
                ", transactionTypes=" + transactionTypes +
                '}';
    }
}
