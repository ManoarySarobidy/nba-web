package com.dreamteam.statistics.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
@Table
public class Action {
    
    @Id
    @Column(name = "Id_action")
    String IdAction;
    String Reference;
    String Nom;

    //SETTERS
    public void setIdAction(String id){
        this.IdAction = id;
    }

    public void setReference(String ref){
        this.Reference = ref;
    }

    public void setNom(String nom){
        this.Nom = nom;
    }

    //GETTERS
    public String getIdAction(){
        return this.IdAction;
    }

    public String getReference(){
        return this.Reference;
    }

    public String getNom(){
        return this.Nom;
    }

    public Action(){

    }

    public Action(String Idaction, String reference, String Nom){
        this.setIdAction(Idaction);
        this.setReference(reference);
        this.setNom(Nom);
    }
    
}
