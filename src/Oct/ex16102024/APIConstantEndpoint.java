package Oct.ex16102024;

public enum APIConstantEndpoint {

    Base_URL("https://app.vwo.com"),
    Login_Page ("https://app.vwo.com/login"),
    DashBord_Page ("https://app.vwo.com/dasHboard"),
    Chatbot_page ("https://app.vwo.com/chat");

    private String name;

    APIConstantEndpoint(String name){
        this.name= name;

    }
    String getvalue(){
        return name;
    }



}
