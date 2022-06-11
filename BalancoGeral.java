import java.util.Locale;
import java.util.Scanner;

public class BalancoGeral {
    public static void main(String[] args) {

        double janeiro;
        double fevereiro;
        double marco;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor gasto em janeiro: ");
        janeiro = sc.nextDouble();

        System.out.print("Digite o valor gasto em Fevereiro: ");
        fevereiro = sc.nextDouble();

        System.out.print("Digite o valor gasto em marco: ");
        marco = sc.nextDouble();

        double gastoTotal = janeiro + fevereiro + marco;
        double mediaGasto = gastoTotal / 3.00;

        System.out.printf("O valor total gasto foi R$ %.2f%n", gastoTotal);
        System.out.printf("A media de valor gasto foi R$ %.2f", mediaGasto);
        
    }
}
