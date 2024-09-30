public class Monkey extends RescueAnimal {
    // Monkey-specific attributes
    private String species;  // Covers species of animals
    private double tailLength;  // In centimeters
    private double height;  // In centimeters
    private double bodyLength;  // In centimeters
    private double weight;  // In kilograms
    
    // Constructor
    public Monkey(String name, String species, String gender, double weight, double tailLength, double height, double bodyLength,
                  String acquisitionDate, String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry) {
        // Using default constructor of RescueAnimal
        super();
        
        // Use setter to set inherited attributes
        setName(name);
        setGender(gender);  // Now correctly passing gender as a parameter
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        
        // Setting Monkey-specific attributes
        this.species = species;
        this.weight = weight;
        this.tailLength = tailLength;
        this.height = height;
        this.bodyLength = bodyLength;
    }
    
    // Setter and Getters for monkey attributes
    
    public String getSpecies() {
        return species;
    }
    
    public void setSpecies(String species) {
        this.species = species;
    }
    
    public double getTailLength() {
        return tailLength;
    }
    
    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getBodyLength() {
        return bodyLength;
    }
    
    public void setBodyLength(double bodyLength) {
        this.bodyLength = bodyLength;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    // A way to display information about the monkey
    @Override
    public String toString() {
        return "Name: " + getName() +
               "\nSpecies: " + species +
               "\nGender: " + getGender() +  // Gender is inherited from RescueAnimal
               "\nAge: " + getAge() +        // Age is inherited from RescueAnimal
               "\nWeight: " + weight +
               "\nTail Length: " + tailLength +
               "\nHeight: " + height +
               "\nBody Length: " + bodyLength +
               "\nAcquisition Date: " + getAcquisitionDate() +
               "\nAcquisition Country: " + getAcquisitionLocation() +
               "\nTraining Status: " + getTrainingStatus() +
               "\nReserved: " + getReserved() +
               "\nIn-Service Country: " + getInServiceLocation();
    }
}
