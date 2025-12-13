package edu.kis.powp.command;

import java.util.List;
import java.util.ArrayList;

public class ComplexComand implements DriverCommand {
    
    List<DriverCommand> commands = new ArrayList<>();

    public void addCommand(DriverCommand command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (DriverCommand command : commands) {
            command.execute();
        }
    }
}
