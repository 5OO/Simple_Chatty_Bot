import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int addsUp = 20;
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();
        System.out.println(input1 + input2 == addsUp ||
                input1 + input3 == addsUp ||
                input2 + input3 == addsUp);
    }
}