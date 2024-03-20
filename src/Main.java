import com.exemple.classe.Utilisateur;

import java.util.ArrayList;
import java.util.Scanner;
import com.exemple.classe.Utilisateur;

public class Main {
    public static void main(String[] args) {
        Utilisateur laura = new Utilisateur("Salmon", "Laura", "salmon.laura@lapsote.net", "1234");
    }
    //Methode
    public static int addition(int nbr1, int nbr2){
        return nbr1+nbr2;
    }
    public static int soustraction(int i, int j, int k){
        return i-j-k;
    }
    public static int moyenne(int i, int j, int k, int l) {
        return (i+j+k+l)/4;
    }
    public static String intervertir(int i, int j) {
        return "i="+ j+" et j="+i;
    }
    /*Correction de Mathieu
    public static String intevertir(int i, int j) {
        int tmp = i;
        i = j ;
        j = tmp;
        return "La nouvelle valeur de i est : " + i + " et la nouvelle valeur de j est :  " + j;
    }*/
    public static void lecture(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre ");
        //Récupéré le nombre saisi
        int nbr = scanner.nextInt();
        System.out.println("Vous avez saisi le nombre : "+nbr);
    }
    public static void carre(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre ");
        //Récupéré le nombre saisi
        int nbr = scanner.nextInt();
        int carre = nbr*nbr;
        System.out.println("Le carré du nombre saisi est : "+carre);
    }
/*  2eme Version
    public static void carre(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre ");
        //Récupéré le nombre saisi
        int nbr = scanner.nextInt();
        int carre = nbr*nbr;
        return carre;
    }*/
    public static void somme(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un 1er nombre ");
        //Récupéré le nombre saisi
        int nbr1 = scanner.nextInt();
        System.out.println("Veuillez saisir un 2éme nombre ");
        //Récupéré le nombre saisi
        int nbr2 = scanner.nextInt();
        int somme = nbr1+nbr2;

        System.out.println("Le somme est : "+somme);
    }
    public static float moyenneV2() {
        //importer un objet scanner
        Scanner scanner = new Scanner(System.in);
        //afficher un message dans la console
        System.out.println("Veuillez saisir un nombre");
        //récuperer le premier nombre saisi
        int nbr1 = scanner.nextInt();
        System.out.println("Veuillez saisir un nombre");
        //récuperer le premier nombre saisi
        int nbr2 = scanner.nextInt();
        System.out.println("Veuillez saisir un nombre");
        //récuperer le premier nombre saisi
        int nbr3 = scanner.nextInt();
        return (nbr1+nbr2+nbr3)/3;
    }
    public static float achat() {
        //importer un objet scanner
        Scanner scanner = new Scanner(System.in);
        //afficher un message dans la console
        System.out.println("Veuillez saisir le prix de l'article");
        //récuperer le premier nombre saisi
        float prixHT = scanner.nextFloat();
        System.out.println("Veuillez saisir un nombre d'article");
        //récuperer le second nombre saisi
        int nbr = scanner.nextInt();
        System.out.println("Veuillez saisir le taux de TVA");
        //récuperer le troiseme nombre saisi
        float tva = scanner.nextFloat();
        return (float) Math.round((prixHT*nbr*tva)*100)/100;
        //Pas sure du *100)/100 ...
    }
    public static String produit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un 1er nombre ");
        //Récupéré le nombre saisi
        int nbr1 = scanner.nextInt();
        System.out.println("Veuillez saisir un 2éme nombre ");
        //Récupéré le nombre saisi
        int nbr2 = scanner.nextInt();

        if (nbr1<0 && nbr2>0 || nbr1>0 && nbr2<0){
            return "Le produit des 2 nombres est négatif";
        } else{
            return "Le produit des 2 nombres est positif";
        }
    }
    public static String produitV2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un 1er nombre ");
        //Récupéré le nombre saisi
        int nbr1 = scanner.nextInt();
        System.out.println("Veuillez saisir un 2éme nombre ");
        //Récupéré le nombre saisi
        int nbr2 = scanner.nextInt();

        if(nbr1==0 || nbr2==0){
            return "Le produit vaux 0 !";
        }else if (nbr1<0 && nbr2>0 || nbr1>0 && nbr2<0){
            return "Le produit des 2 nombres est négatif";
        } else{
            return "Le produit des 2 nombres est positif";
        }
    }
    public static String age(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir l'age :");
        //Récupéré le nombre saisi
        int age = scanner.nextInt();

        if(age>=12){
            return "La catégorie est cadet";
        }else if (age>=10 && age<=11){
            return "La catégorie est Minime";
        }else if (age>=8 && age<=9){
            return "La catégorie est Pupille";
        }else if (age>=6 && age<=8){
            return "La catégorie est Poussin";
        }else {
            return "L'enfant est trop jeune'";
        }
    }
    //VARIANTE SWITCH CASE
