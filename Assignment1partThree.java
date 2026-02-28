import javax.swing.*;
import java.awt.event.*;

public class Assignment1partThree {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Form");

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 30);

        JTextField userText = new JTextField();
        userText.setBounds(150, 50, 150, 30);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 100, 100, 30);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                JOptionPane.showMessageDialog(frame, "Welcome " + username + "!");
            }
        });

        frame.add(userLabel);
        frame.add(userText);
        frame.add(loginButton);

        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
