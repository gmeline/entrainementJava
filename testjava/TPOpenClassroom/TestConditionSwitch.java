public class TestConditionSwitch {
    public static void commenteLaMeteo(final String meteo) {
        switch (meteo) {
            case "soleil":
                System.out.println("Beau temps");
                break;
            case "nuage":
                System.out.println("Couvert");
                break;
            case "pluie":
                System.out.println("Mauvais temps");
                break;
            default :
                System.out.println("Je ne sais pas.");
                break;
        }
    }
    public static String categorieDeFilm(final String film) {
        var resultat = switch (film) {
            case "Star Wars" -> "Science fiction";
            case "Blanche neige", "La petite sirène" -> "Disney";
            case "Indiana Jones" -> {
                String categorie = "Aventure";
                yield categorie;
            }
            default -> "Inconnu";
        };
        return resultat;
    }

    public static void main(String[] args) {
        commenteLaMeteo("soleil");
        commenteLaMeteo("nuage");
        commenteLaMeteo("pluie");
        commenteLaMeteo("inconnu");
        System.out.println(categorieDeFilm("Star Wars"));
        System.out.println(categorieDeFilm("Blanche neige"));
        System.out.println(categorieDeFilm("Indiana Jones"));
        System.out.println(categorieDeFilm("La petite sirène"));
    }
}