//Represents one income record (id, date, source, amount, description)

public class Income {
    private int id;
    private String Item;
    private int quantity;
    private double price;

    public Income(int id, String item, int quantity, double price) {
        this.id = id;
        this.Item = item;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public String setItem(String item) {return item;}
    public void setQuantity(int quantity) {this.quantity = quantity;}
    public void setPrice(double price) {this.price = price;}

    public void display() {
        System.out.println("ID |" + " | " + "Item " + " | " + "Quantity " + " | " + "Price " +  "Total ");
        System.out.println(id + " | " + Item + " | " + quantity + " | ៛ " + price + " | ៛ " +  quantity * price);
    }
}
