import java.util.Scanner;

public class URI_ex_1115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;

        x = sc.nextInt();
        y = sc.nextInt();

        while(x != 0 || y != 0){
            if (x > 0 && y > 0){
                System.out.println("First Quadrant");
            } else if (x < 0 && y > 0){
                System.out.println("Second quadrant");
            } else if (x < 0 && y < 0){
                System.out.println("Third quadrant");
            } else if (x > 0 && y < 0 ){
                System.out.println("Fourth quadrant");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
    }
}
