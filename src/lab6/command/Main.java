package lab6.command;

public class Main {
    public static void main(String[] args) {
        MiningAutomation miningAutomation = new MiningAutomation();

        Command startDrilling = new StartDrilling(miningAutomation);
        Command collectOres = new CollectOres(miningAutomation);
        Command stopDrilling = new StopDrilling(miningAutomation);

        CommandInvoker commandInvoker = new CommandInvoker();

        // Начинаем бурение
        commandInvoker.setCommand(startDrilling);
        commandInvoker.executeCommand();

        // Собираем руду
        commandInvoker.setCommand(collectOres);
        commandInvoker.executeCommand();

        // Останавливаем бурение
        commandInvoker.setCommand(stopDrilling);
        commandInvoker.executeCommand();
    }
}