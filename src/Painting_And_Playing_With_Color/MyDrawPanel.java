package Painting_And_Playing_With_Color;

import java.awt.*;
import  javax.swing.*;

public class MyDrawPanel extends JPanel {

    public void paintComponent1(Graphics g) {

        g.setColor(Color.orange);

        g.fillRect(20, 50, 100, 100); // <-координаты для отрисовки фигуры
    }

    public void paintComponentImage(Graphics g) {
        Image image = new ImageIcon("voennik.jpg").getImage();

        g.drawImage(image, 3, 4, this);
    }

    public void paintComponentPaint(Graphics g) {

        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        int red = (int)(Math.random()*255);
        int green = (int)(Math.random()*255);
        int blue = (int)(Math.random()*255);

        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(70, 70, 100, 100);
    }

    public void painComponentGradient(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange);

        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
    }
    public void paintComponent(Graphics g) { // Вторая реализация верхнего метода
        Graphics2D g2d = (Graphics2D) g;              // в котором начальные и конечные цвета произвольны

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
        g2d.fillOval(70, 70, 100, 100);
    }
}
