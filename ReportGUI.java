package Main;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingUtilities;

public class ReportGUI extends javax.swing.JFrame {

    public CustomReportGenerator reportGenerator;

    public ReportGUI() {
        reportGenerator = new CustomReportGenerator();
        initComponents();
        centerWindow();

        String bestSellingDrink = reportGenerator.calculateBestSellingDrinks();
        best_selling_output.setText(bestSellingDrink);

        double totalSales = reportGenerator.calculateTotalSales();
        String totalSalesAsString = String.valueOf(totalSales);
        total_revenue_output.setText(totalSalesAsString);

        int totalTransaction = reportGenerator.calculateTotalTransaction();
        String totalTransactionAsString = String.valueOf(totalTransaction);
        transaction_output.setText(totalTransactionAsString);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        report_label = new javax.swing.JLabel();
        best_selling_label = new javax.swing.JLabel();
        transaction_label = new javax.swing.JLabel();
        total_revenue_label = new javax.swing.JLabel();
        best_selling_output = new javax.swing.JTextField();
        total_revenue_output = new javax.swing.JTextField();
        transaction_output = new javax.swing.JTextField();
        back_btn = new javax.swing.JButton();
        totalSalesAmount_label = new javax.swing.JLabel();
        totalSalesAmount_select = new javax.swing.JComboBox<>();
        totalSalesAmount_output = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(800, 700));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        report_label.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        report_label.setText("Sales Report Summary");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 50, 0, 50);
        getContentPane().add(report_label, gridBagConstraints);

        best_selling_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        best_selling_label.setText("Best Selling Drinks:");
        best_selling_label.setPreferredSize(new java.awt.Dimension(150, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 50, 0, 0);
        getContentPane().add(best_selling_label, gridBagConstraints);

        transaction_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        transaction_label.setText("Total Transaction: ");
        transaction_label.setPreferredSize(new java.awt.Dimension(150, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 50, 0, 0);
        getContentPane().add(transaction_label, gridBagConstraints);

        total_revenue_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_revenue_label.setText("Total Revenue:");
        total_revenue_label.setPreferredSize(new java.awt.Dimension(150, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 50, 0, 0);
        getContentPane().add(total_revenue_label, gridBagConstraints);

        best_selling_output.setText(" ");
        best_selling_output.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 50, 0, 0);
        getContentPane().add(best_selling_output, gridBagConstraints);

        total_revenue_output.setText(" ");
        total_revenue_output.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 50, 0, 0);
        getContentPane().add(total_revenue_output, gridBagConstraints);

        transaction_output.setText(" ");
        transaction_output.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 50, 0, 0);
        getContentPane().add(transaction_output, gridBagConstraints);

        back_btn.setText("Back");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        getContentPane().add(back_btn, gridBagConstraints);
        back_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdminGUI adminPage = new AdminGUI();
                adminPage.setVisible(true);
                setVisible(false); // Hide the current report GUI
            }
        });

        totalSalesAmount_label.setText("Drinks Sales Amount:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 50, 0, 0);
        getContentPane().add(totalSalesAmount_label, gridBagConstraints);

        totalSalesAmount_select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));
        totalSalesAmount_select.setMinimumSize(new java.awt.Dimension(100, 30));
        totalSalesAmount_select.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(30, 50, 0, 0);
        getContentPane().add(totalSalesAmount_select, gridBagConstraints);
        List<String> drinkNames = reportGenerator.getDrinkNames();
        totalSalesAmount_select.setModel(new DefaultComboBoxModel<>(drinkNames.toArray(new String[0])));
        totalSalesAmount_select.setMinimumSize(new Dimension(100, 30));
        totalSalesAmount_select.setPreferredSize(new Dimension(100, 30));
        totalSalesAmount_select.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedDrink = (String) totalSalesAmount_select.getSelectedItem();
                int totalAmountForDrinks = reportGenerator.calculateTotalAmountForDrinks(selectedDrink);
                totalSalesAmount_output.setText(Integer.toString(totalAmountForDrinks));
            }
        });

        totalSalesAmount_output.setText(" ");
        totalSalesAmount_output.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 50, 0);
        getContentPane().add(totalSalesAmount_output, gridBagConstraints);

        pack();
    }// </editor-fold>                        

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            ReportGUI reportGUI = new ReportGUI();
            // Display the GUI
            reportGUI.setVisible(true);
        });
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

    public static class ReportGenerator {

        private static final String FILE_PATH = "C:/Users/yxinn/IdeaProjects/JavaVendingMachine/src/Main/report.txt";
        private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        public void purchaseRecord(int id, String name, int quantity, double price) {
            LocalDateTime timeOfPurchase;
            timeOfPurchase = LocalDateTime.now();

            String formattedId = String.format("D%03d", id);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
                String line = String.format("%s,%s,%d,%.2f,%s", formattedId, name, quantity, price, timeOfPurchase.format(DATE_TIME_FORMATTER));

                writer.write(line);
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public String calculateBestSellingDrinks() {
            Map<String, Integer> drinkSales = new HashMap<>();

            try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] record = line.split(",");
                    if (record.length >= 2) { // Ensure the record is valid
                        String drinkName = record[1];
                        int quantity = Integer.parseInt(record[2]);
                        drinkSales.put(drinkName, drinkSales.getOrDefault(drinkName, 0) + quantity);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Find best selling drinks
            int maxQuantity = 0;
            String bestSellingDrink = "";
            for (Map.Entry<String, Integer> entry : drinkSales.entrySet()) {
                if (entry.getValue() > maxQuantity) {
                    maxQuantity = entry.getValue();
                    bestSellingDrink = entry.getKey();
                }
            }
            return bestSellingDrink;
        }

        public double calculateTotalSales() {
            double totalSales = 0.0;

            try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] record = line.split(",");
                    if (record.length >= 4) { // Ensure the record is valid
                        int quantity = Integer.parseInt(record[2]);
                        double price = Double.parseDouble(record[3]);
                        totalSales += quantity * price;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            return totalSales;
        }

        public int calculateTotalTransaction() {
            int totalTransaction = 0;
            try (BufferedReader read = new BufferedReader(new FileReader(FILE_PATH))) {
                while (read.readLine() != null) {
                    totalTransaction++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return totalTransaction;
        }

        public List<String> getDrinkNames() {
            Set<String> drinkNames = new HashSet<>();

            try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] record = line.split(",");
                    if (record.length >= 2) {
                        String drinkName = record[1];
                        if (!drinkNames.contains(drinkName)) {
                            drinkNames.add(drinkName);
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            return new ArrayList<>(drinkNames);
        }

        public int calculateTotalAmountForDrinks(String drinkName) {
            int totalAmountForDrinks = 0;

            try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] record = line.split(",");
                    if (record.length >= 4) {
                        String name = record[1];
                        if (name.equals(drinkName)) {
                            totalAmountForDrinks++;
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            return totalAmountForDrinks;
        }
    }

    public class CustomReportGenerator extends ReportGenerator {

        private static final String FILE_PATH = "C:/Users/yxinn/IdeaProjects/JavaVendingMachine/src/Main/report.txt";

        @Override
        public String calculateBestSellingDrinks() {
            Map<String, Integer> drinkSales = new HashMap<>();

            try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] record = line.split(",");
                    if (record.length >= 2) { // Ensure the record is valid
                        String drinkName = record[1];
                        int quantity = Integer.parseInt(record[2]);
                        drinkSales.put(drinkName, drinkSales.getOrDefault(drinkName, 0) + quantity);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Find best selling drinks
            int maxQuantity = 0;
            String bestSellingDrink = "";
            for (Map.Entry<String, Integer> entry : drinkSales.entrySet()) {
                if (entry.getValue() > maxQuantity) {
                    maxQuantity = entry.getValue();
                    bestSellingDrink = entry.getKey();

                }
            }
            return bestSellingDrink;
        }

        @Override
        public double calculateTotalSales() {
            double totalSales = 0.0;

            try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] record = line.split(",");
                    if (record.length >= 4) { // Ensure the record is valid
                        int quantity = Integer.parseInt(record[2]);
                        double price = Double.parseDouble(record[3]);
                        totalSales += quantity * price;

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            return totalSales;
        }

        @Override
        public int calculateTotalTransaction() {
            int totalTransaction = 0;
            try (BufferedReader read = new BufferedReader(new FileReader(FILE_PATH))) {
                while (read.readLine() != null) {
                    totalTransaction++;

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return totalTransaction;
        }

        @Override
        public List<String> getDrinkNames() {
            Set<String> drinkNames = new HashSet<>();

            try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] record = line.split(",");
                    if (record.length >= 2) {
                        String drinkName = record[1];
                        if (!drinkNames.contains(drinkName)) {
                            drinkNames.add(drinkName);
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            return new ArrayList<>(drinkNames);
        }

        @Override
        public int calculateTotalAmountForDrinks(String drinkName) {
            int totalAmountForDrinks = 0;

            try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] record = line.split(",");
                    if (record.length >= 4) {
                        String name = record[1];
                        if (name.equals(drinkName)) {
                            totalAmountForDrinks++;

                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            return totalAmountForDrinks;
        }
    }

    public void setBestSellingOutput(String bestSellingOutput) {
        best_selling_output.setText(bestSellingOutput);
    }

    public void updateTotalSales() {
        double totalSales = reportGenerator.calculateTotalSales();
        String totalSalesAsString = String.valueOf(totalSales);
        total_revenue_output.setText(totalSalesAsString); // Update the UI text field
    }

    public void updateTotalTransaction() {
        int totalTransaction = reportGenerator.calculateTotalTransaction();
        String totalTransactionAsString = String.valueOf(totalTransaction);
        transaction_output.setText(totalTransactionAsString); // Update the UI text field
    }

// Variables declaration - do not modify                     
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel best_selling_label;
    private javax.swing.JLabel totalSalesAmount_label;
    private javax.swing.JTextField best_selling_output;
    private javax.swing.JTextField total_revenue_output;
    private javax.swing.JTextField transaction_output;
    private javax.swing.JLabel report_label;
    private javax.swing.JLabel transaction_label;
    private javax.swing.JTextField totalSalesAmount_output;
    private javax.swing.JComboBox<String> totalSalesAmount_select;
    private javax.swing.JLabel total_revenue_label;
    // End of variables declaration                   
}
