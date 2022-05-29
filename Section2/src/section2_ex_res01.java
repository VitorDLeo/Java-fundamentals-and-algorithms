import java.util.Locale;
import java.util.Scanner;

public class section2_ex_res01 {
    public static void main(String[] args) {
        
        double largura, comprimento, valor, area, preco;

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        largura = sc.nextDouble();
        comprimento = sc.nextDouble();
        valor = sc.nextDouble();

        area = largura * comprimento;

        preco = area * valor;
        
        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);

    }
}
