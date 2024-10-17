public class Person {

    String name;
    int age;

    //Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //we are using this method to print name and age
    public String toString() {
        return "Name:"+ name+",Age:"+ age;
    }
}
