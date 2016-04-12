/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs321.ui;

import cs321.other.*;
import java.awt.Color;
import java.awt.Font;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.*;

/**
 *
 * @author Joshua
 */
public class SettingsConfigurator extends javax.swing.JFrame {

    /**
     * Creates new form SettingsConfigurator
     */
    private static SettingsConfigurator instance = null;

    protected SettingsConfigurator() {
        initComponents();
    }

    public static SettingsConfigurator getInstnace() {
        if (instance == null) {
            instance = new SettingsConfigurator();
        }
        return instance;
    }

    public void DisplayWindow() {
        this.setVisible(true);
    }

    public void HideWindow() {
        this.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        fontSizeList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fontList = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        fontColorList = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        backgroundColorList = new javax.swing.JList<>();
        fontField = new javax.swing.JTextField();
        fontSizeField = new javax.swing.JTextField();
        fontColorField = new javax.swing.JTextField();
        backgroundColorField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fontPreviewField = new javax.swing.JTextField();
        textPreviewLabel = new javax.swing.JLabel();
        resetToDefaultButton = new javax.swing.JButton();
        discardChangesButton = new javax.swing.JButton();
        saveExitButton = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Font Options"));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Font Size:");

        fontSizeList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fontSizeList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "10", "12", "14", "16", "18", "20", "22", "24", "26" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        fontSizeList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(fontSizeList);
        fontSizeList.setSelectedIndex(1);
        ListenerClass listenerFontSize = new ListenerClass();
        fontSizeList.addListSelectionListener(listenerFontSize);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Font*:");

        fontList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fontList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Arial", "Impact", "SansSerif", "Tahoma", "Times New Roman" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        fontList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(fontList);
        fontList.setSelectedIndex(4);
        ListenerClass listenerFont = new ListenerClass();
        fontList.addListSelectionListener(listenerFont);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Font Color:");

        fontColorList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fontColorList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "White", "Black", "Red", "Blue", "Green", "Purple" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        fontColorList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(fontColorList);
        fontColorList.setSelectedIndex(1);
        ListenerClass listenerFontColor = new ListenerClass();
        fontColorList.addListSelectionListener(listenerFontColor);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Text Background Color:");

        backgroundColorList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backgroundColorList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "White", "Black", "Red", "Blue", "Green", "Purple" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        backgroundColorList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(backgroundColorList);
        backgroundColorList.setSelectedIndex(0);
        ListenerClass listenerBackgroundColor = new ListenerClass();
        backgroundColorList.addListSelectionListener(listenerBackgroundColor);

