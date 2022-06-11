public class exercicio3_5 {
    public static void main(String[] args) {
        int x = 13;
        while (x != 1){
            if (x % 2 == 0){
                x = x/2;
            } else if (x % 2 == 1){
                x = 3 * x + 1;
            }
            if (x == 1){
                break;
            }
            System.out.print(x + " -> ");
        }
    }
}
