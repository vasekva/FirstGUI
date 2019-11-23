package Painting_And_Playing_With_Color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SimpleGui3C implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        SimpleGui3C gui = new SimpleGui3C();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(this); // <- Добавили слушателя (this) к кнопке

        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.SOUTH, button); // Добавляем два виджета (кнопку и панель  для рисования)
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel); // в две области фрейма
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        frame.repaint(); // Как только польз-ль нажмет кнопку,вызываем для фрейма метод repaint()
    } // (метод paintComponent() вызывается для каждого виджета во фрейме)
}

