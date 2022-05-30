import java.util.Scanner;

public class URI_ex_1060 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n1, n2, n3, n4, n5, n6;
        int count = 0;

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
        n5 = sc.nextInt();
        n6 = sc.nextInt();

        if (n1 > 0){
            count += 1;
        }
        if (n2 > 0){
            count += 1;
        }
        if (n3 > 0){
            count += 1;
        }
        if (n4 > 0){
            count += 1;
        }
        if (n5 > 0){
            count += 1;
        }
        if (n6 > 0){
            count += 1;
        }
        System.out.println("Quantidade de numeros positivos: " + count);
    }
}
