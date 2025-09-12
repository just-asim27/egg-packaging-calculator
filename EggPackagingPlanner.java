import java.util.Scanner;

public class EggPackagingPlanner {

    public static void main(String[] args) {

        // ===========================
        // Section 1: Title Display
        // ===========================
        String title = "EGG PACKAGING PLANNER";
        int consoleWidth = 50;
        int padding = (consoleWidth - title.length()) / 2;

        System.out.println("=".repeat(consoleWidth));
        System.out.println(" ".repeat(padding) + title);
        System.out.println("=".repeat(consoleWidth));

        // ===========================
        // Section 2: Main Program Loop
        // ===========================
        Scanner userInput = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {

            int totalEggs = 0;

            // ===========================
            // Section 3: User Input & Validation
            // ===========================
            while (true) {

                System.out.print("\nEnter total number of eggs: ");

                if (userInput.hasNextInt()) {

                    totalEggs = userInput.nextInt();

                    if (totalEggs > 0) 
                        break;
                    else 
                        System.out.println("\n[ERROR] Invalid input! Please enter a number greater than 0.");
                    
                } else {

                    System.out.println("\n[ERROR] Invalid input! Please enter a whole number.");
                    userInput.next();

                }

            }

            // ===========================
            // Section 4: Carton Calculation & Output
            // ===========================
            int[] cartonSizes = {30, 24, 18, 12, 6};

            System.out.println("\nEgg Packaging Plan:");

            int remainingEggs = totalEggs; 
            int totalCartons = 0;          

            for (int size : cartonSizes) {

                int cartons = remainingEggs / size;
                remainingEggs = remainingEggs % size;

                if (cartons > 0) {

                    System.out.printf("%d-egg cartons: %d%n", size, cartons);
                    totalCartons += cartons;

                }

            }

            System.out.printf("Leftover eggs: %d%n", remainingEggs);
            System.out.printf("Total cartons: %d%n", totalCartons);

            userInput.nextLine();

            // ===========================
            // Section 5: Repeat or Exit
            // ===========================
            String userChoice = "";

            while (true) {

                System.out.print("\nDo you want to calculate for another batch? Enter (yes/no): ");
                userChoice = userInput.nextLine().trim().toLowerCase();

                if (userChoice.equals("yes")) {

                    break;

                } else if (userChoice.equals("no")) {

                    continueProgram = false;
                    break;

                } else {

                    System.out.println("\n[ERROR] Invalid input! Please enter 'yes' or 'no'.");

                }

            }

        }

        System.out.println("\nThank you for using Egg Packaging Planner!");
        System.out.println("Created by Asim");

        System.out.print("\nPress Enter to exit...");
        userInput.nextLine();

        userInput.close();

    }

}
