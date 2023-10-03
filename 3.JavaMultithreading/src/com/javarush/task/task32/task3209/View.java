package com.javarush.task.task32.task3209;

import com.javarush.task.task32.task3209.listeners.FrameListener;
import com.javarush.task.task32.task3209.listeners.TabbedPaneChangeListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    private Controller controller;

    private JTabbedPane tabbedPane = new JTabbedPane();
    private JTextPane htmlTextPane = new JTextPane();
    private JEditorPane plainTextPane = new JEditorPane();

    public View() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            ExceptionHandler.log(e);
        }
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public Controller getController() {
        return controller;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void init() {
        initGui();
        addWindowListener(new FrameListener(this));
        setVisible(true);
    }

    public void exit() {
        controller.exit();
    }

    public void initMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        MenuHelper.initFileMenu(this, menuBar);
        MenuHelper.initEditMenu(this, menuBar);
        MenuHelper.initStyleMenu(this, menuBar);
        MenuHelper.initAlignMenu(this, menuBar);
        MenuHelper.initColorMenu(this, menuBar);
        MenuHelper.initFontMenu(this, menuBar);
        MenuHelper.initHelpMenu(this, menuBar);

        getContentPane().add(menuBar, BorderLayout.NORTH);
    }

    public void initEditor() {
        htmlTextPane.setContentType("text/html");
        JScrollPane htmlScrollPane = new JScrollPane(htmlTextPane);
        tabbedPane.addTab("HTML", htmlScrollPane);

        JScrollPane plainScrollPane = new JScrollPane(plainTextPane);
        tabbedPane.addTab("Текст", plainScrollPane);

        tabbedPane.setPreferredSize(new Dimension(300, 300));

        tabbedPane.addChangeListener(new TabbedPaneChangeListener(this));

        getContentPane().add(tabbedPane, BorderLayout.CENTER);
    }

    public void initGui() {
        initMenuBar();
        initEditor();
        pack();
    }

    public void selectedTabChanged() {

    }
}