import java.util.Arrays;
import java.util.List;

public class TestConditionFor {
    public static void compteJusquaDix() {
        for(int i=1; i<=10; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        compteJusquaDix();
        List<String> nomsDesLangages = Arrays.asList("Java", "PHP", "JavaScript");
            for (String nomDUnLangage : nomsDesLangages) {
                System.out.println(nomDUnLangage);
            }
    }
}