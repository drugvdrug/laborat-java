package lab6.command;

public class StartDrilling implements Command {
    private MiningAutomation miningAutomation;

    public StartDrilling(MiningAutomation miningAutomation) {
        this.miningAutomation = miningAutomation;
    }

    @Override
    public void execute() {
        miningAutomation.startDrilling();
    }
}