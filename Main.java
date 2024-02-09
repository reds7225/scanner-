import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = scanner.nextInt();
        String result = number % 2 == 0 ? "Even" : "0dd";
        System.out.println("The number is: " + result);
    }
}