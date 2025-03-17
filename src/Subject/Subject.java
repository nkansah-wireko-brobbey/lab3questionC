package Subject;
import java.util.ArrayList;
import java.util.List;

import Observer.Observer;

public class Subject {
    List<Observer> observers = new ArrayList<>();


    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void donotify(int newCount){
        for (Observer observer : observers)
            observer.update(newCount);
    }

}
