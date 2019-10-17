package clockyourhours.PresentationLayer;

import clockyourhours.DomainModelLayer.Task;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimeRegistrationLayerGUI {
    private JPanel panel1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;

    public TimeRegistrationLayerGUI() {
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        comboBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        comboBox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void setData(Task data) {
    }

    public void getData(Task data) {
    }

    public boolean isModified(Task data) {
        return false;
    }
}

