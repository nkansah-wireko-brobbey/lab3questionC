package app;

import Observer.Observer;
import UI.CounterFrame;
import UI.OvalFrame;
import UI.RectFrame;
import UI.TextFrame;
import domain.Counter;
import services.CounterService;

public class Main {

    public static void main(String[] args) {
        CounterFrame counterFrame = new CounterFrame();
        Observer textFrame = new TextFrame();
        Observer rectFrame = new RectFrame();
        Observer ovalFrame = new OvalFrame();
        Counter counter = new Counter();
        counter
                .addObserver(
                        textFrame
                );
        counter.addObserver(rectFrame);
        counter.addObserver(ovalFrame);
        CounterService counterService = new CounterService(counter);
        counterFrame.setCounterService(counterService);

    }
}
