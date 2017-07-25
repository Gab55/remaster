package com.company;

public class Joueur {

    private String nom;
    private int carte;

    public Joueur(String nom, int carte) {
        this.nom = nom;
        this.carte=carte;
    }


    public String toString(){
        return " "+ this.getNom()+" ";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCarte() {
        return carte;
    }

    public void setCarte(int carte) {
        this.carte = carte;
    }

}
