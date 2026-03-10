//Calculates: total income, total expenses, net profit or loss
import java.util.ArrayList;

public class Report {
    public static double calculateTotalIncome(ArrayList<Income> incomes) {
        double total = 0;

        for (Income income : incomes) {
            total += income.getPrice() *  income.getQuantity();
        }

        return total;
    }

    public static double calculateTotalExpense(ArrayList<Expense> expenses) {
        double total = 0;

        for (Expense expense : expenses) {
            total += expense.getPrice() * expense.getQuantity();
        }
        return total;
    }

    public static void showReport(ArrayList<Income> incomes, ArrayList<Expense> expenses) {
        double totalIncome = calculateTotalIncome(incomes);
        double totalExpense = calculateTotalExpense(expenses);
        double net = totalIncome - totalExpense;

        System.out.println("\n===== FINANCIAL REPORT =====");
        System.out.println("Total income: ៛ " + totalIncome);
        System.out.println("Total expense: ៛ " + totalExpense);

        if (net > 0) {
            System.out.println("Net Profit: ៛ " + net);
        } else {
            System.out.println("Net Loss: ៛ " + Math.abs(net));
        }
    }
}
