/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package quizgame.UI;

import java.util.List;
import javax.swing.DefaultListModel;
import quizgame.Giocatore;
import quizgame.QuizGame;

/**
 *
 * @author Andrea.casamatta
 */
public class Classifica extends javax.swing.JPanel {

    /**
     * Creates new form Classifica
     */
    private QuizGame quizGame;

    public Classifica(QuizGame quizGame) {
        this.quizGame = quizGame;

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

        posizione = new javax.swing.JLabel();
        nomeGiocatore = new javax.swing.JLabel();
        punteggio = new javax.swing.JLabel();
        classificaTitolo = new javax.swing.JLabel();
        nomeGiocatoreList = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        posizioneList = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        puntiList = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();

        posizione.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posizione.setText("Posizione");

        nomeGiocatore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeGiocatore.setText("Nome Giocatore");

        punteggio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        punteggio.setText("Punti");

        classificaTitolo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        classificaTitolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classificaTitolo.setText("Classifica");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        nomeGiocatoreList.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        posizioneList.setViewportView(jList2);

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        puntiList.setViewportView(jList3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(posizioneList, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(posizione, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomeGiocatoreList, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(puntiList, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(classificaTitolo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeGiocatore, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(punteggio)))
                .addContainerGap(309, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(classificaTitolo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(posizione)
                            .addComponent(punteggio)
                            .addComponent(nomeGiocatore))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(posizioneList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(puntiList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(nomeGiocatoreList)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
public void aggiornaClassifica() {
        //giocatori dalla classe QuizGame
        List<Giocatore> giocatori = quizGame.getGiocatori();

        // Ordina i giocatori in base al punteggio 
        giocatori.sort((g1, g2) -> Integer.compare(g2.getPunteggio(), g1.getPunteggio()));

        // arraay per le colonne della classifica
        String[] posizioni = new String[giocatori.size()];
        String[] nomi = new String[giocatori.size()];
        String[] punteggi = new String[giocatori.size()];

        // Popolare gli array con i dati ordinati
        for (int i = 0; i < giocatori.size(); i++) {
            Giocatore giocatore = giocatori.get(i);
            posizioni[i] = String.valueOf(i + 1); // Posizione
            nomi[i] = giocatore.getNomeUtente(); // Nome del giocatore
            punteggi[i] = String.valueOf(giocatore.getPunteggio()); // Punteggio
        }

        // Imposta i dati 
        jList2.setListData(posizioni);
        jList1.setListData(nomi);
        jList3.setListData(punteggi);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel classificaTitolo;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JLabel nomeGiocatore;
    private javax.swing.JScrollPane nomeGiocatoreList;
    private javax.swing.JLabel posizione;
    private javax.swing.JScrollPane posizioneList;
    private javax.swing.JLabel punteggio;
    private javax.swing.JScrollPane puntiList;
    // End of variables declaration//GEN-END:variables
}
