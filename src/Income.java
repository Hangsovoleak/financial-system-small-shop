//Represents one income record (id, date, source, amount, description)

public class Income {
    private int id;
    private String date;
    private String source;
    private double amount;

    public Income(int id, String date, String source, double amount) {
        this.id = id;
        this.date = date;
        this.source = source;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void display() {
        System.out.println(id + " | " + date + " | " + source + " | $" + amount + " | ");
    }
}
