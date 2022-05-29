import java.util.Locale;
import java.util.Scanner;

public class URI_ex_1038 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code, amount;
        double total = 0;

        code = sc.nextInt();
        amount = sc.nextInt();

        if (code == 1){
            total = amount * 4.00;
        } else if (code == 2) {
            total = amount * 4.50;
        } else if (code == 3){
            total = amount * 5.00;
        } else if (code == 4){
            total = amount * 2.00;
        } else if (code == 5){
            total = amount * 1.50;
        } else {
            System.out.println("Invalid option");
        }
        
        System.out.printf("Total: U$ %.2f", total);
    }
}
