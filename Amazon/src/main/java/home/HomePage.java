package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.IOException;

public class HomePage extends CommonAPI {

    public void searchInputBox()throws Exception {
       typeByCss("#twotabsearchtextbox","iphone");

       //captureScreenshot(driver,"picture1");

    }
}
