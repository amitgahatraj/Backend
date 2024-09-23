package AssignmentOOP;

// Employee class
public class Employee {
    private int empId;
    private double sal;
    private double basic;
    private double allowance;
    private double deductions;
    private String firstName;
    private String lastName;
    private String address;
    private String pincode;

    // Getter and Setter for EmpId
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Getter for Salary (ReadOnly)
    public double getSal() {
        return sal;
    }

    // Setter for Salary (protected so it can be accessed by subclasses)
    protected void setSal(double sal) {
        this.sal = sal;
    }

    // Getter and Setter for Basic
    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    // Getter and Setter for Allowance
    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    // Getter and Setter for Deductions
    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    // Getter and Setter for FirstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for LastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter for Address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and Setter for Pincode
    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    // Method to get Full Name
    public String getRealName() {
        return firstName + " " + lastName;
    }

    public void setRealName(String realName) {
        if (realName.length() == 0) {
            throw new IllegalArgumentException("Real name cannot be less than 0 characters.");
        }
        String[] names = realName.split(" ");
        this.firstName = names[0];
        this.lastName = names.length > 1 ? names[1] : "";
    }

    // Constructor
    public Employee(int empId, double basic, double allowance, double deductions, String firstName, String lastName, String address, String pincode) {
        this.empId = empId;
        this.basic = basic;
        this.allowance = allowance;
        this.deductions = deductions;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.pincode = pincode;
    }

    // Method to calculate salary
    public void calcSalary() {
        setSal(basic + allowance - deductions);
    }
}

// Part-time employee extending Employee class
class PartTimeEmployee extends Employee {

    public PartTimeEmployee(int empId, double basic, double allowance, double deductions, String firstName, String lastName, String address, String pincode) {
        super(empId, basic, allowance, deductions, firstName, lastName, address, pincode);
    }

    @Override
    public void calcSalary() {
        // Assuming part-time employees get half the basic salary
        setSal((getBasic() / 2) + getAllowance() - getDeductions());
    }
}

// Full-time employee class
class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int empId, double basic, double allowance, double deductions, String firstName, String lastName, String address, String pincode) {
        super(empId, basic, allowance, deductions, firstName, lastName, address, pincode);
    }

}

// Night shift employee class (extra allowance for cab)
class NightShiftEmployee extends FullTimeEmployee {
    private double cabAllowance;

    public NightShiftEmployee(int empId, double basic, double allowance, double deductions, double cabAllowance, String firstName, String lastName, String address, String pincode) {
        super(empId, basic, allowance, deductions, firstName, lastName, address, pincode);
        this.cabAllowance = cabAllowance;
    }

    @Override
    public void calcSalary() {
        setSal(getBasic() + getAllowance() + cabAllowance - getDeductions());
    }
}

// Manager class (Full-time and works night shifts)
class Manager extends NightShiftEmployee {

    public Manager(int empId, double basic, double allowance, double deductions, double cabAllowance, String firstName, String lastName, String address, String pincode) {
        super(empId, basic, allowance, deductions, cabAllowance, firstName, lastName, address, pincode);
    }

}

// Main class to demonstrate the functionality
 class MainEmployee {
    public static void main(String[] args) {
        // Full-time employee
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee(1, 5000, 1000, 500, "John", "Doe", "123 Street", "111222");
        fullTimeEmp.calcSalary();
        System.out.println("Full-Time Employee Salary: " + fullTimeEmp.getSal());

        // Part-time employee
        PartTimeEmployee partTimeEmp = new PartTimeEmployee(2, 5000, 1000, 500, "Jane", "Smith", "456 Avenue", "333444");
        partTimeEmp.calcSalary();
        System.out.println("Part-Time Employee Salary: " + partTimeEmp.getSal());

        // Night shift employee
        NightShiftEmployee nightShiftEmp = new NightShiftEmployee(3, 5000, 1000, 500, 200, "Mike", "Johnson", "789 Boulevard", "555666");
        nightShiftEmp.calcSalary();
        System.out.println("Night Shift Employee Salary: " + nightShiftEmp.getSal());

        // Manager
        Manager manager = new Manager(4, 7000, 1500, 800, 300, "Sarah", "Brown", "123 Circle", "777888");
        manager.calcSalary();
        System.out.println("Manager Salary: " + manager.getSal());
    }
}
