 package AssignmentOOP;
class Student {
    private String studentId;
    private String name;
    private String mobileNo;
    private String address;
    private String course;

    public Student(String studentId, String name, String mobileNo, String address, String course) {
        setStudentId(studentId);
        setName(name);
        setMobileNo(mobileNo);
        setAddress(address);
        setCourse(course);
    }

    // Getters and setters with validation
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 15) {
            throw new IllegalArgumentException("Name should not be greater than 15 characters.");
        }
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        if (mobileNo.length() != 10 || !mobileNo.matches("\\d+")) {
            throw new IllegalArgumentException("Mobile number should have exactly 10 digits.");
        }
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Default CalculateFee method
    public double calculateFee() {
        switch (course.toLowerCase()) {
            case "computer science":
                return 1000.0;
            case "data science":
                return 1500.0;
            case "business analytics":
                return 1200.0;
            default:
                return 0.0;
        }
    }
}

// FastTrackBatchStudent class
class FastTrackBatchStudent extends Student {
    public FastTrackBatchStudent(String studentId, String name, String mobileNo, String address, String course) {
        super(studentId, name, mobileNo, address, course);
    }

    @Override
    public double calculateFee() {
        return super.calculateFee() + 500.0; // Adding an additional fee for fast track batch
    }
}

// CorporateBatchStudent class
class CorporateBatchStudent extends Student {
    public CorporateBatchStudent(String studentId, String name, String mobileNo, String address, String course) {
        super(studentId, name, mobileNo, address, course);
    }

    @Override
    public double calculateFee() {
        return super.calculateFee() + 1000.0; // Corporate batch has a higher fee
    }
}

// WeekendBatchStudent class
class WeekendBatchStudent extends Student {
    public WeekendBatchStudent(String studentId, String name, String mobileNo, String address, String course) {
        super(studentId, name, mobileNo, address, course);
    }

    @Override
    public double calculateFee() {
        return super.calculateFee() + 200.0; // Weekend batch has a slightly higher fee
    }
}

// CorporateWeekendBatchStudent class
class CorporateWeekendBatchStudent extends Student {
    public CorporateWeekendBatchStudent(String studentId, String name, String mobileNo, String address, String course) {
        super(studentId, name, mobileNo, address, course);
    }

    @Override
    public double calculateFee() {
        return super.calculateFee() + 1200.0; // Corporate weekend batch has the highest fee
    }
}

 class Main {
    public static void main(String[] args) {
        Student s1 = new FastTrackBatchStudent("S001", "John Doe", "1234567890", "New York", "Computer Science");
        System.out.println("FastTrackBatchStudent Fee: " + s1.calculateFee());

        Student s2 = new CorporateBatchStudent("S002", "Jane Smith", "0987654321", "Los Angeles", "Data Science");
        System.out.println("CorporateBatchStudent Fee: " + s2.calculateFee());

        Student s3 = new WeekendBatchStudent("S003", "Alice Johnson", "9876543210", "San Francisco", "Business Analytics");
        System.out.println("WeekendBatchStudent Fee: " + s3.calculateFee());

        Student s4 = new CorporateWeekendBatchStudent("S004", "Bob Brown", "8765432109", "Chicago", "Computer Science");
        System.out.println("CorporateWeekendBatchStudent Fee: " + s4.calculateFee());
    }
}
