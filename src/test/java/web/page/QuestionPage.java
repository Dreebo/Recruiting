package web.page;

import driver.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import web.element.Question;

public class QuestionPage {
    WebDriver driver = WebDriverSingleton.getInstance();
    public void enterQuestionPage() {
        driver.get(Question.URL);
    }
    public void enterQuestionPagePersonal() {
        driver.get(Question.URL_PERS);
    }

    public void clickAddQuestion() {
        Question.ADD_QUESTION.click();
    }
    public void typeQuestion(String question){
        Question.FIELD_QUESTION.type(question);
    }
    public void typeAnswer(String answer ){
        Question.QUESTION_ANSWER.type(answer);
    }
    public void typeCompetence(String competence){
        Question.COMPETENCE.type(competence);
    }
    public void clickSave() {
        Question.SAVE_QUESTION.click();
    }
    public void clickCancel() {
        Question.CANCEL.click();
    }
    public void typeSearch(String search){
        Question.SEARCH.type(search);
    }

}

