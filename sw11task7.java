import java.util.Scanner;

public class sw11task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight Conversion Program");
        System.out.println("Convert lbs to kgs");
        System.out.println("Convert kgs to lbs");

        System.out.print("Choose an option: ");
        int option = scanner.nextInt();

        if (option == 1) {
            System.out.print("Enter the weight in lbs: ");
            double lbs = scanner.nextDouble();
            double kg = lbs / 2.20462;
            System.out.printf("The new weight in kgs is: %.2f%n", kg);

        } else if (option == 2) {
            System.out.print("Enter the weight in kgs: ");
            double kg = scanner.nextDouble();
            double lbs = kg * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f%n", lbs);

        } else {
            System.out.println("Invalid option.");
        }

        scanner.close();
    }
}