package domain;

import Subject.Subject;

public class Counter extends Subject
{
    public int count;

    public Counter(){}
    public void increment(){
        ++count;
        donotify(count);
    }

    public void decrement(){
        count--;
        donotify(count);
    }

}
