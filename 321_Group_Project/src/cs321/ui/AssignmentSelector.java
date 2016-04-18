/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs321.ui;

import cs321.other.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Joshua
 */
public class AssignmentSelector extends javax.swing.JFrame {

    /**
     * Creates new form AssignmentSelector
     */
    private AssignmentSelector() {
        initComponents();
    }

    /**
     * Get a reference to the instance of AssignmentSelector.
     *
     * @return A reference to the instance of AssignmentSelector.
     */
    public static AssignmentSelector getInstance() {
        if (instance == null) {
            instance = new AssignmentSelector();
        }
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        assignment1Button = new javax.swing.JButton();
        assignment2Button = new javax.swing.JButton();
        assignment3Button = new javax.swing.JButton();
        assignment4Button = new javax.swing.JButton();
        assignment5Button = new javax.swing.JButton();
        exitMainMenuButton = new javax.swing.JButton();
        importAssignmentButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        ExitToMainMenuMenutItem = new javax.swing.JMenuItem();
        ExitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        SettingsMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        AboutMenuItem = new javax.swing.JMenuItem();

        assignment1Button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        assignment1Button.setText("Assignment 1");
        assignment1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignment1ButtonActionPerformed(evt);
            }
        });

        assignment2Button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        assignment2Button.setText("Assignment 2");
        assignment2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignment2ButtonActionPerformed(evt);
            }
        });

        assignment3Button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        assignment3Button.setText("Assignment 3");
        assignment3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignment3ButtonActionPerformed(evt);
            }
        });

        assignment4Button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        assignment4Button.setText("Assignment 4");
        assignment4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignment4ButtonActionPerformed(evt);
            }
        });

        assignment5Button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        assignment5Button.setText("Assignment 5");
        assignment5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignment5ButtonActionPerformed(evt);
            }
        });

        exitMainMenuButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        exitMainMenuButton.setText("Exit to Main Menu");
        exitMainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMainMenuButtonActionPerformed(evt);
            }
        });

        importAssignmentButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        importAssignmentButton.setText("Import Assignment");
        importAssignmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importAssignmentButtonActionPerformed(evt);
            }
        });

        fileMenu.setText("File");

        ExitToMainMenuMenutItem.setText("Exit to Main Menu");
        ExitToMainMenuMenutItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitToMainMenuMenutItemActionPerformed(evt);
            }
        });
        fileMenu.add(ExitToMainMenuMenutItem);

        ExitMenuItem.setText("Exit");
        ExitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(ExitMenuItem);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");

        SettingsMenuItem.setText("Settings");
        SettingsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(SettingsMenuItem);

        jMenuBar1.add(editMenu);

        helpMenu.setText("Help");

        AboutMenuItem.setText("About");
        AboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(AboutMenuItem);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(importAssignmentButton)
                            .addComponent(assignment1Button)
                            .addComponent(assignment2Button)
                            .addComponent(assignment3Button)
                            .addComponent(assignment4Button)
                            .addComponent(assignment5Button))
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(exitMainMenuButton)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(assignment1Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignment2Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignment3Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignment4Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignment5Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(importAssignmentButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(exitMainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitToMainMenuMenutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitToMainMenuMenutItemActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_ExitToMainMenuMenutItemActionPerformed

    private void ExitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitMenuItemActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitMenuItemActionPerformed

    private void SettingsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsMenuItemActionPerformed
        // TODO add your handling code here:
        settings.setVisible(true);
    }//GEN-LAST:event_SettingsMenuItemActionPerformed

    private void AboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutMenuItemActionPerformed
        // TODO add your handling code here:
        aboutMenu.setVisible(true);
    }//GEN-LAST:event_AboutMenuItemActionPerformed

    private void exitMainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMainMenuButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_exitMainMenuButtonActionPerformed

    private void assignment1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignment1ButtonActionPerformed
        // TODO add your handling code here:
        pathname = "Data\\Assignment1.txt";
        loadAssignment(pathname);
        startAssignment();


    }//GEN-LAST:event_assignment1ButtonActionPerformed

    private void importAssignmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importAssignmentButtonActionPerformed
        // TODO add your handling code here:
        
        pathname = JOptionPane.showInputDialog(rootPane, "Enter a filename to import.");
        if (pathname == null) {
            JOptionPane.showMessageDialog(rootPane, "You did not enter a filename.");
        } else if (pathname.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "You did not enter a filename.");
        } else {

            loadAssignment(pathname);

        }

    }//GEN-LAST:event_importAssignmentButtonActionPerformed

    private void assignment2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignment2ButtonActionPerformed
        // TODO add your handling code here:
        pathname = "Data\\Assignment2.txt";
        loadAssignment(pathname);
        startAssignment();


    }//GEN-LAST:event_assignment2ButtonActionPerformed

    private void assignment5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignment5ButtonActionPerformed
        // TODO add your handling code here:
        pathname = "Data\\Assignment5.txt";
        loadAssignment(pathname);
        startAssignment();
    }//GEN-LAST:event_assignment5ButtonActionPerformed

    private void assignment3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignment3ButtonActionPerformed
        // TODO add your handling code here:
        pathname = "Data\\Assignment3.txt";
        loadAssignment(pathname);
        startAssignment();
    }//GEN-LAST:event_assignment3ButtonActionPerformed

    private void assignment4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignment4ButtonActionPerformed
        // TODO add your handling code here:
        pathname = "Data\\Assignment4.txt";
        loadAssignment(pathname);
        startAssignment();
    }//GEN-LAST:event_assignment4ButtonActionPerformed

    /**
     * Main method of the AssignmentSelector class.
     *
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AssignmentSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignmentSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignmentSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignmentSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignmentSelector().setVisible(true);
            }
        });
    }

    private void loadAssignment(String filename) {
        myFile = new File(filename);
        atp = new AssignmentTemplateParser();
        try {
            atp.readFile(myFile);
            theAssignment = atp.getAssignment();

            startAssignment();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane,
                    "Warning: File not found. Assignment will not be opened.");
            ex.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(AssignmentSelector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void startAssignment() {
        teachingMode.setAssignment(theAssignment);
        teachingMode.setVisible(true);
        this.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AboutMenuItem;
    private javax.swing.JMenuItem ExitMenuItem;
    private javax.swing.JMenuItem ExitToMainMenuMenutItem;
    private javax.swing.JMenuItem SettingsMenuItem;
    private javax.swing.JButton assignment1Button;
    private javax.swing.JButton assignment2Button;
    private javax.swing.JButton assignment3Button;
    private javax.swing.JButton assignment4Button;
    private javax.swing.JButton assignment5Button;
    private javax.swing.JMenu editMenu;
    private javax.swing.JButton exitMainMenuButton;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton importAssignmentButton;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    // User variable declaration
    public static AssignmentSelector instance = null;
    private TeachingMode teachingMode = TeachingMode.getInstance();
    private About aboutMenu = About.getInstance();
    private SettingsConfigurator settings = SettingsConfigurator.getInstance();

    private File myFile = new File("c:\\temp2\\data.txt");
    private AssignmentTemplateParser atp = new AssignmentTemplateParser();
    private Assignment theAssignment;

    String pathname = null;

    //Temporary ArrayLists for testing Assignment buttons
    private ArrayList<String> instruction = new ArrayList<String>();
    private ArrayList<String> masterCode = new ArrayList<String>();

}
