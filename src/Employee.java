public class Employee extends Person {

    double salary;

    //Constructor
    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

  //here we are overriding toString method to include salary
    @Override
    public String toString() {
        return super.toString()+",Salary: "+salary;
    }
}
