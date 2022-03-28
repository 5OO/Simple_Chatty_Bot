import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int aa = a / 100;
        int bb = (a - (a % 10)) / 10 - (aa * 10);
        int cc = a % 10;
        System.out.println(aa + bb + cc);
    }
}