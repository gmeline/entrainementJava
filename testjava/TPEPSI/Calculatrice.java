// Exercice : Création d'une calculatrice
// Consigne : 
// Ecrire un programme demandant de :
// - saisir 2 valeurs assignées aux a et b
// - saisir un opérateur parmi + - * /
// En utilisant un switch, réaliser l'opération et afficher le résultat

import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un nombre 'a' : ");
        int a = scanner.nextInt();
        System.out.println("Entrer un nombre 'b' : ");
        int b = scanner.nextInt();
        System.out.println("Entrer un opérateur (+, -, *, /) : ");
        String operateur = scanner.next();
        choixOperateur(a, b, operateur);
    }

    public static void choixOperateur(int a, int b, String operateur) {
        int c;
        switch (operateur) {
            case "+":
                c = a + b;
                break;
            case "-":
                c = a - b;
                break;
            case "*":
                c = a * b;
                break;
            case "/":
                c = a / b;
                break;
            default:
                System.out.println("Opérateur invalide");
                return;
        }
        System.out.println("Voici le résultat 'c' : ");
        System.out.println(c);
    }
}