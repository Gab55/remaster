package com.company;

public class LoupGarous {

    private String nom;

    public LoupGarous(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public String toString(){
        return " "+ this.getNom()+"";

    }
    public void setNom(String nom) {
        this.nom = nom;
    }

}
