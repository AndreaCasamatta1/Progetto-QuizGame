/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizgame;

import quizgame.UI.Impostazioni;

/**
 *
 * @author Andrea.casamatta
 */
public class BaseDomanda { 
    private String testo;
    private String immagine;
    private String filmato;
    private String categoria;
    private String difficolta;
    private String tipoRisposta;
    private String rispostaCorretta;
    private String giocatoreScelto;


    public BaseDomanda(String testo, String immagine, String filmato, String categoria, String difficolta, String tipoRisposta, String rispostaCorretta,String giocatoreScelto) {
        this.testo = testo;
        this.immagine = immagine;
        this.filmato = filmato;
        this.categoria = categoria;
        this.difficolta = difficolta;
        this.tipoRisposta = tipoRisposta;
        this.rispostaCorretta = rispostaCorretta;
        this.giocatoreScelto = giocatoreScelto;
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


    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

    public String getGiocatoreScelto() {
        return giocatoreScelto;
    }

    public void setGiocatoreScelto(String giocatoreScelto) {
        this.giocatoreScelto = giocatoreScelto;
    }
    
    
    public void verificaRisposta(int punti){
        
    }
    
}
