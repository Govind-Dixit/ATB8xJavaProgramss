package Oct.ex04102024_constructor;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class Dog {
    String name;
    int age;
    int legs;
    String breed;

    // Default con
    Dog() {

        System.out.println(" Iam DC");
    }


    Dog(String breed) {

        System.out.println(" I am PC");
        this.breed = breed;

    }


    Dog(String name, int age, int legs) {

        System.out.println(" I am PC");
        this.name = name;
        this.age = age;
        this.legs = legs;


    }


    }


