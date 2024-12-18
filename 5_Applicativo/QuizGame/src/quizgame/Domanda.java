package quizgame;

import java.util.List;
import quizgame.QuizGame;

public class Domanda extends QuizGame { 
    private String testo;
    private String immagine;
    private String filmato;
    private String audio;
    private String categoria;
    private String difficolta;
    private String tipoRisposta;
    private String rispostaCorretta;
    private List<String> risposte; 

    public Domanda(String testo, String immagine, String filmato, String audio, String categoria, String difficolta, String tipoRisposta, String rispostaCorretta, List<String> risposte) {
        this.testo = testo;
        this.immagine = immagine;
        this.filmato = filmato;
        this.audio = audio;
        this.categoria = categoria;
        this.difficolta = difficolta;
        this.tipoRisposta = tipoRisposta;
        this.rispostaCorretta = rispostaCorretta;
        this.risposte = risposte;
    }


    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public String getImmagine() {
        return immagine;
    }

    public void setImmagine(String immagine) {
        this.immagine = immagine;
    }

    public String getFilmato() {
        return filmato;
    }

    public void setFilmato(String filmato) {
        this.filmato = filmato;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDifficolta() {
        return difficolta;
    }

    public void setDifficolta(String difficolta) {
        this.difficolta = difficolta;
    }

    public String getTipoRisposta() {
        return tipoRisposta;
    }

    public void setTipoRisposta(String tipoRisposta) {
        this.tipoRisposta = tipoRisposta;
    }

    public String getRispostaCorretta() {
        return rispostaCorretta;
    }

    public void setRispostaCorretta(String rispostaCorretta) {
        this.rispostaCorretta = rispostaCorretta;
    }
    
    public List<String> getRisposte() {
        return risposte;
    }

    public void setRisposte(List<String> risposte) {
        this.risposte = risposte;
    }
    //verifica la risposta del giocatore
    public boolean verificaRisposta(String risposta) {
        return this.rispostaCorretta.equals(risposta);
    }
}
