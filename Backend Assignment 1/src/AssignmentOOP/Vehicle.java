package AssignmentOOP;

// Abstract class Vehicle
abstract class Vehicle {
    protected String regNumber;

    // Constructor to initialize registration number
    public Vehicle(String regNumber) {
        this.regNumber = regNumber;
    }

    // Abstract method to get the number of wheels
    public abstract int getNumberOfWheels();

    // Getter for registration number
    public String getRegNumber() {
        return regNumber;
    }

    // Override equals method to compare based on regNumber
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vehicle vehicle = (Vehicle) obj;
        return regNumber.equals(vehicle.regNumber);
    }

    @Override
    public int hashCode() {
        return regNumber.hashCode();
    }
}

// TwoWheeler class extending Vehicle
class TwoWheeler extends Vehicle {

    // Constructor
    public TwoWheeler(String regNumber) {
        super(regNumber);
    }

    // Override method to return 2 wheels
    @Override
    public int getNumberOfWheels() {
        return 2;
    }
}

// ThreeWheeler class extending Vehicle
class ThreeWheeler extends Vehicle {

    // Constructor
    public ThreeWheeler(String regNumber) {
        super(regNumber);
    }

    // Override method to return 3 wheels
    @Override
    public int getNumberOfWheels() {
        return 3;
    }
}

// FourWheeler class extending Vehicle
class FourWheeler extends Vehicle {

    // Constructor
    public FourWheeler(String regNumber) {
        super(regNumber);
    }

    // Override method to return 4 wheels
    @Override
    public int getNumberOfWheels() {
        return 4;
    }
}

// Car class extending FourWheeler
class Car extends FourWheeler {

    // Constructor
    public Car(String regNumber) {
        super(regNumber);
    }
}

// Auto class extending ThreeWheeler
class Auto extends ThreeWheeler {

    // Constructor
    public Auto(String regNumber) {
        super(regNumber);
    }
}

// MotorBike class extending TwoWheeler
class MotorBike extends TwoWheeler {

    // Constructor
    public MotorBike(String regNumber) {
        super(regNumber);
    }
}

// Main class to demonstrate the functionality
class MainVehicle {
    public static void main(String[] args) {
        // Create instances of different vehicles
        Car car = new Car("CAR1234");
        Auto auto = new Auto("AUTO5678");
        MotorBike motorBike = new MotorBike("BIKE9101");

        // Print details of the vehicles
        System.out.println("Car Reg Number: " + car.getRegNumber() + ", Wheels: " + car.getNumberOfWheels());
        System.out.println("Auto Reg Number: " + auto.getRegNumber() + ", Wheels: " + auto.getNumberOfWheels());
        System.out.println("MotorBike Reg Number: " + motorBike.getRegNumber() + ", Wheels: " + motorBike.getNumberOfWheels());

        // Check equality based on registration number
        Car anotherCar = new Car("CAR1234");
        System.out.println("Is car equal to anotherCar? " + car.equals(anotherCar)); // true

        // Check equality for different registration numbers
        System.out.println("Is car equal to motorBike? " + car.equals(motorBike)); // false
    }
}
