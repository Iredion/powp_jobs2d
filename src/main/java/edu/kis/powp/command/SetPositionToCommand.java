package edu.kis.powp.command;
import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionToCommand implements DriverCommand {
    private final int x;
    private final int y;

    private final Job2dDriver jobs2dDriver;

    public SetPositionToCommand(int x, int y, Job2dDriver driver) {

        this.x = x;
        this.y = y;
        this.jobs2dDriver = driver;
    }

    @Override
    public void execute() {
        jobs2dDriver.setPosition(x, y);
    }
    
}
