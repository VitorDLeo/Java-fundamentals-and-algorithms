import java.util.Scanner;

public class URI_ex_1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opt, gas, alcool, diesel;

        alcool = 0;
        gas = 0;
        diesel = 0;

        System.out.println("Digite o combustivel de preferencia");
        System.out.println("Op 1 - Alcool");
        System.out.println("Op 2 - Gas");
        System.out.println("Op 3 - Diesel");
        System.out.println("Op 4 - Sair");
        
        opt = sc.nextInt();

        while(opt != 4){
            if(opt == 1){
                alcool += 1;
            } else if (opt == 2){
                gas += 1;
            } else if (opt == 3){
                diesel += 1;
            } 
            opt = sc.nextInt();
        }

        System.out.println("Muito Obrigado!");
        System.out.println("Acool: " + alcool);
        System.out.println("Gas: " + gas);
        System.out.println("Diesel: " + diesel);

        
    }
}
