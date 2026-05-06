package chain.model;

public class ExpenseRequest {

    private String description;
    private double amount;

    public ExpenseRequest(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
}
