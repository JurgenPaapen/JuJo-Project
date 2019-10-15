

import java.awt.*;
import javax.swing.*;

public class MultiplePanel extends JFrame {

    JPanel container;
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;

    GridBagLayout cockatoo;
    GridBagConstraints c;

    public MultiplePanel() {

        JButton g = new JButton("JPanel1");
        JButton h = new JButton("JPanel2");
        JButton j = new JButton("JPanel3");
        JButton k = new JButton("JPanel4");

        cockatoo = new GridBagLayout();
        c = new GridBagConstraints();

        container = new JPanel();
        container.setLayout(cockatoo);

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();


        //Will use BorderLayout in the panels, cause its a demostration but it works as well as if it was the only panel in the JFrame.
        panel1.setLayout(new BorderLayout(9000,324));
        panel1.add(g);

        panel2.setLayout(new BorderLayout());
        panel2.add(h);

        panel3.setLayout(new BorderLayout());
        panel3.add(j);

        panel4.setLayout(new BorderLayout());
        panel4.add(k);

        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.BOTH;
        container.add(panel1, c);

        c.gridx = 1;
        c.gridy = 0;
        container.add(panel2, c);

        c.gridx = 2;
        c.gridy = 0;
        container.add(panel3, c);

        c.gridx = 3;
        c.gridy = 0;
        container.add(panel4, c);

        getContentPane().add(container);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Cockatoo Panels inside a JFrame (GridBagLayout)");
        pack();
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String args[]) {

        MultiplePanel v = new MultiplePanel();

    }
}