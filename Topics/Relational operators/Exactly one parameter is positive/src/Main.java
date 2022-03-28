import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        final int positive = 0;

        boolean aa = a > positive && b <= positive && c <= positive;
        boolean bb = b > positive && c <= positive && a <= positive;
        boolean cc = c > positive && a <= positive && b <= positive;

        System.out.println(aa || bb || cc);
    }
}