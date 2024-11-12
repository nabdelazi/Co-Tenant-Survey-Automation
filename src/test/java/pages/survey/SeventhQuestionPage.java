package pages.survey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeventhQuestionPage {

	WebDriver driver;

	public SeventhQuestionPage(WebDriver driver) {

		this.driver = driver;

	}

	By ClickTab = By.xpath("//input[@class='v-field__input']");
	By ConcludeSurvey = By.xpath("//button[.='Conclude survey (after confirmation)']");

	public void SeventhQuesText() {

		String SeventhQues = driver.findElement(By.xpath("//strong[@class='q-text']")).getText();

		if (SeventhQues.equals("7. Please share any other related comments below")) {
			System.out.println("PASSED  -  Question is visible correctly");
		} else {
			System.out.println("FAILED  -  Question is NOT visible correctly");

		}

	}

	public void TypeAComment() {
		driver.findElement(ClickTab).click();
		driver.findElement(ClickTab).sendKeys("Test Test");
	}

	public void AfterConfirmation() {
		driver.findElement(ConcludeSurvey).click();
	}
}
