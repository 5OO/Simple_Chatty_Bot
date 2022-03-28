import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        char firstChar = text.charAt(0);

        boolean startsWithJ = firstChar == 'J' || firstChar == 'j';
        System.out.println(startsWithJ);
    }
}