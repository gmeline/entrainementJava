// Exercice : Afficher un carré
// Consigne : 
// Demander à un utilisateur de saisir un nombre. Par exemple, n=3. Et afficher un carré comme ci-dessous :
//
// n=3
// ###
// ###
// ###

import java.util.Scanner;

public class Square{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Entrez une nombre : ");
        int n =scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}