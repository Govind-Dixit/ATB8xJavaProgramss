package Oct.ex11102024_ECapssulation.ecap;

public class Lab136 {

    public static void main(String[] args) {

        vwologinPage vwologin = new vwologinPage ("admin:", "Password");
        System.out.println(vwologin.Password);
        vwologin.Password = "hakar";
        System.out.println(vwologin.Password);

        GoodVwologin vwoLogin1 = new GoodVwologin("admin","Goodpassword");
        //System.out.println(vwoLogin1.password);

        System.out.println(vwoLogin1.getPassword());

        //checking the admin

        boolean isAdmin = false;

        vwoLogin1.setPassword("newpassword",isAdmin);
        System.out.println(vwoLogin1.getPassword());




        }

    }

