//Holder class that can store objects of any type
public class Holder <T>{
    T obj;

    //Constructor
    public Holder(T obj) {
        this.obj = obj;
    }

    //Method to get object
    public T getObj() {
        return obj;
    }
}
