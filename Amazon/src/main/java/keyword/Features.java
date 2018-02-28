package keyword;

import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import search.ItemsToBeSearched;
import search.SearchPage;

import java.io.IOException;

public class Features extends CommonAPI{
    public void signIn(){
        typeByCss("","userName");
        clickByCss("");
    }
    public void registration(){
        typeByCss("","email");
        clickByCss("");
    }

    public void search() throws IOException, InterruptedException {
        SearchPage searchPage = PageFactory.initElements(driver,SearchPage.class);
        searchPage.searchItemsAndSubmitButton();
    }

    public void select(String featureName) throws IOException, InterruptedException {
        switch(featureName){
            case "signIn":
                signIn();
                break;
            case "registration":
                registration();
                break;
            case "search":
                search();
                break;
            default:
                throw new InvalidArgumentException("invalid choice");
        }
    }

    public void selectFeatures() throws IOException, InterruptedException {
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String [] testSteps = itemsToBeSearched.getDataFromExcelFileForFeaturesChoice();
        for(int i=0; i<testSteps.length; i++) {
            select(testSteps[i]);
        }
    }
}
