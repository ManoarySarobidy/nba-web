package com.dreamteam.statistics.model;

import java.sql.Date;

import jakarta.persistence.*;


@Entity
@Table
public class Effectif {
    @Id
    @Column(name = "Id_effectif")
    String idEffectif;
    int status;
    String idContrat;
    String idPlayoff;

    //SETTERS
    public void setIdEffectif(String id){
        this.idEffectif = id;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public void setIdContrat(String idcontrat){
        this.idContrat = idcontrat;
    }

    public void setIdPlayoff(String idplayoff){
        this.idPlayoff = idplayoff;
    }

    //GETTERS
    public String getIdEffectif(){
        return this.idEffectif;
    }

    public int getStatus(){
        return this.status;
    }

    public String getIdContrat(){
        return this.idContrat;
    }

    public String getIdPlayoff(){
        return this.idPlayoff;
    }

    public Effectif(){

    }

    public Effectif(String ideffectif, int status, String idcontrat, String idplayoff){
        this.setIdEffectif(ideffectif);
        this.setStatus(status);
        this.setIdContrat(idcontrat);
        this.setIdPlayoff(idplayoff);
    }
}