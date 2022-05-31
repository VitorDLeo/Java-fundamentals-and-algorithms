import java.util.Scanner;

public class URI_ex_1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int password;

        password = sc.nextInt();

        while (password != 2002){
            System.out.println("Invalid acces");
            password = sc.nextInt();
        }
        System.out.println("Valid acces");
    }
}
