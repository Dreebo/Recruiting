package web.page;

import driver.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import web.element.EditApplication;

public class EditApplicationPage {
    WebDriver driver = WebDriverSingleton.getInstance();
    public void enterEditApplicationPage(){

        driver.get(EditApplication.URL);
    }
    public void Candidate(){

        driver.get(EditApplication.URL_1);
    }
    public void clickEdit(){
        EditApplication.EDIT.click();
    }
    public void moveCountry(){
        EditApplication.COUNTRY.moveToElement();
    }
    public void typeCountry(String country ){
        EditApplication.COUNTRY.type(country);
    }
    public void clickAddPhone(){
        EditApplication.ADD_PHONE.click();
    }

    public void typeNumber(String number) {
        EditApplication.NUMBER_PHONE.type(number);

    }
    public void typeBirthday(String birthday){
        EditApplication.BIRTHDAY.type(birthday);
    }
    public void clickSave(){
        EditApplication.SAVE.click();
    }

}
