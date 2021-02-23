package oops;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulation Gorge=new Encapsulation();
        System.out.println(Gorge.getFirstName());
        System.out.println(Gorge.getLastName());
        System.out.println(Gorge.getAge());
        System.out.println(Gorge.getSsn());
        Gorge.setFirstName("Forkan");
        System.out.println(Gorge.getFirstName());

    }


}
