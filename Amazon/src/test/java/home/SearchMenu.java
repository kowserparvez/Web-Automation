package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchMenu extends HomePage {
    @Test
    public void test1() throws Exception {
       // driver.getTitle();
        //driver.findElement(By.xpath("")).click();
        searchInputBox();
    }
}
