package pages.survey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForthQuestionPage {
	WebDriver driver;

	public ForthQuestionPage(WebDriver driver) {

		this.driver = driver;
	}

	// By ForthQues = By.xpath("//strong[@class='q-text']");
	By AnsYes = By.xpath("//input[@value='Yes']");
	By AnsNo = By.xpath("//input[@value='No']");
	By DropDown = By.cssSelector(".mdi-menu-down");
	By FifthNextQues = By.xpath("//button[.='Next Question']");

	public void ForthQuesText() {

		String ForthQues = driver.findElement(By.xpath("//strong[@class='q-text']")).getText();
		if (ForthQues.equals("4. Does the center have any temporary tenants? (Halloween, Christmas etc…)")) {
			System.out.println("PASSED  -  FORTH question is visible correctly");
		} else {
			System.out.println("FAILED  -  Question is NOT visible correctly");

		}
	}

	public void AnswerYes() {
		driver.findElement(AnsYes).click();
	}

	public void AnswerNo() {
		driver.findElement(AnsNo).click();
	}

	public void DDown() {
		driver.findElement(DropDown).click();
		driver.findElement(DropDown).click();
	}

	public void NFifthQues() {
		driver.findElement(FifthNextQues).click();
	}

}
