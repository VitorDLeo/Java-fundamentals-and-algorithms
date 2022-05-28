import java.util.Scanner;

public class input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("You entered the value " + x);
        System.out.println("You entered the value " + y);
        System.out.println("You entered the value " + z);

        sc.close();

    }

}
