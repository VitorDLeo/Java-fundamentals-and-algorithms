import java.util.Locale;
import java.util.Scanner;

public class URI_ex_1037 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double v;

        v = sc.nextDouble();

        if (v >= 0 && v <= 25.00){
            System.out.println("Break [0;25]");
        } else if (v >= 25.01 && v <= 50.00){
            System.out.println("Break [25;50]");
        } else if (v >= 50.01 && v <= 70.00){
            System.out.println("Break [50;75]");
        } else if (v >= 70.01 && v <= 100){
            System.out.println("Break [75;100]");
        }
    }
}
