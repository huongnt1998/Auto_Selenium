package BT_Java_Oop3.common;

public class BaseTest {

    //Tạo hàm createDriver
    public void createDriver(){

        //hiển thị thông tin: Browser, Report, Headless
        System.out.println("Browser: " +Constants.browser);
        System.out.println("Report: " +Constants.report);
        System.out.println("Headless:" +Constants.headless);

    }

    //Tạo hàm closeDriver
    public void closeDriver(){
        //hiển thị thông tin "Closed browser: " + browser và truyền Browser vào
        System.out.println("Closed browser: " +Constants.browser);
    }
}
