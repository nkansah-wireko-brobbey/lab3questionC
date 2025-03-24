package domain;

import Subject.Subject;
import domain.state.CounterState;
import domain.state.SingleDigitState;

public class Counter extends Subject
{
    private int count;
    private CounterState currentState = new SingleDigitState();

    public void increment(){
        currentState.increment(this);
        System.out.println("increment");
        // int newCount = count+1;
        // this.setCount(newCount);
        donotify(count);
    }

    public void decrement(){
        currentState.decrement(this);
        System.out.println("decrement");
        donotify(count);
    }

    public void setCount(int count){
        this.count = count;
    }

    public int getCount(){
        return this.count;
    }

    public void setCurrentState(CounterState counterState){
        this.currentState = counterState;
    }

}

