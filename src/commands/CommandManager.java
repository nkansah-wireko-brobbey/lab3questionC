package commands;

import java.util.Stack;

public class CommandManager {
    private final Stack<Command> commandHistoryStack;
    private final Stack<Command> undoListStack;

    public CommandManager(){
        this.commandHistoryStack = new Stack<>();
        this.undoListStack = new Stack<>();
    }

    public void executeCommand(Command command){
        command.execute();
        commandHistoryStack.push(command);
    }

    public void undo(){
        if (!commandHistoryStack.isEmpty()) {
            Command  command  = this.commandHistoryStack.pop();
            command.unExecute();
            this.undoListStack.push(command);
            return;
        }
        System.out.println("The History Stack is empty");
    }
    public void redo(){
        if (!undoListStack.isEmpty()) {
            Command  command  = this.undoListStack.pop();
            command.execute();
            this.commandHistoryStack.push(command);
            return;
        }
        System.out.println("The Undo Stack is empty");
    }


}
