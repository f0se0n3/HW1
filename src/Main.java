import java.util.Scanner;

public class Main {
    public static String input;

    public static void main(String[] args) {
        input = getValidInputFromKeyboard();
    }

    private static String getValidInputFromKeyboard() {
        PhoneNumberValidator validator = new PhoneNumberValidator();
        boolean isValidInput = false;

        do {
            System.out.print("Enter your number:");
            Scanner inputFromKeyboard = new Scanner(System.in);
            input = inputFromKeyboard.next();
            isValidInput = validator.isValid(input);
        } while (!isValidInput);

        return input;
    }
}