import java.util.Locale;

public class dataOutput {

    public static void main(String[] args) {

        int y = 32;
        double x = 10.35784;
        String word1 = "Ola";
        String word2 = "mundo";
        String word3 = "java";

        System.out.println(y);
        System.out.println(x);

        // format

        System.out.printf("%.2f%n", x); //  Duas casas decimais
        System.out.printf("%.3f%n", x); // tres casas decimais
        Locale.setDefault(Locale.US); // Utilizado para aplicar o Ponto no lugar da virgula. Padrao americano
        System.out.printf("%.2f%n", x);

        // concatenacao

        System.out.println("O numero inteiro = " + y + " e O numero decimal = " + x);

        System.out.printf("%s estou apredendo %s, e sempre comecamos com %s %s !", word1, word3, word1, word2);
    }
}
