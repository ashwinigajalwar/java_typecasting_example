public class Student extends Person {

    char grade;

    //Constructor
    public Student(String name, int age, char grade) {
        super(name, age);
        this.grade = grade;
    }

    //here we are overriding toString method to include grade
    @Override
    public String toString() {
        return super.toString()+",Grade: "+grade;
    }
}
