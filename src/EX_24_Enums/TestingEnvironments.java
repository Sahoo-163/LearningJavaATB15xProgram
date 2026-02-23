package EX_24_Enums;

public enum TestingEnvironments {
    DEV("https://www.dev.com/"),
    QA ("https://www.QA.com/"),
    PROD("https://www.PROD.com/"),
    PRE_PROD("https://www.PRE_PROPD.com/");

    public  String BaseURL;

    TestingEnvironments(String baseurls){
        this.BaseURL = baseurls;
    }

    String get_Baseurl(){
        return this.BaseURL;
    }

}
