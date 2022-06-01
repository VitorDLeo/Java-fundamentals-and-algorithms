import java.util.Locale;
import java.util.Scanner;

public class Mult_tools {
    public static void main(String[] args) {

        int option;
        double a, b, mult, div, raiz, pot, soma, sub;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("Escolha a sua opcao");
        System.out.println("[ 1 ] Calculadora");
        System.out.println("[ 9 ] Sair");


        soma = 0;
        pot = 0;
        mult = 0;
        sub = 0;
        raiz = 0;


        option = sc.nextInt();

        if (option == 1){
            while (option != 5){
                System.out.println("------------------");
                System.out.println("[ 1 ] Soma");
                System.out.println("[ 2 ] Subtracao");
                System.out.println("[ 3 ] Multiplicaçao");
                System.out.println("[ 4 ] Divisao");
                System.out.println("[ 5 ] Sair");
                System.out.println("------------------");
                option = sc.nextInt();
                System.out.println("Agora, digite o valor de A e de B: ");

                a = sc.nextDouble();
                b = sc.nextDouble();

                if (option == 1){
                    soma = a + b;
                    System.out.println("soma = " + soma);
                    System.out.println("Digite 7 para fechar");
                    option = sc.nextInt();
                } else if (option == 2) {
                    sub = a - b;
                    System.out.println("Sub = " + sub);
                    System.out.println("Digite 7 para fechar");
                    option = sc.nextInt();
                } else if (option == 3) {
                    mult = a * b;
                    System.out.println("mult = " + mult);
                    System.out.println("Digite 7 para fechar");
                    option = sc.nextInt();
                } else if (option == 4) {
                    div = a / b;
                    System.out.println("div = " + div);
                    System.out.println("Digite 7 para fechar");
                    option = sc.nextInt();
                }
                option = sc.nextInt();
            }
        }
    }

}
