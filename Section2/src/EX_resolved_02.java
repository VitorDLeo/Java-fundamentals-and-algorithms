import java.util.Locale;
import java.util.Scanner;

public class EX_resolved_02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double b, h, Diagonal, Area, Perimetro;

        b = sc.nextDouble();
        h = sc.nextDouble();

        Area = b * h;
        Perimetro = 2 * (b + h);
        Diagonal = Math.sqrt(Math.pow(b, 2.0) + Math.pow(h, 2.0));

        System.out.printf("AREA = %.4f%n", Area);
        System.out.printf("PERIMETRO  = %.4f%n", Perimetro);
        System.out.printf("DIAGONAL = %.4f", Diagonal);
    }   
}
