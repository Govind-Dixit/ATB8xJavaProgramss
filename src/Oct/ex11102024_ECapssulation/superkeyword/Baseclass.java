package Oct.ex11102024_ECapssulation.superkeyword;

public class Baseclass {

    private String browser;


    Baseclass() {
        System.out.println("DC - Baseclass");

    }

    ;

    Baseclass(String b) {
        System.out.println("CC - BaseClass");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        } else {
            System.out.println("Not allowed");
        }
    }

    void openBrowser(){
        System.out.println("opning Browser");
    }

    void openBrowser (String browserName){
        System.out.println("open browser !!"+ browserName);

    }

    void closeBrowser(){
        System.out.println("Close Browser!!");
    }

}