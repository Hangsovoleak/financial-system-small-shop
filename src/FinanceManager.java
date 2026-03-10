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

    public void updateIncome(int id, String item, int qty, double price) {
        for (Income income : incomes) {
            if (income.getId() == id) {
                income.setItem(item);
                income.setQuantity(qty);
                income.setPrice(price);
                System.out.println("Income updated successfully");
                return;
            }
        }
        System.out.println("Income ID not found");
    }

    public void updateExpense(int id, String item, int qty, double price) {
        for (Expense expense : expenses) {
            if (expense.getId() == id) {
                expense.setItem(item);
                expense.setQuantity(qty);
                expense.setPrice(price);
                System.out.println("Expense updated successfully");
                return;
            }
        }
        System.out.println("Expense ID not found");
    }

    public void deleteIncome(int id) {
        for (Income income : incomes) {
            if (income.getId() == id) {
                incomes.remove(income);
                System.out.println("Income deleted successfully");
                return;
            }
        }
        System.out.println("Income ID not found");
    }

    public void deleteExpense(int id) {
        for (Expense expense : expenses) {
            if (expense.getId() == id) {
                expenses.remove(expense);
                System.out.println("Expense deleted successfully");
                return;
            }
        }
        System.out.println("Expense ID not found");
    }

    public void SearchIncome(int id) {
        for (Income income : incomes) {
            if (income.getId() == id) {
                income.display();
                return;
            }
        }
        System.out.println("Income ID not found");
    }

    public void SearchExpense(int id) {
        for (Expense expense : expenses) {
            if (expense.getId() == id) {
                expense.display();
                return;
            }
        }
        System.out.println("Expense ID not found");
    }

    public ArrayList<Income> getIncomes() {
        return incomes;
    }

    public ArrayList<Expense> getExpenses() {
        return expenses;
    }
}
