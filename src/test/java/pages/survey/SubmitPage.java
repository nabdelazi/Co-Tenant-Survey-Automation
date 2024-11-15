package pages.survey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubmitPage {

	WebDriver driver;

	public SubmitPage(WebDriver driver) {

		this.driver = driver;

	}

	By CompleteSurvey = By.xpath("//button[@class='submit-button']");

	public void CompleteSurv() {

		driver.findElement(CompleteSurvey).click();

	}
}