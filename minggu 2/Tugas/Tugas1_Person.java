package Tugas;

public class Tugas1_Person {

    String name;
    int age;

    public Tugas1_Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args){
        String fName, lName, stuStatus;
        int stuId;

        fName = "Lisa";
        lName = "Palombo";
        stuStatus = "Active";
        stuId = 123456789;

        System.out.println("Student Name    : " + fName +lName);
        System.out.println("Student Status  : " + stuStatus);
        System.out.println("Student ID      : " + stuId);

    }
}