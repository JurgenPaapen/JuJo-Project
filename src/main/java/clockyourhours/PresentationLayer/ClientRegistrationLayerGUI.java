package clockyourhours.PresentationLayer;

import clockyourhours.DomainModelLayer.Project;
import clockyourhours.DomainModelLayer.Task;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ClientRegistrationLayerGUI implements Runnable{
    private JFrame frame;
    private List<Project> Projects;

    public ClientRegistrationLayerGUI(List<Project> projects) {
        this.Projects = projects;
    }

    @Override
    public void run() {
        frame = new JFrame("Clock Your Hours");
        frame.setPreferredSize(new Dimension(600, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container contentPane) {
        contentPane.setLayout(new BorderLayout(10, 10));

        JPanel productPanel = new JPanel();
        productPanel.setLayout(new GridLayout(Projects.size(), 1));

        JTextArea chosenProductSummary = new JTextArea();
        chosenProductSummary.setPreferredSize(new Dimension(150, 200));
        chosenProductSummary.setBackground(Color.LIGHT_GRAY);
        JLabel totalPrice = new JLabel();
        totalPrice.setText("Totaal: ");
        JButton payButton = new JButton("Afrekenen");

        JPanel displayPanel = new JPanel();
//        displayPanel.setLayout(new GridLayout(3,1));
        displayPanel.setLayout(new BoxLayout(displayPanel, BoxLayout.Y_AXIS));
        displayPanel.add(chosenProductSummary);
        displayPanel.add(totalPrice);
        displayPanel.add(payButton);
    }
    }