import java.util.Locale;
import java.util.Scanner;

public class Mult_tools {
    public static void main(String[] args) {

        int option;
        double a, b, h, raio,mult, div, soma, sub, area;
        double pi = 3.14;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("Escolha a sua opcao");
        System.out.println("[ 1 ] Calculadora");
        System.out.println("[ 2 ] Geometria");
        System.out.println("[ 9 ] Sair");

        option = sc.nextInt();

        if (option == 1) {
            System.out.println("------------------");
            System.out.println("[ 1 ] Soma");
            System.out.println("[ 2 ] Subtracao");
            System.out.println("[ 3 ] Multiplicaçao");
            System.out.println("[ 4 ] Divisao");
            System.out.println("------------------");
            option = sc.nextInt();
            System.out.println("Agora, digite o valor de A e de B: ");

            a = sc.nextDouble();
            b = sc.nextDouble();

            if (option == 1) {
                soma = a + b;
                System.out.println("soma = " + soma);
                System.out.println("Digite 7 para fechar");
            } else if (option == 2) {
                sub = a - b;
                System.out.println("Sub = " + sub);
                System.out.println("Digite 7 para fechar");
            } else if (option == 3) {
                mult = a * b;
                System.out.println("mult = " + mult);
                System.out.println("Digite 7 para fechar");
            } else if (option == 4) {
                div = a / b;
                System.out.println("div = " + div);
                System.out.println("Digite 7 para fechar");
             }
        }else if (option == 2) {
            System.out.println("--------------------");
            System.out.println("Bem vindo ao menu de Geometria");
            System.out.println("Escolha qual figura geometrica");
            System.out.println("[ 1 ] Quadrado");
            System.out.println("[ 2 ] Triangulo");
            System.out.println("[ 3 ] Retangulo");
            System.out.println("[ 4 ] Circulo");
            System.out.println("[ 5 ] Sair");
            System.out.println("--------------------");
            option = sc.nextInt();
            if (option == 1){
                System.out.println("Digite o valor do lado do quadrado");
                a = sc.nextDouble();
                area = a * a;
                System.out.println("Area do quadrado " + area);
            } else if (option == 2) {
                System.out.println("Digite o valor da base(b): ");
                b = sc.nextDouble();
                System.out.println("Digite o valor da altura(h): ");
                h = sc.nextDouble();
                area = (b * h) / 2.00;
                System.out.printf("AREA TRIANGULO = %.2f%n", area);
            } else if (option == 3) {
                System.out.println("Digite o valor da base(b)");
                b = sc.nextDouble();
                System.out.println("Digite o valor da altura(h)");
                h = sc.nextDouble();
                area = b * h;
                System.out.printf("AREA RETANGULO = %.2f%n", area);
            } else if (option == 4) {
                System.out.println("Digite o valor do Raio(R): ");
                raio = sc.nextDouble();
                area = pi * Math.pow(raio, 2.00);
                System.out.printf("AREA DO CIRCULO = %.2f%n", area);
            }
        }
    }
}
