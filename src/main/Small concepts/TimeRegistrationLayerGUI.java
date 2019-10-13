
import com.sun.org.apache.xml.internal.resolver.helpers.FileURL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import static sun.plugin.javascript.navig.JSType.URL;

class TimeRegistrationLayerGUI extends JFrame implements ActionListener {
    String [] messagestrings = {"Message 1", "Message 2", "Message 3"};
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
                case "Message 1": lblText.setText("You selected Message 1. :-)");
                    break;
                case "Message 2": lblText.setText("You selected Message 2. Well done");
                    break;
                case "Message 3": lblText.setText("You selected Message 3. Good Choice");
                    break;
                default: lblText.setText("Whoops. error");
            }
        }
    }
}

