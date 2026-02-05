import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        // Compare Length
        if (s1.length() == s2.length()) {
            System.out.println("Both strings have EQUAL length");
        } else {
            System.out.println("Strings have DIFFERENT length");
        }

        // Case wise comparison
        if (s1.equals(s2)) {
            System.out.println("Strings are EXACTLY equal (case sensitive)");
        } 
        else if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Strings are equal (case insensitive)");
        } 
        else {
            System.out.println("Strings are NOT equal");
        }
    }
}
