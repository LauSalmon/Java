package com.exemple.classe;

public class Guerrier extends Personnage {

    //Attributs
    private int bonusDefense;

    //Constructeur
    public Guerrier(String nom, int vie, int attaque, int defense, int bonusDefense){
        super(nom, vie, attaque, defense);
        this.bonusDefense = bonusDefense;
    }

    //Getters et setters

    public int getBonusDefense() {
        return bonusDefense;
    }

    public void setBonusDefense(int bonusDefense) {
        this.bonusDefense = bonusDefense;
    }

    //Methodes
    public void attaquer(Personnage cible) {
        double random = Math.random();
        if (random < 0.05) {
            this.setVie(this.getVie()+this.getBonusDefense());
            System.out.println("Gain de vie du Guerrier");
        }
        cible.setVie(cible.getVie() - (this.getAttaque() - cible.getDefense()));
    }
}
