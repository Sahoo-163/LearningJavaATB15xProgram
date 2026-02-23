package EX_24_Enums;

public class Testing_ENV_Mainmehtod {
    public static void main(String[] args) {
        System.out.println(TestingEnvironments.QA.get_Baseurl());
        System.out.println(TestingEnvironments.DEV.get_Baseurl());
        if (TestingEnvironments.QA.get_Baseurl().equalsIgnoreCase("https://www.QA.com/")){
            System.out.println( "Start my testing");
        }
    }
}
