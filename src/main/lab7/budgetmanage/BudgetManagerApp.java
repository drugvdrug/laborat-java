package main.lab7.budgetmanage;

public class BudgetManagerApp {
    public static void main(String[] args) {
        Budget budget = new Budget(0, 0);
        BudgetViewModel viewModel = new BudgetViewModel(budget);
        BudgetView view = new BudgetView(viewModel);
        view.display();
    }
}
