import java.util.Locale;
import java.util.Scanner;

public class URI_ex_1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double R, pi, volume;

        pi = 3.14159;

        R = sc.nextDouble();

        volume = (double) (4.0/3.0) * pi * Math.pow(R, 3.0);

        System.out.printf("VOLUME = %.3f", volume);
    }
}
