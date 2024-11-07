package Oct.ex14102024_abstraction;

public class baseclass extends GrandbaseClass{

    // Webautomation
    // Single
    // Hide the functionality of the open and close Browser

    void openBrowser (String browser){}
    void closeBrowser (String browser){}


    @Override
    void takingscrrenshot() {
        System.out.println("taking scrren shot");
    }
}
