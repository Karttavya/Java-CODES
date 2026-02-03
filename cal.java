import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a number (or type 'stop' to finish): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            try {
                int num = Integer.parseInt(input);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'stop'.");
            }
        }
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
