package ej;

public class ListeString {
    private String[] liste;
    
    public ListeString(int quantite) {
        this.liste = new String[quantite];
    }
    
    public void add(int indice, int valeur) {
        // this.liste[indice] = valeur;
    }
    
    public String get(int indice) {
        return this.liste[indice];
    }
    
}