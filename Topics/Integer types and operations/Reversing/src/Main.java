import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // read input
        int i = scanner.nextInt();
        // generate solution
        int n3 = i / 100;
        int n2 = i % 100 / 10 * 10;
        int n1 = i % 10 * 100;
        // output
        System.out.println(n1 + n2 + n3);
    }
}