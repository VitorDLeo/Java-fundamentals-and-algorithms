import java.util.Locale;
import java.util.Scanner;

public class URI_ex_1014 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int km;
        double totalKm, gas;

        km = sc.nextInt();
        gas = sc.nextDouble();

        totalKm = (double) km / gas;

        System.out.printf("%.3f km/l", totalKm);
    }
}
