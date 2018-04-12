package web.page;

import driver.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import web.element.Comment;
import web.element.DeleteCandidate;

public class CommentPage {
    WebDriver driver = WebDriverSingleton.getInstance();
    public void enterCandidatesPage(){
        driver.get(Comment.URL);}

    public void clickCheckboxNew(){
        Comment.CHECKBOX_NEW.click();}

    public void clickCheckboxMoving(){
        Comment.CHECKBOX_MOVING.click();}

    public void enterCandidates(){
        driver.get(Comment.URL_2);}

    public void clickCandidate(){
        Comment.CANDIDATE.click();}

    public void clickComment(){
        Comment.COMMENT.click();}

    public void typeComment(String comment){
        Comment.INSCRIPTION.type(comment);
    }
    public void clickSave(){
        Comment.SAVE.click();
}
    public void clickDelete(){
        Comment.DELETE.click();
    }


}
