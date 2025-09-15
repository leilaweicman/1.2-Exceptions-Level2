package Exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        while (true) {
            System.out.println(message);
            try {
                byte input = scanner.nextByte();
                scanner.nextLine();
                return input;
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
                int input = scanner.nextInt();
                scanner.nextLine();
                return input;
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
                float input = scanner.nextFloat();
                scanner.nextLine();
                return input;
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
                double input = scanner.nextDouble();
                scanner.nextLine();
                return input;
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid Double.");
                scanner.nextLine();
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            System.out.println(message);
            String input = scanner.next().trim();
            try {
                if (input.length() != 1) {
                    throw new InvalidInputException("Format error. Please enter only one character.");
                }
                char res = input.charAt(0);
                scanner.nextLine();
                return res;
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
        while (true) {
            System.out.println(message + " (y/n)");
            String input = scanner.next().toLowerCase();
            try {
                if (input.equals("y") || input.equals("n")) {
                    boolean res = input.equals("y");
                    scanner.nextLine();
                    return res;
                } else {
                    throw new InvalidInputException("Please enter 'y' or 'n'.");
                }
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
