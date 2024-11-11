package Oct.ex16102024;

public class Lab153_StaticKeywor {
    public static void main(String[] args) {

        Student s1 = new Student(23);
        Student s2 = new Student(33);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(Student.school_name);
        Student.school_name= "xyz";// we can also change the school name
        System.out.println(Student.school_name);


    }


}

class Student {

    int age ; // Instance Variable (Non Static)
    static String school_name = "ABC";// Static variable

    {
        System.out.println("IIB");
        System.out.println("Here you can write a code what you want to do when objected is created");
        System.out.println("Read mysql db");
    }

    static {

        System.out.println("SIB");

        System.out.println("Loaded once when class is laod");
    }

    public Student(int age) {
        this.age = age;

    }


}