package src.main.java;

import javax.swing.*;

public class MainUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Database Application");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JButton createButton = new JButton("Create Tables");
        createButton.setBounds(10, 20, 160, 25);
        createButton.addActionListener(e -> DatabaseOperations.createTables());
        panel.add(createButton);

        JButton dropButton = new JButton("Drop Tables");
        dropButton.setBounds(10, 60, 160, 25);
        dropButton.addActionListener(e -> DatabaseOperations.dropTables());
        panel.add(dropButton);

        JButton populateButton = new JButton("Populate Tables");
        populateButton.setBounds(10, 100, 160, 25);
        populateButton.addActionListener(e -> DatabaseOperations.populateTables());
        panel.add(populateButton);

        JButton queryButton = new JButton("Query Tables");
        queryButton.setBounds(10, 140, 160, 25);
        queryButton.addActionListener(e -> DatabaseOperations.queryTables());
        panel.add(queryButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(10, 180, 160, 25);
        exitButton.addActionListener(e -> System.exit(0));
        panel.add(exitButton);
    }
}
