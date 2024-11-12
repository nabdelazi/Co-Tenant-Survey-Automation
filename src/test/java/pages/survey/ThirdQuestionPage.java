package pages.survey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThirdQuestionPage {
	WebDriver driver;

	public ThirdQuestionPage(WebDriver driver) {

		this.driver = driver;
	}

	// By ThirdQues = By.xpath("//strong[@class='q-text']");
	By ChooseYes = By.id("input-41");
	By ChooseNo = By.xpath("//input[@value='No']");
	By HowMany = By.xpath("//input[@class='v-field__input']");
	By NextForthQues = By.xpath("//button[.='Next Question']");

	public void ThirdQuesText() {

		String ThirdQues = driver.findElement(By.xpath("//strong[@class='q-text']")).getText();

		if (ThirdQues.equals("3. Are there any other vacancies in the center?")) {
			System.out.println("PASSED  -  Third question is visible correctly");
		} else {
			System.out.println("FAILED  -  Question is NOT visible correctly");

		}
	}

	public void ClickYes() {

		driver.findElement(ChooseYes).click();
	}

	public void VacanciesNum(String Vacancies) {

		driver.findElement(HowMany).click();

		driver.findElement(HowMany).sendKeys(Vacancies);

	}

	public void ClickNo() {

		driver.findElement(ChooseNo).click();
	}

	public void NForthQues() {

		driver.findElement(NextForthQues).click();
	}

}
