import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Assignment2partThree {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout (2x2)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Use GridLayout instead of Assignment2partThree
        frame.setLayout(new GridLayout(2, 2));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));

        frame.setVisible(true);
    }
}