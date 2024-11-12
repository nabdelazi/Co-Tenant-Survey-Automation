package pages.survey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThankYouPage {
	
	WebDriver driver;

	public ThankYouPage(WebDriver driver) {

		this.driver = driver;

}
	
	
	By StartNew = By.cssSelector(".submit-button");
	
	public void ThankYouText () {
		String ThankU = driver.findElement(By.xpath("//h2[1]")).getText();
		
		if (ThankU.equals("Thank you!")) {
			System.out.println("PASSED  -  Thank you MSG is visible correctly");
		} else {
			System.out.println("Msg is incorrect");

		}
	}

	public void SubmissionText() {
		
	String SubReceived =	driver.findElement(By.xpath("//h2[2]")).getText();
		
		if (SubReceived.equals("Survey submission received!")) {
			System.out.println("Submission Complete");
		} else {
			System.out.println("Msg is incorrect");

		}
	}
	
	public void StartNewSurvey() {
		driver.findElement(StartNew).click();
	}
}
