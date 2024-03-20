import com.exemple.classe.*;

import com.exemple.classe.Partie;

public class RPG {
    public static void main(String[] args) {
        Assassin mechant = new Assassin("Tsaritsa", 100, 18, 10, 2);
        Guerrier gentil = new Guerrier("Sofia", 100, 18, 9, 5);

        Partie guerre = new Partie(mechant,gentil,10);
        System.out.println(guerre.lancerPartie());
    }
}
