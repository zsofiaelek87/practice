package Review02_BudgetPlanner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionsFlow {
    private List<Transaction> transactions = new ArrayList<>();

    public BigDecimal getTotalAmount(List<Transaction> transactions){
        double sum = transactions.stream()
                .mapToDouble(transaction -> transaction.getAmount().doubleValue())
                .sum();
        return new BigDecimal(sum);
    }

    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
    }

    public void removeTransaction(Transaction transaction){
        transactions.remove(transaction);
    }

    public void listTransactions(){
        transactions.forEach(transaction -> System.out.println(transaction));
    }

    public List<Transaction> filteringList(Conditions conditions){
        return transactions.stream()
                .filter(transaction -> transaction.getDate().isAfter(conditions.getFrom()))
                .filter(transaction -> transaction.getDate().isBefore(conditions.getTo()))
                .filter(transaction -> conditions.getCurrencies().contains(transaction.getCurrency()))
                .filter(transaction -> conditions.getTransactionSubTypes().contains(transaction.getTransactionSubType()))
                .filter(transaction -> conditions.getTransactionTypes().contains(transaction.getTransactionType()))
                .collect(Collectors.toList());


    }
}
