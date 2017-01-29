package br.com.afc.wikipedia;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.afc.AbstractTest;
import br.com.afc.wikipedia.pages.SoftwareTestingPage;
import br.com.afc.wikipedia.pages.WikipediaPage;

public class TestWikipedia extends AbstractTest {

	@Test
	public void testFindArticle() {
		WikipediaPage wikipediaPage = WikipediaPage.create(driver);
		wikipediaPage.goTo();
		assertTrue("Should be at Wikepedia Home Page", wikipediaPage.isAt());

		SoftwareTestingPage softwareTestingPage = wikipediaPage.findArticle();
		assertTrue("Should be at Software Testing Page", softwareTestingPage.isAt());
	}

}
