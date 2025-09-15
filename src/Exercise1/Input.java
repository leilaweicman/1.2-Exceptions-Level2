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
        return '0';
    }

    public static String readString(String message) {
        return "";
    }

    public static boolean readYesNo(String message) {
        return false;
    }
}
