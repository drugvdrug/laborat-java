package main.lab7.budgetmanage;

import java.util.Scanner;

public class BudgetView {
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
