package UI;
import javax.swing.*;

import domain.Counter;
import services.CounterService;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterFrame {

    // public void setCounter(Counter counter) {
    //     this.counter = counter;
    // }

    // private Counter counter;

    private CounterService counterService;

    public void setCounterService(CounterService counterService){
        this.counterService = counterService;
    }
    

    public CounterFrame() {
        // Create the JFrame
        JFrame frame = new JFrame("Simple JFrame with Buttons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a panel to hold the buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2)); // 2 rows, 2 columns

        // Create four buttons
        JButton increment = new JButton("increment");
        JButton decrement = new JButton("Decrement");
        JButton redo = new JButton("Redo");
        JButton undo = new JButton("Undo");

        // Add action listeners to the buttons
        increment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counterService
                        .increment();
            }
        });

        decrement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counterService
                        .decrement();
            }
        });

        redo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counterService.redo();
            }
        });

        undo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counterService.undo();
            }
        });
        // Add buttons to the panel
        panel.add(increment);
        panel.add(decrement);
        panel.add(redo);
        panel.add(undo);

        // Add the panel to the frame
        frame.add(panel);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
