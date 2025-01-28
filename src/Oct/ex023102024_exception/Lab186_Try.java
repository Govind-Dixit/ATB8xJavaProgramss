package Oct.ex023102024_exception;

public class Lab186_Try {

    public static void main(String[] args) {
        try {
            int c =  10/0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //  if (condition) // handling?
    }
}

