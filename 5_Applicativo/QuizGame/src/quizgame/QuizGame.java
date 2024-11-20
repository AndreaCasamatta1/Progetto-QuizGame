/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Andrea.casamatta
 */
public class QuizGame {
    private  List<Giocatore> giocatori = new ArrayList<Giocatore>();
    private  List<Domanda> domande = new ArrayList<Domanda>();

    public QuizGame() {
    }

    public List<Giocatore> getGiocatori() {
        return giocatori;
    }

    public void setGiocatori(List<Giocatore> giocatori) {
        this.giocatori = giocatori;
    }

    public List<Domanda> getDomande() {
        return domande;
    }

    public void setDomande(List<Domanda> domande) {
        this.domande = domande;
    }
    
    public void aggiungiGiocatore(Giocatore giocatore){
        giocatori.add(giocatore);
    }
    public void rimuoviGiocatore(){
        giocatori.removeAll(giocatori);
    }
    
    public void aggiornaClassifica(){
        
    }
    public void visualizzaClassifica(){
        
    }    
    
}
