package element;

import driver.WebDriverSingleton;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class Element extends By {
        private String name;
        private By by;

        public Element(String name, By by) {
            this.name = name;
            this.by = by;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public By getBy() {
            return by;
        }

        public void setBy(By by) {
            this.by = by;
        }

        public Boolean isElementPresent() {
            try {
                getWebElement();
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

        public WebElement getWebElement() {
            return WebDriverSingleton.getInstance().findElement(by);
        }

        public void assertPresence() {
            Assert.assertTrue("Элемент " + name + " не существует на странице", isElementPresent());
        }

        public void click() {
            assertPresence();
            getWebElement().click();
        }

        public void doubleClick(){
            WebDriver driver = WebDriverSingleton.getInstance();
            Actions action = new Actions(driver);
            action.doubleClick().perform();
        }

        public void moveToElement(){
            WebDriver driver = WebDriverSingleton.getInstance();
            Actions action = new Actions(driver);
            action.moveToElement(getWebElement()).perform();
        }


        public String getText() {
            assertPresence();
            return getWebElement().getText();
        }

        public void type(String text) {
            assertPresence();
            WebElement element = getWebElement();
            element.clear();
            element.sendKeys(text);
        }


    @Override
    public List<WebElement> findElements(SearchContext searchContext) {
        return null;
    }
}


