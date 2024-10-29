import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class SignUp extends JFrame implements ActionListener {

    JLabel formCodeNum, personalDetails;

    public SignUp() {

        //setLayout(null);

        Random  random1 = new Random();
        long randomCodeNum = Math.abs((random1.nextLong() % 9000L) + 1000L);

        // Application Form Number
        formCodeNum = new JLabel("APPLICATION FORM NO. " + randomCodeNum);
        formCodeNum.setFont(new Font("Raleway", Font.BOLD, 38));
        formCodeNum.setBounds(140, 20, 600, 40);
        add(formCodeNum);

        // Personal Details
        personalDetails = new JLabel("Page 1 : Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);



        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {}

    public static void main(String args []) {
        new SignUp();
    }
}
