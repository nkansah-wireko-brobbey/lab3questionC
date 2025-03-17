package commands;

import domain.Counter;

public class IncrementCommand  implements Command {
    private final Counter counter;

    public IncrementCommand(Counter counter){
        this.counter = counter;
    }

    @Override
    public void execute() {
      this.counter.increment();
    }

    @Override
    public void unExecute() {
      this.counter.decrement();
    }

    
}
