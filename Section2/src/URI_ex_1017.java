import java.util.Locale;
import java.util.Scanner;

public class URI_ex_1017 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int time, velocity;
        double gas;

        time = sc.nextInt();
        velocity = sc.nextInt();

        gas = (double) (velocity / 12.00) * time;

        System.out.printf("%.3f", gas);
    }
}
