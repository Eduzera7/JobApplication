import java.util.Scanner;

public class JobApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Job Application Simulator");
        System.out.println("All visa rules and outcomes are fictional and for programming practice only.");
        System.out.println("Years of experience (whole number, 0 or more):");

        if (!input.hasNextInt()) {
            System.out.println("Invalid experience. Please enter a whole number from 0 to 2147483647.");
            input.close();
            return;
        }

        int years = input.nextInt();

        if (years < 0) {
            System.out.println("Invalid experience. Years of experience cannot be negative.");
            input.close();
            return;
        }

        // Read the rest of the line after nextInt(). Reject extra text as well.
        String remainingText = "";
        if (input.hasNextLine()) {
            remainingText = input.nextLine().trim();
        }
        if (!remainingText.isEmpty()) {
            System.out.println("Invalid experience. Please enter only a whole number.");
            input.close();
            return;
        }

        System.out.println("Visa type (1G or Study):");
        if (!input.hasNextLine()) {
            System.out.println("Missing visa type. Please enter 1G or Study.");
            input.close();
            return;
        }
        String visa = input.nextLine().trim();

        // The visa is invalid only when it matches neither accepted value.
        if (!visa.equalsIgnoreCase("1G") && !visa.equalsIgnoreCase("Study")) {
            System.out.println("Invalid visa type. Please enter 1G or Study.");
            input.close();
            return;
        }

        if (visa.equalsIgnoreCase("1G")) {
            if (years >= 2) {
                System.out.println("Simulated outcome: You are invited to an interview.");
            } else {
                System.out.println("Simulated outcome: Please explore our internship programme.");
            }
        } else if (years >= 2) {
            // Only Study can reach this branch because the visa was validated above.
            System.out.println("Simulated outcome: Please apply for an interview after graduation.");
        } else {
            System.out.println("Simulated outcome: Please continue your studies and build your experience.");
        }

        input.close();
    }
}
