/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package quizgame.UI;

/**
 *
 * @author Andrea.casamatta
 */
public class MenuIniziale extends javax.swing.JPanel {

    /**
     * Creates new form MenuIniziale
     */
    public MenuIniziale() {
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

        aggGiocatore = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        rimGiocatore = new javax.swing.JButton();
        titolo = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();

        aggGiocatore.setText("aggiungi giocatore");
        aggGiocatore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggGiocatoreActionPerformed(evt);
            }
        });

        jTextField6.setText("Inserisci nome");
        jTextField6.setEnabled(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField9.setText("Inserisci nome");
        jTextField9.setEnabled(false);

        jTextField8.setText("Inserisci nome");
        jTextField8.setEnabled(false);

        jTextField5.setText("Inserisci nome");
        jTextField5.setEnabled(false);

        jTextField4.setText("Inserisci nome");
        jTextField4.setEnabled(false);

        jTextField3.setText("Inserisci nome");
        jTextField3.setEnabled(false);

        jTextField10.setText("Inserisci nome");
        jTextField10.setEnabled(false);

        rimGiocatore.setText("rimuovi giocatore");
        rimGiocatore.setEnabled(false);
        rimGiocatore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rimGiocatoreActionPerformed(evt);
            }
        });

        titolo.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        titolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titolo.setText("QUIZ GAME");
        titolo.setToolTipText("");

        jTextField2.setText("Inserisci nome");
        jTextField2.setEnabled(false);

        jTextField1.setText("Inserisci nome");

        jTextField7.setText("Inserisci nome");
        jTextField7.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(aggGiocatore)
                                .addGap(46, 46, 46)
                                .addComponent(rimGiocatore)
                                .addGap(56, 56, 56))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(160, 160, 160)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(titolo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(titolo, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aggGiocatore, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rimGiocatore, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void aggGiocatoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggGiocatoreActionPerformed

        if (jTextField9.isEnabled()){
            aggGiocatore.setEnabled(false);
            aggGiocatore.setText("massimo raggiunto");
        }
        if(jTextField9.isEnabled()){
            jTextField10.setEnabled(true);
        }
        else if(jTextField8.isEnabled()){
            jTextField9.setEnabled(true);
        }
        else if(jTextField7.isEnabled()){
            jTextField8.setEnabled(true);
        }
        else if(jTextField6.isEnabled()){
            jTextField7.setEnabled(true);
        }
        else if(jTextField5.isEnabled()){
            jTextField6.setEnabled(true);
        }
        else if(jTextField4.isEnabled()){
            jTextField5.setEnabled(true);
        }
        else if(jTextField3.isEnabled()){
            jTextField4.setEnabled(true);
        }
        else if(jTextField2.isEnabled()){
            jTextField3.setEnabled(true);
        }
        else if(jTextField1.isEnabled()){
            jTextField2.setEnabled(true);

        }
        rimGiocatore.setEnabled(true);
        rimGiocatore.setText("rimuovi giocatore");
        jTextField1.setEnabled(true);
    }//GEN-LAST:event_aggGiocatoreActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void rimGiocatoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rimGiocatoreActionPerformed
        // TODO add your handling code here:
        if(!jTextField3.isEnabled()){
            jTextField2.setEnabled(false);
            rimGiocatore.setEnabled(false);
            rimGiocatore.setText("Minimo raggiunto");
        }
        else if(!jTextField4.isEnabled()){
            jTextField3.setEnabled(false);
            jTextField3.setText("Inserisci nome");
        }
        else if(!jTextField5.isEnabled()){
            jTextField4.setEnabled(false);
            jTextField4.setText("Inserisci nome");
        }
        else if(!jTextField6.isEnabled()){
            jTextField5.setEnabled(false);
            jTextField5.setText("Inserisci nome");
        }
        else if(!jTextField7.isEnabled()){
            jTextField6.setEnabled(false);
            jTextField6.setText("Inserisci nome");
        }
        else if(!jTextField8.isEnabled()){
            jTextField7.setEnabled(false);
            jTextField7.setText("Inserisci nome");
        }
        else if(!jTextField9.isEnabled()){
            jTextField8.setEnabled(false);
            jTextField8.setText("Inserisci nome");
        }
        else if(!jTextField10.isEnabled()){
            jTextField9.setEnabled(false);
            jTextField9.setText("Inserisci nome");
        }
        jTextField10.setEnabled(false);
        jTextField10.setText("Inserisci nome");
        aggGiocatore.setText("aggiungi giocatore");
        aggGiocatore.setEnabled(true);
    }//GEN-LAST:event_rimGiocatoreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aggGiocatore;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton rimGiocatore;
    private javax.swing.JLabel titolo;
    // End of variables declaration//GEN-END:variables
}
