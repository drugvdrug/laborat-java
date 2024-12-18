package lab6.command;

public class CollectOres implements Command {
    private MiningAutomation miningAutomation;

    public CollectOres(MiningAutomation miningAutomation) {
        this.miningAutomation = miningAutomation;
    }

    @Override
    public void execute() {
        miningAutomation.collectOres();
    }
}