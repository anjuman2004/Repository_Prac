package oops;

public class Polymorphism {

    public static void main(String[] args) {
       printName();
       printName("Azraf");
       printName( "Azraf", 11);

    }
    public static void printName(){
        System.out.println("Arriya");
    }
    public static void printName(String firstName){
        System.out.println("My name is " + firstName);
    }

    public static void printName(String firstName, int age){
        System.out.println( "My name is " +firstName +" and I am " + age + " years old");



    }






}
