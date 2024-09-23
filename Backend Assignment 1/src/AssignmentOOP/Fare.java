package AssignmentOOP;

// Parent class Fare
abstract class Fare {
    protected String origin;
    protected String destination;
    protected double fare;

    // Constructor
    public Fare(String origin, String destination, double fare) {
        this.origin = origin;
        this.destination = destination;
        this.fare = fare;
    }

    // Abstract method to calculate fare
    public abstract void calculateFare();

    // Method to print fare details
    public void printFare() {
        System.out.println("Origin: " + origin + " -> Destination: " + destination + " | Fare: " + fare);
    }
}

// Child class SeasonalPass (10% discount)
class SeasonalPass extends Fare {

    public SeasonalPass(String origin, String destination, double fare) {
        super(origin, destination, fare);
    }

    @Override
    public void calculateFare() {
        fare = fare - (fare * 0.10); // Apply 10% discount
    }
}

// Child class OneTime (no discount)
class OneTime extends Fare {

    public OneTime(String origin, String destination, double fare) {
        super(origin, destination, fare);
    }

    @Override
    public void calculateFare() {
        // No discount, fare remains the same
    }
}

// Child class FreePass (free fare for freedom fighters)
class FreePass extends Fare {

    public FreePass(String origin, String destination) {
        super(origin, destination, 0);
    }

    @Override
    public void calculateFare() {
        fare = 0; // No fare
    }
}

// Child class StudentSeasonalPass (30% discount, extends SeasonalPass)
class StudentSeasonalPass extends SeasonalPass {

    public StudentSeasonalPass(String origin, String destination, double fare) {
        super(origin, destination, fare);
    }

    @Override
    public void calculateFare() {
        fare = fare - (fare * 0.30); // Apply 30% discount
    }
}

// GeneralPass class to be extended by ChildPass, AdultPass, PhysicallyHandicappedPass, and SeniorsPass
abstract class GeneralPass extends Fare {

    public GeneralPass(String origin, String destination, double fare) {
        super(origin, destination, fare);
    }
}

// Child class ChildPass (50% discount, extends GeneralPass)
class ChildPass extends GeneralPass {

    public ChildPass(String origin, String destination, double fare) {
        super(origin, destination, fare);
    }

    @Override
    public void calculateFare() {
        fare = fare * 0.50; // Apply 50% discount (half ticket)
    }
}

// Child class AdultPass (no discount, extends GeneralPass)
class AdultPass extends GeneralPass {

    public AdultPass(String origin, String destination, double fare) {
        super(origin, destination, fare);
    }

    @Override
    public void calculateFare() {
        // No discount, fare remains the same
    }
}

// Child class PhysicallyHandicappedPass (40% discount, extends GeneralPass)
class PhysicallyHandicappedPass extends GeneralPass {

    public PhysicallyHandicappedPass(String origin, String destination, double fare) {
        super(origin, destination, fare);
    }

    @Override
    public void calculateFare() {
        fare = fare - (fare * 0.40); // Apply 40% discount
    }
}

// Child class SeniorsPass (60% discount, extends GeneralPass)
class SeniorsPass extends GeneralPass {

    public SeniorsPass(String origin, String destination, double fare) {
        super(origin, destination, fare);
    }

    @Override
    public void calculateFare() {
        fare = fare - (fare * 0.60); // Apply 60% discount
    }
}

// Main class to demonstrate the functionality
class MainFare {
    public static void main(String[] args) {
        // SeasonalPass (10% discount)
        SeasonalPass seasonalPass = new SeasonalPass("City A", "City B", 100);
        seasonalPass.calculateFare();
        seasonalPass.printFare(); // Fare: 90.0

        // OneTime (no discount)
        OneTime oneTimePass = new OneTime("City A", "City B", 100);
        oneTimePass.calculateFare();
        oneTimePass.printFare(); // Fare: 100.0

        // FreePass (no fare)
        FreePass freePass = new FreePass("City A", "City B");
        freePass.calculateFare();
        freePass.printFare(); // Fare: 0.0

        // StudentSeasonalPass (30% discount)
        StudentSeasonalPass studentPass = new StudentSeasonalPass("City A", "City B", 100);
        studentPass.calculateFare();
        studentPass.printFare(); // Fare: 70.0

        // ChildPass (50% discount)
        ChildPass childPass = new ChildPass("City A", "City B", 100);
        childPass.calculateFare();
        childPass.printFare(); // Fare: 50.0

        // AdultPass (no discount)
        AdultPass adultPass = new AdultPass("City A", "City B", 100);
        adultPass.calculateFare();
        adultPass.printFare(); // Fare: 100.0

        // PhysicallyHandicappedPass (40% discount)
        PhysicallyHandicappedPass handicappedPass = new PhysicallyHandicappedPass("City A", "City B", 100);
        handicappedPass.calculateFare();
        handicappedPass.printFare(); // Fare: 60.0

        // SeniorsPass (60% discount)
        SeniorsPass seniorsPass = new SeniorsPass("City A", "City B", 100);
        seniorsPass.calculateFare();
        seniorsPass.printFare(); // Fare: 40.0
    }
}

