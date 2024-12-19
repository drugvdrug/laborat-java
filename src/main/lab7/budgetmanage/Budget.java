package main.lab7.budgetmanage;

public class Budget {
    private double income;
    private double expenses;

    public Budget(double income, double expenses) {
        this.income = income;
        this.expenses = expenses;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public double getBalance() {
        return income - expenses;
    }
}
