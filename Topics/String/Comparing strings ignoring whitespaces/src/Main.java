import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yourName1 = scanner.nextLine();
        String yourName2 = scanner.nextLine();
        String trimmedString1 = yourName1.trim().replaceAll(" ", "");
        String trimmedString2 = yourName2.trim().replaceAll(" ", "");
        System.out.println(trimmedString1.equalsIgnoreCase(trimmedString2));
    }
}