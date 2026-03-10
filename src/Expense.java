//Represent one expense record (id, date, category, amount)

public class Expense {
    private int id;
    private String item;
    private int quantity;
    private double price;

    public Expense(int id, String item, int quantity, double price) {
        this.id = id;
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {return quantity;}

    public String setItem(String item) { return item;}
    public void setQuantity(int quantity) {this.quantity = quantity;}
    public void setPrice(double price) {this.price = price;}

    public void display() {
        System.out.println("ID |" + " | " + "Item " + " | " + "Quantity " + " | " + "Price " + "Total ");
        System.out.println(id + " | " + item + " | " + quantity + " | ៛ " + price + " | ៛ " + quantity * price);
    }
}
