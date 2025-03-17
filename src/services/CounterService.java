package services;

import commands.Command;
import commands.CommandManager;
import commands.DecrementCommand;
import commands.IncrementCommand;
import domain.Counter;

public class CounterService {
    private final Counter counter;
    private final CommandManager commandManager;

    public CounterService(Counter counter){
        this.counter = counter;
        this.commandManager  = new CommandManager();
    }

    public void increment(){
        Command command = new IncrementCommand(counter);
        this.commandManager.executeCommand(command);
    }

    public void decrement(){
        Command command = new DecrementCommand(counter);
        this.commandManager.executeCommand(command);
    }

    public void undo(){
        this.commandManager.undo();
    }
    public void redo(){
        this.commandManager.redo();
    }
}