/*    public static String ageSwitch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("veuillez saisir l'age de l'enfant");
        int age = scanner.nextInt();
        String resultat = "";
        switch (age) {
            case 12:
                resultat= "Cadet";
                break;
            case 10 :
            case 11 :
                resultat = "Minime";
                break;
            case 9 :
            case 8 :
                resultat ="Pupille";
                break;
            case 7:
            case 6:
                resultat ="Poussin";
            default:
                if(age > 12) {
                    resultat = "Cadet";
                }
                if(age<6) {
                    resultat = "Trop jeune";
                }
        }
        return resultat;
    }*/
    public static String heure(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir une heure ");
        //Récupéré le nombre saisi
        int heure = scanner.nextInt();
        System.out.println("Veuillez saisir les minutes ");
        //Récupéré le nombre saisi
        int minute = scanner.nextInt();

        if(heure == 23 && minute==59){
            heure = 00;
            minute = 00;
            return "Dans une minute,il sera : "+ heure+":"+minute;
        } else if ( minute==59){
            heure = heure+1;
            minute = 00;
            return "Dans une minute, il sera : "+heure+":"+minute;
        }else {
            return "Dans une minute,il sera : "+ heure+":"+(minute+1);
        }

    }
    public static String heureV2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir une heure ");
        //Récupéré le nombre saisi
        int heure = scanner.nextInt();
        System.out.println("Veuillez saisir les minutes ");
        //Récupéré le nombre saisi
        int min = scanner.nextInt();        System.out.println("Veuillez saisir les secondes ");
        //Récupéré le nombre saisi
        int sec = scanner.nextInt();

        if(heure == 23 && min==59 && sec==59){
            heure = 00;
            min = 00;
            sec = 00;
            return "Dans une seconde,il sera : "+ heure+" heure(s), "+min+" minute(s), "+(sec)+" seconde(s)";
        } else if ( min==59 && sec==59){
            heure = heure+1;
            min = 00;
            sec = 00;
            return "Dans une seconde,il sera : "+ heure+" heure(s), "+min+" minute(s), "+sec+" seconde(s)";
        }else if (sec==59){
            min = min+1;
            sec = 00;
            return "Dans une seconde,il sera : "+ heure+" heure(s), "+min+" minute(s), "+sec+" seconde(s)";
        }else {
            return "Dans une seconde,il sera : " + heure + " heure(s), " + min + " minute(s), " + (sec+1) + " seconde(s)";
        }
    }
    public static String copie(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre de copie :");
        //Récupéré le nombre saisi
        int nbr = scanner.nextInt();

        float total = 0;

        if(nbr<=10){
            total = (float) (nbr*0.1);
        }else if (nbr>10 && nbr<=20){
            total = (float) (1+((nbr-10)*0.09));
        }else {
            total = (float) (1.9+((nbr-20)*0.08));
        }
        return "FACTURE : Total = "+total+"€ (TTC)";
    }

    public static String choix(){
        Scanner scanner = new Scanner(System.in);

        int min = 1;
        int max = 3;
        int range = max - min +1;
        int random = (int) (Math.random()*range)+min;

        System.out.println("Veuillez saisir un nombre entre 1 et 3 :");
        //Récupéré le nombre saisi
        int nbr = scanner.nextInt();

        while(nbr != random){

            System.out.println("Veuillez saisir un nombre entre 1 et 3 :");
            //Récupéré le nombre saisi
            nbr = scanner.nextInt();
        }
        return "Bravo ! ";

    }
    public static String aleatoire(){
        Scanner scanner = new Scanner(System.in);

        int min = 10;
        int max = 20;
        int range = max - min +1;
        int random = (int) (Math.random()*range)+min;

        System.out.println("Veuillez saisir un nombre entre 10 et 20 :");
        //Récupéré le nombre saisi
        int nbr = scanner.nextInt();

        while(nbr != random){
            if (nbr<10){
                System.out.println("Trop petit !");
                System.out.println("Veuillez saisir un nombre entre 10 et 20 :");
                //Récupéré le nombre saisi
                nbr = scanner.nextInt();
            } else if (nbr>20){
                System.out.println("Trop grand !");
                System.out.println("Veuillez saisir un nombre entre 10 et 20 :");
                //Récupéré le nombre saisi
                nbr = scanner.nextInt();
            }
                System.out.println("Veuillez saisir un nombre entre 10 et 20 :");
                //Récupéré le nombre saisi
                nbr = scanner.nextInt();

        }
        return "Bravo ! ";
    }

    public static void dix(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre :");
        //Récupéré le nombre saisi
        int nbr = scanner.nextInt();

        for (int i=nbr+1; i<(nbr+11); i++){
            System.out.println(i);
        }
    }
    public static void multiplication(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre :");
        //Récupéré le nombre saisi
        int nbr = scanner.nextInt();

        System.out.println("Table de "+nbr+" :");
        for (int i=1; i<11; i++){
            System.out.println(nbr+" x "+i+" = "+(nbr*i));
        }
    }
    //Exo18:
    public static void calcul() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        int nbr = scanner.nextInt();
        int total = 0;
        for (int i = 1; i < nbr + 1 ; i++) {
            total += i;
        }
        System.out.println("La somme est égal à " + total);
    }

    //Exo19
    public static int search(){
        int [] tab = {10,33,56,89,7,11,2,16};
        int min=tab[0];

        for (int i=0; i<tab.length; i++){
            if(tab[i]<min){
                min = tab[i];
            }
        }
        return min;
    }
    public static int searchMax(){
        int [] tab = {10,33,56,89,7,11,2,16};
        int max=tab[0];

        for (int i=0; i<tab.length; i++){
            if(tab[i]>max){
                max= tab[i];
            }
        }
        return max;
    }
    public static int moyenne(){
        int [] tab = {10,33,56,89,7,11,2,16};
        int max=0;

        for(int value:tab){
            max = max+value;
        }
        return max/tab.length;
    }
    public static void moyenneNote() {
        Scanner scanner = new Scanner(System.in);
        //instance d'une arrayList de notes
        ArrayList<Integer> notes = new ArrayList<>();
        System.out.println("Veuillez saisir une note ou -1 pour arréter");
        int note = scanner.nextInt();
        while (note > 0) {
            notes.add(note);
            System.out.println("Veuillez saisir une note ou -1 pour arréter");
            note = scanner.nextInt();
        }
        //variable qui va contenir la somme de toutes les notes
        int somme = 0;

        for (int i = 0; i < notes.size(); i++) {
            somme += notes.get(i);
        }
        System.out.println("la moyenne est égale : " + somme/notes.size());
    }
}
