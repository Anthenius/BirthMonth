import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String invalidInput = "";

        System.out.print("Enter your birth month [1-12]: ");
        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine(); // clear the buffer

            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("You said your birth month is: " + birthMonth);
            } else {
                System.out.println("You said your birth month is: " + birthMonth + ", which is invalid.");
                System.out.println("Run the program again with a correct format.");
            }
        } else {
            invalidInput = in.nextLine();
            System.out.println("You entered " + invalidInput + ", which is not a valid response.");
            System.out.println("Try again.");
        }

        in.close(); // Close the scanner
    }
}
