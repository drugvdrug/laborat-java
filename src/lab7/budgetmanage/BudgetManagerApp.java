package lab7.budgetmanage;

import java.util.Scanner;

// Модель бюджета
class Budget {
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

// ViewModel для управления бюджетом
class BudgetViewModel {
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

// Представление для взаимодействия с пользователем
class BudgetView {
    private BudgetViewModel viewModel;
    private Scanner scanner;

    public BudgetView(BudgetViewModel viewModel) {
        this.viewModel = viewModel;
        this.scanner = new Scanner(System.in);
    }

    public void display() {
        while (true) {
            System.out.println("\nCurrent Budget:");
            System.out.println("Income: " + viewModel.getIncome());
            System.out.println("Expenses: " + viewModel.getExpenses());
            System.out.println("Balance: " + viewModel.getBalance());
            System.out.println("\nCommands: ");
            System.out.println("1. Set Income");
            System.out.println("2. Set Expenses");
            System.out.println("3. Exit");

            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.print("Enter new income: ");
                    double income = Double.parseDouble(scanner.nextLine());
                    viewModel.setIncome(income);
                    break;
                case "2":
                    System.out.print("Enter new expenses: ");
                    double expenses = Double.parseDouble(scanner.nextLine());
                    viewModel.setExpenses(expenses);
                    break;
                case "3":
                    System.out.println("Exiting the budget manager.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Unknown command. Please try again.");
            }
        }
    }
}

// Главный класс для запуска приложения
public class BudgetManagerApp {
    public static void main(String[] args) {
        Budget budget = new Budget(0, 0);
        BudgetViewModel viewModel = new BudgetViewModel(budget);
        BudgetView view = new BudgetView(viewModel);
        view.display();
    }
}
