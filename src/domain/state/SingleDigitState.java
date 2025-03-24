package domain.state;

import domain.Counter;

public class SingleDigitState implements CounterState{

    @Override
    public void decrement(Counter counter) {
        int count = counter.getCount();
        counter.setCount(--count);
    }

    @Override
    public void increment(Counter counter) {
        int count = counter.getCount();
        counter.setCount(++count);
        if (
            counter.getCount() > 9 
        ) {
            counter.setCurrentState(new DoubleDigitState());
        }
    }
    

}
