package survey;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BurlSurvey {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
 
		driver.get("https://ew-dwstrsurvey1.win.coat.com:9443/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
		Thread.sleep(1000);
		driver.manage().window().maximize(); 
  
		// insert store number
		Thread.sleep(700);
		driver.findElement(By.id("numericInput")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("numericInput")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("numericInput")).sendKeys("109");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".confirm-store-btn")).click();
		Thread.sleep(700);

		// start survey
		driver.findElement(By.cssSelector(".take-survey")).click();
		Thread.sleep(1000);

		// first question
		System.out.println("FIRST QUESTION"); 
		String firstQuestion = driver.findElement(By.xpath("//strong[@class='q-text']")).getText();

		String Ross = driver.findElement(By.xpath("//label[.='Ross']")).getText();
		String TJMaxx = driver.findElement(By.xpath("//label[.='TJ Maxx']")).getText();
		String HomeGoods = driver.findElement(By.xpath("//label[.='HomeGoods']")).getText();
		String Marshalls = driver.findElement(By.xpath("//label[.='Marshalls']")).getText();
		String Michaels = driver.findElement(By.xpath("//label[.='Michaels']")).getText();
		String HobbyLobby = driver.findElement(By.xpath("//label[.='Hobby Lobby']")).getText();
		String BestBuy = driver.findElement(By.xpath("//label[.='Best Buy']")).getText();
		String DSG = driver.findElement(By.xpath("//label[.=\"Dick's Sporting Goods\"]")).getText();
		String Target = driver.findElement(By.xpath("//label[.='Target']")).getText();
		String PetSmart = driver.findElement(By.xpath("//label[.='PetSmart']")).getText();
		String Other = driver.findElement(By.xpath("//label[.='Other']")).getText();
		String None = driver.findElement(By.xpath("//label[.='None']")).getText();

		driver.findElement(By.id("checkbox-12")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='TJ Maxx']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Target']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Next Question']")).click();

		if (firstQuestion.equals(
				"1. Who are the major anchor tenants currently operating in the center? *Select all that apply. If other, enter major tenant when prompted. If none, select None."))

		{
			System.out.println("PASSED  -  Question is visible correctly");
		} else {
			System.out.println("Question is NOT visible correctly - Test Failed");
		}

		if (Ross.equals("Ross"))

		{
			System.out.println("PASSED  -  Ross is visible");
		} else {
			System.out.println("Ross is NOT visible - Test Failed");
		}

		if (TJMaxx.equals("TJ Maxx"))

		{
			System.out.println("PASSED  -  TJ Maxx is visible");
		} else {
			System.out.println("TJ Maxx is NOT visible - Test Failed");
		}

		if (HomeGoods.equals("HomeGoods"))

		{
			System.out.println("PASSED  -  HomeGoods is visible");
		} else {
			System.out.println("HomeGoods is NOT visible - Test Failed");
		}

		if (Marshalls.equals("Marshalls"))

		{
			System.out.println("PASSED  -  Marshalls is visible");
		} else {
			System.out.println("Marshalls is NOT visible - Test Failed");
		}

		if (Michaels.equals("Michaels"))

		{
			System.out.println("PASSED  -  Michaels is visible");
		} else {
			System.out.println("Michaels is NOT visible - Test Failed");
		}

		if (HobbyLobby.equals("Hobby Lobby"))

		{
			System.out.println("PASSED  -  Hobby Lobby is visible");
		} else {
			System.out.println("Hobby Lobby is NOT visible - Test Failed");
		}

		if (BestBuy.equals("Best Buy"))

		{
			System.out.println("PASSED  -  Best Buy is visible");
		} else {
			System.out.println("Best Buy is NOT visible - Test Failed");
		}

		if (DSG.equals("Dick's Sporting Goods"))

		{
			System.out.println("PASSED  -  Dick's Sporting Goods is visible");
		} else {
			System.out.println("Dick's Sporting Goods is NOT visible - Test Failed");
		}

		if (Target.equals("Target"))

		{
			System.out.println("PASSED  -  Target is visible");
		} else {
			System.out.println("Target is NOT visible - Test Failed");
		}

		if (PetSmart.equals("PetSmart"))

		{
			System.out.println("PASSED  -  PetSmart is visible");
		} else {
			System.out.println("PetSmart is NOT visible - Test Failed");
		}

		if (Other.equals("Other"))

		{
			System.out.println("PASSED  -  Other is visible");
		} else {
			System.out.println("Other is NOT visible - Test Failed");
		}

		if (None.equals("None"))

		{
			System.out.println("PASSED  -  None is visible");
		} else {
			System.out.println("None is NOT visible - Test Failed");
		}

		// second question
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("SECOND QUESTION");

		String secondQuestion = driver.findElement(By.xpath("//strong[@class='q-text']")).getText();

		if (secondQuestion.equals("2. Have any major anchor tenants vacated?"))

		{
			System.out.println("PASSED  -  Question is visible correctly");
		} else {
			System.out.println("Question is NOT visible correctly - Test Failed");
		}

		driver.findElement(By.xpath("//input[@value='No']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Yes']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//button[@class='v-btn v-theme--light text-primary v-btn--density-default v-btn--size-default v-btn--variant-text mb-2']"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='v-field__input']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='v-field__input']")).sendKeys("4");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Next Question']")).click();
		Thread.sleep(1000);

		// third question-inputs
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("THIRD QUESTION");

		String thirdQuestion = driver.findElement(By.xpath("//strong[@class='q-text']")).getText();

		if (thirdQuestion.equals("3. Are there any other vacancies in the center?")) {
			System.out.println("PASSED  -  Question is visible correctly");
		} else {
			System.out.println("Question is NOT visible correctly - Test Failed");

		}

		driver.findElement(By.id("input-41")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='v-field__input']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='v-field__input']")).sendKeys("5");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Next Question']")).click();

		// forth question
		System.out.println("  ");
		System.out.println("  ");

		System.out.println("FORTH QUESTION");

		String forthQuestion = driver.findElement(By.xpath("//strong[@class='q-text']")).getText();

		if (forthQuestion.equals("4. Does the center have any temporary tenants? (Halloween, Christmas etc…)")) {
			System.out.println("PASSED  -  Question is visible correctly");
		} else {
			System.out.println("Question is NOT visible correctly - Test Failed");

		}

		driver.findElement(By.xpath("//input[@value='Yes']")).click();
		Thread.sleep(1000);
		WebElement dropDownElement = driver.findElement(By.xpath(
				"//i[@class='mdi-menu-down mdi v-icon notranslate v-theme--light v-icon--size-default v-select__menu-icon']"));
		Thread.sleep(1000);
		dropDownElement.click();
		Thread.sleep(1000);
		dropDownElement.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Next Question']")).click();
		Thread.sleep(1000);

		// strong[@class='q-text']

		// fifth question
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("FIFTH QUESTION");

		String fifthQuestion = driver.findElement(By.xpath("//strong[@class='q-text']")).getText();

		if (fifthQuestion.equals("5. Does your parking lot have an electric vehicle charging station?")) {
			System.out.println("PASSED  -  Question is visible correctly");
		} else {
			System.out.println("Question is NOT visible correctly - Test Failed");

		}

		driver.findElement(By.xpath("//input[@value='Yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Next Question']")).click();
		Thread.sleep(1000);

		// sixth question

		System.out.println("  ");
		System.out.println("  ");
		System.out.println("SIXTH QUESTION");

		String sixthQuestion = driver.findElement(By.xpath("//strong[@class='q-text']")).getText();

		if (sixthQuestion.equals(
				"6. In the last 12 months have any of the following tenants closed and/or are any currently operating in your center? *Select N/A if tenant has not been in center in the last 12 months.")) {
			System.out.println("PASSED  -  Question is visible correctly");
		} else {
			System.out.println("Question is NOT visible correctly - Test Failed");

		}

		String Macys = driver.findElement(By.xpath("//td[.=\"Macy's\"]")).getText();
		String BBB = driver.findElement(By.xpath("//td[.='Bed, Bath, and Beyond']")).getText();
		String bBuyBaby = driver.findElement(By.xpath("//td[.='Buy Buy Baby']")).getText();
		String christmasTreeShops = driver.findElement(By.xpath("//td[.='Christmas Tree Shops']")).getText();
		String tuesdayMorning = driver.findElement(By.xpath("//td[.='Tuesday Morning']")).getText();
		String riteAid = driver.findElement(By.xpath("//td[.='Rite Aid']")).getText();
		String joannFabrics = driver.findElement(By.xpath("//td[.='Joann Fabrics']")).getText();
		String bigLots = driver.findElement(By.xpath("//td[.='Big Lots']")).getText();
		String jCPenney = driver.findElement(By.xpath("//td[.='JCPenney']")).getText();

		if (Macys.equals("Macy's"))

		{
			System.out.println("PASSED  -  Macy's is visible");
		} else {
			System.out.println("Macy's is NOT visible - Test Failed");
		}

		if (BBB.equals("Bed, Bath, and Beyond"))

		{
			System.out.println("PASSED  -  Bed, Bath, and Beyond is visible");
		} else {
			System.out.println("Bed, Bath, and Beyond is NOT visible - Test Failed");
		}

		if (bBuyBaby.equals("Buy Buy Baby"))

		{
			System.out.println("PASSED  -  Buy Buy Baby is visible");
		} else {
			System.out.println("Buy Buy Baby is NOT visible - Test Failed");
		}

		if (christmasTreeShops.equals("Christmas Tree Shops"))

		{
			System.out.println("PASSED  -  Christmas Tree Shops is visible");
		} else {
			System.out.println("Christmas Tree Shops is NOT visible - Test Failed");
		}

		if (tuesdayMorning.equals("Tuesday Morning"))

		{
			System.out.println("PASSED  -  Tuesday Morning is visible");
		} else {
			System.out.println("Tuesday Morning is NOT visible - Test Failed");
		}

		if (riteAid.equals("Rite Aid"))

		{
			System.out.println("PASSED  -  Rite Aid is visible");
		} else {
			System.out.println("Rite Aid is NOT visible - Test Failed");
		}

		if (joannFabrics.equals("Joann Fabrics"))

		{
			System.out.println("PASSED  -  Joann Fabrics is visible");
		} else {
			System.out.println("Joann Fabrics is NOT visible - Test Failed");
		}

		if (bigLots.equals("Big Lots"))

		{
			System.out.println("PASSED  -  Big Lots is visible");
		} else {
			System.out.println("Big Lots is NOT visible - Test Failed");
		}

		if (jCPenney.equals("JCPenney"))

		{
			System.out.println("PASSED  -  is visible");
		} else {
			System.out.println(" is NOT visible - Test Failed");
		}

		driver.findElement(By.xpath(
				"//tbody[1]//div[@class='v-selection-control v-selection-control--density-default v-checkbox-btn']//input[@name='closed_recently']"))
				.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//tr[2]//input[@name='open_currently']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//tr[3]//input[@name='open_currently']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//tr[4]//input[@name='not_applicable']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//tr[5]//input[@name='open_currently']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//tr[6]//input[@name='open_currently']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//tr[7]//input[@name='not_applicable']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//tr[8]//input[@name='open_currently']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//tr[9]//input[@name='closed_recently']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[.='Next Question']")).click();
		Thread.sleep(1000);

		// Seventh question
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("SEVENTH QUESTION");

		String seventhQuestion = driver.findElement(By.xpath("//strong[@class='q-text']")).getText();

		if (seventhQuestion.equals("7. Please share any other related comments below")) {
			System.out.println("PASSED  -  Question is visible correctly");
		} else {
			System.out.println("Question is NOT visible correctly - Test Failed");

		}

		driver.findElement(By.xpath("//input[@class='v-field__input']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='v-field__input']")).sendKeys("Test Test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Conclude survey (after confirmation)']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='submit-button']")).click();

		// complete survey

		String surveyMsg = driver.findElement(By.xpath("//h2[2]")).getText();

		Thread.sleep(1000);

		if (surveyMsg.equals("Survey submission received!")) {
			System.out.println("Submession Complete");
		} else {
			System.out.println("Msg is incorrect");

		}

		driver.findElement(By.xpath("//button[@class='submit-button']")).click();

		driver.quit();

	}

}
