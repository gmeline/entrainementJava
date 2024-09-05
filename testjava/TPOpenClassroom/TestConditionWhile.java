public class TestConditionWhile {
    public static void affiche() {
        int chiffre = 0;
        while(chiffre < 5) {
            System.out.println(chiffre);
            chiffre++;
        }
    }
    public static void chiffre() {
    int affiche = 0;
    do {
        System.out.println(affiche);
        affiche++;
    } while(affiche == 1);
}
    public static void main(String[] args) {
        affiche();
        chiffre();
    }
}