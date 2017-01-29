package br.com.afc.wikipedia.pages;

import org.openqa.selenium.WebDriver;

public class SoftwareTestingPage extends AbstractPage {

	private static final String SOFTWARE_TESTING_PAGE = "Software_testing";

	public SoftwareTestingPage(WebDriver driver) {
		super(driver);
	}

	public static SoftwareTestingPage create(WebDriver driver) {
		return new SoftwareTestingPage(driver);
	}

	@Override
	public String getPage() {
		return SOFTWARE_TESTING_PAGE;
	}

}
