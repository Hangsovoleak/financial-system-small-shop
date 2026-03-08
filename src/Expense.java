//Represent one expense record (id, date, category, amount)

public class Expense {
    private int id;
    private String date;
    private String category;
    private double amount;

    public Expense(int id, String date, String category, double amount) {
        this.id = id;
        this.date = date;
        this.category = category;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void display() {
        System.out.println(id + " | " + date + " | " + category + " | $" + amount + " | ");
    }
}
