package Animation;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {
    private int x = 70;
    private int y = 70;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for(int i = 0; i < 130; i++) {
            x++;
            y++;

            drawPanel.repaint();

            try {
                Thread.sleep(80);
            } catch(Exception e) { }
        }
    }

    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.white); // <-"Закрась прямоугольник начиная с x0,y0 белым цветом"
            g.fillRect(0, 0, this.getWidth(), this.getHeight()); // и сделай его таким же широким и высоким,как эта панель

            Graphics2D g2d = (Graphics2D) g;

            int red = (int)(Math.random()*255);
            int green = (int)(Math.random()*255);
            int blue = (int)(Math.random()*255);
            Color startColor = new Color(red, green, blue);

            red = (int)(Math.random()*255);
            green = (int)(Math.random()*255);
            blue = (int)(Math.random()*255);
            Color endColor = new Color(red, green, blue);

            GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
            g2d.setPaint(gradient);
            g2d.fillOval(x, y, 60, 60);

        }
    }
}
