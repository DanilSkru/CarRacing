import javax.swing.*;
import java.awt.*;

public class CarRacing {
    public CarRacing() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        GUIcarRacing app = new GUIcarRacing();
        app.setVisible(true);
    }
    public static void main(String[] arg) {
        new CarRacing();
    }
}
class GUIcarRacing extends JFrame {
    JLabel label_audi = new JLabel();
    JLabel label_cadillac = new JLabel();
    JLabel label_lada = new JLabel();
    JLabel label_landrover = new JLabel();
    JLabel label_lexus = new JLabel();
    String winner = "";
    public GUIcarRacing() {
        super("CarRacing");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0, 23, 1000, 700);

        JLabel background = new JLabel();
        background.setBackground(Color.white);
        background.setOpaque(true);
        this.setContentPane(background);

        ImageIcon audi = new ImageIcon("audi.png");
        ImageIcon cadillac = new ImageIcon("cadillac.png");
        ImageIcon lada = new ImageIcon("lada.png");
        ImageIcon landrover = new ImageIcon("landrover.png");
        ImageIcon lexus = new ImageIcon("lexus.png");
        int start_line = 371;
        label_audi.setBounds(start_line-audi.getIconWidth(), 10, audi.getIconWidth(), audi.getIconHeight());
        label_cadillac.setBounds(start_line-cadillac.getIconWidth(), 140, cadillac.getIconWidth(), cadillac.getIconHeight());
        label_lada.setBounds(start_line-lada.getIconWidth(), 280, lada.getIconWidth(), lada.getIconHeight());
        label_landrover.setBounds(start_line-landrover.getIconWidth(), 405, landrover.getIconWidth(), landrover.getIconHeight());
        label_lexus.setBounds(start_line-lexus.getIconWidth(), 540, lexus.getIconWidth(), lexus.getIconHeight());
        label_audi.setIcon(audi);
        label_cadillac.setIcon(cadillac);
        label_lada.setIcon(lada);
        label_landrover.setIcon(landrover);
        label_lexus.setIcon(lexus);
        this.add(label_audi);
        this.add(label_cadillac);
        this.add(label_lada);
        this.add(label_landrover);
        this.add(label_lexus);
        this.setVisible(true);
        MovingWay(990);
        JLabel label_winner = new JLabel(winner, SwingConstants.CENTER);
        label_winner.setFont(new java.awt.Font("Arial", Font.BOLD, 108));
        label_winner.setForeground(Color.black);
        this.setLayout(new BorderLayout());
        this.add(label_winner);
    }
    static int getRandomIntInclusive(int min, int max) {
        min = (int) Math.ceil(min);
        max = (int) Math.floor(max);
        return (int) (Math.floor(Math.random() * (max - min + 1)) + min);
    }
    void MovingWay(int w) {
        int pause_sleep = 18;
        try {
                    while(true) {
                        int x = 0;
                        x = getRandomIntInclusive(1, 5);
                        if ((label_audi.getLocation().x + label_audi.getWidth() + x) > w) {
                            x = w - label_audi.getLocation().x - label_audi.getWidth();
                        }
                        label_audi.setLocation(label_audi.getLocation().x + x, label_audi.getLocation().y);
                        if (label_audi.getLocation().x + label_audi.getWidth() == w) {
                            winner = "1";
                            break;
                        }
                        x = getRandomIntInclusive(1, 5);
                        if ((label_cadillac.getLocation().x + label_cadillac.getWidth() + x) > w) {
                            x = w - label_cadillac.getLocation().x - label_cadillac.getWidth();
                        }
                        label_cadillac.setLocation(label_cadillac.getLocation().x + x, label_cadillac.getLocation().y);
                        if (label_cadillac.getLocation().x + label_cadillac.getWidth() == w) {
                            winner = "2";
                            break;
                        }
                        x = getRandomIntInclusive(1, 5);
                        if ((label_lada.getLocation().x + label_lada.getWidth() + x) > w) {
                            x = w - label_lada.getLocation().x - label_lada.getWidth();
                        }
                        label_lada.setLocation(label_lada.getLocation().x + x, label_lada.getLocation().y);
                        if (label_lada.getLocation().x + label_lada.getWidth() == w) {
                            winner = "3";
                            break;
                        }
                        x = getRandomIntInclusive(1, 5);
                        if ((label_landrover.getLocation().x + label_landrover.getWidth() + x) > w) {
                            x = w - label_landrover.getLocation().x - label_landrover.getWidth();
                        }
                        label_landrover.setLocation(label_landrover.getLocation().x + x, label_landrover.getLocation().y);
                        if (label_landrover.getLocation().x + label_landrover.getWidth() == w) {
                            winner = "4";
                            break;
                        }
                        x = getRandomIntInclusive(1, 5);
                        if ((label_lexus.getLocation().x + label_lexus.getWidth() + x) > w) {
                            x = w - label_lexus.getLocation().x - label_lexus.getWidth();
                        }
                        label_lexus.setLocation(label_lexus.getLocation().x + x, label_lexus.getLocation().y);
                        if (label_lexus.getLocation().x + label_lexus.getWidth() == w) {
                            winner = "5";
                            break;
                        }
                        Thread.sleep(pause_sleep);
                    }
                }
        catch(Exception e) {
                    e.printStackTrace();
                }
    }
}