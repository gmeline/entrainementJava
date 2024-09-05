// Exercice : Calculer des montants TTC
// Consigne :
// Créer un programme permettant de saisir :
// - un montant hors taxe
// - la taxe à appliquer
// Puis de calculer le montant TTC et afficher le résultat
// | Saisissez le montant HT :100
// | Saisissez la valeur de la taxe à appliquer en pourcentage : 10
// | Montant TTC : 110,00

import java.util.Scanner;

public class CalculTTC {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Saisissez le montant HT : ");
    double montantHT = scanner.nextDouble();

    System.out.print("Saisissez la valeur de la taxe à appliquer en pourcentage : ");
    double taxe = scanner.nextDouble();

    double montantTTC = montantHT + (montantHT * (taxe / 100));

    System.out.printf("Montant TTC : %.2f €\n", montantTTC);
  }
}