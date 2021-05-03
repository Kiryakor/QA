package com.javatechie.travis.api;

import com.javatechie.travis.api.parser.MyParser;
import com.javatechie.travis.api.userHistory.UserHistory;
import com.javatechie.travis.api.userHistory.UserHistoryServiceImp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SimpleGUI extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("");

    private JTable table;
    private DefaultTableModel tableModel;
    private Object[] columnsHeader = new String[] {"Запрос", "Ответ"};
    private Object[][] userHistoryArray;

    MyParser myParser = new MyParser();

    UserHistoryServiceImp userHistoryService = new UserHistoryServiceImp();

    public SimpleGUI() {
        super("Simple Example");
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(input);

        label.setName("anwerLabel");
        container.add(label);

        Object[] columnsHeader = new String[] {"Наименование", "Ед.измерения"};
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(columnsHeader);
        table = new JTable(tableModel);
        table.setName("table");
        prepareData();
        container.add(table);

        button.setName("actionButton");
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            userHistoryService.add(input.getText());
            message = myParser.action(input.getText());
            label.setText(message);

            Object[] columnsHeader = new String[] { input.getText(), message};

            input.setText("");
            tableModel.addRow(columnsHeader);
            table.updateUI();
        }
    }

    public void prepareData() {
        try {
            Iterable<UserHistory> data = userHistoryService.listAll();
            for (UserHistory t : data) {
                Object[] columnsHeader = new String[]{t.getAnswer(), t.getRequest()};
                tableModel.addRow(columnsHeader);
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static void main(String[] args) {
        SimpleGUI app = new SimpleGUI();
        app.setVisible(true);
    }
}