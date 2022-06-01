import java.util.Locale;
import java.util.Scanner;

public class Mult_tools {
    public static void main(String[] args) {

        int option;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("Escolha a sua opcao");
        System.out.println("[ 1 ] Calculadora");
        System.out.println("[ 9 ] Sair");




        option = sc.nextInt();

        while (option != 9){
            System.out.println("--------------------------");
            System.out.println("Escolha a sua opcao");
            System.out.println("[ 1 ] Calculadora");
            System.out.println("[ 9 ] Sair");
            System.out.println("--------------------------");

            if (option == 1){
                while (option == 7){
                    System.out.println("------------------");
                    System.out.println("[ 1 ] Soma");
                    System.out.println("[ 2 ] Subtracao");
                    System.out.println("[ 3 ] Multiplicaçao");
                    System.out.println("[ 4 ] Divisao");
                    System.out.println("[ 5 ] Raiz Quadrada");
                    System.out.println("[ 6 ] Potencia");
                    System.out.println("[ 7 ] Sair");
                    System.out.println("------------------");
                    option = sc.nextInt();

                }
            }
        }

    }
}
