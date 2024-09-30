
public class Pet {
	// Attributes
	private String petType;    // Type of pet (dog or cat)
	private String petName;    // Pet's name
	private int petAge;        // Pet's age
	private int daysStay;      // Number of days pet staying
	private double amountDue;  // Amount due for the length of stay
	private int spaceNumber;    // Boarding space number
	private static int dogSpaces = 30;  // Total available space for dogs
	private static int catSpaces = 12;  // Total available space for cats
	
	// Constructor: Initiates the attributes when a Pet object is created
	public Pet(String petType, String petName, int petAge, int daysStay, double amountDue, int spaceNumber) {
		this.petType = petType;
		this.petName = petName;
		this.petAge = petAge;
		this.daysStay = daysStay;
		this.amountDue = amountDue;
		this.spaceNumber = spaceNumber;
	}
	
	//Getter  and Setter for petType
	public String getPetType() {
		return petType;
	}
	
	public void setPetType(String petType) {
		this.petType = petType;
	}
	
	// Getter and Setter for petName
	public String getPetName() {
		return petName;
	}
	
	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	// Getter and Setter for petAge
	public int getPetAge() {
		return petAge;
	}
	
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}
	
	// Getter and Setter for daysStay
	public int getDaysStay() {
		return daysStay;
	}
	
	public void setDaysStay(int daysStay) {
		this.daysStay = daysStay;
	}
	
	// Getter and Setter for amountDue
	public double getAmountDue() {
		return amountDue;
	}
	
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}
	
	// Getter and Setter for spaceNumber
	public int getSpaceNumber() {
		return spaceNumber;
	}
	
	public void setSpaceNumber(int spaceNumber) {
		this.spaceNumber = spaceNumber;
	}
	
	// Getter and Setter for dogSpaces
	public static int getDogSpaces() {
		return dogSpaces;
	}
	
	public static void setDogSpaces(int dogSpaces) {
		Pet.dogSpaces = dogSpaces;
	}
	
	// Getter and Setter for catSpaces
	public static int getCatSpaces() {
		return catSpaces;
	}
	
	public static void setCatSpaces(int catSpaces) {
		Pet.catSpaces = catSpaces;
	}
	

}
