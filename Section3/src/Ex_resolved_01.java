import java.util.Locale;
import java.util.Scanner;

public class Ex_resolved_01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double n1, n2, nFinal;

        n1 = sc.nextDouble();
        n2 = sc.nextDouble();

        nFinal = n1 + n2;

        if (nFinal >= 60.0){
            System.out.printf("Media = %.1f%n", nFinal);
        } else {
            System.out.printf("MEDIA = %.1f%n", nFinal);
            System.out.println("REPROVADO!!");
        }
    }
}