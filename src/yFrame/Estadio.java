/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package yFrame;


import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author josue
 */
public class Estadio extends javax.swing.JFrame {
    
    private static ArrayList<String> campos = new ArrayList<>();
    public static ArrayList<String> getpcampo() {
    return campos;
}
    
    public Estadio() {
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel3.setBackground(new Color(0,0,0,70));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jCombojugadores = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton_iniciar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jBMinimizar = new javax.swing.JButton();
        jBBackToinicio1 = new javax.swing.JButton();
        jlBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCombojugadores.setBackground(new java.awt.Color(4, 4, 4));
        jCombojugadores.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jCombojugadores.setForeground(new java.awt.Color(0, 153, 0));
        jCombojugadores.setBorder(null);
        jCombojugadores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCombojugadores.setOpaque(true);
        jCombojugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombojugadoresActionPerformed(evt);
            }
        });
        jPanel3.add(jCombojugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 200, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECCIÓN DE ESTADIO");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/line.png"))); // NOI18N
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 270, 20));

        jSeparator2.setBackground(new java.awt.Color(111, 174, 2));
        jSeparator2.setForeground(new java.awt.Color(111, 174, 2));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 350, 10));

        jButton_iniciar.setBackground(new java.awt.Color(4, 4, 4));
        jButton_iniciar.setForeground(new java.awt.Color(4, 4, 4));
        jButton_iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GO_LOG_OFF.png"))); // NOI18N
        jButton_iniciar.setBorder(null);
        jButton_iniciar.setBorderPainted(false);
        jButton_iniciar.setContentAreaFilled(false);
        jButton_iniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_iniciar.setOpaque(true);
        jButton_iniciar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GO_LOG_ON.png"))); // NOI18N
        jButton_iniciar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GO_LOG_ON.png"))); // NOI18N
        jButton_iniciar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GO_LOG_ON.png"))); // NOI18N
        jButton_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_iniciarMouseClicked(evt);
            }
        });
        jPanel3.add(jButton_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 50, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 820, 380));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jBMinimizar.setBorder(null);
        jBMinimizar.setBorderPainted(false);
        jBMinimizar.setContentAreaFilled(false);
        jBMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(jBMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 40, 40));

        jBBackToinicio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Home_32px.png"))); // NOI18N
        jBBackToinicio1.setBorder(null);
        jBBackToinicio1.setBorderPainted(false);
        jBBackToinicio1.setContentAreaFilled(false);
        jBBackToinicio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBBackToinicio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBBackToinicio1MouseClicked(evt);
            }
        });
        jPanel1.add(jBBackToinicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 40, 40));

        jlBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Loginbueno.png"))); // NOI18N
        jPanel1.add(jlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBackToinicio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBackToinicio1MouseClicked
        Inicio inicio = new Inicio();
        dispose(); // Cierra la ventana de login
        inicio.setVisible(true);
    }//GEN-LAST:event_jBBackToinicio1MouseClicked

    private void jBMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMinimizarMouseClicked
        this.setState(yFrame.Login.ICONIFIED);
    }//GEN-LAST:event_jBMinimizarMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jCombojugadores.addItem("Camp Nou");
        jCombojugadores.addItem("Santiago Bernabéu");
        jCombojugadores.addItem("Parc des Princes");
        jCombojugadores.addItem("Etihad Stadium");
        jCombojugadores.addItem("Anfield");
        jCombojugadores.addItem("Allianz Arena");
        jCombojugadores.addItem("Old Trafford");
        jCombojugadores.addItem("Signal Iduna Park");
        jCombojugadores.addItem("San Siro");
        jCombojugadores.addItem("Stamford Bridge");
        jCombojugadores.addItem("Emirates Stadium");
        jCombojugadores.addItem("Wanda Metropolitano");
        jCombojugadores.addItem("Stade de France");
        jCombojugadores.addItem("Giuseppe Meazza");
        jCombojugadores.addItem("Estadio Azteca");
        jCombojugadores.addItem("Estadio Monumental");
        jCombojugadores.addItem("Estadio do Maracanã");
        jCombojugadores.addItem("Estadio Nacional de Chile");
        jCombojugadores.addItem("Estadio Centenario");
        jCombojugadores.addItem("Estadio Metropolitano de Mérida");
        
        
    
    }//GEN-LAST:event_formWindowOpened

    private void jCombojugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombojugadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombojugadoresActionPerformed

    private void jButton_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_iniciarMouseClicked
    String estadioSeleccionado = (String) jCombojugadores.getSelectedItem();

    if (campos.contains(estadioSeleccionado)) {
        JOptionPane.showMessageDialog(null, "El estadio " + estadioSeleccionado + " ya ha sido seleccionado.");
    } else {
        campos.add(estadioSeleccionado);
        JOptionPane.showMessageDialog(null, "Estadio seleccionado: " + estadioSeleccionado + "sera usado en todos los encuentros");
    }
        
    }//GEN-LAST:event_jButton_iniciarMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Estadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estadio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBackToinicio1;
    private javax.swing.JButton jBMinimizar;
    private javax.swing.JButton jButton_iniciar;
    private javax.swing.JComboBox<String> jComboequipos;
    private javax.swing.JComboBox<String> jCombojugadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlBackground;
    // End of variables declaration//GEN-END:variables
}
