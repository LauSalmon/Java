import com.exemple.classe.Utilisateur;
import com.exemple.classe.Habitation;
import com.exemple.classe.Vehicule;

public class Demarrage {
    public static void main(String[] args) {
/*        Habitation maison = new Habitation("Maison de campagne", 15, 10, 3);
        Habitation appt = new Habitation("Appartement à Mondonville", 6,10, 1);
        Habitation ferme = new Habitation("Coeur de ferme", 50, 30, 2);

        System.out.println("l'Habitation : "+maison.getNom()+" à une surface de "+maison.surface()+"m²");
        System.out.println("l'Habitation : "+appt.getNom()+" à une surface de "+appt.surface()+"m²");
        System.out.println("l'Habitation : "+ferme.getNom()+" à une surface de "+ferme.surface()+"m²");*/

        Vehicule voiture = new Vehicule("Yaris", 4, 80);
        Vehicule moto = new Vehicule("Vespa", 2, 50);
        Vehicule gyro = new Vehicule("Gyropode", 1, 30);

        System.out.println("Le véhicule : "+voiture.getNom()+" est de type "+voiture.detect()+".");
        System.out.println("Le véhicule : "+moto.getNom()+" est de type "+moto.detect()+".");
        System.out.println("Le véhicule : "+gyro.getNom()+" est de type "+gyro.detect()+".");

        voiture.boost();
        moto.boost();
        gyro.boost();
        System.out.println("Le véhicule : "+voiture.getNom()+" possède une vitesse de : "+voiture.getVitesse()+" km/h.");
        System.out.println("Le véhicule : "+moto.getNom()+" possède une vitesse de : "+moto.getVitesse()+" km/h.");
        System.out.println("Le véhicule : "+gyro.getNom()+" possède une vitesse de : "+gyro.getVitesse()+" km/h.");


        System.out.println("Le véhicule le plus rapide entre "+gyro.getNom()+" et "+moto.getNom()+" est : "+gyro.plusRapide(moto)+" !");


    }

}
