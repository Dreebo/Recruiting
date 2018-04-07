package web.page;

import driver.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import web.element.DeleteCandidate;

public class DeletePage {
    WebDriver driver = WebDriverSingleton.getInstance();
    public void enterCandidatesPage(){
        driver.get(DeleteCandidate.URL);
    }
    public void typeSearch(String search ){DeleteCandidate.SEARCH.type(search);}
    public void clickButtonSearch(){DeleteCandidate.BUTTON_SEARCH.click();}
    public void clickCandidate(){DeleteCandidate.CANDIDATE.click();}
    public void clickDelete(){DeleteCandidate.DELETE.click();}

}
