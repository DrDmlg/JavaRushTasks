package com.javarush.task.task32.task3209;

import com.javarush.task.task32.task3209.listeners.FrameListener;
import com.javarush.task.task32.task3209.listeners.TabbedPaneChangeListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.*;
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
        initGui();
        FrameListener listener = new FrameListener(this);
        addWindowListener(listener);
        setVisible(true);
    }

    public void initMenuBar() {

    }

    public void initEditor() {
        htmlTextPane.setContentType("text/html");

        JScrollPane htmljScrollPane = new JScrollPane(htmlTextPane);
        tabbedPane.add("HTML", htmljScrollPane);

        JScrollPane plainjScrollPane = new JScrollPane(plainTextPane);
        tabbedPane.add("Текст", plainjScrollPane);

        tabbedPane.setPreferredSize(new Dimension(200, 200));

        TabbedPaneChangeListener listener = new TabbedPaneChangeListener(this);
        tabbedPane.addChangeListener(listener);

        getContentPane().add(tabbedPane, BorderLayout.CENTER);
    }

    public void initGui() {
        initMenuBar();
        initEditor();
        pack();
    }

    public void selectedTabChanged() {

    }

    public void exit() {
        controller.exit();
    }
}
