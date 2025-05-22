import javax.swing.*;
import java.awt.*;

public class Swing {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Button Demo");
        frame.setDefalutCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,150);
        frame.setLayout(new FlowLayout());

        JButton alphabtn = new JButton("Alpha");
        JButton betabtn = new JButton("Beta");
        JLabel label = new JLabel("click it");

        alphabtn.addActionListner(e -> label.setText("Alpha pressed"));
        betabtn.addActionListner(e -> label.setText("beta pressed"));

        frame.add(alphabtn);
        frame.add(betabtn);
        frame.add(label);

    }
}
