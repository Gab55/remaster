package com.company;

public class Villageois {

    private String nom;
    private  int numVillageois;

    public Villageois(String nom, int numVillageois) {
        this.nom = nom;
        this.numVillageois = numVillageois;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumVillageois() {
        return numVillageois;
    }

    public void setNumVillageois(int numVillageois) {
        this.numVillageois = numVillageois;
    }
}
