public class TestConditionIf {
    public static void chiffreEgalAZero(final int valeur) {
        if(valeur == 0) {
            System.out.println("L’entier passé en paramètre vaut 0");
        } else {
            System.out.println("L’entier passé en paramètre est différent de 0");
        }
    }
    public static void meteo(final boolean beauTemps) {
        if(beauTemps) {
            System.out.println("Je vais à la plage");
        } else {
            System.out.println("Je vais au cinéma");
        }
    }
    public static void nombre(final int valeur) {
        if(valeur > 0 && valeur < 10){
            System.out.println("LA valeur est entre 0 et 10");
        } else {
            System.out.println("La valeur n'est pas entre 0 et 10");
        }
    }
    public static void valeur(final int nombre) {
        if(nombre == 10 || nombre == 20)
            System.out.println("Le nombre vaut 10 ou 20");
        else
            System.out.println("Le nombre ne vaut pas 10 ou 20");
    }
    public static void meteo(final boolean beauTemps, final boolean nuageux) {
    if(beauTemps && !nuageux) {
        System.out.println("Je vais à la plage");
    } else if(!beauTemps && nuageux) {
        System.out.println("Je vais me promener");
    } else {
        System.out.println("Je vais au cinéma");
    } 
}

    public static void main(String[] args) {
        chiffreEgalAZero(3);
        chiffreEgalAZero(0);
        boolean beauTemps = true;
        boolean mauvaisTemps = false;
        boolean nuageux = false;
        meteo(beauTemps, nuageux);
        meteo(mauvaisTemps, true);
        meteo(mauvaisTemps, nuageux); 
        nombre(11);
        nombre(5);
        valeur(10);
        valeur(15);
        

    }
}
