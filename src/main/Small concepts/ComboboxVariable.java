import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Item {

    private String name;
    private String color;

    public Item(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return name;
    }
}



class SourceCodeProgram {

    public static void main(String argv[]) throws Exception {
        JComboBox<Item> comboBox = new JComboBox<Item>(new Item[] {
                new Item("Major", "red"), new Item("Critical", "dark"),
                new Item("Minor", "green") });
        comboBox.addActionListener(new ActionListener() {

            @SuppressWarnings("unchecked")
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<Item> comboBox = (JComboBox<Item>) e.getSource();
                Item item = (Item) comboBox.getSelectedItem();
                System.out.println(item.getColor());
            }
        });
        JFrame frame = new JFrame();
        frame.setPreferredSize(new Dimension(500   , 300));
        comboBox.setSize(new Dimension( 100,50));
        frame.add(comboBox);

        frame.setPreferredSize(new Dimension(600, 300));
        frame.pack();
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}