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
            System.out.println("3). View All Income");
            System.out.println("4). View All Expense");
            System.out.println("5). Show Report");
            System.out.println("6). Exit");
            System.out.print("Choice: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Income ID: ");
                    int incomeId = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Date: ");
                    String incomeDate = input.nextLine();

                    System.out.print("Enter Source: ");
                    String source = input.nextLine();

                    System.out.print("Enter Amount: ");
                    double incomeAmount = input.nextDouble();
                    input.nextLine();

                    manager.addIncome(new Income(incomeId, incomeDate, source, incomeAmount));
                    break;
                case 2:
                    System.out.print("Enter Expense ID: ");
                    int expenseId = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Date: ");
                    String expenseDate = input.nextLine();

                    System.out.print("Enter Category: ");
                    String category = input.nextLine();

                    System.out.print("Enter Amount: ");
                    double expenseAmount = input.nextDouble();
                    input.nextLine();

                    manager.addExpense(new Expense(expenseId, expenseDate, category, expenseAmount));
                    break;
                case 3:
                    manager.showAllIncomes();
                    break;
                case 4:
                    manager.showAllExpenses();
                    break;
                case 5:
                    Report.showReport(manager.getIncomes(), manager.getExpenses());
                    break;
                case 6:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}