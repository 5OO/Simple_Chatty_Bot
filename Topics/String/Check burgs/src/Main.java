import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yourName = scanner.nextLine();
        System.out.println(yourName.endsWith("burg"));
    }
}