import java.util.Scanner;

public class EggPackagingPlanner {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // Get total eggs; determines number of cartons needed
        System.out.print("Enter total number of eggs: ");
        int totalEggs = userInput.nextInt();

        // Standard carton sizes, largest first
        int[] cartonSizes = {30, 24, 18, 12, 6};

        System.out.println("\nEgg Packaging Plan:");

        int remainingEggs = totalEggs; 
        int totalCartons = 0;          

        for (int size : cartonSizes) {

            int cartons = remainingEggs / size;  // Number of cartons of this size
            remainingEggs = remainingEggs % size;   // Eggs left for smaller cartons

            if (cartons > 0) {

                // Print carton size and quantity
                System.out.printf("%d-egg cartons: %d%n", size, cartons);
                totalCartons += cartons;

            }

        }

        // Remaining eggs that don’t fit any carton
        System.out.printf("Leftover eggs: %d%n", remainingEggs);

        // Total cartons used
        System.out.printf("Total cartons: %d%n", totalCartons);

        userInput.nextLine();  // Clear leftover newline

        System.out.print("\nPress Enter to exit...");
        userInput.nextLine();  // Wait for Enter before exit

        userInput.close();

    }

}
