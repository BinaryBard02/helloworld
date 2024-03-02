import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String[] args){
int a=10;
        Person rishabh=new Person();
        Scanner ob=new Scanner(System.in);
        System.out.print("Please enter Details");
        rishabh.Gender=ob.next();
        rishabh.age=ob.nextInt();
        rishabh.name=ob.next();

       /* rishabh.age=26;
        rishabh.Gender="male";
        rishabh.name="Rishabh";
        Person rajatgoel=new Person();
        rajatgoel.Gender="trans";
        rajatgoel.age=00;
        rajatgoel.name="chakka";*/
   System.out.println(rishabh.toString()+"\n ");
    }
}