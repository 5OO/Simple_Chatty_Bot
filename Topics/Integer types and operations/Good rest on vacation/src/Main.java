import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // read data
        int days = scanner.nextInt();
        int food = scanner.nextInt() * days;
        int flight = scanner.nextInt() * 2;
        int hotel = scanner.nextInt() * (days - 1);
        // calculate + output
        System.out.println(food + flight + hotel);
    }
}