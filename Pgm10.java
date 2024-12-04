import javax.swing.*;
import java.awt.event.*; 

public class ButtonWithInheritance extends JFrame {
    public ButtonWithInheritance() {
        setTitle("Swing Button with Inheritance");
        setLayout(null);
        JButton button = new JButton("Click Me!");
        button.setBounds(100, 100, 120, 40);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(null, "Button Clicked!");
            }
        });
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ButtonWithInheritance();
    }
}







