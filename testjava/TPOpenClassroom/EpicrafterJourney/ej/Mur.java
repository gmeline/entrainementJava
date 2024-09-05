package ej;

public class Mur extends Bloc { // par extension, Mur va devoir respecter l’interface
    
    private boolean porteur;
    
    public Mur(final int longueur, final int largeur, final int hauteur, final boolean porteur) {
        super(longueur, largeur, hauteur);
        this.porteur = porteur;
    }
    
    public boolean isTraversable() {
        return !porteur;
    }
    
    @Override
    public void afficherDescription() {
        System.out.println("Je suis un mur !");
    }
    
}