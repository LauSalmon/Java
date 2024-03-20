package com.exemple.classe;
import com.exemple.classe.Personnage;

public class Assassin extends Personnage {
/*
    Redéfinir la méthode attaquer en ajoutant une chance de coup critique (attaque + bonusAttaque) avec 5 % de chance (5 fois sur 100),*/

    //Attributs
    private int bonusAttaque;

    //Constructeurs
    public Assassin(String nom, int vie, int attaque, int defense, int bonusAttaque){
        super(nom, vie, attaque, defense);
        this.bonusAttaque = bonusAttaque;
    }

    //Getters et setters
    public int getBonusAttaque(){
        return bonusAttaque;
    }
    public void setBonusAttaque(int bonusAttaque){
        this.bonusAttaque = bonusAttaque;
    }

    //Methodes
    public void attaquer(Personnage cible) {
        double random = Math.random();
        if (random < 0.05) {
            cible.setVie(cible.getVie() - ((this.getAttaque() + this.getBonusAttaque()) - cible.getDefense()));
            System.out.println("Bonus d'attaque de l'assassin");
        } else {
            cible.setVie(cible.getVie() - (this.getAttaque() - cible.getDefense()));
        }
    }
}
