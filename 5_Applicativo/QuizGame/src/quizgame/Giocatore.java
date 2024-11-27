/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizgame;

import quizgame.UI.MenuIniziale;

/**
 *
 * @author Andrea.casamatta
 */
public class Giocatore extends QuizGame {
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
        if(nomeUtente.length() < 1){
            String alfabeto = "abcdefghijklmnopqrstuvwxyz";
            int numeroLettereAlfabeto = alfabeto.length();
            String parola = "";
            for (int i = 0; i < 5; i++) {
                // scelgo una delle lettere dell'alfabeto.
                int j = (int)(Math.random()*numeroLettereAlfabeto);
                parola += alfabeto.charAt(j);
            }
            nomeUtente=parola;
        }
        this.nomeUtente = nomeUtente;
        
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }
    
    public void aggiornaPunteggio(){
        punteggio++;
    }
    
    
}
