import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;


class testTimer extends JFrame {
    public static void main( String args[] ) {
        JFrame frame = new testTimer();
        frame.setSize( 640, 480 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setTitle( "Start / Stop Timer" );
        frame.setContentPane( new Tellerpaneel() );
        frame.setVisible( true );
    }


public static class Tellerpaneel extends JPanel {
    private int teller;
    private Timer timer;
    private JButton startknop, stopknop, totaal;

    public Tellerpaneel() {
        teller = 0;
        timer = new Timer(1000, new TimerHandler());  // seconde
//        timer = new Timer(100, new TimerHandler());  // tiende seconde


        startknop = new JButton("Start");
        stopknop = new JButton("Stop");
        totaal = new JButton("totaal");

        add(startknop);
        add(stopknop);
        add(totaal);

        KnopHandler kh = new KnopHandler();
        startknop.addActionListener(kh);
        stopknop.addActionListener(kh);
        totaal.addActionListener(kh);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.setFont(new Font("SansSerif", Font.BOLD, 14));
        g.drawString("Teller = " + teller, 130, 80);
    }

    class TimerHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller++;
            repaint();
        }
    }

    class KnopHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == startknop)
                timer.start();
            if (e.getSource() == stopknop)
                timer.stop();
        }
    }
}}


//
//    String time1 = "16:00:00";
//    String time2 = "19:00:00";
//
//    SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
//    Date date1 = format.parse(time1);
//    Date date2 = format.parse(time2);
//    long difference = date2.getTime() - date1.getTime();
