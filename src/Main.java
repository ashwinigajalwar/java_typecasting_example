public class Main {
    public static void main(String[] args) {

        Holder<?>[] holders = new Holder[3];

        holders[0]= new Holder<>(new Person("Diya",30));
        holders[1]= new Holder<>(new Employee("Ashwini",25,32000));
        holders[2]=new Holder<>(new Student("Ashish",28,'A'));

        for (Holder<?> holder : holders) {
            Object object=holder.getObj();

            if (object instanceof Person){
                Person person=(Person)object;
                System.out.println(person);
            }
            else if (object instanceof Employee){
                Employee employee=(Employee)object;
                System.out.println(employee);
            }
            else if (object instanceof Student) {
                Student student=(Student)object;
                System.out.println(student);

            }
        }


    }
}
