import java.util.Locale;
import java.util.Scanner;

public class input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        char s;

        Locale.setDefault(Locale.US);
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        s = sc.next().charAt(0);
        System.out.println("You entered the value " + x);
        System.out.println("You entered the value " + y);
        System.out.println("You entered the value " + z);
        System.out.println("You entered the value " + s);

        sc.close();

    }

}
