import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* read input */
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        /* generate output */
        System.out.println(k % n);
    }
}