package Oct.ex16102024;

public class Printmybook extends Book{
    public Printmybook(String author, double price, String name) {
        super(author, price, name);
    }

    @Override
    void getDetails() {
        System.out.println(name);
        System.out.println(author);
        System.out.println(price);

    }
}
