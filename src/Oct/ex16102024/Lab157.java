package Oct.ex16102024;

public class Lab157 {
    public static void main(String[] args) {

        System.out.println(color.Blue.getHexcode());
        System.out.println(color.Red.getHexcode());

        if (color.Blue.getHexcode()=="#4477FF"){
            System.out.println("color is blue");
        }
    }

}

enum color{

    Red("#FF0000"),
    Green("#3377FF"),
    Blue("#4477FF");


    private String hexcode;

   private color (String hexcode){//constracter
        this.hexcode = hexcode;

    }

    public String getHexcode() {// getter for colorcode
        return hexcode;
    }
}

