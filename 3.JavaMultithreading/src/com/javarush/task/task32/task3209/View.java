package com.javarush.task.task32.task3209;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {

    private Controller controller;

    private JTabbedPane tabbedPane = new JTabbedPane(); // панель с двумя вкладками
    private JTextPane htmlTextPane = new JTextPane(); // компонент для визуального редактирования html(на первой вкладке)
    private JEditorPane plainTextPane = new JEditorPane(); // компонент для редактирования html в виде текста, он будет отображать код html (теги и их содержимое).


    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void init() {

    }

    public void exit() {
        controller.exit();
    }
}
