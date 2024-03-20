package com.exemple.classe;
import com.exemple.classe.Personnage;
import java.util.Scanner;

public class Partie {
/*    Attributs (joueur1 de type Personnage, Joueur2 de type Personnage, nbrTour de type int)
    Getter et setter de chaque attribut,*/

    //Attributs
    private Personnage joueur1;
    private Personnage joueur2;
    private int nbrTour;

    //Constructeurs
    public Partie(Personnage joueur1, Personnage joueur2, int nbrTour){
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.nbrTour = nbrTour;
    }

    //Getters et Setters

    public Personnage getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(Personnage joueur1) {
        this.joueur1 = joueur1;
    }

    public Personnage getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(Personnage joueur2) {
        this.joueur2 = joueur2;
    }

    public int getNbrTour() {
        return nbrTour;
    }

    public void setNbrTour(int nbrTour) {
        this.nbrTour = nbrTour;
    }

    //Methode
    public String lancerPartie(){

        for(int i=0; i<this.getNbrTour(); i++){
            joueur1.attaquer(joueur2);
            joueur2.attaquer(joueur1);
            if(joueur1.getVie() <= 0){
                return joueur2.getNom()+" a gagné !";
            }else if(joueur2.getVie()<= 0){
                return joueur1.getNom()+" a gagné !";
            }
        }
        return "Egalité !";
    }
}
