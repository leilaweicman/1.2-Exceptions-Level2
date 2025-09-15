package Exercise1;

public class Main {
    public static void main(String[] args) {

        byte quantity = Input.readByte("Enter the product quantity");
        System.out.println("Quantity (byte): " + quantity);

        int year = Input.readInt("Enter the current year");
        System.out.println("Year (int): " + year);

        float temperature = Input.readFloat("Enter the temperature in Celsius");
        System.out.println("Temperature (float): " + temperature);

        double price = Input.readDouble("Enter the product price");
        System.out.println("Price (double): " + price);

        char initial = Input.readChar("Enter the first letter of your name");
        System.out.println("Initial (char): " + initial);

        String city = Input.readString("Enter your city");
        System.out.println("City (string): " + city);

        boolean continueProcess = Input.readYesNo("Do you want to continue?");
        System.out.println("Continue? " + continueProcess);
    }
}
