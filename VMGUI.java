package Main;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import Main.ReportGUI.ReportGenerator;
import java.awt.Color;
import java.awt.Font;

public class VMGUI extends javax.swing.JFrame {
    // ...(class members, constructor, methods)

    private ReportGUI.ReportGenerator reportGenerator;

    private double balance = 0.0;
    private double selectedDrinkPrice = 0.0;
    private List<Drink> drinks;

    public VMGUI() {
        initComponents();
        loadDrinksData();
        centerWindow();

        reportGenerator = new ReportGUI.ReportGenerator();

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

        cocacola_btn = new javax.swing.JRadioButton();
        colazero_btn = new javax.swing.JRadioButton();
        fantaorange_btn = new javax.swing.JRadioButton();
        fantagrape_btn = new javax.swing.JRadioButton();
        sevenup_btn = new javax.swing.JRadioButton();
        pepsi_btn = new javax.swing.JRadioButton();
        sprite_btn = new javax.swing.JRadioButton();
        water_btn = new javax.swing.JRadioButton();

        drinkButtonGroup = new ButtonGroup();
        drinkButtonGroup.add(cocacola_btn);
        drinkButtonGroup.add(colazero_btn);
        drinkButtonGroup.add(fantaorange_btn);
        drinkButtonGroup.add(fantagrape_btn);
        drinkButtonGroup.add(sevenup_btn);
        drinkButtonGroup.add(pepsi_btn);
        drinkButtonGroup.add(sprite_btn);
        drinkButtonGroup.add(water_btn);

        cocacola_img = new javax.swing.JLabel();
        colazero_img = new javax.swing.JLabel();
        fantaorange_img = new javax.swing.JLabel();
        fantagrape_img = new javax.swing.JLabel();
        cocacola_label = new javax.swing.JLabel();
        colazero_label = new javax.swing.JLabel();
        fantaorange_label = new javax.swing.JLabel();
        fantagrape_label = new javax.swing.JLabel();
        sevenup_label = new javax.swing.JLabel();
        pepsi_img = new javax.swing.JLabel();
        sprite_img = new javax.swing.JLabel();
        water_img = new javax.swing.JLabel();
        pepsi_label = new javax.swing.JLabel();
        sprite_label = new javax.swing.JLabel();
        water_label = new javax.swing.JLabel();
        sevenup_img = new javax.swing.JLabel();
        heading_label = new javax.swing.JLabel();
        rm10 = new javax.swing.JButton();
        rm5 = new javax.swing.JButton();
        rm1 = new javax.swing.JButton();
        cents = new javax.swing.JButton();
        balance_panel = new javax.swing.JPanel();
        balance_label = new javax.swing.JLabel();
        change_label = new javax.swing.JLabel();
        balance_display = new javax.swing.JTextField();
        change_display = new javax.swing.JTextField();
        cost_display = new javax.swing.JTextField();
        cost_label = new javax.swing.JLabel();
        clear_btn = new javax.swing.JButton();
        admin_btn = new javax.swing.JButton();
        purchase_btn = new javax.swing.JButton();
        exit_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vending Machine");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setName("VMGUI"); // NOI18N
        getContentPane().setLayout(new java.awt.GridBagLayout());

        cocacola_btn.addActionListener((java.awt.event.ActionEvent evt) -> {
            cocacola_btnActionPerformed(evt);
            drinkSelected(evt);
        });
        colazero_btn.addActionListener(this::drinkSelected);
        fantaorange_btn.addActionListener(this::drinkSelected);
        fantagrape_btn.addActionListener(this::drinkSelected);
        sevenup_btn.addActionListener(this::drinkSelected);
        pepsi_btn.addActionListener(this::drinkSelected);
        sprite_btn.addActionListener(this::drinkSelected);
        water_btn.addActionListener(this::drinkSelected);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        getContentPane().add(cocacola_btn, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        getContentPane().add(colazero_btn, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        getContentPane().add(fantaorange_btn, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        getContentPane().add(fantagrape_btn, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
        getContentPane().add(sevenup_btn, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        getContentPane().add(pepsi_btn, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        getContentPane().add(sprite_btn, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        getContentPane().add(water_btn, gridBagConstraints);

        cocacola_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cocacola_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinks_img/coca_cola.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        getContentPane().add(cocacola_img, gridBagConstraints);

        colazero_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinks_img/cola_zero.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        getContentPane().add(colazero_img, gridBagConstraints);

        fantaorange_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinks_img/fanta_orange.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        getContentPane().add(fantaorange_img, gridBagConstraints);

        fantagrape_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinks_img/fanta_grape.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        getContentPane().add(fantagrape_img, gridBagConstraints);

        cocacola_label.setText("CocaCola RM2.50");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        getContentPane().add(cocacola_label, gridBagConstraints);

        colazero_label.setText("ColaZero RM2.50");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        getContentPane().add(colazero_label, gridBagConstraints);

        fantaorange_label.setText("FantaOrange RM3.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        getContentPane().add(fantaorange_label, gridBagConstraints);

        fantagrape_label.setText("FantaGrape RM3.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        getContentPane().add(fantagrape_label, gridBagConstraints);

        sevenup_label.setText("7up RM2.50");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
        getContentPane().add(sevenup_label, gridBagConstraints);

        pepsi_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinks_img/pepsi.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        getContentPane().add(pepsi_img, gridBagConstraints);

        sprite_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinks_img/sprite.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        getContentPane().add(sprite_img, gridBagConstraints);

        water_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinks_img/mineral_water.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        getContentPane().add(water_img, gridBagConstraints);

        pepsi_label.setText("Pepsi RM2.50");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        getContentPane().add(pepsi_label, gridBagConstraints);

        sprite_label.setText("Sprite RM2.50");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        getContentPane().add(sprite_label, gridBagConstraints);

        water_label.setText("Mineral Water RM1.50");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        getContentPane().add(water_label, gridBagConstraints);

        sevenup_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drinks_img/sevenup.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        getContentPane().add(sevenup_img, gridBagConstraints);

        heading_label.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        heading_label.setText("Vending Machine");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        getContentPane().add(heading_label, gridBagConstraints);

        rm10.setText("RM 10"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 20, 10);
        getContentPane().add(rm10, gridBagConstraints);
        rm10.addActionListener(e -> updateBalance(10.0));

        rm5.setText("RM 5"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 20, 10);
        getContentPane().add(rm5, gridBagConstraints);
        rm5.addActionListener(e -> updateBalance(5.0));

        rm1.setText("RM 1"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 20, 10);
        getContentPane().add(rm1, gridBagConstraints);

        rm1.addActionListener(e -> updateBalance(1.0));

        cents.setText("RM0.50"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 20, 20);
        getContentPane().add(cents, gridBagConstraints);
        cents.addActionListener(e -> updateBalance(0.50));

        balance_panel.setPreferredSize(new java.awt.Dimension(200, 150));
        balance_panel.setLayout(new java.awt.GridBagLayout());

        balance_label.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        balance_label.setText("Balance:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 20);
        balance_panel.add(balance_label, gridBagConstraints);

        change_label.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        change_label.setText("Change:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        balance_panel.add(change_label, gridBagConstraints);

        cost_display.setText(" ");
        cost_display.setPreferredSize(new java.awt.Dimension(80, 30));
        cost_display.addActionListener(this::cost_displayActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        balance_panel.add(cost_display, gridBagConstraints);

        cost_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        cost_label.setText("Cost:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        balance_panel.add(cost_label, gridBagConstraints);

        balance_display.setPreferredSize(new java.awt.Dimension(80, 30));
        balance_display.setRequestFocusEnabled(false);
        balance_display.addActionListener(this::balance_displayActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        balance_panel.add(balance_display, gridBagConstraints);

        change_display.setPreferredSize(new java.awt.Dimension(80, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        balance_panel.add(change_display, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 20, 10);
        getContentPane().add(balance_panel, gridBagConstraints);

        clear_btn.setText("Clear");
        clear_btn.setPreferredSize(new java.awt.Dimension(100, 20));
        clear_btn.addActionListener(this::clear_btnActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 20, 10);
        getContentPane().add(clear_btn, gridBagConstraints);

        admin_btn.setText("Admin  >>");
        admin_btn.addActionListener(this::admin_btnActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 10;
        getContentPane().add(admin_btn, gridBagConstraints);

        purchase_btn.setText("Purchase");
        purchase_btn.setPreferredSize(new java.awt.Dimension(100, 20));
        purchase_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchase_btnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        getContentPane().add(purchase_btn, gridBagConstraints);

        exit_btn.setText("Exit");
        exit_btn.setPreferredSize(new java.awt.Dimension(100, 20));
        exit_btn.addActionListener(this::exitButtonClicked);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        getContentPane().add(exit_btn, gridBagConstraints);

        pack();
    }// </editor-fold>                        

    private void cocacola_btnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        balance = 0.0; //Reset balance to 0
        balance_display.setText(""); // Update balance display
        cost_display.setText("");
        change_display.setText("");// Clear change dislay
        selectedDrinkPrice = 0.0;//Reset selected drink price
        drinkButtonGroup.clearSelection(); // Clear selected drink radio button
    }

    private void balance_displayActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void purchase_btnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (selectedDrinkPrice > 0) {
            if (balance >= selectedDrinkPrice) {
                double change = balance - selectedDrinkPrice;
                if (change >= 0) {
                    updateBalance(-selectedDrinkPrice);
                    change_display.setText(String.format("%.2f", change));

                    // Determine the selected drink index based on the selected radio button
                    int selectedDrinkIndex = -1; // Default value if no drink is selected
                    if (cocacola_btn.isSelected()) {
                        selectedDrinkIndex = 0;
                    } else if (colazero_btn.isSelected()) {
                        selectedDrinkIndex = 1;
                    } else if (fantaorange_btn.isSelected()) {
                        selectedDrinkIndex = 2;
                    } else if (fantagrape_btn.isSelected()) {
                        selectedDrinkIndex = 3;
                    } else if (sevenup_btn.isSelected()) {
                        selectedDrinkIndex = 4;
                    } else if (sprite_btn.isSelected()) {
                        selectedDrinkIndex = 5;
                    } else if (pepsi_btn.isSelected()) {
                        selectedDrinkIndex = 6;
                    } else if (water_btn.isSelected()) {
                        selectedDrinkIndex = 7;
                    }

                    if (selectedDrinkIndex != -1) {
                        int currentQuantity = drinks.get(selectedDrinkIndex).getQuantity();
                        if (currentQuantity > 0) {
                            drinks.get(selectedDrinkIndex).setQuantity(currentQuantity - 1);
                            writeDrinksToFile(drinks, "C:/Users/yxinn/IdeaProjects/JavaVendingMachine/src/Main/drinks.txt");

                            // Update purchase information in ReportGenerator
                            String drinkName = drinks.get(selectedDrinkIndex).getName();
                            int drinkId = selectedDrinkIndex + 1; // Assuming id starts from 1
                            int drinkQuantity = 1; // Always 1 quantity when purchasing
                            double drinkPrice = selectedDrinkPrice;
                            
                            reportGenerator.purchaseRecord(drinkId, drinkName, drinkQuantity, drinkPrice);
                        } else {
                            JOptionPane.showMessageDialog(this, "This drink is out of stock.", "Out of Stock", JOptionPane.WARNING_MESSAGE);
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Insufficient balance. Please add more funds.", "Insufficient Balance", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Insufficient balance. Please add more funds.", "Insufficient Balance", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a drink before purchasing.", "No Drink Selected", JOptionPane.WARNING_MESSAGE);
        }
        drinkButtonGroup.clearSelection();
    }

    public void writeDrinksToFile(List<Drink> drinks, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Drink drink : drinks) {
                writer.write(drink.getId() + "," + drink.getName() + "," + drink.getQuantity() + "," + drink.getPrice());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cost_displayActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void admin_btnActionPerformed(java.awt.event.ActionEvent evt) {
        VMGUI.this.setVisible(false); // Hide the current VMGUI window
        AdminLogInGUI adminLogIn = new AdminLogInGUI(); // Create an instance of AdminLogInGUI
        adminLogIn.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                VMGUI.this.setVisible(true); // Show the VMGUI window when AdminLogInGUI is closed
            }
        });
        adminLogIn.setVisible(true); // Make the AdminLogInGUI window visible
    }

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VMGUI().setVisible(true);
        });

    }

    private void drinkSelected(java.awt.event.ActionEvent evt) {
        if (balance > 0) {
            if (cocacola_btn.isSelected()) {
                selectedDrinkPrice = drinks.get(0).getPrice();
                cost_display.setText(String.format("%.2f", selectedDrinkPrice));
            } else if (colazero_btn.isSelected()) {
                selectedDrinkPrice = drinks.get(1).getPrice();
                cost_display.setText(String.format("%.2f", selectedDrinkPrice));
            } else if (fantaorange_btn.isSelected()) {
                selectedDrinkPrice = drinks.get(2).getPrice();
                cost_display.setText(String.format("%.2f", selectedDrinkPrice));
            } else if (fantagrape_btn.isSelected()) {
                selectedDrinkPrice = drinks.get(3).getPrice();
                cost_display.setText(String.format("%.2f", selectedDrinkPrice));
            } else if (sevenup_btn.isSelected()) {
                selectedDrinkPrice = drinks.get(4).getPrice();
                cost_display.setText(String.format("%.2f", selectedDrinkPrice));
            } else if (pepsi_btn.isSelected()) {
                selectedDrinkPrice = drinks.get(5).getPrice();
                cost_display.setText(String.format("%.2f", selectedDrinkPrice));
            } else if (sprite_btn.isSelected()) {
                selectedDrinkPrice = drinks.get(6).getPrice();;
                cost_display.setText(String.format("%.2f", selectedDrinkPrice));
            } else if (water_btn.isSelected()) {
                selectedDrinkPrice = drinks.get(7).getPrice();
                cost_display.setText(String.format("%.2f", selectedDrinkPrice));
            } else {
                // Display an error message or perform other actions if the balance is not sufficient
                JOptionPane.showMessageDialog(this, "Insufficient balance. Please add more funds.", "Insufficient Balance", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter balance first.", "Empty Balance", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void updateBalance(double amount) {
        if (balance + amount >= 0) { // Check if the balance won't go negative
            balance += amount;
            balance_display.setText(String.format("%.2f", balance));
        } else {
            JOptionPane.showMessageDialog(this, "Insufficient balance. Please add more funds.", "Insufficient Balance", JOptionPane.WARNING_MESSAGE);
            // Display an error message or perform other actions if the balance goes negative
        }
    }

    private void exitButtonClicked(java.awt.event.ActionEvent evt) {
        if (balance > 0) {
            int choice = JOptionPane.showConfirmDialog(this, "Do you want to exit? You have an available balance of " + String.format("%.2f", balance) + ". ", "Exit Confirmation", JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                // User chose to exit, close the window
                dispose();
            }
        } else {
            // No balance, simply close the window
            dispose();
        }
    }

    private void loadDrinksData() {
        drinks = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/yxinn/IdeaProjects/JavaVendingMachine/src/Main/drinks.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String id = parts[0].trim();
                    String name = parts[1];
                    int quantity = Integer.parseInt(parts[2].trim());
                    double price = Double.parseDouble(parts[3].trim());
                    drinks.add(new Drink(id, name, quantity, price));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<String, JLabel> drinkLabelMap = new HashMap<>();

        drinkLabelMap.put("D001", cocacola_label);
        drinkLabelMap.put("D002", colazero_label);
        drinkLabelMap.put("D003", fantaorange_label);
        drinkLabelMap.put("D004", fantagrape_label);
        drinkLabelMap.put("D005", sevenup_label);
        drinkLabelMap.put("D006", pepsi_label);
        drinkLabelMap.put("D007", sprite_label);
        drinkLabelMap.put("D008", water_label);

        // Update the price in cocacola_label
        for (Drink drink : drinks) {
            JLabel label = drinkLabelMap.get(drink.getId());

            if (label != null) {
                if (drink.getQuantity() == 0) {
                    label.setText("Sold Out");
                    label.setForeground(Color.RED);
                    label.setFont(label.getFont().deriveFont(Font.BOLD));
                } else {
                    label.setText(drink.getName() + " RM" + String.format("%.2f", drink.getPrice()));
                    label.setForeground(Color.BLACK);
                    label.setFont(label.getFont().deriveFont(Font.PLAIN));
                }
            }
        }

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
        //Getter methods
        public double getPrice() {
            return price;
        }
        public int getQuantity() {
            return quantity;
        }
        public String getName() {
            return name;
        }
        public String getId() {
            return id;
        }
        //Setter methods
        public void setId(String id) {
            this.id = id;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
        public void setPrice(double price) {
            this.price = price;
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton admin_btn;
    private javax.swing.JTextField balance_display;
    private javax.swing.JLabel balance_label;
    private javax.swing.JPanel balance_panel;
    private javax.swing.JButton cents;
    private javax.swing.JTextField change_display;
    private javax.swing.JLabel change_label;
    private javax.swing.JButton clear_btn;
    private javax.swing.JRadioButton cocacola_btn;
    private javax.swing.JLabel cocacola_img;
    private javax.swing.JLabel cocacola_label;
    private javax.swing.JRadioButton colazero_btn;
    private javax.swing.JLabel colazero_img;
    private javax.swing.JLabel colazero_label;
    private javax.swing.JTextField cost_display;
    private javax.swing.JLabel cost_label;
    private javax.swing.JRadioButton fantagrape_btn;
    private javax.swing.JLabel fantagrape_img;
    private javax.swing.JLabel fantagrape_label;

    private javax.swing.JRadioButton fantaorange_btn;
    private javax.swing.JLabel fantaorange_img;
    private javax.swing.JLabel fantaorange_label;
    private javax.swing.JLabel heading_label;
    private javax.swing.JRadioButton pepsi_btn;
    private javax.swing.JLabel pepsi_img;
    private javax.swing.JLabel pepsi_label;
    private javax.swing.JButton purchase_btn;
    private javax.swing.JButton rm1;
    private javax.swing.JButton rm10;
    private javax.swing.JButton rm5;
    private javax.swing.JRadioButton sevenup_btn;
    private javax.swing.JLabel sevenup_img;
    private javax.swing.JLabel sevenup_label;
    private javax.swing.JRadioButton sprite_btn;
    private javax.swing.JLabel sprite_img;
    private javax.swing.JLabel sprite_label;
    private javax.swing.JRadioButton water_btn;
    private javax.swing.JLabel water_img;
    private javax.swing.JLabel water_label;
    private ButtonGroup drinkButtonGroup;
    private javax.swing.JButton exit_btn;
    // End of variables declaration                   
}
