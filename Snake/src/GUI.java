import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();

    public GUI() {
        JButton button2 = new JButton("Start");
        button2.addActionListener(this);
        JLabel label = new JLabel();
        panel.setBorder(BorderFactory.createEmptyBorder(50,100,50,100));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button2);
        panel.add(label);
        frame.setResizable(false);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Shamyx");
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        GameFrame GF = new GameFrame();

    }

}
