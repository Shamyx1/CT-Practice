import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameFrame extends JFrame implements ActionListener{
    GamePanel panel = new GamePanel(1);
    GamePanel panel2 = new GamePanel(2);
    GameFrame () {

        Thread thread1 = new Thread(panel);
        thread1.run();
//        GamePanel panel2 = new GamePanel(2);
//        Thread thread2 = new Thread(panel2);
//        panel2.setPlayerNumber(2);
//        thread2.run();


        panel2.setPlayerNumber(2);
        Thread myThread = new Thread(panel2);
        myThread.run();
        this.add(panel, BorderLayout.WEST);
        this.add(panel2,BorderLayout.EAST);
        this.setTitle("Snake");
        this.setFocusable(true);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.addKeyListener(new myKeyAdapter());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(panel.running)
        {
            panel.move(panel.direction);
            panel.checkApple();
            panel.checkCollisions();
        }
        panel.repaint();

        if(panel2.running)
        {
            panel2.move(panel.direction);
            panel2.checkApple();
            panel2.checkCollisions();
        }
        panel2.repaint();
    }
    public class myKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
                switch (e.getKeyCode())
                {
                    case KeyEvent.VK_LEFT:
                        if(panel2.direction != 'R')
                        {
                            panel2.direction = 'L';
                        }
                        break;
                    case KeyEvent.VK_RIGHT:
                        if(panel2.direction != 'L')
                        {
                            panel2.direction = 'R';
                        }
                        break;
                    case KeyEvent.VK_UP:
                        if(panel2.direction != 'D')
                        {
                            panel2.direction = 'U';
                        }
                        break;
                    case KeyEvent.VK_DOWN:
                        if(panel2.direction != 'U')
                        {
                            panel2.direction = 'D';
                        }
                        break;

                }

                switch (e.getKeyCode()) {
                    case KeyEvent.VK_A:
                        if (panel.direction != 'R') {
                            panel.direction = 'L';
                        }
                        break;
                    case KeyEvent.VK_D:
                        if (panel.direction != 'L') {
                            panel.direction = 'R';
                        }
                        break;
                    case KeyEvent.VK_W:
                        if (panel.direction != 'D') {
                            panel.direction = 'U';
                        }
                        break;
                    case KeyEvent.VK_S:
                        if (panel.direction != 'U') {
                            panel.direction = 'D';
                        }
                        break;
                }


        }
    }
}

