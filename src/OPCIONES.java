/* @author Moises Gonzalez
 */
public class OPCIONES extends javax.swing.JFrame {
    
    private String perfil = null;
    private String usuario = null;
   
  public OPCIONES() {
        
        initComponents();
  }
    /* Creates new form OPCIONES
     */
    
    
    public OPCIONES(String perfil,String usuario) {
        
        initComponents();
        this.perfil=perfil;
        this.usuario=usuario;
        this.setTitle("MENU PRINCIPAL ["+usuario+"]");
        
        switch(perfil){
        
            case "Administrador":
                
                vermenu.setEnabled(true);
                verestadisticas.setEnabled(true);
                vermesas.setEnabled(true);
                verpedido.setEnabled(true);
                vercocina.setEnabled(true);
                vercobro.setEnabled(true);
                break;
                  case "Recepcionista":
                vercocina.setEnabled(false);
                vermenu.setEnabled(false);
                verestadisticas.setEnabled(false);
                vermesas.setEnabled(true);
                verpedido.setEnabled(false);
                vercobro.setEnabled(false);
                break;
            case "Cocinera":
                vercocina.setEnabled(true);
                vermenu.setEnabled(false);
                verestadisticas.setEnabled(false);
                vermesas.setEnabled(false);
                verpedido.setEnabled(false);
                vercobro.setEnabled(false);
                break;
                  case "Mesero":
                vercocina.setEnabled(false);
                vermenu.setEnabled(true);
                verestadisticas.setEnabled(false);
                vermesas.setEnabled(false);
                verpedido.setEnabled(true);
                vercobro.setEnabled(false);
                break;
          
            default:
                    }      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        vercocina = new javax.swing.JButton();
        vermenu = new javax.swing.JButton();
        verestadisticas = new javax.swing.JButton();
        vermesas = new javax.swing.JButton();
        verpedido = new javax.swing.JButton();
        vercobro = new javax.swing.JButton();
        regresarusuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Opciones");

        vercocina.setText("COCINA");
        vercocina.setMaximumSize(new java.awt.Dimension(105, 23));
        vercocina.setMinimumSize(new java.awt.Dimension(105, 23));
        vercocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vercocinaActionPerformed(evt);
            }
        });

        vermenu.setText("MENU");
        vermenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vermenuActionPerformed(evt);
            }
        });

        verestadisticas.setText("ESTADISTICAS");
        verestadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verestadisticasActionPerformed(evt);
            }
        });

        vermesas.setText("MESAS");
        vermesas.setMaximumSize(new java.awt.Dimension(105, 23));
        vermesas.setMinimumSize(new java.awt.Dimension(105, 23));
        vermesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vermesasActionPerformed(evt);
            }
        });

        verpedido.setText("PEDIDO");
        verpedido.setMaximumSize(new java.awt.Dimension(105, 23));
        verpedido.setMinimumSize(new java.awt.Dimension(105, 23));
        verpedido.setPreferredSize(new java.awt.Dimension(105, 23));
        verpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verpedidoActionPerformed(evt);
            }
        });

        vercobro.setText("COBRO");
        vercobro.setMaximumSize(new java.awt.Dimension(105, 23));
        vercobro.setMinimumSize(new java.awt.Dimension(105, 23));
        vercobro.setPreferredSize(new java.awt.Dimension(105, 23));
        vercobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vercobroActionPerformed(evt);
            }
        });

        regresarusuario.setText("<<<  REGRESAR");
        regresarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarusuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(verestadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(vercocina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vermesas, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vermenu, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vercobro, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regresarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vermenu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vercocina, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(verestadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(vermesas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vercobro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addComponent(regresarusuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vercobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vercobroActionPerformed
        Cobro a= new Cobro();
        a.setVisible(true);
        this.setVisible(false);   
// TODO add your handling code here:
    }//GEN-LAST:event_vercobroActionPerformed

    private void vercocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vercocinaActionPerformed
 cocina a= new cocina();
        a.setVisible(true);
        this.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_vercocinaActionPerformed

    private void vermenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vermenuActionPerformed
      menu a= new menu();
        a.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_vermenuActionPerformed

    private void vermesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vermesasActionPerformed
            mesas a= new mesas();
        a.setVisible(true);
        this.setVisible(false); 
        // TODO add your handling code here:
    }//GEN-LAST:event_vermesasActionPerformed

    private void verestadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verestadisticasActionPerformed
            Estadisticas a= new Estadisticas();
        a.setVisible(true);
        this.setVisible(false); 
        // TODO add your handling code here:
    }//GEN-LAST:event_verestadisticasActionPerformed

    private void verpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verpedidoActionPerformed
     Pedidos a= new Pedidos();
        a.setVisible(true);
        this.setVisible(false);  
    // TODO add your handling code here:
    }//GEN-LAST:event_verpedidoActionPerformed

    private void regresarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarusuarioActionPerformed
      LO_Acceso a= new LO_Acceso();
        a.setVisible(true);
        this.setVisible(false);        
// TODO add your handling code here:
    }//GEN-LAST:event_regresarusuarioActionPerformed

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
            java.util.logging.Logger.getLogger(OPCIONES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OPCIONES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OPCIONES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OPCIONES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OPCIONES().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton regresarusuario;
    private javax.swing.JButton vercobro;
    private javax.swing.JButton vercocina;
    private javax.swing.JButton verestadisticas;
    private javax.swing.JButton vermenu;
    private javax.swing.JButton vermesas;
    private javax.swing.JButton verpedido;
    // End of variables declaration//GEN-END:variables
}