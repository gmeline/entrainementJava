// Exercice : Calcul d'une franchise
// Consigne :
// Une compagnie d'assurance effectue des remboursement en ponctionnant une franchise de 20%. 
// La franchise ne peut excéder 200€.
// Réaliser un programme demandant à l'utilisateur saisir le montant des dommages et calculer la valeur de la franchise et le montant du remboursement.
import java.util.Scanner;

public class Franchise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Entrez le montant des dommages : ");
        double montantDommages = scanner.nextDouble();
    
        double franchise = Math.min(montantDommages * 0.20, 200);
        double montantRemboursement = montantDommages - franchise;
    
        System.out.println("La valeur de la franchise est de " + franchise + " €");
        System.out.println("Le montant du remboursement est de " + montantRemboursement + " €");
      }
    
}
