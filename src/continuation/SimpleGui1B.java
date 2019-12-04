package continuation;

import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener { // <--Кнопка будет передавать собитий только тем,кто реализует этот инт-йс
    JButton button;

    public static void main (String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this); // <--регистрация кнопки(отслеживание ее событий)

        frame.getContentPane().add(button); // <-добавление кнопки на панель фрейма
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // <-закрытие проги от окна
        frame.setSize(300, 300);
        frame.setVisible(true); // <- !!!видимость окна!!!
    }

    public void actionPerformed(ActionEvent event) {
        button.setText("I've been clicked!"); // реализация метода интерфейса. Фактически метод обработки событий
    }
}