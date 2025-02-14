import java.util.Random;
import java.util.Scanner;

/**
 * F1Race class simulates various Formula 1 race-related scenarios using arrays.
 */
public class F1RaceA {
    public static void main(String[] args) {
        welcomeMessage(); // Display a welcome message

        // Call methods and store return values
        String raceLocation = exercise1_StartYourEngines(); // Get a random race location
        String[] drivers = exercise2_RaceReport(); // Get an array of drivers
        String lastDriver = exercise3_GetLastDriver(drivers); // Get the last driver in the list
        String firstDriver = exercise4_GetFirstDriver(drivers); // Get the first driver in the list
        int numDrivers = exercise5_PitCrewRollCall(drivers); // Get the number of drivers

        // Call void methods
        exercise6_DisplayDriverPositions(drivers); // Display drivers with their positions
        exercise7_DriverChange(drivers); // Change a driver in the list
        exercise8_ReverseDriverList(drivers); // Display drivers in reverse order
        exercise10_PitStop(drivers); // Copy and display drivers
        exercise9_LapTimeTotal(drivers); // Calculate total lap times and find the fastest driver

        // Display results
        displayResults(raceLocation, drivers, numDrivers, lastDriver, firstDriver);
    }

    /**
     * Prints a welcome message for the race simulation.
     */
    public static void welcomeMessage() {
        System.out.println("========================================");
        System.out.println("🏎️ Welcome to the Ultimate F1 Race Simulator! 🏁");
        System.out.println("Get ready to experience the thrill of high-speed racing and strategic pit stops!");
        System.out.println("========================================");
    }

    /**
     * Displays results from the different exercises.
     */
    public static void displayResults(String raceLocation, String[] drivers, int numDrivers, String lastDriver, String firstDriver) {
        System.out.println("\n--- Exercise 1: Start Your Engines ---");
        System.out.println("Race Location: " + raceLocation);

        System.out.println("\n--- Exercise 2: Race Report ---");
        System.out.println("Drivers on the grid:");
        for (String driver : drivers) {
            System.out.println(driver);
        }


        System.out.println("\n--- Exercise 3: Get the Last Driver ---");
        System.out.println("Last driver in the list: " + lastDriver);

        System.out.println("\n--- Exercise 4: Get the First Driver ---");
        System.out.println("First driver in the list: " + firstDriver);

        System.out.println("\n--- Exercise 5: Pit Crew Roll Call ---");
        System.out.println("Number of drivers: " + numDrivers);
    }

    /**
     * Exercise 1: Returns a randomly chosen Formula 1 race location.
     */
    public static String exercise1_StartYourEngines() {
        // Define an array of race locations "Monaco", "Silverstone", "Suzuka", "Spa", "Hungary", "Imola", "Austin", "Bahrain", "Singapore", "Melbourne"

        // Generate a random index between 0 and the length of the array - 1


        // Return the randomly selected race location
        return " ";
    }

    /**
     * Exercise 2: Returns an array of six Formula 1 drivers.
     */
    public static String[] exercise2_RaceReport() {
        // Define an array with six driver names "Hamilton", "Verstappen", "Leclerc", "Norris", "Russell", "Sainz"
        String[] raceDrivers = new String[6];

        // Return the array of drivers
        return raceDrivers;
    }

    /**
     * Exercise 3: Returns the last driver in the array.
     */
    public static String exercise3_GetLastDriver(String[] drivers) {

        return "MISSING"; // Get the last driver from the array
    }

    /**
     * Exercise 4: Returns the first driver in the array.
     */
    public static String exercise4_GetFirstDriver(String[] drivers) {

        return "MISSING"; // Get the first driver from the array
    }


    /**
     * Exercise 5: Returns the number of drivers in an array.
     */
    public static int exercise5_PitCrewRollCall(String[] raceDrivers) {

        // Return the length of the array (number of drivers)
        return 0;
    }



    /**
     * Exercise 6: Race Standings - Displays drivers and their positions.
     */
    public static void exercise6_DisplayDriverPositions(String[] drivers) {
        System.out.println("\n--- Exercise 6: Race Standings ---");
         // Print position and driver name

    }

    /**
     * Exercise 7: Driver Swap - Allows user to replace a driver in the list.
     */
    public static void exercise7_DriverChange(String[] drivers) {
         // Display index and driver name


        // Get the new driver name from user
        // Get the index from user

        // Validate index
        // Replace driver at given index
        // Display updated list

    }

    /**
     * Exercise 8: Prints the drivers' names in reverse order.
     */
    public static void exercise8_ReverseDriverList(String[] drivers) {
        System.out.println("\n--- Exercise 8: Reverse Driver List ---");
        System.out.println("Drivers in reverse order:");

        // Loop from the last index to the first index
        // Print each driver in reverse order

    }

    /**
     * Exercise 9: Calculates total lap time and finds the fastest driver.
     */
    public static int exercise9_LapTimeTotal(String[] drivers) {

        // Define an array with lap times for 10 drivers
        double[] lapTimes = {78.5, 79.3, 77.8, 80.1, 78.9, 76.5, 77.2, 81.0, 79.7, 78.1};

        // Initialize variables for total time, fastest time, and index of the fastest driver
        double totalLapTime = 0;
        double fastestTime = lapTimes[0];
        int fastestIndex = 0;

        /* Loop through the lap times to calculate total time and find the fastest time */
        //MISSING

        // Print results
        System.out.println("\n--- Exercise 9: Lap Time Total ---");
        System.out.println("Total Lap Time: " + totalLapTime);
        System.out.println("Fastest Driver Index: " + fastestIndex + " with time " + fastestTime);


        return  fastestIndex;
    }

    /**
     * Exercise 10: Copies driver names and prints both lists.
     */
    public static void exercise10_PitStop(String[] originalDrivers) {
        // Create a new array with the same length as the original
        //MISSING

        // Copy the contents of the original array into the new array
        //MISSING

        // Print the original and copied arrays
//        System.out.println("\n--- Exercise 10: Pit Stop ---");
//        System.out.println("Original Drivers List:");
//        for (String driver : originalDrivers) System.out.println(driver);
//        System.out.println("Copied Drivers List:");
//        for (String driver : copiedDrivers) System.out.println(driver);
    }

}
