package Main;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class AdminLogInGUI extends javax.swing.JFrame {

    public AdminLogInGUI() {
        initComponents();
        centerWindow();
        setSize(800, 600);

        loadAdminFile("C:/Users/yxinn/IdeaProjects/JavaVendingMachine/src/Main/admin.txt");
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

        admin_label = new javax.swing.JLabel();
        adminID_label = new javax.swing.JLabel();
        password_label = new javax.swing.JLabel();
        adminID_input = new javax.swing.JTextField();
        adminLogIn_btn = new javax.swing.JButton();
        adminPW_input = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Log In Page");
        setPreferredSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        admin_label.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        admin_label.setText("Admin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        getContentPane().add(admin_label, gridBagConstraints);

        adminID_label.setText("Admin ID:");
        adminID_label.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        getContentPane().add(adminID_label, gridBagConstraints);

        password_label.setText("Password:");
        password_label.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        getContentPane().add(password_label, gridBagConstraints);

        adminID_input.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        getContentPane().add(adminID_input, gridBagConstraints);

        adminLogIn_btn.setText("Log In");
        adminLogIn_btn.addActionListener((ActionEvent e) -> {
            String adminID = adminID_input.getText().trim();
            char[] password = adminPW_input.getPassword();
            String enteredPassword = new String(password);
            
            if (adminID.isEmpty() || enteredPassword.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter both admin ID and password.", "Validation Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            // Continue with validation if fields are not empty
            boolean isValid = validateAdminCredentials(adminID, enteredPassword);
            
            if (isValid) {
                // Successful login, open the AdminGUI window and dispose of the current window
                AdminGUI adminWindow = new AdminGUI();
                adminWindow.setVisible(true);
                VMGUI vmWindow = new VMGUI();
                vmWindow.setVisible(false);
                dispose(); // Close the current login window
            } else {
                // Failed login, show an error message
                JOptionPane.showMessageDialog(null, "Invalid admin ID or password. Please try again.", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(adminLogIn_btn, gridBagConstraints);

        adminPW_input.setText("");
        adminPW_input.setPreferredSize(new java.awt.Dimension(200, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        getContentPane().add(adminPW_input, gridBagConstraints);

        showPasswordCheckBox = new javax.swing.JCheckBox("Show Password");
        showPasswordCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adminPW_input.setEchoChar(showPasswordCheckBox.isSelected() ? '\u0000' : '*');
            }
        });
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        getContentPane().add(showPasswordCheckBox, gridBagConstraints);

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminLogInGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogInGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogInGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogInGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogInGUI().setVisible(true);
            }
        });
    }

    Map<String, String> admin = new HashMap<>();

    private void loadAdminFile(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:/Users/yxinn/IdeaProjects/JavaVendingMachine/src/Main/admin.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String adminID = parts[0].trim();
                    String password = parts[1].trim();
                    admin.put(adminID, password);
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean validateAdminCredentials(String enteredAdminID, String enteredPassword) {
        // Check if the entered admin ID exists in the map
        if (admin.containsKey(enteredAdminID)) {

            String storedPassword = admin.get(enteredAdminID);
            return storedPassword.equals(enteredPassword);
        }

        return false; // Invalid admin ID or password
    }

    private void admin_btnActionPerformed(java.awt.event.ActionEvent evt) {
        // Hide the current VMGUI window
        setVisible(false);

        // Create an instance of AdminLogInGUI
        AdminLogInGUI adminLogIn = new AdminLogInGUI();

        // Add a window listener to show the VMGUI window when AdminLogInGUI is closed
        adminLogIn.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                // Show the VMGUI window when AdminLogInGUI is closed
                setVisible(true);
            }
        });

        // Make the AdminLogInGUI window visible
        adminLogIn.setVisible(true);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField adminID_input;
    private javax.swing.JLabel adminID_label;
    private javax.swing.JButton adminLogIn_btn;
    private javax.swing.JPasswordField adminPW_input;
    private javax.swing.JLabel admin_label;
    private javax.swing.JLabel password_label;
    private javax.swing.JCheckBox showPasswordCheckBox;
    // End of variables declaration                   
}
