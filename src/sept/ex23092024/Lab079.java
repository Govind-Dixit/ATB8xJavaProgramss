package sept.ex23092024;

public class Lab079 {
    public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> execute chrome
        // firefox -> execute of firefox
        // edge -> edge cases.

        String browser = "opera";

        switch (browser) {
            case "crome":
                System.out.println("starting the crome browser");
                // Further code to start the Chrome
                // Webdriver driver = new Chrome(); // Selenium Code
                break;
            case "firefox":
                System.out.println("starting the firefox browser");
                // Further code to start the Firefox
                // Webdriver driver = new Firfox(); // Selenium Code
                break;
            case "edge":
                System.out.println("starting the edge browser");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;


        }

    }
}