package br.com.afc.wikipedia.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikipediaPage extends AbstractPage {

	private static final String WIKI_HOME_PAGE = "Main_Page";

	private WebElement search;

	public WikipediaPage(WebDriver driver) {
		super(driver);
	}

	public static WikipediaPage create(WebDriver driver) {
		return new WikipediaPage(driver);
	}

	public SoftwareTestingPage findArticle() {
		search.sendKeys("Software testing", Keys.ENTER);
		return SoftwareTestingPage.create(driver);
	}

	@Override
	public String getPage() {
		return WIKI_HOME_PAGE;
	}

}
