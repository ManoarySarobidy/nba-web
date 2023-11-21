package com.dreamteam.statistics.model;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name="contrat")

public class Contrat {
    
    @Id
    @Column(name = "Id_contrat")
    String idContrat;

    @Column(name = "Date_contrat")
    Date dateContrat;

    @Column(name = "Id_joueur")
    String idJoueur;

    @Column(name = "Id_saison")
    String idSaison;

    @Column(name = "Id_equipe")
    String idEquipe;

    //SETTERS
    public void setIdContrat(String id){
        this.idContrat = id;
    }

    public void setDateContrat(Date date){
        this.dateContrat = date;
    }

    public void setIdJoueur(String idj){
        this.idJoueur = idj;
    }

    public void setIdSaison(String ids){
        this.idSaison = ids;
    }

    public void setIdEquipe(String ide){
        this.idEquipe = ide;
    }

    //GETTERS
    public String getIdContrat(){
        return this.idContrat;
    }

    public Date getDateContrat(){
        return this.dateContrat;
    }

    public String getIdJoueur(){
        return this.idJoueur;
    }

    public String getIdSaison(){
        return this.idSaison;
    }

    public String getIdEquipe(){
        return this.idEquipe;
    }

    // public Contrat(){

    // }

    // public Contrat(String idcontrat, Date datecontrat, String idjoueur, String idsaison, String idequipe){
    //     this.setIdContrat(idcontrat);
    //     this.setDateContrat(datecontrat);
    //     this.setIdJoueur(idjoueur);
    //     this.setIdSaison(idsaison);
    //     this.setIdEquipe(idequipe);
    // }
    
}
