package lab6.command;

public class StopDrilling implements Command {
    private MiningAutomation miningAutomation;

    public StopDrilling(MiningAutomation miningAutomation) {
        this.miningAutomation = miningAutomation;
    }

    @Override
    public void execute() {
        miningAutomation.stopDrilling();
    }
}