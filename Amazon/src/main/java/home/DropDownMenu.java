package home;

import base.CommonAPI;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class DropDownMenu extends CommonAPI {
    public List<String> getMenus(){
        TestLogger.log(getClass().getSimpleName()+ " :" +convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> items = new ArrayList<String>();
        items = getTextFromWebElements("#searchDropdownBox option");
        return items;


    }


}
