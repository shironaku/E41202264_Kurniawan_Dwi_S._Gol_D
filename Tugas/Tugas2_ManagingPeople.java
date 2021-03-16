package Tugas;

public class Tugas2_ManagingPeople {

    public static void main(String[] args) {

        Tugas1_Person p1 = new Tugas1_Person("Arial", 37 );
        Tugas1_Person p2 = new Tugas1_Person("Joseph", 15);

        if (p1.getAge() == p2.getAge())
        {
            System.out.println(p1.getAge() +" is the same age as " + p2.getAge());
        } else {
            System.out.println(p1.getAge() +" is NOT the same as " + p2.getAge());
        }

    }
}
