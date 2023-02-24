package Review02_BudgetPlanner;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Transaction transaction1 = new Transaction("CBA", "bread and milk", new BigDecimal(1002), Currency.EUR, Instant.parse("2023-01-01T12:42:15.972727900Z"), TransactionType.EXPENSE, TransactionSubType.FOOD);
        Transaction transaction2 = new Transaction("Salary", "monthly salary from company X", new BigDecimal(10000), Currency.EUR, Instant.now(), TransactionType.INCOME, TransactionSubType.SALARY);

        TransactionsFlow transactionsFlow = new TransactionsFlow();

        transactionsFlow.addTransaction(transaction1);
        transactionsFlow.addTransaction(transaction2);

        Conditions conditions = new Conditions();
        conditions.setTransactionSubTypes(List.of(TransactionSubType.FOOD));

        List<Transaction> results = transactionsFlow.filteringList(conditions);
        System.out.println(results);

    }
}
