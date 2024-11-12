package pages.survey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartSurveyPage {

	WebDriver driver;

	public StartSurveyPage(WebDriver driver) {
		this.driver = driver;
	}


	By StartSurvey = By.cssSelector(".take-survey");

	
	public void TakeSurvey() {
		driver.findElement(StartSurvey).click();
	}

}
