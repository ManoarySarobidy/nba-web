package com.dreamteam.statistics.model;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table
public class Playoff {
    @Id
    @Column(name = "Id_playoff")
    String IdPlayoff;

    @Column(name = "Date_playoff")
    Date DatePlayoff;

    @Column(name = "Id_equipe")
    String IdEquipe;

    @Column(name = "Id_equipe_1")
    String IdEquipe1;

    @Column(name = "Id_saison")
    String IdSaison;

    //SETTERS
    public void setIdPlayoff(String id){
        this.IdPlayoff = id;
    }

    public void setDatePlayoff(Date date){
        this.DatePlayoff = date;
    }
    public void setIdSaison(String ids){
        this.IdSaison = ids;
    }

    public void setIdEquipe(String ide){
        this.IdEquipe = ide;
    }

    public void setIdEquipe1(String ide){
        this.IdEquipe1 = ide;
    }

    //GETTERS
    public String getIdPlayoff(){
        return this.IdPlayoff;
    }

    public Date getDatePlayoff(){
        return this.DatePlayoff;
    }

    public String getIdSaison(){
        return this.IdSaison;
    }

    public String getIdEquipe(){
        return this.IdEquipe;
    }

    public String getIdEquipe1(){
        return this.IdEquipe1;
    }

    public Playoff(){

    }

    public Playoff(String Idplayoff, Date dateplayoff, String idequipe, String idequipe1, String idsaison){
        this.setIdPlayoff(Idplayoff);
        this.setDatePlayoff(dateplayoff);
        this.setIdEquipe(idequipe);
        this.setIdEquipe(idequipe1);
        this.setIdSaison(idsaison);
    }
}
