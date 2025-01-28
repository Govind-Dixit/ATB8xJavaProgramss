package Oct.ex023102024_exception;

public class Lab183_custom_Execption {

    public static void main(String[] args) {
        Bank sbi = new Bank ("Inr", 100);
        Bank icici = new Bank ("Inr",100);
        Bank jp_chase = new Bank ("USD",100);
        System.out.println(sbi.add(icici));
        System.out.println(sbi.add(jp_chase));


    }
}
