
//import com.sun.org.apache.xml.internal.resolver.helpers.FileURL;

//import jdk.internal.joptsimple.internal.Strings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

//import static sun.plugin.javascript.navig.JSType.URL;

class TimeRegistrationLayerGUI extends JFrame implements ActionListener {
//    Scanner input = new Scanner();
    String input1 = "Message1";
    String input2 = "Hee Jurgen kijk eens goed";
    String input3 = "Het kan ook afzonderlijk";


    String[] inputs = {input1, input2, input3};
    String [] messagestrings = inputs;
    JComboBox cmbMessageList = new JComboBox(messagestrings);
    JLabel lblText = new JLabel();

    public static void main(String[] args) {
        TimeRegistrationLayerGUI fr = new TimeRegistrationLayerGUI();
        fr.setVisible(true);
    }

    public TimeRegistrationLayerGUI() {
        setLayout(new FlowLayout());
        setSize(400, 300);
        setTitle("JComboBox Example");
//        setIconImage(new ImageIcon(URL).getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cmbMessageList.setSelectedIndex(1);
        cmbMessageList.addActionListener(this);
        add(cmbMessageList);
        add(lblText);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cmbMessageList) {
            JComboBox cb = (JComboBox)e.getSource();
            String msg = (String)cb.getSelectedItem();
            switch (msg) {
                case "Message1" : lblText.setText("You selected Message 1. :-)");
                    break;
                case "Hee Jurgen kijk eens goed" : lblText.setText("You selected Message 2. Well done");
                    break;
                case "Het kan ook afzonderlijk" : lblText.setText("You selected Message 3. Good Choice");
                    break;
                default: lblText.setText("Whoops. error");
            }
        }
    }
}

