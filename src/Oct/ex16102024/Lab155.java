package Oct.ex16102024;

public class Lab155 {

    public static void main(String[] args) {

        ATB s1 = new ATB("Amit");
        ATB s2 = new ATB ("Suraj");
        ATB s3 = new ATB ("Tushar");
        ATB s4 = new ATB ("Balam");
        ATB s5;
        new ATB ("Pramod");
        s1.readdocument();
        s2.readdocument();
        ATB.doAssignment();

    }




}


class ATB {

    {

        System.out.println("IIB");
        // what is the purpose?
        // Here you can write code releted to
        // start a website or anything before starting the
        // web automation or api automation
        System.out.println(" Reading the CSV file");

    }

    static {

        System.out.println("load the class I will excute");
    }

    private String name;
    private String phone;
    static String course_name= "ATB8X";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public ATB (String name){
        this.name = name;

    }

    void readdocument(){
        System.out.println("non static method");
        System.out.println(course_name);
    }

    static void doAssignment(){
        //System.out.println(phone); we cannot use phone as this is not difine

        System.out.println("do Assignment");
    }

    static class genAI {

        // not use in automation
    }

}