package commands;

import domain.Counter;

public class DecrementCommand implements Command{
    private final Counter counter;

    public DecrementCommand(Counter counter){
        this.counter = counter;
    }


    @Override
    public void execute() {
        this.counter.decrement();
    }

    @Override
    public void unExecute() {
        this.counter.increment();
    }
    
}
