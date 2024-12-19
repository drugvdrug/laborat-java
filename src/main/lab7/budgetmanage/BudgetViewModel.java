package main.lab7.budgetmanage;

public class BudgetViewModel {
    private Budget budget;

    public BudgetViewModel(Budget budget) {
        this.budget = budget;
    }

    public double getIncome() {
        return budget.getIncome();
    }

    public void setIncome(double income) {
        budget.setIncome(income);
    }

    public double getExpenses() {
        return budget.getExpenses();
    }

    public void setExpenses(double expenses) {
        budget.setExpenses(expenses);
    }

    public double getBalance() {
        return budget.getBalance();
    }
}
