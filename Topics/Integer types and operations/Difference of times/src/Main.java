import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int s1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int s2 = scanner.nextInt();
        h1 = h1 * 60;
        m1 = (h1 + m1) * 60;
        s1 = s1 + m1;
        h2 = h2 * 60;
        m2 = (h2 + m2) * 60;
        s2 = s2 + m2;
        System.out.println(s2 - s1);
    }
}