package com.exemple.classe;

public class Utilisateur {
    //attributs
    private String nom;
    private String prenom;
    private String email;
    private String password;

    //Contructeurs
    public Utilisateur(){

    }
    public Utilisateur(String nom, String prenom, String email, String password){
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;

    }

    public Utilisateur(String email, String password) {
        this.email = email;
        this.password = password;
    }

    //getters et setters
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Methodes
    public String toString(){
        return this.nom + " " + this.prenom;
    }

}
