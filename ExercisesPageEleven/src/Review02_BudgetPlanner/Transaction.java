package Review02_BudgetPlanner;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Transaction {

    private String name;
    private String note;
    private BigDecimal amount;
    private Currency currency;
    private Instant date;
    private TransactionType transactionType;

    private TransactionSubType transactionSubType;

    public Transaction(String name, String note, BigDecimal amount, Currency currency, Instant date, TransactionType transactionType, TransactionSubType transactionSubType) {
        this.name = name;
        this.note = note;
        this.amount = amount;
        this.currency = currency;
        this.date = date;
        this.transactionType = transactionType;
        this.transactionSubType = transactionSubType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public BigDecimal getAmount() {
        if(transactionType.equals(TransactionType.EXPENSE)){
            return amount.multiply(new BigDecimal(-1));
        }
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }
    public TransactionSubType getTransactionSubType() {
        return transactionSubType;
    }

    public void setTransactionSubType(TransactionSubType transactionSubType) {
        this.transactionSubType = transactionSubType ;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(name, that.name) && Objects.equals(note, that.note) && Objects.equals(amount, that.amount) && currency == that.currency && Objects.equals(date, that.date) && transactionType == that.transactionType && transactionSubType == that.transactionSubType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, note, amount, currency, date, transactionType, transactionSubType);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "name='" + name + '\'' +
                ", note='" + note + '\'' +
                ", amount=" + amount +
                ", currency=" + currency +
                ", date=" + date +
                ", transactionType=" + transactionType +
                ", transactionSubType=" + transactionSubType +
                '}';
    }
}
