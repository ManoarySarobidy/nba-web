package com.dreamteam.statistics.model;

import java.sql.Date;

import jakarta.persistence.*;


@Entity
@Table
public class Statistique {
    @Id
    @Column(name = "Id_action")
    String IdAction;

    @Column(name = "Id_effectif")
    String IdEffectif;

    double Point;

    //SETTERS
    public void setIdAction(String id){
        this.IdAction = id;
    }

    public void setIdEffectif(String ideffectif){
        this.IdEffectif = ideffectif;
    }
    public void setPoint(double point){
        this.Point = point;
    }

    //GETTERS
    public String getIdAction(){
        return this.IdAction;
    }

    public String getIdEffectif(){
        return this.IdEffectif;
    }

    public double getPoint(){
        return this.Point;
    }

    public Statistique(){

    }

    public Statistique(String Idactions, String ideffectif, double point){
        this.setIdAction(Idactions);
        this.setIdEffectif(ideffectif);
        this.setPoint(point);
    }
}

