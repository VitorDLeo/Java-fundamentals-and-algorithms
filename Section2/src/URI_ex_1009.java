import java.util.Locale;
import java.util.Scanner;

public class URI_ex_1009 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name;
        double salary, sales, commission, newSalary;

        name = sc.next();
        salary = sc.nextDouble();
        sales = sc.nextDouble();

        commission = sales * (15/100.00);

        newSalary = salary + commission;

        System.out.printf("TOTAL: R$ %.2f", newSalary);
    }
}
