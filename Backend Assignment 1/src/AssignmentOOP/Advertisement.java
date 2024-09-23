package AssignmentOOP;

class Advertisement {
    private String advertisementId;
    private String adDescription;

    // Constructor
    public Advertisement(String advertisementId, String adDescription) {
        this.advertisementId = advertisementId;
        this.adDescription = adDescription;
    }

    // Getters
    public String getAdvertisementId() {
        return advertisementId;
    }

    public String getAdDescription() {
        return adDescription;
    }

    @Override
    public String toString() {
        return "Advertisement ID: " + advertisementId + ", Description: " + adDescription;
    }
}

// Child class MatrimonialAdvertisement
class MatrimonialAdvertisement extends Advertisement {
    private String gender;
    private int age;
    private String occupation;

    // Constructor
    public MatrimonialAdvertisement(String advertisementId, String adDescription, String gender, int age, String occupation) {
        super(advertisementId, adDescription);
        this.gender = gender;
        this.age = age;
        this.occupation = occupation;
    }

    // Getters
    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    @Override
    public String toString() {
        return super.toString() + ", Gender: " + gender + ", Age: " + age + ", Occupation: " + occupation;
    }
}

// Child class RealEstateAdvertisement
class RealEstateAdvertisement extends Advertisement {
    private String realEstateType;
    private double size; // Size in square feet
    private double price;

    // Constructor
    public RealEstateAdvertisement(String advertisementId, String adDescription, String realEstateType, double size, double price) {
        super(advertisementId, adDescription);
        this.realEstateType = realEstateType;
        this.size = size;
        this.price = price;
    }

    // Getters
    public String getRealEstateType() {
        return realEstateType;
    }

    public double getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return super.toString() + ", Real Estate Type: " + realEstateType + ", Size: " + size + " sqft, Price: $" + price;
    }
}

// Main class to demonstrate the functionality
class MainAdvertisement {
    public static void main(String[] args) {
        // Create instances of advertisements
        MatrimonialAdvertisement matrimonialAd = new MatrimonialAdvertisement("MA123", "Looking for a life partner.", "Female", 28, "Software Engineer");
        RealEstateAdvertisement realEstateAd = new RealEstateAdvertisement("RE456", "2BHK Apartment for sale.", "Apartment", 1200, 250000);

        System.out.println(matrimonialAd);
        System.out.println(realEstateAd);
    }
}
