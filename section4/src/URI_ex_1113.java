import java.util.Scanner;

public class URI_ex_1113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;

        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0  && y != 0){
            if (x > y){
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescent");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }
    }
}