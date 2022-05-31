import java.util.Scanner;

public class Ex_resolved_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age, mediaAge, sumAge, count;

        mediaAge = 0;
        count = 0;
        sumAge = 0;
        age = sc.nextInt();

        while (age >= 0){
            if (age >= 0){
                sumAge += age;
                count += 1;
            } else if (age < 0) {
                System.out.println("Impossivel de calcular");
            }
            age = sc.nextInt();
        }
        
        if (count > 0){
            mediaAge = sumAge / count;
        }
        
        System.out.println("Sum Age: " + mediaAge);
    }   
}
