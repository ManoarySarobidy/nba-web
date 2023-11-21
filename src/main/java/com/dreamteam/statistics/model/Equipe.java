package com.dreamteam.statistics.model;

import java.sql.Date;

import jakarta.persistence.*;


@Entity
@Table
public class Equipe {
    @Id
    @Column(name = "Id_equipe")
    String IdEquipe;
    String Nom;
    String Reference;

    //SETTERS
    public void setIdEquipe(String id){
        this.IdEquipe = id;
    }

    public void setNom(String nom){
        this.Nom = nom;
    }

    public void setReference(String ref){
        this.Reference = ref;
    }

    //GETTERS
    public String getIdEquipe(){
        return this.IdEquipe;
    }

    public String getNom(){
        return this.Nom;
    }

    public String getReference(){
        return this.Reference;
    }

    public Equipe(){

    }

    public Equipe(String IdEquipe, String Nom, String reference){
        this.setIdEquipe(IdEquipe);
        this.setNom(Nom);
        this.setReference(reference);
    }
    
}
