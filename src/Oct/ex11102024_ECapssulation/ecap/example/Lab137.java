package Oct.ex11102024_ECapssulation.ecap.example;

public class Lab137 {
    public static void main(String[] args) {

        ICICIBank amit = new ICICIBank("Amit", 100);
        //amit.bal = 100000;
        //amit.setBal(100000);

        // This should allowed to only admin

        // write a code to connect with mysql
        // admin

        //public static void main (String[]args){
            //ICICIBank amit = new ICICIBank("Amit", 100);
            // amit.bal = 10000; private name
            // amit.setBal(10000000);

            // This should allowed to only Admin

            // Write a code to connect with mySQL
            //  Admin
            boolean are_you_admin = true;
            ICICIBank admin = new ICICIBank("admin", 1000);
            admin.setBal(50000, true);
//        admin.setBal(50000,false);
            System.out.println(admin.getName(are_you_admin));


        }
    }
