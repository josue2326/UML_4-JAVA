/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package yFrame;

import Class.Jugador;
import Class.Team;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class Equipo extends javax.swing.JFrame {
    
     private static ArrayList<String> playersteam = new ArrayList<>();
    
    public static ArrayList<String> getplayersteam() {
    return playersteam;
}
    
    private static ArrayList<Team> equipos = new ArrayList<>();
    
    public static ArrayList<Team> getequipos() {
    return equipos;
}
    

    public Equipo() {
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel2.setBackground(new Color(0,0,0,70));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPHome = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jCombojugadores = new javax.swing.JComboBox<>();
        jButtonAgregar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton_iniciar = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jBMinimizar = new javax.swing.JButton();
        jBBackToinicio1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jlBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPHome.setOpaque(false);
        jPHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setBackground(new java.awt.Color(4, 4, 4));
        jComboBox1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 153, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E" }));
        jComboBox1.setBorder(null);
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.setOpaque(true);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 268, 190, 40));

        jComboBox2.setBackground(new java.awt.Color(4, 4, 4));
        jComboBox2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 153, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIURNO", "NOCTURNO" }));
        jComboBox2.setBorder(null);
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.setOpaque(true);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 168, 190, 40));

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
        jPanel2.add(jCombojugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 200, 50));

        jButtonAgregar.setBackground(new java.awt.Color(4, 4, 4));
        jButtonAgregar.setForeground(new java.awt.Color(4, 4, 4));
        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images2/ANADIR_OFF.png"))); // NOI18N
        jButtonAgregar.setBorder(null);
        jButtonAgregar.setContentAreaFilled(false);
        jButtonAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAgregar.setOpaque(true);
        jButtonAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images2/ANADIR_ON.png"))); // NOI18N
        jButtonAgregar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images2/ANADIR_ON.png"))); // NOI18N
        jButtonAgregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images2/ANADIR_ON.png"))); // NOI18N
        jButtonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAgregarMouseClicked(evt);
            }
        });
        jPanel2.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 120, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/line.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 270, 20));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREACIÓN DE EQUIPOS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/line.png"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 270, 20));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/line.png"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 270, 20));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/line.png"))); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 270, 20));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/line.png"))); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 270, 20));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/line.png"))); // NOI18N
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 270, 20));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Teléfono");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 7, 7)));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 190, 40));

        jTextField3.setBackground(new java.awt.Color(0, 0, 0));
        jTextField3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Color");
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 7, 7)));
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 190, 40));

        jTextField4.setBackground(new java.awt.Color(0, 0, 0));
        jTextField4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Nombre");
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 7, 7)));
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 190, 40));

        jTextField5.setBackground(new java.awt.Color(0, 0, 0));
        jTextField5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Técnico");
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 7, 7)));
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 190, 40));

        jSeparator2.setBackground(new java.awt.Color(111, 174, 2));
        jSeparator2.setForeground(new java.awt.Color(111, 174, 2));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 350, 10));

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
        jPanel2.add(jButton_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 50, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/line.png"))); // NOI18N
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 270, 20));

        jPHome.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 820, 380));

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
        jPHome.add(jBMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 40, 40));

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
        jPHome.add(jBBackToinicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 40, 40));

        jSeparator3.setBackground(new java.awt.Color(111, 174, 2));
        jSeparator3.setForeground(new java.awt.Color(111, 174, 2));
        jPHome.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 850, 10));

        getContentPane().add(jPHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Loginbueno.png"))); // NOI18N
        jPanel1.add(jlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        jTextField3.setText("");
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        jTextField4.setText("");
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed

    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        jTextField5.setText("");
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_iniciarMouseClicked

    String nombre = jTextField4.getText();
    String tecnico = jTextField5.getText();
    String telefono = jTextField1.getText();
    String horario = (String) jComboBox2.getSelectedItem();
    String color = jTextField3.getText();
    String categoria = (String) jComboBox1.getSelectedItem();
    
    if (playersteam.size() < 11) {
        JOptionPane.showMessageDialog(null, "Jugadores Insuficientes");
        return; // Salir si no hay suficientes jugadores
    }

    if ((nombre.equals("Nombre") || tecnico.equals("Técnico") || telefono.equals("Teléfono") || color.equals("Color")) ||
            (nombre.equals("") || tecnico.equals("") || telefono.equals("") || color.equals(""))) {
        JOptionPane.showMessageDialog(this, "Por favor rellene los espacios correctamente", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Salir si los campos no están llenados correctamente
    }

    boolean equipoExistente = false;
    for (Team equipo : equipos) {
        if (equipo.getNombre().equalsIgnoreCase(nombre)) {
            equipoExistente = true;
            break;
        }
    }

    if (equipoExistente) {
        JOptionPane.showMessageDialog(this, "El equipo con nombre " + nombre + " ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        Team nuevoequipo = new Team(nombre, tecnico, telefono, horario, color, categoria, new ArrayList<>(playersteam));
        equipos.add(nuevoequipo);
        JOptionPane.showMessageDialog(this, "Equipo agregado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        // Limpiar los campos de texto
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField1.setText("");
        jTextField3.setText("");
        jComboBox2.setSelectedIndex(0); // Opcional: restablece al primer elemento
        jComboBox1.setSelectedIndex(0); // Opcional: restablece al primer elemento
        
        // Limpiar la lista de jugadores del equipo
        playersteam.clear();
    }

    }//GEN-LAST:event_jButton_iniciarMouseClicked

    private void jBMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMinimizarMouseClicked
        this.setState(yFrame.Login.ICONIFIED);
    }//GEN-LAST:event_jBMinimizarMouseClicked

    private void jBBackToinicio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBackToinicio1MouseClicked
        Inicio inicio = new Inicio();
        dispose(); // Cierra la ventana de login
        inicio.setVisible(true);
    }//GEN-LAST:event_jBBackToinicio1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            jCombojugadores.addItem("Lionel Messi");
            jCombojugadores.addItem("Cristiano Ronaldo");
            jCombojugadores.addItem("Neymar Junior");
            jCombojugadores.addItem("Kylian Mbappe");
            jCombojugadores.addItem("Luka Modric");
            jCombojugadores.addItem("Mohamed Salah");
            jCombojugadores.addItem("Kevin De Bruyne");
            jCombojugadores.addItem("Virgil van Dijk");
            jCombojugadores.addItem("Sergio Ramos");
            jCombojugadores.addItem("Robert Lewandowski");
            jCombojugadores.addItem("Manuel Neuer");
            jCombojugadores.addItem("Sadio Mane");
            jCombojugadores.addItem("Toni Kroos");
            jCombojugadores.addItem("Gerard Pique");
            jCombojugadores.addItem("Karim Benzema");
            jCombojugadores.addItem("Paul Pogba");
            jCombojugadores.addItem("Eden Hazard");
            jCombojugadores.addItem("Marc Ter Stegen");
            jCombojugadores.addItem("Raheem Sterling");
            jCombojugadores.addItem("Sergio Aguero");


          for (Jugador jugador : Jugador1.getjugadores()) {
            jCombojugadores.addItem(jugador.getNombre());
        }
          
        
    }//GEN-LAST:event_formWindowOpened

    private void jButtonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAgregarMouseClicked
            if (playersteam.size() < 11) {
        String jugadorSeleccionado = (String) jCombojugadores.getSelectedItem();
        if (!playersteam.contains(jugadorSeleccionado)) {
            playersteam.add(jugadorSeleccionado);
            JOptionPane.showMessageDialog(null, jugadorSeleccionado + " ha sido agregado al equipo.");
        } else {
            JOptionPane.showMessageDialog(null, jugadorSeleccionado + " ya está en el equipo.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "El equipo ya tiene 11 jugadores.");
    }
    }//GEN-LAST:event_jButtonAgregarMouseClicked

    private void jCombojugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombojugadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombojugadoresActionPerformed

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
            java.util.logging.Logger.getLogger(Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Equipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Equipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBackToinicio1;
    private javax.swing.JButton jBMinimizar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButton_iniciar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jCombojugadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPHome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel jlBackground;
    // End of variables declaration//GEN-END:variables
}
