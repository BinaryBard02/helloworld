public class Student extends Person {
    String Classname;
    int studentid;
    Student(){
        Classname="";
        studentid=0;

    }


    @Override
    public String toString() {
        return Classname+" "+studentid;

    }
}
