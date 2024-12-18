/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package quizgame.UI;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.border.Border;
import quizgame.Domanda;
import quizgame.Giocatore;
import quizgame.QuizGame;

/**
 *
 * @author Andrea.casamatta
 */
public class DomandaVeroFalso extends javax.swing.JPanel {

    private QuizGame quizGame;
    private Impostazioni impo1;

    public DomandaVeroFalso(QuizGame quizGame, Impostazioni impo1) {
        this.quizGame = quizGame;
        this.impo1 = impo1;
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        nomeGiocatore = new javax.swing.JLabel();
        numDomanda = new javax.swing.JLabel();
        vero = new javax.swing.JRadioButton();
        falso = new javax.swing.JRadioButton();
        risponde = new javax.swing.JLabel();
        contentDomanda = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 153, 255));
        setPreferredSize(new java.awt.Dimension(793, 443));

        nomeGiocatore.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        nomeGiocatore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeGiocatore.setText("nomeGiocatore");

        numDomanda.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        numDomanda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numDomanda.setText("num domanda");

        buttonGroup1.add(vero);
        vero.setText("VERO");
        vero.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        vero.setBorderPainted(true);
        vero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veroActionPerformed(evt);
            }
        });

        buttonGroup1.add(falso);
        falso.setSelected(true);
        falso.setText("FALSO");
        falso.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        falso.setBorderPainted(true);
        falso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                falsoActionPerformed(evt);
            }
        });

        risponde.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        risponde.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        risponde.setText("risponde");

        contentDomanda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contentDomanda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contentDomanda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(nomeGiocatore, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(risponde, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(numDomanda)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(vero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(falso)
                .addGap(193, 193, 193))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(contentDomanda, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeGiocatore, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numDomanda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(risponde, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(contentDomanda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(falso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );
    }// </editor-fold>//GEN-END:initComponents
    private String risposta = "false";
    private String rispostaCorretta;
    Giocatore giocatore1;
    private void falsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_falsoActionPerformed
        risposta = "Falso";
    }//GEN-LAST:event_falsoActionPerformed

    private void veroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veroActionPerformed
        risposta = "Vero";
    }//GEN-LAST:event_veroActionPerformed

    public void scegliGiocatore(int numGiocatore) {
        List<Giocatore> nomiGiocatori = quizGame.getGiocatori();
        //sceglie il giocatore dalla lista dei giocatori
        Giocatore giocatoreScelto = nomiGiocatori.get(numGiocatore);
        nomeGiocatore.setText(giocatoreScelto.getNomeUtente());
        //imposta il giocatore scelto come giocatore corrente
        giocatore1 = giocatoreScelto;
    }

    public void verificaRisposta() throws InterruptedException {
        System.out.println("Verifico vero-falso");
        if (risposta.equals(rispostaCorretta)) {
            //nel caso la risposta è corretta aggirona il punteggio del giocatore che sta rispondendo alla domanda
            giocatore1.aggiornaPunteggio();

        }
        System.out.println(giocatore1.getPunteggio());
    }

    public void scegliDomanda(int numeroDomanda) {
        //prende categoria e difficolta scelta dall'utente
        String cat = impo1.getCategoria();
        String diff = impo1.getDifficolta();
        //imposta il testo  della domanda vuota
        contentDomanda.setText("");
        numDomanda.setText(Integer.toString(numeroDomanda));
        quizGame.QuizGame();
        List<Domanda> domande = quizGame.getDomande();
        //le domandeUtili sono le domande che rispettano le impoostazioni delle domande inserite dall'utente
        List<Domanda> domandeUtili = new ArrayList<>();
        int contaDomande = 0;
        for (int i = 0; i < domande.size(); i++) {
            if ((domande.get(i).getTipoRisposta().equals("VF")) && (domande.get(i).getCategoria().equals(cat)) && (domande.get(i).getDifficolta().equals(diff))) {
                //aggiunge le domande che rispecchiano le scelte dell'utente alla lista
                domandeUtili.add(domande.get(i));
                contaDomande++;
            }
        }

        if (contaDomande > 0) {
            Random random = new Random();
            int indiceCasuale = random.nextInt(contaDomande);
            Domanda domandaCasuale = domandeUtili.get(indiceCasuale);
            contentDomanda.setText(domandaCasuale.getTesto());
            rispostaCorretta = domandaCasuale.getRispostaCorretta();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel contentDomanda;
    private javax.swing.JRadioButton falso;
    private javax.swing.JLabel nomeGiocatore;
    private javax.swing.JLabel numDomanda;
    private javax.swing.JLabel risponde;
    private javax.swing.JRadioButton vero;
    // End of variables declaration//GEN-END:variables
}
