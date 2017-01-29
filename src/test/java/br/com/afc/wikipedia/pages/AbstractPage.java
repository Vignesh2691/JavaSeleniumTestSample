package br.com.afc.wikipedia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

	protected static final String BASE_PAGE = "https://en.wikipedia.org/wiki/";
	
	protected WebDriver driver;
	
	public abstract String getPage();
	
    public AbstractPage(WebDriver driver) {
        super();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void goTo() {
    	driver.get(BASE_PAGE + getPage());
    }
    
    public boolean isAt() {
    	return driver.getCurrentUrl().equals(BASE_PAGE + getPage());
    }

}
