import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int limit = 10;
        int input1 = scanner.nextInt();
        System.out.println(input1 < limit);
    }
}