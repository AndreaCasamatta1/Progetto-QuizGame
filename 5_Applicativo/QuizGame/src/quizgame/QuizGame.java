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
    
    public void QuizGame() {
        caricaDomande();
    }
    

    private void caricaDomande()  {     //Generato da AI
        try {
            File file = new File(System.getProperty("user.dir") + "/src/quizgame/Quiz.txt");
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    // Leggi il testo della domanda
                    String testo = scanner.hasNextLine() ? scanner.nextLine().trim() : null;
                    if (testo == null || testo.isEmpty()) {
                        continue; // Salta righe vuote
                    }
                    
                    String categoria = scanner.hasNextLine() ? scanner.nextLine().trim() : null;
                    
                    String difficolta = scanner.hasNextLine() ? scanner.nextLine().trim() : null;
                    // Leggi il tipo di domanda
                    String tipo = scanner.hasNextLine() ? scanner.nextLine().trim() : null;
                    
                    // Leggi la risposta corretta
                    String rispostaCorretta = scanner.hasNextLine() ? scanner.nextLine().trim() : null;


                    List<String> risposte = new ArrayList<>();
                    if ("Multipla".equalsIgnoreCase(tipo)) {
                        // Leggi le risposte multiple
                        String opzioni = scanner.hasNextLine() ? scanner.nextLine().trim() : null;
                        if (opzioni != null) {
                            String[] opzioniArray = opzioni.split(",");
                            for (String opzione : opzioniArray) {
                                risposte.add(opzione.trim());
                            }
                        }
                    }

                    // Controlla che i campi essenziali siano presenti
                    if (testo != null && tipo != null && difficolta != null && rispostaCorretta != null && categoria != null) {
                        Domanda domanda = new Domanda(testo, null, null, null, categoria, difficolta, tipo, rispostaCorretta, risposte);
                        domande.add(domanda);
                    }

                    // Salta eventuali linee vuote tra le domande
                    if (scanner.hasNextLine()) {
                        scanner.nextLine();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File non trovato: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Errore durante il caricamento delle domande: " + e.getMessage());
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

}
