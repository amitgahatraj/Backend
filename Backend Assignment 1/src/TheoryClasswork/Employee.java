package TheoryClasswork;

public class Employee {

    private int id;
    private String name;
    private Address address;


    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display()
    {
        System.out.println(id+"    "+name);

        System.out.println(address.city+"\t"+address.state);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Address a=new Address("Hyd","TS","India");
        Address a1=new Address("gno","UP","India");

        Employee e=new Employee(100,"shiva",a);

        Employee e1=new Employee(101,"rani",a1);

        e.display();
        e1.display();



    }

}
