import java.util.Scanner;

public class URI_ex_1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0){
            System.out.println("The values are multiple");
        } else {
            System.out.println("Values are not multiple");
        }
    }
}
