package Main;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

public class AdminGUI extends javax.swing.JFrame {

    private DefaultTableModel tableModel;
    
    private JTable table;

    public AdminGUI() {
        initComponents();
        centerWindow();
        updateTableData();

        loadDrinkDataFromFile("C:/Users/yxinn/IdeaProjects/JavaVendingMachine/src/Main/drinks.txt");
    }

    private void centerWindow() {
        // Get the screen dimensions
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calculate the center coordinates
        int centerX = (screenSize.width - getWidth()) / 2;
        int centerY = (screenSize.height - getHeight()) / 2;

        // Set the JFrame's location to center
        setLocation(centerX, centerY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        IM_label = new javax.swing.JLabel();
        drinks_table = new javax.swing.JScrollPane();
        drinksTable = new javax.swing.JTable();
        edit_drinks_label = new javax.swing.JLabel();
        edit_drinks_input = new javax.swing.JTextField();
        edit_quantity_label = new javax.swing.JLabel();
        edit_quantity_input = new javax.swing.JSpinner();
        edit_price_label = new javax.swing.JLabel();
        edit_price_input = new javax.swing.JSpinner();
        save_changes_btn = new javax.swing.JButton();
        report_btn = new javax.swing.JButton();
        search_btn = new javax.swing.JButton();
        edit_name_label = new javax.swing.JLabel();
        edit_name_input = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        IM_label.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        IM_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IM_label.setText("Inventory Management");
        IM_label.setPreferredSize(new java.awt.Dimension(400, 80));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        getContentPane().add(IM_label, gridBagConstraints);

        drinksTable.setOpaque(false);
        drinksTable.setPreferredSize(new java.awt.Dimension(300, 200));
        drinksTable = new javax.swing.JTable(10, 4);
        drinks_table.setViewportView(drinksTable);
        drinksTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{"ID", "Name", "Quantity", "Price"}
        ));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 30, 0);
        getContentPane().add(drinks_table, gridBagConstraints);

        edit_drinks_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        edit_drinks_label.setText("Drinks ID:");
        edit_drinks_label.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 30, 50);
        getContentPane().add(edit_drinks_label, gridBagConstraints);

        edit_drinks_input.setText(" ");
        edit_drinks_input.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 50);
        getContentPane().add(edit_drinks_input, gridBagConstraints);

        edit_name_label.setText("Name:");
        edit_name_label.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 30, 50);
        getContentPane().add(edit_name_label, gridBagConstraints);

        edit_name_input.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 50);
        getContentPane().add(edit_name_input, gridBagConstraints);

        edit_quantity_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        edit_quantity_label.setText("Quantity:");
        edit_quantity_label.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 30, 50);
        getContentPane().add(edit_quantity_label, gridBagConstraints);

        edit_quantity_input.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 50);
        getContentPane().add(edit_quantity_input, gridBagConstraints);

        edit_price_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        edit_price_label.setText("Price:");
        edit_price_label.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 30, 50);
        getContentPane().add(edit_price_label, gridBagConstraints);

        edit_price_input = new javax.swing.JSpinner(new SpinnerNumberModel(0.00, 0.00, Double.MAX_VALUE, 0.50));
        edit_price_input.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 50);
        getContentPane().add(edit_price_input, gridBagConstraints);

        save_changes_btn.setText("Save Changes");
        save_changes_btn.setMaximumSize(new java.awt.Dimension(150, 23));
        save_changes_btn.setPreferredSize(new java.awt.Dimension(130, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        save_changes_btn.addActionListener((var e) -> {
            String selectedDrinkId = edit_drinks_input.getText().trim();

            if (selectedDrinkId.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a valid drink ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            String updatedName = edit_name_input.getText().trim();
            int updatedQuantity = (int) edit_quantity_input.getValue();
            double updatedPrice = (double) edit_price_input.getValue();

            DefaultTableModel model = (DefaultTableModel) drinksTable.getModel();
            for (int row = 0; row < model.getRowCount(); row++) {
                String drinkId = model.getValueAt(row, 0).toString();
                if (drinkId.equals(selectedDrinkId)) {
                    model.setValueAt(updatedName, row, 1); // Update name
                    model.setValueAt(updatedQuantity, row, 2); // Update quantity
                    model.setValueAt(updatedPrice, row, 3); // Update price
                    break;
                }
            }
            updateDataInFile(selectedDrinkId, updatedName, updatedQuantity, updatedPrice);

            JOptionPane.showMessageDialog(this, "Changes saved successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        });

        getContentPane().add(save_changes_btn, gridBagConstraints);

        report_btn.setText("Report >>");
        report_btn.addActionListener(e -> {
            ReportGUI reportGUI = new ReportGUI();
            reportGUI.setVisible(true);
            setVisible(false);
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 50);

        getContentPane()
                .add(report_btn, gridBagConstraints);

        search_btn.setText("Search");
        search_btn.setPreferredSize(
                new java.awt.Dimension(110, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 30, 0);
        getContentPane().add(search_btn, gridBagConstraints);

        search_btn.addActionListener((ActionEvent e) -> {
            // Get the input from the edit_drinks_input text field
            String searchText = edit_drinks_input.getText().trim();

            searchAndPopulateFields(searchText);
        });

        pack();
    }// </editor-fold>                        

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminGUI().setVisible(true);
        });
    }

    public class Drink {

        private String id;
        private String name;
        private int quantity;
        private double price;

        public Drink(String id, String name, int quantity, double price) {
            this.id = id;
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }

        // Getters and setters for each attribute
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
        
        
    }

    private void loadDrinkDataFromFile(String filePath) {
        DefaultTableModel model = (DefaultTableModel) drinksTable.getModel();
        model.setRowCount(0); // Clear existing rows

        try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/yxinn/IdeaProjects/JavaVendingMachine/src/Main/drinks.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3) {
        String id = parts[0];
        String name = parts[1];
        int quantity = Integer.parseInt(parts[2]);
        double price = 0.0; // Default value in case price is missing
        if (parts.length == 4) {
            price = Double.parseDouble(parts[3]);
        }
        model.addRow(new Object[]{id, name, quantity, price});
        }

            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private void updateTableData() {
        try {
            ArrayList<Object[]> data = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader("DrinksDetails"));
            String line;
            int rowCount = 0;
            while ((line = reader.readLine()) != null) {
                String[] rowData = line.split(",");
                if (rowData.length == 5) {
                    String drinkId = rowData[0];
                    String name = rowData[1];
                    String price = rowData[2];
                    String stock = rowData[3];
                    String imagePath = rowData[4];
                    ImageIcon imageIcon = new ImageIcon(imagePath);
                    int drinkNumber = Integer.parseInt(drinkId.substring(2));
                    data.add(new Object[]{name, price, stock, imageIcon, drinkNumber});
                    rowCount++;
                } else {
                    System.out.println("Invalid row data: " + line);
                }
            }
            reader.close();

            String[] columnNames = {"Drink Name", "Price", "Stock", "Image"};
            tableModel = new DefaultTableModel(columnNames, 0);
            for (Object[] row : data) {
                tableModel.addRow(new Object[]{row[0], row[1], row[2], row[3]});
            }

            table.setModel(tableModel);
            // ... Other table setup code ...

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    private void searchAndPopulateFields(String searchText) {
        DefaultTableModel model = (DefaultTableModel) drinksTable.getModel();
        boolean drinkFound = false;

        for (int row = 0; row < model.getRowCount(); row++) {
            String drinkId = model.getValueAt(row, 0).toString(); // Assuming ID is in the first column
            if (drinkId.equals(searchText)) {
                // Drink data found, populate input fields
                edit_name_input.setText(model.getValueAt(row, 1).toString()); // Name
                edit_quantity_input.setValue(model.getValueAt(row, 2)); // Quantity
                edit_price_input.setValue(Double.parseDouble(model.getValueAt(row, 3).toString())); // Price
                drinkFound = true;
                break; // Stop searching after the first match
            }
        }

        if (!drinkFound) {
            JOptionPane.showMessageDialog(this, "Drink ID not found.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }
    }

    private void clearFields() {
        edit_name_input.setText("");
        edit_quantity_input.setValue(0);
        edit_price_input.setValue(0.00);
    }

    private void updateDataInFile(String selectedDrinkId, String updatedName, int updatedQuantity, double updatedPrice) {
        String filePath = "C:/Users/yxinn/IdeaProjects/JavaVendingMachine/src/Main/drinks.txt";
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
            for (int i = 0; i < lines.size(); i++) {
                String[] parts = lines.get(i).split(",");
                if (parts.length == 4 && parts[0].equals(selectedDrinkId)) {
                    lines.set(i, selectedDrinkId + "," + updatedName + "," + updatedQuantity + "," + updatedPrice);
                    break;
                }
            }
            Files.write(Paths.get(filePath), lines, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating data in file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JLabel IM_label;
    private javax.swing.JScrollPane drinks_table;
    private javax.swing.JLabel edit_drinks_label;
    private javax.swing.JTextField edit_drinks_input;
    private javax.swing.JTextField edit_name_input;
    private javax.swing.JLabel edit_name_label;
    private javax.swing.JSpinner edit_price_input;
    private javax.swing.JLabel edit_price_label;
    private javax.swing.JSpinner edit_quantity_input;
    private javax.swing.JLabel edit_quantity_label;
    private javax.swing.JTable drinksTable;
    private javax.swing.JButton report_btn;
    private javax.swing.JButton save_changes_btn;
    private javax.swing.JButton search_btn;
    // End of variables declaration                   
}
