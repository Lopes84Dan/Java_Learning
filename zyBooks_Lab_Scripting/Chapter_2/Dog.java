
public class Dog {
	// Attributes
	private int dogSpaceNumber; //Dog space number (tracks space within the kennel)
	private double dogWeight; // Tracks the dog's weight
	private boolean grooming; // Does the dog need grooming
	
	// Constructor: Initiates the attributes when a Dog object is created
	public Dog(int dogSpaceNumber, double dogWeight, boolean grooming) {
		this.dogSpaceNumber = dogSpaceNumber;
		this.dogWeight = dogWeight;
		this.grooming = grooming;
	}
	//Getter for dogSpaceNumber
	public int getdogSpaceNumber() {
		return dogSpaceNumber;
	}
	
	//Setter for dogSpaceNumber
	public void setDogSpaceNumber(int dogSpaceNumber){
		this.dogSpaceNumber = dogSpaceNumber;
	}
	
	//Getter for dogWeight
	public double getdogWeight() {
		return dogWeight;
	}
	
	//Setter for dogWeight
	public void setdogWeight(double dogWeight) {
		this.dogWeight = dogWeight;
	}
	//Getter for grooming
	public boolean getGrooming() {
		return grooming;
	}
	
	//Setter for grooming
	public void setGrooming(boolean grooming) {
		this.grooming = grooming;
	}
}