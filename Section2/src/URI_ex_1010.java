import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class URI_ex_1010 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int pc1, pc2, code1, code2;
        double pricePc1, pricePc2, total;

        code1 = sc.nextInt();
        pc1 = sc.nextInt();
        pricePc1 = sc.nextDouble();

        code2 = sc.nextInt();
        pc2 = sc.nextInt();
        pricePc2 = sc.nextDouble();

        total = pc1 * pricePc1 + pc2 * pricePc2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
    }
}
