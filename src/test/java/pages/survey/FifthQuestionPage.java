package pages.survey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FifthQuestionPage {

	WebDriver driver;

	public FifthQuestionPage(WebDriver driver) {
		this.driver = driver;
	}

	By Y = By.xpath("//input[@value='Yes']");
	By N = By.xpath("//input[@value='No']");
	By NextSixQues = By.xpath("//button[.='Next Question']");

	public void FifthQuesText() {

		String fifthQuestion = driver.findElement(By.xpath("//strong[@class='q-text']")).getText();

		if (fifthQuestion.equals("5. Does your parking lot have an electric vehicle charging station?")) {
			System.out.println("PASSED  -  Fifth question is visible correctly");
		} else {
			System.out.println("FAILED  -  Question is NOT visible correctly");

		}
	}

	public void YY() {
		driver.findElement(Y).click();
	}

	public void NN() {
		driver.findElement(N).click();
	}

	public void NSixthQues() {
		driver.findElement(NextSixQues).click();
	}

}
