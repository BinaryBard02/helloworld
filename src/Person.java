public class Person {
    String name;
    int age;
    String Gender;

    Person(){
        age=0;
        name="";
        Gender="";

    }

    @Override
    public String toString() {
        return age+" "+Gender+" "+name;
    }
}
