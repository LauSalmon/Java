package com.exemple.classe;

public class Batman extends Personnage implements Competence{
    public Batman (String nom, int vie, int attaque, int defense){
        super(nom, vie, attaque, defense);
    }

    public void attaquer(Personnage cible){
        cible.setVie(cible.getVie()-(this.getAttaque()-cible.getDefense()));
    }
}
