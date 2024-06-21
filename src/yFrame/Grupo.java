package yFrame;
import Class.GRUPO;
import Class.Jugador;
import Class.Team;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Grupo extends javax.swing.JFrame {
    
private static final ArrayList<GRUPO> grupos = new ArrayList<>();
    private static final ArrayList<String> teams = new ArrayList<>();

    public static ArrayList<GRUPO> getGrupos() {
        return grupos;
    }

    public static ArrayList<String> getTeams() {
        return teams;
    }

    public Grupo() {
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel2.setBackground(new Color(0,0,0,70));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPHome1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jComboequipos = new javax.swing.JComboBox<>();
        jButtonAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jButton_iniciar = new javax.swing.JButton();
        jBMinimizar1 = new javax.swing.JButton();
        jBBackToinicio2 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jlBackground1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPHome1.setOpaque(false);
        jPHome1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboequipos.setBackground(new java.awt.Color(4, 4, 4));
        jComboequipos.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jComboequipos.setForeground(new java.awt.Color(0, 153, 0));
        jComboequipos.setBorder(null);
        jComboequipos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboequipos.setOpaque(true);
        jComboequipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboequiposActionPerformed(evt);
            }
        });
        jPanel2.add(jComboequipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 200, 50));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAgregarMouseEntered(evt);
            }
        });
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 120, 40));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREACIÓN DE GRUPOS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/line.png"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 270, 20));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/line.png"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 270, 20));

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
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 190, 50));

        jSeparator3.setBackground(new java.awt.Color(111, 174, 2));
        jSeparator3.setForeground(new java.awt.Color(111, 174, 2));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 350, 10));

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
        jPanel2.add(jButton_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 50, -1));

        jPHome1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 820, 380));

        jBMinimizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jBMinimizar1.setBorder(null);
        jBMinimizar1.setBorderPainted(false);
        jBMinimizar1.setContentAreaFilled(false);
        jBMinimizar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBMinimizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBMinimizar1MouseClicked(evt);
            }
        });
        jPHome1.add(jBMinimizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 40, 40));

        jBBackToinicio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Home_32px.png"))); // NOI18N
        jBBackToinicio2.setBorder(null);
        jBBackToinicio2.setBorderPainted(false);
        jBBackToinicio2.setContentAreaFilled(false);
        jBBackToinicio2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBBackToinicio2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBBackToinicio2MouseClicked(evt);
            }
        });
        jPHome1.add(jBBackToinicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 40, 40));

        jSeparator4.setBackground(new java.awt.Color(111, 174, 2));
        jSeparator4.setForeground(new java.awt.Color(111, 174, 2));
        jPHome1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 850, 10));

        getContentPane().add(jPHome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlBackground1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Loginbueno.png"))); // NOI18N
        jPanel3.add(jlBackground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboequiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboequiposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboequiposActionPerformed

    private void jButtonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAgregarMouseClicked
         if (teams.size() < 6) {
        String equipoSeleccionado = (String) jComboequipos.getSelectedItem();
        if (!teams.contains(equipoSeleccionado)) {
            teams.add(equipoSeleccionado);
            JOptionPane.showMessageDialog(null, equipoSeleccionado + " ha sido agregado al grupo.");
        } else {
            JOptionPane.showMessageDialog(null, equipoSeleccionado + " ya está en el grupo.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "El grupo ya tiene 6 grupo.");
    }
    }//GEN-LAST:event_jButtonAgregarMouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        jTextField4.setText("");
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed

    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_iniciarMouseClicked
    String nombre = jTextField4.getText();
    
    
    if (teams.size() < 6) {
        JOptionPane.showMessageDialog(null, "equipos Insuficientes");
        return; // Salir si no hay suficientes jugadores
    }

    if ((nombre.equals("Nombre")) || (nombre.equals("") )) {
        JOptionPane.showMessageDialog(this, "Por favor rellene los espacios correctamente", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Salir si los campos no están llenados correctamente
    }

    boolean grupoExistente = false;
    for (GRUPO grupo : grupos) {
        if (grupo.getNombre().equalsIgnoreCase(nombre)) {
            grupoExistente = true;
            break;
        }
    }

    if (grupoExistente) {
        JOptionPane.showMessageDialog(this, "El grupo con nombre " + nombre + " ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        GRUPO nuevoGrupo = new GRUPO(nombre, new ArrayList<>(teams));
        grupos.add(nuevoGrupo);
        JOptionPane.showMessageDialog(this, "Grupo agregado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        // Limpiar los campos de texto
        jTextField4.setText("");
        
        
        // Limpiar la lista de jugadores del equipo
        teams.clear();
    }

    }//GEN-LAST:event_jButton_iniciarMouseClicked

    private void jBMinimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBMinimizar1MouseClicked
        this.setState(yFrame.Login.ICONIFIED);
    }//GEN-LAST:event_jBMinimizar1MouseClicked

    private void jBBackToinicio2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBackToinicio2MouseClicked
        Inicio inicio = new Inicio();
        dispose(); // Cierra la ventana de login
        inicio.setVisible(true);
    }//GEN-LAST:event_jBBackToinicio2MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jComboequipos.addItem("FC Barcelona");
        jComboequipos.addItem("Real Madrid");
        jComboequipos.addItem("Paris Saint-Germain");
        jComboequipos.addItem("Manchester City");
        jComboequipos.addItem("Liverpool FC");
        jComboequipos.addItem("Bayern Munich");
        jComboequipos.addItem("Juventus FC");
        jComboequipos.addItem("Chelsea FC");
        jComboequipos.addItem("Manchester United");
        jComboequipos.addItem("Atletico Madrid");
        jComboequipos.addItem("Borussia Dortmund");
        jComboequipos.addItem("Inter Milan");
        jComboequipos.addItem("AC Milan");
        jComboequipos.addItem("Tottenham Hotspur");
        jComboequipos.addItem("AS Roma");
        jComboequipos.addItem("Arsenal FC");
        jComboequipos.addItem("Sevilla FC");
        jComboequipos.addItem("Napoli");
        jComboequipos.addItem("Ajax");
        jComboequipos.addItem("Lazio");

         for (Team equipo: Equipo.getequipos()) {
                jComboequipos.addItem(equipo.getNombre());
        }

    }//GEN-LAST:event_formWindowOpened

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAgregarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgregarMouseEntered

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
            java.util.logging.Logger.getLogger(Grupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grupo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBackToinicio2;
    private javax.swing.JButton jBMinimizar1;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButton_iniciar;
    private javax.swing.JComboBox<String> jComboequipos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPHome1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel jlBackground1;
    // End of variables declaration//GEN-END:variables
}