        fontField.setEditable(false);
        fontField.setText("Tahoma");
        fontField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontFieldActionPerformed(evt);
            }
        });

        fontSizeField.setEditable(false);
        fontSizeField.setText("12");

        fontColorField.setEditable(false);
        fontColorField.setText("Black");

        backgroundColorField.setEditable(false);
        backgroundColorField.setText("White");

        jLabel6.setText("*Font will remain in a monospace font in code windows.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(fontField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(fontSizeField, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fontColorField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backgroundColorField)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(jScrollPane5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fontSizeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fontColorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backgroundColorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fontField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        fontPreviewField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fontPreviewField.setText("The quick brown fox jumped over the lazy dog.");

        textPreviewLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textPreviewLabel.setText("Text Preview");

        resetToDefaultButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        resetToDefaultButton.setText("Reset to Default");
        resetToDefaultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetToDefaultButtonActionPerformed(evt);
            }
        });

        discardChangesButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        discardChangesButton.setText("Discard Changes");
        discardChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardChangesButtonActionPerformed(evt);
            }
        });

        saveExitButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        saveExitButton.setText("Save and Exit");
        saveExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fontPreviewField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textPreviewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(resetToDefaultButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(discardChangesButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveExitButton))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textPreviewLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fontPreviewField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveExitButton)
                    .addComponent(discardChangesButton)
                    .addComponent(resetToDefaultButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fontPreviewField.setFont(Font.decode(fontDecode));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fontFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_fontFieldActionPerformed

    private void saveExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveExitButtonActionPerformed
        // TODO add your handling code here:

        //Save all font options
        currentFontIndex = previewFontIndex;
        currentFontSizeIndex = previewFontSizeIndex;
        currentFontColorIndex = previewFontColorIndex;
        currentBackgroundColorIndex = previewBackgroundColorIndex;
        
        this.HideWindow();
    }//GEN-LAST:event_saveExitButtonActionPerformed

    private void resetToDefaultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetToDefaultButtonActionPerformed
        // TODO add your handling code here:
        fontList.setSelectedIndex(currentFontIndex);
        fontSizeList.setSelectedIndex(currentFontSizeIndex);
        fontColorList.setSelectedIndex(currentFontColorIndex);
        backgroundColorList.setSelectedIndex(currentBackgroundColorIndex);
    }//GEN-LAST:event_resetToDefaultButtonActionPerformed

    private void discardChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardChangesButtonActionPerformed
        // TODO add your handling code here:
        fontList.setSelectedIndex(currentFontIndex);
        fontSizeList.setSelectedIndex(currentFontSizeIndex);
        fontColorList.setSelectedIndex(currentFontColorIndex);
        backgroundColorList.setSelectedIndex(currentBackgroundColorIndex);
        
        this.HideWindow();
    }//GEN-LAST:event_discardChangesButtonActionPerformed

    /**
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
            java.util.logging.Logger.getLogger(SettingsConfigurator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsConfigurator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsConfigurator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsConfigurator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsConfigurator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField backgroundColorField;
    private javax.swing.JList<String> backgroundColorList;
    private javax.swing.JButton discardChangesButton;
    private javax.swing.JTextField fontColorField;
    private javax.swing.JList<String> fontColorList;
    private javax.swing.JTextField fontField;
    private javax.swing.JList<String> fontList;
    private javax.swing.JTextField fontPreviewField;
    private javax.swing.JTextField fontSizeField;
    private javax.swing.JList<String> fontSizeList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton resetToDefaultButton;
    private javax.swing.JButton saveExitButton;
    private javax.swing.JLabel textPreviewLabel;
    // End of variables declaration//GEN-END:variables

    // More variable declaration
    private String fontDecode = "";
    private Color fontColor;
    private Color backgroundColor;
    
    private int currentFontIndex = 3;
    private int currentFontSizeIndex = 1;
    private int currentFontColorIndex = 1;
    private int currentBackgroundColorIndex = 0;
    
    private int previewFontIndex;
    private int previewFontSizeIndex;
    private int previewFontColorIndex;
    private int previewBackgroundColorIndex;

    private void setFontColorFromList() {
        switch (fontColorField.getText()) {
            case "White":
                fontColor = Color.WHITE;
                break;
            case "Black":
                fontColor = Color.BLACK;
                break;
            case "Red":
                fontColor = Color.RED;
                break;
            case "Blue":
                fontColor = Color.BLUE;
                break;
            case "Green":
                fontColor = Color.GREEN;
                break;
            case "Purple":
                fontColor = Color.MAGENTA;
                break;
        }
    }

    private void setBackgroundColorFromList() {
        switch (backgroundColorField.getText()) {
            case "White":
                backgroundColor = Color.WHITE;
                break;
            case "Black":
                backgroundColor = Color.BLACK;
                break;
            case "Red":
                backgroundColor = Color.RED;
                break;
            case "Blue":
                backgroundColor = Color.BLUE;
                break;
            case "Green":
                backgroundColor = Color.GREEN;
                break;
            case "Purple":
                backgroundColor = Color.MAGENTA;
                break;
        }
    }

    private class ListenerClass implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {
            fontField.setText(fontList.getSelectedValue());
            previewFontIndex = fontList.getSelectedIndex();
            
            fontSizeField.setText(fontSizeList.getSelectedValue());
            previewFontSizeIndex = fontSizeList.getSelectedIndex();
            
            fontColorField.setText(fontColorList.getSelectedValue());
            previewFontColorIndex = fontColorList.getSelectedIndex();
            
            backgroundColorField.setText(backgroundColorList.getSelectedValue());
            previewBackgroundColorIndex = backgroundColorList.getSelectedIndex();
            
            fontDecode = fontField.getText() + '-' + fontSizeField.getText();

            setFontColorFromList();
            setBackgroundColorFromList();

            fontPreviewField.setFont(Font.decode(fontDecode));
            fontPreviewField.setForeground(fontColor);
            fontPreviewField.setBackground(backgroundColor);

        }
    }

}
