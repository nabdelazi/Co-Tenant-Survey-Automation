package pages.survey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstQuestionPage {

	WebDriver driver;

	public FirstQuestionPage(WebDriver driver) {

		this.driver = driver;
	}

	By Rosss = By.xpath("//label[.='Ross']");
	By TJMaxxx = By.xpath("//label[.='TJ Maxx']");
	By HomeGoodss = By.xpath("//label[.='HomeGoods']");
	By Marshallss = By.xpath("//label[.='Marshalls']");
	By Michaelss = By.xpath("//label[.='Michaels']");
	By HobbyLobbyy = By.xpath("//label[.='Hobby Lobby']");
	By BestBuyy = By.xpath("//label[.='Best Buy']");
	By DSGG = By.xpath("//label[.=\"Dick's Sporting Goods\"]");
	By Targett = By.xpath("//label[.='Target']");
	By PetSmartt = By.xpath("//label[.='PetSmart']");
	By Otherr = By.xpath("//label[.='Other']");
	By Nonee = By.xpath("//label[.='None']");
	By InputTenants = By.xpath("//input[@class='v-field__input']");
	By NextSecQues = By.xpath("//button[.='Next Question']");

	public void FirstQuesText() {

		String FirstQues = driver.findElement(By.xpath("//strong[@class='q-text']")).getText();

		if (FirstQues.equals(
				"1. Who are the major anchor tenants currently operating in the center? *Select all that apply. If other, enter major tenant when prompted. If none, select None."))

		{
			System.out.println("PASSED  -  First Question is visible correctly");
		} else {
			System.out.println("FAILED  -  First question is NOT visible correctly");
		}

	}

	public void ClickRoss() {

		driver.findElement(Rosss).click();
		String Ross = driver.findElement(By.xpath("//label[.='Ross']")).getText();

		if (Ross.equals("Ross"))

		{
			System.out.println("PASSED  -  Ross is visible");

		} else {
			System.out.println("Ross is NOT visible - Test Failed");
		}

	}

	public void ClickTJMaxx() {

		driver.findElement(TJMaxxx).click();
		String TJMaxx = driver.findElement(By.xpath("//label[.='TJ Maxx']")).getText();

		if (TJMaxx.equals("TJ Maxx"))

		{
			System.out.println("PASSED  -  TJ Maxx is visible");
		} else {
			System.out.println("FAILED  -  THMaxx is NOT visible");
		}

	}

	public void ClickHomeGoods() {

		driver.findElement(HomeGoodss).click();
		String HomeGoods = driver.findElement(By.xpath("//label[.='HomeGoods']")).getText();

		if (HomeGoods.equals("HomeGoods"))

		{
			System.out.println("PASSED  -  HomeGoods is visible");
		} else {
			System.out.println("FAILED  -  HomeGoods is NOT visible");
		}

	}

	public void ClickMarshalls() {

		driver.findElement(Marshallss).click();
		String Marshalls = driver.findElement(By.xpath("//label[.='Marshalls']")).getText();

		if (Marshalls.equals("Marshalls"))

		{
			System.out.println("PASSED  -  Marshalls is visible");
		} else {
			System.out.println("FAILED  -  Marshalls is NOT visible");
		}

	}

	public void ClickMichaels() {

		driver.findElement(Michaelss).click();
		String Michaels = driver.findElement(By.xpath("//label[.='Michaels']")).getText();

		if (Michaels.equals("Michaels"))

		{
			System.out.println("PASSED  -  Michaels is visible");
		} else {
			System.out.println("FAILED  -  Michaels is NOT visible");
		}

	}

	public void ClickHobbyLobby() {

		driver.findElement(HobbyLobbyy).click();
		String HobbyLobby = driver.findElement(By.xpath("//label[.='Hobby Lobby']")).getText();

		if (HobbyLobby.equals("Hobby Lobby"))

		{
			System.out.println("PASSED  -  Hobby Lobby is visible");
		} else {
			System.out.println("FAILED  -  Hobby Lobby is NOT visible");
		}

	}

	public void ClickBestBuy() {

		driver.findElement(BestBuyy).click();
		String BestBuy = driver.findElement(By.xpath("//label[.='Best Buy']")).getText();
		if (BestBuy.equals("Best Buy"))

		{
			System.out.println("PASSED  -  Best Buy is visible");
		} else {
			System.out.println("FAILED  -  Best Buy is NOT visible");
		}

	}

	public void ClickDSG() {

		driver.findElement(DSGG).click();
		String DSG = driver.findElement(By.xpath("//label[.=\"Dick's Sporting Goods\"]")).getText();
		if (DSG.equals("Dick's Sporting Goods"))

		{
			System.out.println("PASSED  -  Dick's Sporting Goods is visible");
		} else {
			System.out.println("FAILED  -  Dick's Sporting Goods is NOT visible");
		}
	}

	public void ClickTarget() {

		driver.findElement(Targett).click();
		String Target = driver.findElement(By.xpath("//label[.='Target']")).getText();
		if (Target.equals("Target"))

		{
			System.out.println("PASSED  -  Target is visible");
		} else {
			System.out.println("FAILED  -  Target is NOT visible");
		}

	}

	public void ClickPetSmart() {

		driver.findElement(PetSmartt).click();
		String PetSmart = driver.findElement(By.xpath("//label[.='PetSmart']")).getText();

		if (PetSmart.equals("PetSmart"))

		{
			System.out.println("PASSED  -  PetSmart is visible");
		} else {
			System.out.println("FAILED  -  PetSmart is NOT visible");
		}

	}

	public void ClickOther() {

		driver.findElement(Otherr).click();
		String Other = driver.findElement(By.xpath("//label[.='Other']")).getText();
		if (Other.equals("Other"))

		{
			System.out.println("PASSED  -  Other is visible");
		} else {
			System.out.println("FAILED  -  Other is NOT visible");
		}

	}

	public void ClickNone() {

		driver.findElement(Nonee).click();
		String None = driver.findElement(By.xpath("//label[.='None']")).getText();

		if (None.equals("None"))

		{
			System.out.println("PASSED  -  None is visible");
		} else {
			System.out.println("FAILED  -  None is NOT visible");
		}
	}

	public void AnchorTenants(String anchTenants) {
		
		driver.findElement(InputTenants).click();
		driver.findElement(InputTenants).sendKeys(anchTenants);
		
	}
	public void NSecQues() {

		driver.findElement(NextSecQues).click();

	}

}
