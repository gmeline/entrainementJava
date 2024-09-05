package ej;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
    //     IBloc mur = new Mur(100,100,100,true);
    //     Rempart rempartNord = new Rempart(mur);
        // Couleur choixCouleur = Couleur.VERT;
        // switch(choixCouleur) {
        //     case BLEU:
        //         System.out.println("Pour des blocs représentant l’eau");
        //         break;
        //     case VERT:
        //         System.out.println("Pour des blocs représentant l’herbe, les feuilles, etc.");
        //         break;
        //     case GRIS:
        //         System.out.println("Pour des blocs représentant le sol ou un mur");
        //         break;
        //     case MARRON:
        //         System.out.println("Pour des blocs représentant la terre ou un toit");
        //         break;
        //     case NOIR:
        //         System.out.println("Pour des blocs représentant une roche");
        //         break;
        // }
        List<Integer> quantiteBlocsUtilises= new ArrayList<Integer>();
        quantiteBlocsUtilises.add(1);
        quantiteBlocsUtilises.add(3);
        quantiteBlocsUtilises.add(1); // doublon autorisé

        for(Integer quantite : quantiteBlocsUtilises) {
            System.out.println(quantite);
        }

        quantiteBlocsUtilises.remove(Integer.valueOf(3));
    }
    
}