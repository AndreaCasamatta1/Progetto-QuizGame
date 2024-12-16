package quizgame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.FileReader;

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

    public void caricaDomande() { //Generato da AI
        try {
            // Percorso del file JSON
            File file = new File(System.getProperty("user.dir") + "/src/quizgame/quiz.json");

            // Lettura del file JSON
            Gson gson = new Gson();
            try (FileReader reader = new FileReader(file)) {
                JsonArray jsonArray = gson.fromJson(reader, JsonArray.class);

                for (JsonElement element : jsonArray) {
                    JsonObject jsonObject = element.getAsJsonObject();

                    // Estrai i campi necessari
                    String testo = jsonObject.has("testo") ? jsonObject.get("testo").getAsString() : null;
                    String categoria = jsonObject.has("categoria") ? jsonObject.get("categoria").getAsString() : null;
                    String difficolta = jsonObject.has("difficolta") ? jsonObject.get("difficolta").getAsString() : null;
                    String tipo = jsonObject.has("tipo") ? jsonObject.get("tipo").getAsString() : null;
                    String rispostaCorretta = jsonObject.has("rispostaCorretta") ? jsonObject.get("rispostaCorretta").getAsString() : null;

                    // Lista delle risposte (per domande multiple)
                    List<String> risposte = new ArrayList<>();
                    if (jsonObject.has("risposte")) {
                        JsonArray risposteArray = jsonObject.getAsJsonArray("risposte");
                        for (JsonElement risposta : risposteArray) {
                            risposte.add(risposta.getAsString());
                        }
                    }

                    // Controlla che i campi essenziali siano presenti
                    if (testo != null && tipo != null && difficolta != null && rispostaCorretta != null && categoria != null) {
                        Domanda domanda = new Domanda(testo, null, null, null, categoria, difficolta, tipo, rispostaCorretta, risposte);
                        domande.add(domanda);
                    }
                }
            }
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
