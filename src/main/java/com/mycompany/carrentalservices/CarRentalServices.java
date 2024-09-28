import java.util.Scanner;

public class CarRentalServices {

    private static String[] availableCars = {
        "Toyota Corolla KDA 456B",
        "Honda Civic KDB 123C",
        "Ford Focus KDC 789D"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        while (option != 4) {
            System.out.println("1. Display available cars");
            System.out.println("2. Rent a car");
            System.out.println("3. Return a car");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            option = scanner.nextInt(); 
            scanner.nextLine();

         
            if (option == 1) {
                displayAvailableCars();
            } else if (option == 2) {
                rentCar(scanner); 
            } else if (option == 3) {
                returnCar(scanner); 
            } else if (option == 4) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid option. Please choose again.");
            }
        }
        
        scanner.close(); 
    }

    private static void displayAvailableCars() {
        System.out.println("Available cars:");
        for (String car : availableCars) {
            System.out.println(car);
        }
        System.out.println();
    }


    private static void rentCar(Scanner scanner) {
        System.out.print("Enter the name of the car to rent: ");
        String carToRent = scanner.nextLine();
        boolean carFound = false;


        for (int i = 0; i < availableCars.length; i++) {
            if (availableCars[i].equalsIgnoreCase(carToRent)) {
                availableCars[i] = null; 
                carFound = true;
                System.out.println("You have rented: " + carToRent);
                break;
            }
        }

        if (!carFound) {
            System.out.println("Car not available.");
        }
        System.out.println();
    }


    private static void returnCar(Scanner scanner) {
        System.out.print("Enter the name of the car to return: ");
        String carToReturn = scanner.nextLine();

   
        boolean canReturn = true;
        for (String car : availableCars) {
            if (car != null && car.equalsIgnoreCase(carToReturn)) {
                System.out.println("This car is already available.");
                canReturn = false;
                break;
            }
        }

        if (canReturn) {
      
            for (int i = 0; i < availableCars.length; i++) {
                if (availableCars[i] == null) {
                    availableCars[i] = carToReturn; 
                    System.out.println("You have returned: " + carToReturn);
                    break;
                }
            }
        }
        System.out.println();
    }
}