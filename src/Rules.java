import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton back,start; 

    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome to Talented Minds "+name);
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Serif",Font.BOLD,28));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText(
            "<html>"+ 
                "1. The quiz consists of 10 questions, each worth 10 marks." + "<br><br>" +
                "2. You have 30 seconds to answer each question." + "<br><br>" +
                "3. Click the \"Next\" button to move to the next question, or it will automatically advance when time is up." + "<br><br>" +
                "4. Use the 50-50 lifeline to eliminate two incorrect options, leaving you with a 50% chance to choose the correct answer." + "<br><br>" +
                "5. The 50-50 lifeline is disabled after one use." + "<br><br>" +
                "6. You cannot go back to previous questions once you've moved forward." + "<br><br>" +
                "7. The \"Submit\" button is enabled once you reach the 10th question." + "<br><br>" +
                "8. Your total score is displayed after submission." + "<br><br>" +
            "<html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);  //click event
        add(back);

        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);  //click event
        add(start);

        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
        }
        else{
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
