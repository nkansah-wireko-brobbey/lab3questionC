package UI;
import javax.swing.*;

import Observer.Observer;

public class TextFrame extends JFrame implements Observer{

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    private String displayText;
    JLabel label;

    public TextFrame() {
        setTitle("Text Frame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

         this.label = new JLabel(this.displayText, SwingConstants.CENTER);
        add(label);

        setVisible(true);
    }

    @Override
    public void update(int count) {
        this.displayText = Integer.toString(count);
        this.updateLabel();
    }
    private void updateLabel() {
        if (label != null) {
            label.setText(displayText);
            label.revalidate();
            label.repaint();
        }
    }
}