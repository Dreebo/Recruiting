package web.page;

        import driver.WebDriverSingleton;
        import org.openqa.selenium.WebDriver;
        import web.element.CreateCandidate;



public class CreateCandidatePage {
    WebDriver driver = WebDriverSingleton.getInstance();

    public void enterCreateCandidate() {
        driver.get(CreateCandidate.URL);
    }

    public void clickCreate(){
        CreateCandidate.CREATE.click();
    }

    public void typeSName(String s_name ){
        CreateCandidate.S_NAME.type(s_name);
    }

    public void typeFName(String f_name){
        CreateCandidate.F_NAME.type(f_name);
    }

    public void typeSecName(String sec_name){
        CreateCandidate.SEC_NAME.type(sec_name);
    }

    public void typePhone(String phone){
        CreateCandidate.PHONE.type(phone);
    }

    public void typeMail(String mail){
        CreateCandidate.E_MAIL.type(mail);
    }

    public void typeSkype(String skype){
        CreateCandidate.SKYPE.type(skype);
    }

    public void typeCountry(String country){
        CreateCandidate.COUNTRY.type(country);
    }

    public void typePosition(String position){
        CreateCandidate.POSITION.type(position);
    }

    public void typeAdditional(String additional){
        CreateCandidate.ADDITIONAL.type(additional);
    }

    public void clickSave(){
        CreateCandidate.SAVE.click();
    }

    public void enterBackCandidate() {
        driver.get(CreateCandidate.BACK_URL);
    }
}
