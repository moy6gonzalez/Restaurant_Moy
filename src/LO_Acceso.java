import java.sql.Statement;
import javax.swing.JOptionPane;
/* @author Moises Gonzalez
 */
public class LO_Acceso extends javax.swing.JFrame {
   
    public LO_Acceso() {
        initComponents();    
         Logica_Acceso la = new Logica_Acceso(usuario,password,verifica);
        verifica.addActionListener(la);
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        verifica = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 80)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PITAKS ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        verifica.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        verifica.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        verifica.setForeground(new java.awt.Color(102, 102, 102));
        verifica.setText("VERIFICAR");
        verifica.setAutoscrolls(true);
        verifica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        verifica.setContentAreaFilled(false);
        verifica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verifica.setFocusPainted(false);
        verifica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        verifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("Password:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("User: ");

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel5.setText("EL SAZON DEL VIT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(125, 125, 125))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(verifica, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(46, 46, 46)
                .addComponent(verifica)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordKeyPressed

    private void verificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificaActionPerformed

        
     /*   try{
             String bd="test";
            String puerto="3306";
            String host="localhost";
            String cadenaConexion="jdbc:mariadb://"+host+":"+puerto+"/"+bd;
            String usuario="root";
            String contrasena="moyeschido";
            JOptionPane.showMessageDialog(null, "Conectado");
            Statement s = cn.createStatement();
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "error"+ex);
        }*/
       
    /*    String nom = usuario.getText();
        String pass = password.getText();

        if ((nom.equals("Administrador")) && (pass.equals("admin"))) {
            nombreA = "Administrador";
            OPCIONES op = new OPCIONES();
            op.setVisible(true);
            op.setLocationRelativeTo(null);
            this.dispose();

         //   op.verCocina.setEnabled(true);
        } else if ((nom.equals("JesusF")) && (pass.equals("jesus"))) {
            nombreA = "JesusF";
            OPCIONES op = new OPCIONES();
            op.setVisible(true);
            op.setLocationRelativeTo(null);
            this.dispose();
        } else if ((nom.equals("MiguelJ")) && (pass.equals("migue"))) {
            nombreA = "MiguelJ";
            OPCIONES op = new OPCIONES();
            op.setVisible(true);
            op.setLocationRelativeTo(null);
            this.dispose();
        //    op.verCocina.setEnabled(false);
        } else if ((nom.equals("AugustoS")) && (pass.equals("augus"))) {
            nombreA = "AugustoS";
            OPCIONES op = new OPCIONES();
            op.setVisible(true);
            op.setLocationRelativeTo(null);
            this.dispose();
        //    op.verCocina.setEnabled(false);
        } else if ((nom.equals("MarleneD")) && (pass.equals("marle"))) {
            nombreA = "MarleneD";
            OPCIONES op = new OPCIONES();
            op.setVisible(true);
            op.setLocationRelativeTo(null);
            this.dispose();
        //    op.verCocina.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(null, "Datos incorrectos, verifique nuevamente.");
        }*/
    }//GEN-LAST:event_verificaActionPerformed
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
            java.util.logging.Logger.getLogger(LO_Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LO_Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LO_Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LO_Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LO_Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JPasswordField password;
    public javax.swing.JTextField usuario;
    private javax.swing.JButton verifica;
    // End of variables declaration//GEN-END:variables
}
