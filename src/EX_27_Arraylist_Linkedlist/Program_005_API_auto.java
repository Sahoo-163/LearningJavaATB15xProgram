package EX_27_Arraylist_Linkedlist;

import java.util.ArrayList;
import java.util.List;

public class Program_005_API_auto {
    public static void main(String[] args) {
        APIautomation vwologin = new APIautomation("https://app.vwo.com/#/login", "vwoapp");
        APIautomation Katlonlogin = new APIautomation("https://partners.katalon.com/partner/s/login/?", " Katlonlogin");
        APIautomation Decathlonlogin = new APIautomation("https://www.decathlon.in/", "decathlon");

        List<APIautomation> apiautomatiolist = new ArrayList<>();
        apiautomatiolist.add(vwologin);
        apiautomatiolist.add(Katlonlogin);
        apiautomatiolist.add(Decathlonlogin);

        vwologin.printdetails();
        Katlonlogin.printdetails();
        Decathlonlogin.printdetails();


    }
}

class APIautomation{
    private  String urls;
    private  String app_names;

    public APIautomation( String app_urls, String new_app_names ){
        this.app_names = new_app_names;
        this.urls = app_urls;
    }

    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    public String getApp_names() {
        return app_names;
    }

    public void setApp_names(String app_names) {
        this.app_names = app_names;
    }


    public void printdetails(){
        System.out.println("Information :"+ this.app_names + " "+ this.urls);
    }


}