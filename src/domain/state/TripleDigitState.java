package domain.state;

import domain.Counter;

public class TripleDigitState implements CounterState {
    @Override
    public void decrement(Counter counter) {
        int count = counter.getCount();
        counter.setCount(count-3);
    }

    @Override
    public void increment(Counter counter) {
        int count = counter.getCount();
        counter.setCount(count+3);
    }
}
