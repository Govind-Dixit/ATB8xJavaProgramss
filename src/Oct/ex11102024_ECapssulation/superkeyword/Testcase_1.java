package Oct.ex11102024_ECapssulation.superkeyword;

public class Testcase_1 extends Baseclass{

    // TestCase is a type of baseclass - single inheritance

    Testcase_1 (){
        super(); // Default constrector called parent
        this.setBrowser("edge",true);
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser, isAuth);
    }
}
