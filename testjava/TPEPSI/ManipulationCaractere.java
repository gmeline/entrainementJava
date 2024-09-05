public class ManipulationCaractere {
    public static void main(String[] args) {
        if (args.length !=1){
            System.out.println("Usage : java ManipulationCaractere <caractere>");
            System.exit(1);
        }
        char caractere = args[0].charAt(0);

    System.out.println("Caractère : " + caractere);

    char caractereMajuscule = Character.toUpperCase(caractere);
    System.out.println("Caractère majuscule : " + caractereMajuscule);

    char caractereSuivant = (char) (caractere + 1);
    System.out.println("Caractère suivant : " + caractereSuivant);
    }
}
