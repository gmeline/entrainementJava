public class TestCondition {
    public static void main (String[]args){
        int[] tableau = {0, 0, 50, 22, 1080, 27001, 0};
        int cpt = 0;
        for(int i=0; i<7; i++){
            if(tableau[i] ==0){
                cpt++;
            }
        }
        System.out.println(cpt);
    }
}
//cpt = compteur de 0 dans le tableau donc ici 1
