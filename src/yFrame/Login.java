
package yFrame;
import AppPackage.AnimationClass;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Class.User;


public class Login extends javax.swing.JFrame {

    private static ArrayList<User> usuariosRegistrados = new ArrayList<>();

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null); // centro al ejecutar
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jregister = new javax.swing.JPanel();
        jLabelUser1 = new javax.swing.JLabel();
        jLabelContra = new javax.swing.JLabel();
        ca_user1 = new javax.swing.JTextField();
        contra_user1 = new javax.swing.JPasswordField();
        jCerrarButtonCreate1 = new javax.swing.JButton();
        jButton_registrar1 = new javax.swing.JButton();
        jregisterlabel = new javax.swing.JLabel();
        Login = new javax.swing.JPanel();
        contra_user = new javax.swing.JPasswordField();
        jCerrarButton = new javax.swing.JButton();
        ca_user = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jButton_iniciar = new javax.swing.JButton();
        jButton_crear_cuenta = new javax.swing.JButton();
        jLabelLogin = new javax.swing.JLabel();
        jbtnMinimizar = new javax.swing.JLabel();
        jbtnCerrar = new javax.swing.JLabel();
        jbntNext = new javax.swing.JButton();
        jbtnBack = new javax.swing.JButton();
        jlblPulic2 = new javax.swing.JLabel();
        jlblPulic1 = new javax.swing.JLabel();
        jpPalo1 = new javax.swing.JLabel();
        jpPalo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jlabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jregister.setBackground(new java.awt.Color(0, 0, 0));
        jregister.setOpaque(false);
        jregister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUser1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelUser1.setForeground(new java.awt.Color(51, 153, 0));
        jLabelUser1.setText("Usuario:");
        jregister.add(jLabelUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabelContra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelContra.setForeground(new java.awt.Color(0, 153, 0));
        jLabelContra.setText("Contraseña:");
        jregister.add(jLabelContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        ca_user1.setBackground(new java.awt.Color(0, 0, 0));
        ca_user1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        ca_user1.setForeground(new java.awt.Color(153, 153, 153));
        ca_user1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        ca_user1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ca_user1ActionPerformed(evt);
            }
        });
        jregister.add(ca_user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 200, 30));

        contra_user1.setBackground(new java.awt.Color(0, 0, 0));
        contra_user1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        contra_user1.setForeground(new java.awt.Color(153, 153, 153));
        contra_user1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        contra_user1.setOpaque(true);
        contra_user1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contra_user1ActionPerformed(evt);
            }
        });
        jregister.add(contra_user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 200, 30));

        jCerrarButtonCreate1.setBackground(new java.awt.Color(17, 16, 16));
        jCerrarButtonCreate1.setFont(new java.awt.Font("Lucida Console", 0, 10)); // NOI18N
        jCerrarButtonCreate1.setForeground(new java.awt.Color(0, 153, 0));
        jCerrarButtonCreate1.setText("Cerrar");
        jCerrarButtonCreate1.setBorder(null);
        jCerrarButtonCreate1.setBorderPainted(false);
        jCerrarButtonCreate1.setContentAreaFilled(false);
        jCerrarButtonCreate1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCerrarButtonCreate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCerrarButtonCreate1MouseClicked(evt);
            }
        });
        jCerrarButtonCreate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCerrarButtonCreate1ActionPerformed(evt);
            }
        });
        jregister.add(jCerrarButtonCreate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jButton_registrar1.setBackground(new java.awt.Color(17, 16, 16));
        jButton_registrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GO_LOG_OFF.png"))); // NOI18N
        jButton_registrar1.setBorder(null);
        jButton_registrar1.setBorderPainted(false);
        jButton_registrar1.setContentAreaFilled(false);
        jButton_registrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_registrar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GO_LOG_ON.png"))); // NOI18N
        jButton_registrar1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GO_LOG_ON.png"))); // NOI18N
        jButton_registrar1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GO_LOG_ON.png"))); // NOI18N
        jButton_registrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_registrar1MouseClicked(evt);
            }
        });
        jregister.add(jButton_registrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 60, -1));

        jregisterlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/LOGIN_INGRESO cabeza.png"))); // NOI18N
        jregisterlabel.setText("jLabel2");
        jregister.add(jregisterlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 290));

        background.add(jregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 260, 270));

        Login.setOpaque(false);
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contra_user.setBackground(new java.awt.Color(0, 0, 0));
        contra_user.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        contra_user.setForeground(new java.awt.Color(153, 153, 153));
        contra_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        contra_user.setOpaque(true);
        contra_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contra_userActionPerformed(evt);
            }
        });
        Login.add(contra_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 200, 30));

        jCerrarButton.setBackground(new java.awt.Color(17, 16, 16));
        jCerrarButton.setFont(new java.awt.Font("Lucida Console", 0, 10)); // NOI18N
        jCerrarButton.setForeground(new java.awt.Color(0, 153, 0));
        jCerrarButton.setText("Cerrar");
        jCerrarButton.setBorder(null);
        jCerrarButton.setBorderPainted(false);
        jCerrarButton.setContentAreaFilled(false);
        jCerrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCerrarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCerrarButtonMouseClicked(evt);
            }
        });
        jCerrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCerrarButtonActionPerformed(evt);
            }
        });
        Login.add(jCerrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        ca_user.setBackground(new java.awt.Color(0, 0, 0));
        ca_user.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        ca_user.setForeground(new java.awt.Color(153, 153, 153));
        ca_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        ca_user.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ca_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ca_userActionPerformed(evt);
            }
        });
        Login.add(ca_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 200, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Contraseña:");
        Login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabelUser.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(51, 153, 0));
        jLabelUser.setText("Usuario:");
        Login.add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jButton_iniciar.setBackground(new java.awt.Color(17, 16, 16));
        jButton_iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GO_LOG_OFF.png"))); // NOI18N
        jButton_iniciar.setBorder(null);
        jButton_iniciar.setBorderPainted(false);
        jButton_iniciar.setContentAreaFilled(false);
        jButton_iniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_iniciar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GO_LOG_ON.png"))); // NOI18N
        jButton_iniciar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GO_LOG_ON.png"))); // NOI18N
        jButton_iniciar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GO_LOG_ON.png"))); // NOI18N
        jButton_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_iniciarMouseClicked(evt);
            }
        });
        Login.add(jButton_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 60, -1));

        jButton_crear_cuenta.setBackground(new java.awt.Color(17, 16, 16));
        jButton_crear_cuenta.setFont(new java.awt.Font("Lucida Console", 0, 10)); // NOI18N
        jButton_crear_cuenta.setForeground(new java.awt.Color(0, 153, 0));
        jButton_crear_cuenta.setText("Crear Cuenta");
        jButton_crear_cuenta.setBorder(null);
        jButton_crear_cuenta.setBorderPainted(false);
        jButton_crear_cuenta.setContentAreaFilled(false);
        jButton_crear_cuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_crear_cuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_crear_cuentaMouseClicked(evt);
            }
        });
        jButton_crear_cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_crear_cuentaActionPerformed(evt);
            }
        });
        Login.add(jButton_crear_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 250, -1, -1));

        jLabelLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/LOGIN_INGRESO new.png"))); // NOI18N
        jLabelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLoginMouseClicked(evt);
            }
        });
        Login.add(jLabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 250, 270));

        background.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, -20, 260, -1));

        jbtnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jbtnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnMinimizarMouseClicked(evt);
            }
        });
        background.add(jbtnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, -10, -1, 70));

        jbtnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Delete_32px.png"))); // NOI18N
        jbtnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnCerrarMouseClicked(evt);
            }
        });
        background.add(jbtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, -1, 50));

        jbntNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BACK.png"))); // NOI18N
        jbntNext.setBorder(null);
        jbntNext.setBorderPainted(false);
        jbntNext.setContentAreaFilled(false);
        jbntNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbntNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbntNextMouseClicked(evt);
            }
        });
        jbntNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbntNextActionPerformed(evt);
            }
        });
        background.add(jbntNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 440, 50, 30));

        jbtnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NEXT.png"))); // NOI18N
        jbtnBack.setBorder(null);
        jbtnBack.setBorderPainted(false);
        jbtnBack.setContentAreaFilled(false);
        jbtnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnBackMouseClicked(evt);
            }
        });
        jbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackActionPerformed(evt);
            }
        });
        background.add(jbtnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 50, 30));

        jlblPulic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images2/publi2new.png"))); // NOI18N
        background.add(jlblPulic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 100, 1000, 320));

        jlblPulic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images2/publi1new.png"))); // NOI18N
        background.add(jlblPulic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1000, 320));

        jpPalo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/paloPublic.png"))); // NOI18N
        background.add(jpPalo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 418, 1000, 10));

        jpPalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/paloPublic.png"))); // NOI18N
        background.add(jpPalo, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 94, 1000, 10));

        jButton1.setBackground(new java.awt.Color(17, 16, 16));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Sin título-1.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Sin títuloon-1.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Sin títuloon-1.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Sin títuloon-1.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 220, 140));

        jlabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Loginbueno.png"))); // NOI18N
        background.add(jlabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnBackActionPerformed

    private void jbntNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbntNextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbntNextActionPerformed

    private void jbtnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnBackMouseClicked
        AnimationClass primero = new AnimationClass();
        primero.jLabelXRight(-1000, 0, 25, 20, jlblPulic1);
        
        AnimationClass segundo = new AnimationClass();
        segundo.jLabelXRight(0, 1000, 25, 20, jlblPulic2);
    }//GEN-LAST:event_jbtnBackMouseClicked

    private void jbntNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbntNextMouseClicked
        AnimationClass primero = new AnimationClass();
        primero.jLabelXLeft(0, -1000, 25,20, jlblPulic1);
        
        AnimationClass segundo = new AnimationClass();
        segundo.jLabelXLeft(1000, 0, 25, 20, jlblPulic2);
    }//GEN-LAST:event_jbntNextMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        AnimationClass primero = new AnimationClass();
        primero.jLabelXLeft(0, -1000, 25, 20, jlblPulic1);
        
        AnimationClass segundo = new AnimationClass();
        segundo.jLabelXLeft(1000, 0, 25, 20, jlblPulic2);
        
        AnimationClass arriba = new AnimationClass();
        arriba.jLabelYUp(20, -210, 18, 10, jLabelLogin);
        
        AnimationClass arriba1 = new AnimationClass();
        arriba1.jLabelYUp(40, 0, 18, 10, jLabelUser);
        
        AnimationClass arriba2 = new AnimationClass();
        arriba2.jTextFieldYUp(80, 0, 18, 10, ca_user);
        
        AnimationClass arriba3 = new AnimationClass();
        arriba3.jPasswordFieldYUp(200, -80, 18, 10, contra_user);
        
        AnimationClass arriba4 = new AnimationClass();
        arriba4.jLabelYUp(170, 0, 18, 10, jLabel1);
        
         AnimationClass arriba5 = new AnimationClass();
        arriba5.jButtonYUp(250, 0, 18, 10, jCerrarButton);
        
        AnimationClass arriba6 = new AnimationClass();
        arriba6.jButtonYUp(240, 0, 18, 10, jButton_iniciar);
        
        AnimationClass arriba7 = new AnimationClass();
        arriba7.jButtonYUp(250, 0, 18, 10, jButton_crear_cuenta);
        
        AnimationClass abajo8 = new AnimationClass();
        abajo8.jLabelYDown(0, 230, 18, 10, jregisterlabel);
        
        AnimationClass abajo9 = new AnimationClass();
        abajo9.jLabelYDown(50, 280, 18, 10, jLabelUser1);
        
        AnimationClass abajo10 = new AnimationClass();
        abajo10.jLabelYDown(150, 270, 18, 10, jLabelContra);
        
        AnimationClass abajo11 = new AnimationClass();
        abajo11.jTextFieldYDown(90, 270, 18, 10, ca_user1);
        
        AnimationClass abajo12 = new AnimationClass();
        abajo12.jPasswordFieldYDown(190, 270, 18, 10, contra_user1);
        
        AnimationClass abajo13 = new AnimationClass();
        abajo13.jButtonYDown(250, 270, 18, 10, jCerrarButtonCreate1);
        
        AnimationClass abajo14 = new AnimationClass();
        abajo14.jButtonYDown(240, 270, 18, 10, jButton_registrar1); 
    }//GEN-LAST:event_formWindowOpened

    private void jbtnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCerrarMouseClicked
        try{
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea Cerrar el Sistema?","EXIT",dialogButton);
        if(result == 0){
            System.exit(0);
        }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jbtnCerrarMouseClicked

    private void jbtnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnMinimizarMouseClicked
        this.setState(yFrame.Login.ICONIFIED);
    }//GEN-LAST:event_jbtnMinimizarMouseClicked

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginMouseClicked

    private void jLabelLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginMouseClicked
 
    }//GEN-LAST:event_jLabelLoginMouseClicked

    private void ca_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ca_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ca_userActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        AnimationClass abajo = new AnimationClass();
        abajo.jLabelYDown(-210, 20, 18, 10, jLabelLogin);
        
        AnimationClass abajo1 = new AnimationClass();
        abajo1.jLabelYDown(0, 40, 18, 13, jLabelUser);
        
        AnimationClass abajo2 = new AnimationClass();
        abajo2 .jTextFieldYUp(0, 80, 18, 10, ca_user);
        
        AnimationClass abajo3 = new AnimationClass();
        abajo3.jPasswordFieldYUp(-80, 200, 18, 10, contra_user);
        
        AnimationClass abajo4 = new AnimationClass();
        abajo4.jLabelYUp(0, 170, 18, 10, jLabel1);
        
        AnimationClass abajo5 = new AnimationClass();
        abajo5.jButtonYUp(0, 250, 18, 10, jCerrarButton);
        
        AnimationClass abajo6 = new AnimationClass();
        abajo6.jButtonYUp(0, 240, 18, 10, jButton_iniciar);
        
        AnimationClass arriba7 = new AnimationClass();
        arriba7.jButtonYUp(0, 250, 18, 10, jButton_crear_cuenta);
        
        AnimationClass abajo8 = new AnimationClass();
        abajo8.jLabelYDown(0, 230, 18, 10, jregisterlabel);
        
        AnimationClass abajo9 = new AnimationClass();
        abajo9.jLabelYDown(50, 280, 18, 10, jLabelUser1);
        
        AnimationClass abajo10 = new AnimationClass();
        abajo10.jLabelYDown(150, 270, 18, 10, jLabelContra);
        
        AnimationClass abajo11 = new AnimationClass();
        abajo11.jTextFieldYDown(90, 270, 18, 10, ca_user1);
        
        AnimationClass abajo12 = new AnimationClass();
        abajo12.jPasswordFieldYDown(190, 270, 18, 10, contra_user1);
        
        AnimationClass arriba13 = new AnimationClass();
        arriba13.jButtonYUp(250, 270, 18, 10, jCerrarButtonCreate1);
        
         AnimationClass abajo14 = new AnimationClass();
        abajo14.jButtonYDown(240, 270, 18, 10, jButton_registrar1); 
        
        ca_user.setText("");
        contra_user.setText("");
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void contra_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contra_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contra_userActionPerformed

    private void jCerrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCerrarButtonActionPerformed
        AnimationClass arriba = new AnimationClass();
        arriba.jLabelYUp(20, -210, 18, 10, jLabelLogin);
        
        AnimationClass arriba1 = new AnimationClass();
        arriba1.jLabelYUp(40, 0, 18, 10, jLabelUser);
        
        AnimationClass arriba2 = new AnimationClass();
        arriba2.jTextFieldYUp(80, 0, 18, 10, ca_user);
        
        AnimationClass arriba3 = new AnimationClass();
        arriba3.jPasswordFieldYUp(200, -80, 18, 10, contra_user);
        
        AnimationClass arriba4 = new AnimationClass();
        arriba4.jLabelYUp(170, 0, 18, 10, jLabel1);
        
        AnimationClass arriba5 = new AnimationClass();
        arriba5.jButtonYUp(250, 0, 18, 10, jCerrarButton);
        
        AnimationClass arriba6 = new AnimationClass();
        arriba6.jButtonYUp(240, 0, 18, 10, jButton_iniciar);
        
        AnimationClass arriba7 = new AnimationClass();
        arriba7.jButtonYUp(250, 0, 18, 10, jButton_crear_cuenta);
        
        ca_user.setText("");
        contra_user.setText("");
    }//GEN-LAST:event_jCerrarButtonActionPerformed

    private void jCerrarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCerrarButtonMouseClicked
        
    }//GEN-LAST:event_jCerrarButtonMouseClicked

    private void jButton_crear_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_crear_cuentaActionPerformed
       
    }//GEN-LAST:event_jButton_crear_cuentaActionPerformed

    private void jButton_crear_cuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_crear_cuentaMouseClicked
        AnimationClass arriba = new AnimationClass();
        arriba.jLabelYUp(20, -210, 18, 10, jLabelLogin);
        
        AnimationClass arriba1 = new AnimationClass();
        arriba1.jLabelYUp(40, 0, 18, 10, jLabelUser);
        
        AnimationClass arriba2 = new AnimationClass();
        arriba2.jTextFieldYUp(80, 0, 18, 10, ca_user);
        
        AnimationClass arriba3 = new AnimationClass();
        arriba3.jPasswordFieldYUp(200, -80, 18, 10, contra_user);
        
        AnimationClass arriba4 = new AnimationClass();
        arriba4.jLabelYUp(170, 0, 18, 10, jLabel1);
        
         AnimationClass arriba5 = new AnimationClass();
        arriba5.jButtonYUp(250, 0, 18, 10, jCerrarButton);
        
        AnimationClass arriba6 = new AnimationClass();
        arriba6.jButtonYUp(240, 0, 18, 10, jButton_iniciar);
        
        AnimationClass arriba7 = new AnimationClass();
        arriba7.jButtonYUp(250, 0, 18, 10, jButton_crear_cuenta);
        
        AnimationClass arriba8 = new AnimationClass();
        arriba8.jLabelYUp(230, 0, 18, 10, jregisterlabel);
        
        AnimationClass arriba9 = new AnimationClass();
        arriba9.jLabelYUp(280, 50, 18, 10, jLabelUser1);
        
        AnimationClass arriba10 = new AnimationClass();
        arriba10.jLabelYUp(270, 150, 18, 10, jLabelContra);
        
        AnimationClass arriba11 = new AnimationClass();
        arriba11.jTextFieldYUp(270, 90, 18, 10, ca_user1);
        
        AnimationClass arriba12 = new AnimationClass();
        arriba12.jPasswordFieldYUp(270, 190, 18, 10, contra_user1);
        
        AnimationClass arriba13 = new AnimationClass();
        arriba13.jButtonYUp(270, 250, 18, 10, jCerrarButtonCreate1);
        
        AnimationClass arriba14 = new AnimationClass();
        arriba14.jButtonYUp(270, 240, 18, 10, jButton_registrar1); 
        
        ca_user.setText("");
        contra_user.setText("");
        
        ca_user1.setText("");
        contra_user1.setText("");
        
    }//GEN-LAST:event_jButton_crear_cuentaMouseClicked

    private void contra_user1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contra_user1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contra_user1ActionPerformed

    private void ca_user1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ca_user1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ca_user1ActionPerformed

    private void jCerrarButtonCreate1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCerrarButtonCreate1MouseClicked
        AnimationClass abajo8 = new AnimationClass();
        abajo8.jLabelYDown(0, 230, 18, 10, jregisterlabel);
        
        AnimationClass abajo9 = new AnimationClass();
        abajo9.jLabelYDown(50, 280, 18, 10, jLabelUser1);
        
        AnimationClass abajo10 = new AnimationClass();
        abajo10.jLabelYDown(150, 270, 18, 10, jLabelContra);
        
        AnimationClass abajo11 = new AnimationClass();
        abajo11.jTextFieldYDown(90, 270, 18, 10, ca_user1);
        
        AnimationClass abajo12 = new AnimationClass();
        abajo12.jPasswordFieldYDown(190, 270, 18, 10, contra_user1);
        
        AnimationClass arriba13 = new AnimationClass();
        arriba13.jButtonYUp(250, 270, 18, 10, jCerrarButtonCreate1);
        
        AnimationClass abajo14 = new AnimationClass();
        abajo14.jButtonYDown(240, 270, 18, 10, jButton_registrar1);
        
        ca_user1.setText("");
        contra_user1.setText("");
    }//GEN-LAST:event_jCerrarButtonCreate1MouseClicked

    private void jCerrarButtonCreate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCerrarButtonCreate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCerrarButtonCreate1ActionPerformed

    private void jButton_registrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_registrar1MouseClicked
    String nombreUsuario = ca_user1.getText();
    String contraseña = new String(contra_user1.getPassword());

    // Verificar si el nombre de usuario ya está registrado
    boolean nombreUsuarioExistente = false;
    for (User usuario : usuariosRegistrados) {
        if (usuario.getNombre_usuario().equals(nombreUsuario)) {
            nombreUsuarioExistente = true;
            break;
        }
    }

    // Mostrar mensaje según el resultado
    if (nombreUsuarioExistente) {
        JOptionPane.showMessageDialog(this, "El nombre de usuario " + "'" + nombreUsuario + "'" + " ya está registrado. Por favor, elija otro.");
    } else {
        // Crear un nuevo objeto Usuario
        User nuevoUsuario = new User(nombreUsuario, contraseña);

        // Agregar el usuario al ArrayList
        usuariosRegistrados.add(nuevoUsuario);

        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(this," Bienvenido " + "'" +nombreUsuario + "'" + " Usuario registrado exitosamente.");
    }
     ca_user1.setText("");
     contra_user1.setText("");
    }//GEN-LAST:event_jButton_registrar1MouseClicked

    private void jButton_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_iniciarMouseClicked
    String nombreUsuario = ca_user.getText();
    String contraseña = new String(contra_user.getPassword());

    // Verificar si el usuario está registrado
    boolean usuarioEncontrado = false;
    for (User usuario : usuariosRegistrados) {
        if (usuario.getNombre_usuario().equals(nombreUsuario) && usuario.getContrasenia().equals(contraseña)) {
            usuarioEncontrado = true;

            // Abrir la ventana de inicio y cerrar la de login
            Inicio inicio = new Inicio();
            dispose(); // Cierra la ventana de login
            inicio.setVisible(true);

            break;
        }
    }

    // Mostrar mensaje según el resultado
    if (usuarioEncontrado) {
        JOptionPane.showMessageDialog(this, "Usuario encontrado. Bienvenido " + "'" +nombreUsuario + "'");
    } else {
        JOptionPane.showMessageDialog(this,"Usuario o contrasenia incorrecta, usuario " + "'" +nombreUsuario + "'" +" no encontrado. O por favor, regístrese primero.");
    }
    
    ca_user.setText("");
    contra_user.setText("");
    }//GEN-LAST:event_jButton_iniciarMouseClicked


    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JPanel background;
    private javax.swing.JTextField ca_user;
    private javax.swing.JTextField ca_user1;
    private javax.swing.JPasswordField contra_user;
    private javax.swing.JPasswordField contra_user1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_crear_cuenta;
    private javax.swing.JButton jButton_iniciar;
    private javax.swing.JButton jButton_registrar1;
    private javax.swing.JButton jCerrarButton;
    private javax.swing.JButton jCerrarButtonCreate1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelContra;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelUser1;
    private javax.swing.JButton jbntNext;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JLabel jbtnCerrar;
    private javax.swing.JLabel jbtnMinimizar;
    private javax.swing.JLabel jlabelBackground;
    private javax.swing.JLabel jlblPulic1;
    private javax.swing.JLabel jlblPulic2;
    private javax.swing.JLabel jpPalo;
    private javax.swing.JLabel jpPalo1;
    private javax.swing.JPanel jregister;
    private javax.swing.JLabel jregisterlabel;
    // End of variables declaration//GEN-END:variables
}
