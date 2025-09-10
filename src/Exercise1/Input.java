package Exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        byte value = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println(message);
            try {
                value = scanner.nextByte();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid Byte.");
                scanner.nextLine();
            }
        }
        return value;
    }

    public static int readInt(String message) {
        int value = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println(message);
            try {
                value = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid Int.");
                scanner.nextLine();
            }
        }
        return value;
    }

    public static float readFloat(String message) {
        float value = 0;
        boolean valid = false;

        while (!valid) {
            System.out.println(message);
            try {
                value = scanner.nextFloat();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid Float.");
                scanner.nextLine();
            }
        }
        return value;
    }

    public static double readDouble(String message) {
        double value = 0.0;
        boolean valid = false;

        while (!valid) {
            System.out.println(message);
            try {
                value = scanner.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid Double.");
                scanner.nextLine();
            }
        }
        return value;
    }

    public static char readChar(String message) {
        return '0';
    }

    public static String readString(String message) {
        return "";
    }

    public static boolean readYesNo(String message) {
        return false;
    }
}
