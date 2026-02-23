package EX_24_Enums;

public class Automation_ENUMS {
    public static void main(String[] args) {
        Locators s = Locators.input_submit;
        System.out.println(s);
        Locators s1 = Locators.input_email;
        System.out.println(s1);
        Locators s2 = Locators.input_password;
        System.out.println(s2);
        System.out.println(Locators.input_submit.getLocator());


    }
}

enum Locators{
    input_email("httsp://username.com"),
    input_password("https://password.com"),
    input_submit("https://Submit.com");

    private final String locator;

    Locators( String LOCATOR){
        this.locator= LOCATOR;

    }

    public String getLocator() {
        return this.locator;
    }
}