package AssignmentOOP;

// Define IMobile interface
interface IMobile {
    void dial(String mobileNo);
    void receive();
    void sendMessage(String message);
    void connectBluetooth(String deviceName);
}

// Define ITelephone interface
interface ITelephone {
    void dial(String phoneNo);
    void receive();
}

// Base Mobile class implementing IMobile and ITelephone
abstract class Mobile implements IMobile, ITelephone {
    protected String IEMICode;
    protected boolean isSingleSIM;
    protected String processor;
    protected String SIMCard;
    protected String mobileNo;

    // Constructor
    public Mobile(String IEMICode, boolean isSingleSIM, String processor, String SIMCard, String mobileNo) {
        this.IEMICode = IEMICode;
        this.isSingleSIM = isSingleSIM;
        this.processor = processor;
        this.SIMCard = SIMCard;
        this.mobileNo = mobileNo;
    }

    // Implementing dial from IMobile and ITelephone (same method)
    @Override
    public void dial(String number) {
        System.out.println("Dialing number: " + number + " from mobile number: " + this.mobileNo);
    }

    // Implementing receive
    @Override
    public void receive() {
        System.out.println("Receiving a call on: " + this.mobileNo);
    }

    // Implementing sendMessage
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message: " + message + " from mobile number: " + this.mobileNo);
    }

    // Implementing connectBluetooth
    @Override
    public void connectBluetooth(String deviceName) {
        System.out.println("Connecting to Bluetooth device: " + deviceName);
    }

    // Get IEMI code
    public String getIEMICode() {
        return IEMICode;
    }

    // Abstract method to get WiFi connection (to be implemented by child classes)
    public abstract void getWIFIConnection();
}

// Samsung class extending Mobile
class Samsung extends Mobile {
    public Samsung(String IEMICode, boolean isSingleSIM, String processor, String SIMCard, String mobileNo) {
        super(IEMICode, isSingleSIM, processor, SIMCard, mobileNo);
    }

    @Override
    public void getWIFIConnection() {
        System.out.println("Connecting to WiFi using Samsung");
    }
}

// Nokia class extending Mobile
class Nokia extends Mobile {
    public Nokia(String IEMICode, boolean isSingleSIM, String processor, String SIMCard, String mobileNo) {
        super(IEMICode, isSingleSIM, processor, SIMCard, mobileNo);
    }

    @Override
    public void getWIFIConnection() {
        System.out.println("Connecting to WiFi using Nokia");
    }
}

// IPhone class extending Mobile
class IPhone extends Mobile {
    public IPhone(String IEMICode, boolean isSingleSIM, String processor, String SIMCard, String mobileNo) {
        super(IEMICode, isSingleSIM, processor, SIMCard, mobileNo);
    }

    @Override
    public void getWIFIConnection() {
        System.out.println("Connecting to WiFi using iPhone");
    }
}

// Samsung S5 class extending Samsung
class SamsungS5 extends Samsung {
    public SamsungS5(String IEMICode, boolean isSingleSIM, String processor, String SIMCard, String mobileNo) {
        super(IEMICode, isSingleSIM, processor, SIMCard, mobileNo);
    }

    @Override
    public void getWIFIConnection() {
        System.out.println("Connecting to WiFi using Samsung S5");
    }
}

// Nokia Lumia625 class extending Nokia
class NokiaLumia625 extends Nokia {
    public NokiaLumia625(String IEMICode, boolean isSingleSIM, String processor, String SIMCard, String mobileNo) {
        super(IEMICode, isSingleSIM, processor, SIMCard, mobileNo);
    }

    @Override
    public void getWIFIConnection() {
        System.out.println("Connecting to WiFi using Nokia Lumia 625");
    }
}

// Main class to demonstrate functionality
class MainMobile {
    public static void main(String[] args) {
        // Create Samsung S5 object
        SamsungS5 samsungS5 = new SamsungS5("IEMI12345", true, "Exynos 990", "SIM1", "9876543210");
        samsungS5.dial("1234567890");
        samsungS5.receive();
        samsungS5.sendMessage("Hello from Samsung S5!");
        samsungS5.connectBluetooth("Bluetooth Speaker");
        samsungS5.getWIFIConnection();
        System.out.println("IEMI Code: " + samsungS5.getIEMICode());

        // Create Nokia Lumia625 object
        NokiaLumia625 nokiaLumia = new NokiaLumia625("IEMI54321", false, "Snapdragon 400", "SIM1", "1234567890");
        nokiaLumia.dial("9876543210");
        nokiaLumia.receive();
        nokiaLumia.sendMessage("Hello from Nokia Lumia 625!");
        nokiaLumia.connectBluetooth("Bluetooth Headset");
        nokiaLumia.getWIFIConnection();
        System.out.println("IEMI Code: " + nokiaLumia.getIEMICode());
    }
}

