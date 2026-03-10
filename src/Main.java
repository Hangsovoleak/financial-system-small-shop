//Starts the program and shows the menu
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FinanceManager manager = new FinanceManager();

        while (true) {
            System.out.println("\n=== Financial Tracking System ===");
            System.out.println("1). Add Income");
            System.out.println("2). Add Expense");
            System.out.println("3). View Items");
            System.out.println("4). Update Items");
            System.out.println("5). Delete Items");
            System.out.println("6). Search Items by ID");
            System.out.println("7). Show Report");
            System.out.println("0). Exit");
            System.out.print("Choice: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Income ID: ");
                    int incomeId = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Product Name: ");
                    String incomeItem = input.nextLine();

                    System.out.print("Enter Quantity: ");
                    int incomeQuantity = input.nextInt();

                    System.out.print("Enter Price ៛ : ");
                    double incomePrice = input.nextDouble();
                    input.nextLine();

                    manager.addIncome(new Income(incomeId, incomeItem, incomeQuantity, incomePrice));
                    break;
                case 2:
                    System.out.print("Enter Expense ID: ");
                    int expenseId = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Product Name: ");
                    String expenseItem = input.nextLine();

                    System.out.print("Enter Quantity: ");
                    int expenseQuantity = input.nextInt();

                    System.out.print("Enter Price ៛ : ");
                    double expensePrice = input.nextDouble();
                    input.nextLine();

                    manager.addExpense(new Expense(expenseId, expenseItem, expenseQuantity, expensePrice));
                    break;
                case 3:
                    System.out.print("View (e-expense/i-income): ");
                    String view = input.nextLine();
                    if (view.equals("e") || view.equals("expense")) {
                        manager.showAllExpenses();
                    } else if (view.equals("i") || view.equals("i-income")) {
                        manager.showAllIncomes();
                    } else {
                        System.out.println("Invalid input");
                    }
                    break;
                case 4:
                    System.out.print("Update (e-expense/i-income): ");
                    String update = input.nextLine();

                    System.out.print("Enter ID: ");
                    int updateId = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter new Item: ");
                    String newItem = input.nextLine();

                    System.out.print("Enter new Quantity: ");
                    int newQuantity = input.nextInt();

                    System.out.print("Enter new Price ៛ : ");
                    double newPrice = input.nextDouble();

                    if (update.equals("e") || update.equals("expense")) {
                        manager.updateExpense(updateId, newItem, newQuantity, newPrice);
                    } else if (update.equals("i") || update.equals("i-income")) {
                        manager.updateIncome(updateId, newItem, newQuantity, newPrice);
                    } else {
                        System.out.println("Invalid input");
                    }
                    break;
                case 5:
                    System.out.print("Delete: ");
                    String delete = input.nextLine();

                    System.out.print("Enter ID: ");
                    int deleteId = input.nextInt();
                    input.nextLine();

                    if (delete.equals("e") || delete.equals("expense")) {
                        manager.deleteExpense(deleteId);
                    } else if (delete.equals("i") || delete.equals("i-income")) {
                        manager.deleteIncome(deleteId);
                    } else {
                        System.out.println("Invalid input");
                    }
                    break;
                case 6:
                    System.out.print("Search (e-expense/i-income): ");
                    String search = input.nextLine();

                    System.out.print("Enter ID: ");
                    int searchId = input.nextInt();
                    input.nextLine();

                    if (search.equals("e") || search.equals("expense")) {
                        manager.SearchExpense(searchId);
                    } else if (search.equals("i") || search.equals("i-income")) {
                        manager.SearchIncome(searchId);
                    } else {
                        System.out.println("Invalid input");
                    }
                    break;
                case 7:
                    Report.showReport(manager.getIncomes(), manager.getExpenses());
                    break;
                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}