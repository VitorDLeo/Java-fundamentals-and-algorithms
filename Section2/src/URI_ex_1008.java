import java.util.Locale;
import java.util.Scanner;

public class URI_ex_1008 {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int code, horas;
        double valor, salary;

        code = sc.nextInt();
        horas = sc.nextInt();
        valor = sc.nextDouble();

        salary = horas * valor;

        System.out.println("NUMBER = " + code);
        System.out.printf("SALARY = U$ %.2f", salary);

    }
}
