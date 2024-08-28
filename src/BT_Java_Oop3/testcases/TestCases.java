package BT_Java_Oop3.testcases;

import BT_Java_Oop3.common.BaseTest;
import BT_Java_Oop3.common.Constants;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class TestCases extends BaseTest {

    public void TC_Login(){
        //gọi hàm createDriver()
        createDriver();
        //Steps
        System.out.println("1. Open URl 'https://cms.anhtester.com/login' ");
        System.out.println("2. Enter Username 'admin@example.com' ");
        System.out.println("3. Enter Password '123456'");
        System.out.println("4. Click Login button");
        //gọi hàm closeDriver()
        closeDriver();
    }

    public void TC_AddCatagory(){

        createDriver();
        System.out.println("1. click on the Products menu");
        System.out.println("2. Click on the Category sub-menu");
        System.out.println("3. Click Add New catagory button");
        System.out.println("4. Fill in Catagory Information page");
        System.out.println("5. Click Save button");
        System.out.println("6. Verify notification 'Category has been inserted successfully' ");
        closeDriver();

    }

    public static void main(String[] args) {
        Constants.browser = "Chrome";
        Constants.report = true;
        Constants.headless = true;
        // khởi tạo 1 đối tượng
        TestCases TC = new TestCases();
        //Running testcase Login
        System.out.println("Running testcase login: ");
        TC.TC_Login();
        System.out.println("-----------------------------");
        System.out.println("Running testcase Add Catagory: ");
        TC.TC_AddCatagory();
    }
}
