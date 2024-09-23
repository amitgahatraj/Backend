package AssignmentOOP;

import java.time.LocalDate;

class Petition {
    private String petitionId;
    private String name;
    private LocalDate dateRegistered;
    private String location;
    private String city;
    private String problemDescription;
    private String status;

    // Constructor
    public Petition(String petitionId, String name, LocalDate dateRegistered, String location, String city, String problemDescription, String status) {
        this.petitionId = petitionId;
        this.name = name;
        this.dateRegistered = dateRegistered;
        this.location = location;
        this.city = city;
        this.problemDescription = problemDescription;
        this.status = status;
    }

    // Getters
    public String getPetitionId() {
        return petitionId;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateRegistered() {
        return dateRegistered;
    }

    public String getLocation() {
        return location;
    }

    public String getCity() {
        return city;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Petition ID: " + petitionId + ", Name: " + name + ", Date Registered: " + dateRegistered +
                ", Location: " + location + ", City: " + city + ", Problem Description: " + problemDescription +
                ", Status: " + status;
    }
}

// Child class FinancialPetition
class FinancialPetition extends Petition {
    private double amountInvolved;

    // Constructor
    public FinancialPetition(String petitionId, String name, LocalDate dateRegistered, String location, String city, String problemDescription, String status, double amountInvolved) {
        super(petitionId, name, dateRegistered, location, city, problemDescription, status);
        this.amountInvolved = amountInvolved;
    }

    // Getter
    public double getAmountInvolved() {
        return amountInvolved;
    }

    @Override
    public String toString() {
        return super.toString() + ", Amount Involved: " + amountInvolved;
    }
}

// Child class NonFinancialPetition
class NonFinancialPetition extends Petition {
    private String citizenName;
    private LocalDate implementationDate;

    // Constructor
    public NonFinancialPetition(String petitionId, String name, LocalDate dateRegistered, String location, String city, String problemDescription, String status, String citizenName, LocalDate implementationDate) {
        super(petitionId, name, dateRegistered, location, city, problemDescription, status);
        this.citizenName = citizenName;
        this.implementationDate = implementationDate;
    }

    // Getters
    public String getCitizenName() {
        return citizenName;
    }

    public LocalDate getImplementationDate() {
        return implementationDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Citizen Name: " + citizenName + ", Implementation Date: " + implementationDate;
    }
}

// Main class to demonstrate the functionality
class MainPetition {
    public static void main(String[] args) {
        // Create instances of petitions
        FinancialPetition financialPetition = new FinancialPetition("FP123", "Funding Request", LocalDate.now(), "123 Main St", "Metropolis", "Request for funding for community project", "Pending", 5000.00);
        NonFinancialPetition nonFinancialPetition = new NonFinancialPetition("NFP456", "Road Safety Petition", LocalDate.now(), "456 Elm St", "Gotham", "Petition for better road safety measures", "In Progress", "John Doe", LocalDate.of(2023, 12, 1));

        // Print petition details
        System.out.println(financialPetition);
        System.out.println(nonFinancialPetition);
    }
}
