package sample;

import javax.swing.*;

public class SimpleGui1 {
    public static void main (String[] args) {

        JFrame frame = new JFrame();
        JButton button = new JButton("click me");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //строка завершения работы при закрытии окна


        frame.getContentPane().add(button); //кнопка на окно

        frame.setSize(300, 300);

        frame.setVisible(true); //делаем фрейм видимым(иначе никак)
    }
}