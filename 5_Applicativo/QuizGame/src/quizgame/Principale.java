/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quizgame;
import quizgame.UI.*;

/**
 *
 * @author Andrea.casamatta
 */
public class Principale extends javax.swing.JFrame {

    /**
     * Creates new form Principale
     */
    Domande domande1 = new Domande();
    Impostazioni impostazioni1 = new Impostazioni();
    MenuIniziale menu1 = new MenuIniziale();
    
    public Principale() {
        initComponents(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PaginaBase = new javax.swing.JPanel();
        CambioPagina = new javax.swing.JPanel();
        prossima = new javax.swing.JButton();
        precedente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setResizable(false);
        setSize(new java.awt.Dimension(750, 415));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.GroupLayout PaginaBaseLayout = new javax.swing.GroupLayout(PaginaBase);
        PaginaBase.setLayout(PaginaBaseLayout);
        PaginaBaseLayout.setHorizontalGroup(
            PaginaBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );
        PaginaBaseLayout.setVerticalGroup(
            PaginaBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        getContentPane().add(PaginaBase, java.awt.BorderLayout.CENTER);
        PaginaBase.setVisible(false);  getContentPane().remove(PaginaBase);  getContentPane().add(menu1, java.awt.BorderLayout.CENTER);

        prossima.setBackground(new java.awt.Color(0, 204, 51));
        prossima.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        prossima.setForeground(new java.awt.Color(0, 0, 0));
        prossima.setText("PROSSIMA");
        prossima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prossimaActionPerformed(evt);
            }
        });

        precedente.setBackground(new java.awt.Color(255, 102, 0));
        precedente.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        precedente.setForeground(new java.awt.Color(0, 0, 0));
        precedente.setText("PRECEDENTE");
        precedente.setEnabled(false);
        precedente.setVisible(false);
        precedente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precedenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CambioPaginaLayout = new javax.swing.GroupLayout(CambioPagina);
        CambioPagina.setLayout(CambioPaginaLayout);
        CambioPaginaLayout.setHorizontalGroup(
            CambioPaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CambioPaginaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(precedente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 636, Short.MAX_VALUE)
                .addComponent(prossima)
                .addContainerGap())
        );
        CambioPaginaLayout.setVerticalGroup(
            CambioPaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CambioPaginaLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(CambioPaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prossima)
                    .addComponent(precedente))
                .addContainerGap())
        );

        getContentPane().add(CambioPagina, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prossimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prossimaActionPerformed
        // TODO add your handling code here:
        if(menu1.isEnabled()){
//            if(jTextField1.isEnabled()){
//                Giocatore g1 = new Giocatore(jTextField1.getText(), 0);
//            }
//            else if(jTextField2.isEnabled()){
//                Giocatore g2 = new Giocatore(jTextField2.getText(), 0);
//            }
//            else if(jTextField3.isEnabled()){
//                Giocatore g3 = new Giocatore(jTextField3.getText(), 0);
//            }
//            else if(jTextField4.isEnabled()){
//                Giocatore g4 = new Giocatore(jTextField4.getText(), 0);
//            }
//            else if(jTextField5.isEnabled()){
//                Giocatore g5 = new Giocatore(jTextField5.getText(), 0);
//            }
//            else if(jTextField6.isEnabled()){
//                Giocatore g6 = new Giocatore(jTextField6.getText(), 0);
//            }
//            else if(jTextField7.isEnabled()){
//                Giocatore g7 = new Giocatore(jTextField7.getText(), 0);
//            }
//            else if(jTextField8.isEnabled()){
//                Giocatore g8 = new Giocatore(jTextField8.getText(), 0);
//            }
//            else if(jTextField9.isEnabled()){
//                Giocatore g9 = new Giocatore(jTextField9.getText(), 0);
//            }
//            else if(jTextField10.isEnabled()){
//                Giocatore g10 = new Giocatore(jTextField10.getText(), 0);
//            } 
            
            menu1.setVisible(false);
            menu1.setEnabled(false);
            getContentPane().remove(menu1);
            getContentPane().add(impostazioni1, java.awt.BorderLayout.CENTER);
            impostazioni1.setVisible(true);
            impostazioni1.setEnabled(true);
            precedente.setVisible(true);
            precedente.setEnabled(true);
        }
        else if(impostazioni1.isEnabled()){   
            impostazioni1.setVisible(false);
            impostazioni1.setEnabled(false);
            getContentPane().remove(impostazioni1);
            getContentPane().add(domande1, java.awt.BorderLayout.CENTER);
            domande1.setVisible(true);
            domande1.setEnabled(true);
 
        }
        
        

    }//GEN-LAST:event_prossimaActionPerformed

    private void precedenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precedenteActionPerformed
        // TODO add your handling code here:
        if(impostazioni1.isEnabled())
        {
            impostazioni1.setVisible(false);
            impostazioni1.setEnabled(false);
            getContentPane().remove(impostazioni1);
            getContentPane().add(menu1, java.awt.BorderLayout.CENTER);
            precedente.setVisible(false);
            precedente.setEnabled(false);
            menu1.setVisible(true);
            menu1.setEnabled(true);
        }
        
        else if(domande1.isEnabled())
        {
            domande1.setVisible(false);
            domande1.setEnabled(false);
            getContentPane().remove(domande1);
            getContentPane().add(impostazioni1, java.awt.BorderLayout.CENTER);
            impostazioni1.setVisible(true);
            impostazioni1.setEnabled(true);
        }
    }//GEN-LAST:event_precedenteActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:              
        
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CambioPagina;
    private javax.swing.JPanel PaginaBase;
    private javax.swing.JButton precedente;
    private javax.swing.JButton prossima;
    // End of variables declaration//GEN-END:variables
}