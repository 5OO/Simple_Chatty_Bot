import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // read data
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        // compute solution
        System.out.println(a / 2 + a % 2 +
                b / 2 + b % 2 +
                c / 2 + c % 2);
    }
}