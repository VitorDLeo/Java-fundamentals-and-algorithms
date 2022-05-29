import java.util.Locale;
import java.util.Scanner;

public class URI_ex_1002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double area, raio;
        double pi = 3.14159;

        raio = sc.nextDouble();

        area = pi * Math.pow(raio, 2.0);

        System.out.printf("A = %.4f", area);
    }
}
