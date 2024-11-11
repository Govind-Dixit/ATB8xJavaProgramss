package Oct.ex16102024;

abstract class Book {



    protected String name;
    protected String author;
    protected double price;

    public Book(String author, double price, String name) {
        this.author = author;
        this.price = price;
        this.name = name;
    }

    abstract void getDetails();




}
