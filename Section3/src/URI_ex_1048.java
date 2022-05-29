import java.util.Locale;
import java.util.Scanner;

public class URI_ex_1048 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String percent;
        double salary, newSalary, readjustment;

        salary = sc.nextDouble();

        newSalary = 0;
        readjustment = 0;
        percent = " ";

        if (salary <= 400.00){
            readjustment = (double) salary * (15.00/100.00);
            newSalary = salary + readjustment;
            percent = "15%"; 
        } else if (salary >= 400.01 && salary <= 800.00){
            readjustment = (double) salary * (12.00/100.00);
            newSalary = salary + readjustment;
            percent = "12%"; 
        } else if (salary >= 800.01 && salary <= 1200.00){
            readjustment = (double) salary * (10.00/100.00);
            newSalary = salary + readjustment;
            percent = "10%"; 
        } else if (salary >= 1200.01 && salary <= 2000.00){
            readjustment = (double) salary * (7.00/100.00);
            newSalary = salary + readjustment;
            percent = "7%"; 
        } else if (salary > 2000.00){
            readjustment = (double) salary * (4.00/100.00);
            newSalary = salary + readjustment;
            percent = "4%"; 
        }

        System.out.printf("New salary: %.2f%n", newSalary);
        System.out.printf("Readjustment: %.2f%n", readjustment);
        System.out.println("Percent: " + percent);

    }
}
