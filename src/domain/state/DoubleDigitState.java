package domain.state;

import domain.Counter;

public class DoubleDigitState implements CounterState {
    @Override
    public void decrement(Counter counter) {
        int count = counter.getCount();
        counter.setCount(count-2);
        if (
            counter.getCount() > 99
        ) {
            counter.setCurrentState(new TripleDigitState());
        }
    }

    @Override
    public void increment(Counter counter) {
        int count = counter.getCount();
        counter.setCount(count+2);
    }
}
