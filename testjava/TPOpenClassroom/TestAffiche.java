public class TestAffiche {
    public static void affichage(String texte) {
        String resultat = texte + " Bonjour";
        System.out.println(resultat);
    }

    public static void main(String[] args) {
        affichage("Hello");
    }
}