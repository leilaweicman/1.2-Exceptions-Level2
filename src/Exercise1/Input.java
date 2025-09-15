package Exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        while (true) {
            System.out.println(message);
            try {
                return scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid Byte.");
                scanner.nextLine();
            }
        }
    }

    public static int readInt(String message) {
        while (true) {
            System.out.println(message);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid Int.");
                scanner.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            System.out.println(message);
            try {
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid Float.");
                scanner.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            System.out.println(message);
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid Double.");
                scanner.nextLine();
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            System.out.println(message);
            String input = scanner.nextLine();
            try {
                if (input.length() != 1) {
                    throw new InvalidInputException("Format error. Please enter only one character.");
                }
                return input.charAt(0);
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String readString(String message) {
        while (true) {
            System.out.println(message);
            String input = scanner.nextLine();
            try {
                if (input.trim().isEmpty()) {
                    throw new InvalidInputException("Format error. Please enter a non-empty string.");
                }
                return input;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static boolean readYesNo(String message) {
        return false;
    }
}
