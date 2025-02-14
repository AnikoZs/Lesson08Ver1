import java.util.Scanner;

/**
 * IceCreamLover class demonstrates array traversal with ice cream flavors.
 */
public class IceCreamLover {
    public static void main(String[] args) {
        welcomeMessage(); // Display a welcome message

        // Define an array of ice cream flavors
        String[] iceCreamFlavors = {"Vanilla", "Strawberry", "Chocolate", "Mint", "Cookie Dough", "Chocolate Chip"};

        // Traverse the array and check for Chocolate flavor
        traverseIceCreamFlavors(iceCreamFlavors);
    }

    /**
     * Prints a welcome message.
     */
    public static void welcomeMessage() {
        System.out.println("========================================");
        System.out.println("🍦 Welcome to the Ice Cream Flavor Explorer! 🍨");
        System.out.println("Let's check out some delicious ice cream flavors!");
        System.out.println("========================================");
    }

    /**
     * Traverses through the ice cream flavors and prints a special message for Chocolate.
     *
     * @param flavors The array of ice cream flavors.
     */
    public static void traverseIceCreamFlavors(String[] flavors) {
        System.out.println("\n--- Ice Cream Flavors ---");

        // Loop through each ice cream flavor
        for (String flavor : flavors) {
            if (flavor.equals("Chocolate")) {
                System.out.println(flavor + " - This one is delicious! 🍫"); // Special message for Chocolate
            } else {
                System.out.println(flavor); // Print other flavors normally
            }
        }
    }
}
