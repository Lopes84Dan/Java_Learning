import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selection = "";

        // Initialize dog and monkey lists
        initializeDogList();
        initializeMonkeyList();

        // Main loop to display the menu and process user input
        while (!selection.equalsIgnoreCase("q")) {
            displayMenu(); 
            selection = scanner.nextLine(); 
            
            switch (selection) {
                case "1":
                    intakeNewDog(scanner);  // Collect and add a new dog
                    break;
                case "2":
                    intakeNewMonkey(scanner);  // Collect and add a new monkey
                    break;
                case "3":
                    reserveAnimal(scanner);  // Reserve a dog or monkey
                    break;
                case "4":
                    printAnimals("dog");  // Print the list of all dogs
                    break;
                case "5":
                    printAnimals("monkey");  // Print the list of all monkeys
                    break;
                case "6":
                    printAnimals("available");  // Print available (unreserved) animals
                    break;
                case "q":
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid selection, please try again.");
            }
        }
        scanner.close();  
    }

    // Display the system menu
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println("Enter a menu selection:");
    }

    // Initializes the dog list with sample data
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", 25.6, "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", 35.2, "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", 25.6, "12-12-2019", "Canada", "in service", true, "Canada");
        
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // Placeholder for initializing the monkey list (can add test data)
    public static void initializeMonkeyList() {
    }

    // Collects user input to add a new dog to the system
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for (Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                System.out.println("This dog is already in our system.");
                return; 
            }
        }

        // Gather the remaining details for the new dog
        System.out.println("Enter the dog's breed:");
        String breed = scanner.nextLine();
        System.out.println("Enter the dog's gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter the dog's age:");
        String age = scanner.nextLine();
        System.out.println("Enter the dog's weight:");
        String weight = scanner.nextLine();
        System.out.println("Enter the acquisition date:");
        String acquisitionDate = scanner.nextLine();
        System.out.println("Enter the acquisition country:");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("Enter the training status:");
        String trainingStatus = scanner.nextLine();
        System.out.println("Is the dog reserved? (true/false):");
        boolean reserved = scanner.nextBoolean();
        scanner.nextLine();  
        System.out.println("Enter the in-service country:");
        String inServiceCountry = scanner.nextLine();

        // Add the new dog to the list
        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        dogList.add(newDog);
        System.out.println("Dog added successfully!");
    }

    // Collects user input to add a new monkey to the system
    public static void intakeNewMonkey(Scanner scanner) {
        System.out.println("Enter the monkey's name:");
        String name = scanner.nextLine();
        
        // Check if monkey is already in the system
        for (Monkey monkey : monkeyList) {
            if (monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("This monkey is already in our system.");
                return;
            }
        }

        // Collect remaining monkey details
        System.out.println("Enter the species (Capuchin, Guenon, Macaque, etc.):");
        String species = scanner.nextLine();
        if (!(species.equalsIgnoreCase("Capuchin") || species.equalsIgnoreCase("Guenon") ||
              species.equalsIgnoreCase("Macaque") || species.equalsIgnoreCase("Marmoset") ||
              species.equalsIgnoreCase("Squirrel Monkey") || species.equalsIgnoreCase("Tamarin"))) {
            System.out.println("Invalid species.");
            return;
        }

        System.out.println("Enter the monkey's gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter the monkey's weight:");
        double weight = scanner.nextDouble();
        scanner.nextLine();  
        System.out.println("Enter the monkey's tail length:");
        double tailLength = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the monkey's height:");
        double height = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the monkey's body length:");
        double bodyLength = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the acquisition date:");
        String acquisitionDate = scanner.nextLine();
        System.out.println("Enter the acquisition country:");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("Enter the training status:");
        String trainingStatus = scanner.nextLine();
        System.out.println("Is the monkey reserved? (true/false):");
        boolean reserved = scanner.nextBoolean();
        scanner.nextLine();  
        System.out.println("Enter the in-service country:");
        String inServiceCountry = scanner.nextLine();

        // Add the new monkey to the list
        Monkey newMonkey = new Monkey(name, species, inServiceCountry, weight, tailLength, height, bodyLength, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        monkeyList.add(newMonkey);
        System.out.println("Monkey added successfully!");
    }

    // Reserves an animal (dog or monkey) based on its type and in-service country
    public static void reserveAnimal(Scanner scanner) {
        System.out.println("Enter the type of animal (dog or monkey):");
        String animalType = scanner.nextLine();
        System.out.println("Enter the in-service country:");
        String country = scanner.nextLine();

        // Reserve a dog
        if (animalType.equalsIgnoreCase("dog")) {
            for (Dog dog : dogList) {
                if (dog.getInServiceLocation().equalsIgnoreCase(country) && !dog.getReserved()) {
                    dog.setReserved(true);
                    System.out.println("Dog " + dog.getName() + " is now reserved.");
                    return;
                }
            }
            System.out.println("There are no available dogs in this country.");
        } 
        // Reserve a monkey
        else if (animalType.equalsIgnoreCase("monkey")) {
            for (Monkey monkey : monkeyList) {
                if (monkey.getInServiceLocation().equalsIgnoreCase(country) && !monkey.getReserved()) {
                    monkey.setReserved(true);
                    System.out.println("Monkey " + monkey.getName() + " is now reserved.");
                    return;
                }
            }
            System.out.println("There are no available monkeys in this country.");
        } 
        else {
            System.out.println("Invalid animal type.");
        }
    }

    // Prints a list of animals based on the specified type (dog, monkey, or available)
    public static void printAnimals(String listType) {
        if (listType.equalsIgnoreCase("dog")) {
            for (Dog dog : dogList) {
                System.out.println(dog);
            }
        } 
        else if (listType.equalsIgnoreCase("monkey")) {
            for (Monkey monkey : monkeyList) {
                System.out.println(monkey);
            }
        } 
        else if (listType.equalsIgnoreCase("available")) {
            System.out.println("Available animals:");
            for (Dog dog : dogList) {
                if (dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {
                    System.out.println(dog);
                }
            }
            for (Monkey monkey : monkeyList) {
                if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()) {
                    System.out.println(monkey);
                }
            }
        } 
        else {
            System.out.println("Invalid option.");
        }
    }
}
