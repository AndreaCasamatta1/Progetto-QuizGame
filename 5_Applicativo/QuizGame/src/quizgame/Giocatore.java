/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizgame;

/**
 *
 * @author Andrea.casamatta
 */
public class Giocatore {
    private String nomeUtente;
    private int punteggio;

    public Giocatore(String nomeUtente, int punteggio) {
        this.nomeUtente = nomeUtente;
        this.punteggio = punteggio;
    }
    
    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }
    
    public void aggiornaPunteggio(int punti){
        
    }
}
