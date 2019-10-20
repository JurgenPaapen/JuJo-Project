package clockyourhours.PresentationLayer;

import clockyourhours.DomainModelLayer.Client;
import clockyourhours.DomainModelLayer.Project;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static clockyourhours.BusinessLogicLayer.TimeRegistrationImpl.*;
//import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;


public class TaskRegistrationLayerGUI implements Runnable {
    private JFrame frame;
    private List<Project> projects;
    private ArrayList<Client> clients;
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
    long startTimer;
    long stopTimer;


    public TaskRegistrationLayerGUI(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public JFrame getFrame() {
        return frame;
    }

    @Override
    public void run() {
        /**
         * Configuring Frame and size an visability
         */
        frame = new JFrame("Clock Your Hours");
        frame.setPreferredSize(new Dimension(400, 500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container pane) {

        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
        JTextArea text;
//        JTextArea text2;
        JButton button;
        JButton stopbutton;
        JButton starttimer;
        JButton total;
        JComboBox comboBox;
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        if (shouldFill) {
            //natural height, maximum width
            c.fill = GridBagConstraints.HORIZONTAL;
        }

/**
 * Code to go through client arraylist and put  company name in a new String array.
 * This company name can be used to fil combobox
 */
        Client[] clientString = new Client[clients.size()];
        int i = clients.size();
        int n = i++;
        int cnt = 0;
        String[] newArray = new String[n];
        for (Client client : clients) {
            newArray[cnt] = client.getCompanyName();
            cnt++;
        }

        /**
         * constructing combobox with new array (with client company name
         */
        comboBox = new JComboBox(newArray);
        if (shouldWeightX) {
            c.weightx = 0.5;
        }
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(comboBox, c);

        comboBox = new JComboBox(newArray);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 1;
        pane.add(comboBox, c);

        /**
         * getting company logo and add it to pane
         */

        InputStream imageStream = this.getClass().getResourceAsStream("LOGO.jpg");
        BufferedImage image = null;
        try {
            image = ImageIO.read(imageStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        JLabel picLabel = new JLabel(new ImageIcon(image));
        c.weightx = 0.5;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(picLabel, c);

        /**
         * text area to show the impact of an action listener
         */

        text = new JTextArea(" ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 3;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 2;
        pane.add(text, c);

        /**
         * constructing four buttons for different tasks
         */

        button = new JButton("inmeten");
        if (shouldWeightX) {
            c.weightx = 0.5;
        }
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 2;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 3;
        pane.add(button, c);

        button = new JButton("opbouw");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 3;
        pane.add(button, c);

        button = new JButton("afwerking");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 4;
        pane.add(button, c);

        button = new JButton("voorlichting");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 4;
        pane.add(button, c);

//        button.addActionListener(E -> {
//            text.setText(" Stop Timer");
//
//        });

/**
 * creating a stop button to show the effect of an action listener
 */

        stopbutton = new JButton("STOP");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;       //reset to default
        c.weighty = 1.0;   //request any extra vertical space
        c.anchor = GridBagConstraints.PAGE_END; //bottom of space
//        c.insets = new Insets(10, 0, 0, 0);  //top padding
        c.gridx = 2;       //aligned with button 2
        c.gridwidth = 2;   //2 columns wide
        c.gridy = 5;       //third row
        pane.add(stopbutton, c);

        stopbutton.addActionListener(E -> {
            stopTimer = stopTimer();
            text.setText(" Timer gestopt");
        });

        starttimer = new JButton("START");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 5;
        pane.add(starttimer, c);

        starttimer.addActionListener(E -> {
            startTimer = startTimer();
            text.setText(" Timer loopt");
        });


        total = new JButton("TOTAAL");
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 6;
        c.weighty = 0.0;   //request any extra vertical space
        pane.add(total, c);

        total.addActionListener(E -> {
            text.setText("Verstreken tijd is " + timeDifference(stopTimer, startTimer)/1000 + " seconden");
        });

//    ButtonAction nog aanpassen, werkt nog niet

//        button.addActionListener(new ActionListener() {
//
//            public void actionPerformed(ActionEvent e) {
//                if (e.getSource() == starttimer)
//                    startTimer();
//                if (e.getSource() == stopbutton)
//                    stopTimer();
//                if (e.getSource() == total)
//                    text.setText("verstreken tijd" + timeDifference(stopTimer, startTimer));

//hier moet het totaal nog weergegeven worden in textArea
//
//            }
//        });
    }
}


