package com.exemple.classe;

public class Vehicule {
    private String nom;
    private int nbrRoues;
    private int vitesse;

    //Constructeurs
    public Vehicule(){};
    public Vehicule(String nom, int nbrRoues, int vitesse){
        this.nom = nom;
        this.nbrRoues = nbrRoues;
        this.vitesse = vitesse;
    }

    //Getters et setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrRoues() {
        return nbrRoues;
    }

    public void setNbrRoues(int nbrRoues) {
        this.nbrRoues = nbrRoues;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    //Methodes
    public void boost(){
        setVitesse(this.getVitesse()+50);
    }

    public String detect(){
        if(nbrRoues == 4){
            return "voiture";
        }else if (nbrRoues == 2){
            return "moto";
        }else {
            return "Autre vehicule";
        }
    }

    public String plusRapide(Vehicule vehicule){
        if(this.vitesse > vehicule.vitesse){
            return this.nom;
        }else {
            return vehicule.nom;
        }
    }
}
