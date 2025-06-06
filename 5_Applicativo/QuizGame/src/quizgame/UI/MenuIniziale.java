/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package quizgame.UI;

import java.util.*;
import javax.swing.JTextField;
import quizgame.*;

/**
 *
 * @author Andrea.casamatta
 */
public class MenuIniziale extends javax.swing.JPanel {

    private QuizGame quizGame;

    public MenuIniziale(QuizGame quizGame) {
        this.quizGame = quizGame;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aggGiocatore = new javax.swing.JButton();
        nomeUtente6 = new javax.swing.JTextField();
        nomeUtente9 = new javax.swing.JTextField();
        nomeUtente8 = new javax.swing.JTextField();
        nomeUtente5 = new javax.swing.JTextField();
        nomeUtente4 = new javax.swing.JTextField();
        nomeUtente3 = new javax.swing.JTextField();
        nomeUtente10 = new javax.swing.JTextField();
        rimGiocatore = new javax.swing.JButton();
        titolo = new javax.swing.JLabel();
        nomeUtente2 = new javax.swing.JTextField();
        nomeUtente1 = new javax.swing.JTextField();
        nomeUtente7 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(51, 153, 255));

        aggGiocatore.setText("aggiungi giocatore");
        aggGiocatore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggGiocatoreActionPerformed(evt);
            }
        });

        nomeUtente6.setText("Inserisci nome");
        nomeUtente6.setEnabled(false);

        nomeUtente9.setText("Inserisci nome");
        nomeUtente9.setEnabled(false);

        nomeUtente8.setText("Inserisci nome");
        nomeUtente8.setEnabled(false);

        nomeUtente5.setText("Inserisci nome");
        nomeUtente5.setEnabled(false);

        nomeUtente4.setText("Inserisci nome");
        nomeUtente4.setEnabled(false);

        nomeUtente3.setText("Inserisci nome");
        nomeUtente3.setEnabled(false);

        nomeUtente10.setText("Inserisci nome");
        nomeUtente10.setEnabled(false);

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

        nomeUtente2.setText("Inserisci nome");
        nomeUtente2.setEnabled(false);

        nomeUtente1.setText("Inserisci nome");

        nomeUtente7.setText("Inserisci nome");
        nomeUtente7.setEnabled(false);

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
                                    .addComponent(nomeUtente1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeUtente5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(nomeUtente7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nomeUtente9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nomeUtente3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(160, 160, 160)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeUtente6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeUtente2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeUtente10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeUtente8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeUtente4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addComponent(nomeUtente1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeUtente2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeUtente3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeUtente4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeUtente6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeUtente5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeUtente8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeUtente7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeUtente10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeUtente9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aggGiocatore, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rimGiocatore, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void aggGiocatoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggGiocatoreActionPerformed
        //serve per aggiungere i giocatori, quando arriva a 10 giocatori il Button viene disabilitato
        if (nomeUtente9.isEnabled()) {
            aggGiocatore.setEnabled(false);
            aggGiocatore.setText("massimo raggiunto");
        }
        if (nomeUtente9.isEnabled()) {
            nomeUtente10.setEnabled(true);
        } else if (nomeUtente8.isEnabled()) {
            nomeUtente9.setEnabled(true);
        } else if (nomeUtente7.isEnabled()) {
            nomeUtente8.setEnabled(true);
        } else if (nomeUtente6.isEnabled()) {
            nomeUtente7.setEnabled(true);
        } else if (nomeUtente5.isEnabled()) {
            nomeUtente6.setEnabled(true);
        } else if (nomeUtente4.isEnabled()) {
            nomeUtente5.setEnabled(true);
        } else if (nomeUtente3.isEnabled()) {
            nomeUtente4.setEnabled(true);
        } else if (nomeUtente2.isEnabled()) {
            nomeUtente3.setEnabled(true);
        } else if (nomeUtente1.isEnabled()) {
            nomeUtente2.setEnabled(true);

        }
        rimGiocatore.setEnabled(true);
        rimGiocatore.setText("rimuovi giocatore");
        nomeUtente1.setEnabled(true);
    }//GEN-LAST:event_aggGiocatoreActionPerformed

    private void rimGiocatoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rimGiocatoreActionPerformed
        //serve per rimuovere i giocatori, quando arriva a un giocatore il Button viene disabilitato
        if (!nomeUtente3.isEnabled()) {
            nomeUtente2.setEnabled(false);
            nomeUtente2.setText("Inserisci nome");
            rimGiocatore.setEnabled(false);
            rimGiocatore.setText("Minimo raggiunto");
        } else if (!nomeUtente4.isEnabled()) {
            nomeUtente3.setEnabled(false);
            nomeUtente3.setText("Inserisci nome");
        } else if (!nomeUtente5.isEnabled()) {
            nomeUtente4.setEnabled(false);
            nomeUtente4.setText("Inserisci nome");
        } else if (!nomeUtente6.isEnabled()) {
            nomeUtente5.setEnabled(false);
            nomeUtente5.setText("Inserisci nome");
        } else if (!nomeUtente7.isEnabled()) {
            nomeUtente6.setEnabled(false);
            nomeUtente6.setText("Inserisci nome");
        } else if (!nomeUtente8.isEnabled()) {
            nomeUtente7.setEnabled(false);
            nomeUtente7.setText("Inserisci nome");
        } else if (!nomeUtente9.isEnabled()) {
            nomeUtente8.setEnabled(false);
            nomeUtente8.setText("Inserisci nome");
        } else if (!nomeUtente10.isEnabled()) {
            nomeUtente9.setEnabled(false);
            nomeUtente9.setText("Inserisci nome");
        }
        nomeUtente10.setEnabled(false);
        nomeUtente10.setText("Inserisci nome");
        aggGiocatore.setText("aggiungi giocatore");
        aggGiocatore.setEnabled(true);
    }//GEN-LAST:event_rimGiocatoreActionPerformed

    public void inviaNomi() {
        //rimuove i giocatori dalla partita precedente
        quizGame.rimuoviGiocatore();
        //crea due array che contiene tutti i 10 fields e i 10 giocatori
        JTextField fields[] = {nomeUtente1, nomeUtente2, nomeUtente3, nomeUtente4, nomeUtente5, nomeUtente6, nomeUtente7, nomeUtente8, nomeUtente9, nomeUtente10};
        Giocatore utenti[] = new Giocatore[fields.length];
        for (int i = 0; i < fields.length; i++) {
            if (fields[i].isEnabled()) {
                //nel caso sia stato abilitato il JTextField, viene preso il nome inserito e dopo viene messo nel giocatore come nome
                utenti[i] = new Giocatore(fields[i].getText(), 0); 
                utenti[i].setNomeUtente(fields[i].getText());
                quizGame.aggiungiGiocatore(utenti[i]);
               
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aggGiocatore;
    private javax.swing.JTextField nomeUtente1;
    private javax.swing.JTextField nomeUtente10;
    private javax.swing.JTextField nomeUtente2;
    private javax.swing.JTextField nomeUtente3;
    private javax.swing.JTextField nomeUtente4;
    private javax.swing.JTextField nomeUtente5;
    private javax.swing.JTextField nomeUtente6;
    private javax.swing.JTextField nomeUtente7;
    private javax.swing.JTextField nomeUtente8;
    private javax.swing.JTextField nomeUtente9;
    private javax.swing.JButton rimGiocatore;
    private javax.swing.JLabel titolo;
    // End of variables declaration//GEN-END:variables
}
