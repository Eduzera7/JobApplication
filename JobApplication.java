import java.util.Scanner;

public class JobApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Years of experience:");

        if (!input.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            input.close();
            return;
        }

        int years = input.nextInt();

        if (years < 0) {
            System.out.println("Experience cannot be negative.");
            input.close();
            return;
        }

        input.nextLine();

        System.out.println("Type of visa:");
        String visa = input.nextLine();

        if (visa.equalsIgnoreCase("1G")) {
            if (years >= 2) {
                System.out.println("Called for Interview");
            } else {
                System.out.println("Check out our Internship program");
            }
        } else if (visa.equalsIgnoreCase("Study") && years >= 2) {
            System.out.println("We can interview you when you graduate");
        } else {
            System.out.println(
                    "Thanks for your interest. We will keep you on file and never ever contact you.");
        }

        input.close();
    }
}