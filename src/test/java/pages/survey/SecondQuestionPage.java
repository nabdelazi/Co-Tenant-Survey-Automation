package pages.survey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondQuestionPage {

	WebDriver driver;

	public SecondQuestionPage(WebDriver driver) {

		this.driver = driver;

	}

	By No = By.xpath("//input[@value='No']");
	By Yes = By.xpath("//input[@value='Yes']");
	By Tenant = By.xpath(
			"//button[@class='v-btn v-theme--light text-primary v-btn--density-default v-btn--size-default v-btn--variant-text mb-2']");

	By TenantNum = By.xpath("//input[@class='v-field__input']");
	By SaveBn = By.xpath("//button[contains(.,'Save')]");
	By NextThirdQues = By.xpath("//button[.='Next Question']");
	By PreviousQues = By.xpath("//button[@class='previous-question-button']");

	public void SecondQuesText() {

		String SecondQues = driver.findElement(By.xpath("//strong[@class='q-text']")).getText();

		if (SecondQues.equals("2. Have any major anchor tenants vacated?"))

		{
			System.out.println("PASSED  -  Second question is visible correctly");
		} else {
			System.out.println("FAILED  -  Question is NOT visible correctly");

		}
	}

	public void NoAnswer() {

		driver.findElement(No).click();

	}

	public void YesAnswer() {

		driver.findElement(Yes).click();

	}

	public void AddTenant() {
		driver.findElement(Tenant).click();
	}

	public void TenantNumber(String Num) {
		driver.findElement(TenantNum).click();
		driver.findElement(TenantNum).sendKeys(Num);
	}

	public void ClickSave() {

		driver.findElement(SaveBn).click();
	}

	public void NThirdQues() {

		driver.findElement(NextThirdQues).click();
	}

	public void ClickPrevious() {

		driver.findElement(PreviousQues).click();

	}

}
