package quizgame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Andrea.casamatta
 */
public class QuizGame {
    
    private List<Giocatore> giocatori = new ArrayList<>();
    private List<Domanda> domande = new ArrayList<>();
    public void QuizGame(){
        caricaDomande();
    }
    private void caricaDomande() {
        try {
            File file = new File("quiz.txt");
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    String testo = scanner.nextLine().trim();
                    String tipo = scanner.nextLine().trim();
                    String difficolta = scanner.nextLine().trim();
                    String rispostaCorretta = scanner.nextLine().trim();
                    List<String> risposte = new ArrayList<>();
                    if (tipo.equals("Multipla")) {
                        String[] opzioni = scanner.nextLine().trim().split(",");
                        for (String opzione : opzioni) {
                            risposte.add(opzione.trim());
                        }
                    }
                    Domanda domanda = new Domanda(testo, null, null, null, null, difficolta, tipo, rispostaCorretta, risposte);
                    domande.add(domanda);
                    // Salta la linea vuota tra le domande
                    if (scanner.hasNextLine()) {
                        scanner.nextLine();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato: " + e.getMessage());
        }
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

    public void aggiungiGiocatore(Giocatore giocatore) {
        giocatori.add(giocatore);
    }

    public void rimuoviGiocatore() {
        giocatori.removeAll(giocatori);
    
    }

    public void visualizzaClassifica() {
        
    }

}
