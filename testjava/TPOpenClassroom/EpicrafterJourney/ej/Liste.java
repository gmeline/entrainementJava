package ej;

public class Liste<T> {
    
    private T[] liste;
    
    public Liste(Class<T> classe, int quantite) {
        // this.liste = (T[]) Array.newInstance(classe, quantite);
    }
    
    public void add(int indice, int valeur) {
        // this.liste[indice] = valeur;
    }
    
    public T get(int indice) {
        return this.liste[indice];
    }
    
}