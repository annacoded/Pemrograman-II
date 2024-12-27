package PRAKTIKUM6;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MainGUI extends JFrame {
    public MainGUI() {
        // Set title
        setTitle("Daftar Mahasiswa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);

        // Create table columns
        String[] columnNames = {"NIM", "Nama"};
        Object[][] data = {
            {"2310817120002", "Siti Ratna Dwinta Sari"},
            {"2310817120005", "Noviana Nur Aisyah"},
            {"2310817120003", "Natalie Grace Katiandagho"},
            {"2310817210004", "Allano Lintang Ertantora"},
            {"2310817310010", "Akmallulail Sya'ban"},
            {"2310817210019", "Naufal Elyzar"},
            {"2310817120014", "Aliya Raffa Naura Ayu"},
            {"2310817210009", "Muhammad Ibnu Sina"},
            {"2310817320007", "Zahra Nabila"},
            {"2310817310011", "Muhammad Rizky"}
        };

        // Create table model and table
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        // Add table to scroll pane
        JScrollPane scrollPane = new JScrollPane(table);

        // Set layout
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);

        // Make the window visible
        setVisible(true);
    }
}
