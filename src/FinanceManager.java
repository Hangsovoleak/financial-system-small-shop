//stores all income and expense data using ArrayList and performs CRUD operations
import java.util.ArrayList;

public class FinanceManager {
    private ArrayList<Income> incomes = new ArrayList<>();
    private ArrayList<Expense> expenses = new ArrayList<>();

    public void addIncome(Income income) {
        incomes.add(income);
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void showAllIncomes() {
        for (Income income : incomes) {
            income.display();
        }
    }

    public void showAllExpenses() {
        for (Expense expense : expenses) {
            expense.display();
        }
    }

//    public double getTotalIncome() {
//        double total = 0;
//        for (Income income : incomes) {
//            total += income.getAmount();
//        }
//        return total;
//    }
//
//    public double getTotalExpense() {
//        double total = 0;
//        for (Expense expense : expenses) {
//            total += expense.getAmount();
//        }
//        return total;
//    }
//
//    public double getNetProfit() {
//        return getTotalIncome() - getTotalExpense();
//    }

    public ArrayList<Income> getIncomes() {
        return incomes;
    }

    public ArrayList<Expense> getExpenses() {
        return expenses;
    }
}
