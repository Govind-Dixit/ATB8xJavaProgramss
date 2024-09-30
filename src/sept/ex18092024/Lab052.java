package sept.ex18092024;

public class Lab052 {
    public static void main(String[] args) {
        //GST= 18.45
        int course = 100;
        float gst = 18.45f;
        //int total_price = course+gst;// narrowing implicit - by jvm invalid
        // float total_price = course+gst;

       // int total_price = course+(int)gst; // Narrowing - explicit - loss
       // System.out.println(total_price);

    }

}
