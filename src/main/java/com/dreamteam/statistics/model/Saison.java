package com.dreamteam.statistics.model;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table
public class Saison {
    @Id
    @Column(name = "Id_saison")
    String idSaison;
    String nom;

    //SETTERS
    public void setIdSaison(String id){
        this.idSaison = id;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    //GETTERS
    public String getIdSaison(){
        return this.idSaison;
    }

    public String getNom(){
        return this.nom;
    }

    public Saison(){

    }

    public Saison(String idSaison, String nom){
        this.setIdSaison(idSaison);
        this.setNom(nom);
    }
    
}
