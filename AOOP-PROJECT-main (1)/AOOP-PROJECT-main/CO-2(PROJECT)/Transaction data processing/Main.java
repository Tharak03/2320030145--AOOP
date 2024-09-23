import java.util.*;
import java.util.stream.Collectors;

class Transaction {
    String id;
    String type;
    double amount;
    String status;

    public Transaction(String id, String type, double amount, String status) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.status = status;
    }

    @Override
    public String toString() {
        return "{id='" + id + "', type='" + type + "', amount=" + amount + ", status='" + status + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        // List of transactions
        List<Transaction> transactions = Arrays.asList(
            new Transaction("T1", "Deposit", 1000.00, "SUCCESS"),
            new Transaction("T2", "Withdrawal", 500.00, "FAILED"),
            new Transaction("T3", "Deposit", 1200.00, "SUCCESS"),
            new Transaction("T4", "Transfer", 700.00, "SUCCESS"),
            new Transaction("T5", "Withdrawal", 300.00, "FAILED"),
            new Transaction("T6", "Transfer", 900.00, "SUCCESS")
        );

        // Filter deposits
        List<Transaction> deposits = transactions.stream()
            .filter(t -> t.type.equals("Deposit"))
            .collect(Collectors.toList());
        System.out.println("Deposits: " + deposits);

        // Total amount of successful transactions
        double totalAmount = transactions.stream()
            .filter(t -> t.status.equals("SUCCESS"))
            .mapToDouble(t -> t.amount)
            .sum();
        System.out.println("Total successful amount: " + totalAmount);

        // Failed transaction IDs
        List<String> failedIds = transactions.stream()
            .filter(t -> t.status.equals("FAILED"))
            .map(t -> t.id)
            .collect(Collectors.toList());
        System.out.println("Failed transaction IDs: " + failedIds);

        // Group by type
        Map<String, List<Transaction>> groupedByType = transactions.stream()
            .collect(Collectors.groupingBy(t -> t.type));
        System.out.println("Grouped by type: " + groupedByType);
    }
}
