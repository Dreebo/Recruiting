package web.page;

import driver.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import web.element.Application;


public class ApplicationPage {
    WebDriver driver = WebDriverSingleton.getInstance();

    public void enterApplicationPage() {
        driver.get(Application.URL);
    }
    public void clickCreateApplication() {
        Application.CREAT_APPLICATION.click();
    }
    public void typePosition(String position) {
        Application.POSITION.type(position);
    }
    public void typeQuantity(String quantity){
        Application.QUANTITY.type(quantity);
    }
    public void typeCreationReason(String creation){
        Application.CREATION_REASON.type(creation);
    }
    public void typeSalary(String salary){
        Application.SALARY.type(salary);
    }
    public void typeBusinessTrip(String trip){
        Application.BUSINESS_TRIP.type(trip);
    }
    public void typeTimeWork(String time){
        Application.TIMEWORK.type(time);
    }
    public void typeProbation(String probation){
        Application.PROBATION.type(probation);
    }
    public void typeResponsibilites(String responsibilities){
        Application.RESPONSIBILITIES.type(responsibilities);
    }
    public void typeComment(String comment){
        Application.COMMENT.type(comment);
    }
    public void clickCandidateExternal() {
        Application.CANDIDATE_EXTERNAL.click();
    }
    public void clickCandidateInternal() {
        Application.CANDIDATE_INTERNAL.click();
    }
    public void clickCompetence() {
        Application.COMPETENCE_BUTTON.click();
    }
    public void clickOkCompetence() {
        Application.OK_COMPETENCE_BUTTON.click();
    }
    public void clickSaveButton() {
        Application.SAVE_BUTTON.click();
    }
    public void clickCompetence1() {
        Application.MS_OFFICE.click();
    }
    public void clickCompetence2() {
        Application.MS_EXCEL.doubleClick();
    }

    public void moveCompetence2() {
        Application.MS_EXCEL.moveToElement();
    }
    public void clickAgreement(){
        Application.AGREEMENT.click();
    }
    public void clickPartnerAgreement(){
        Application.PARTNER_AGREEMENT.click();
    }
    public void clickSelectPartner(){
        Application.SELECT_PARTNER.click();
    }
    public void clickPartner(){
        Application.PARTNER.click();
    }
    public void clickApproveButton(){
        Application.APPROVE_BUTTON.click();
    }
    public void clickApprove(){
        Application.APPROVE.click();
    }

    public void clickOkButton(){
        Application.OK_BUTTON.click();
    }
    public void clickCreateVacancy(){
        Application.CREATE_VACANCY_BUTTON.click();
    }
    public void clickAnnul(){
        Application.ANNUL_BUTTON.click();
    }
    public void clickRework(){
        Application.REWORK_BUTTON.click();
    }
    public void clickReject(){
        Application.REJECT_BUTTON.click();
    }
    public void typeCloseDate(String date){
        Application.CLOSE_DATE.type(date);
    }
    public void clickSaveVacancy(){
        Application.SAVE_VACANCY.click();
    }
}
