package domain.state;

import domain.Counter;

public interface CounterState {    
    void decrement(Counter counter);
    void increment(Counter counter);
}
