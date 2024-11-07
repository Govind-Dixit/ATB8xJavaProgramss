package Oct.ex14102024_abstraction;

import javax.xml.transform.Source;

public class firefoxtc extends baseclass{

    @Override
    void openBrowser(String browser) {
        System.out.println("open the firefox");
    }

    @Override
    void closeBrowser(String browser) {
        System.out.println("close the firefox");
    }
}
