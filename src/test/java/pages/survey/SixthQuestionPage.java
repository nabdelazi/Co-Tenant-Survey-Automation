package pages.survey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SixthQuestionPage {

	WebDriver driver;

	public SixthQuestionPage(WebDriver driver) {

		this.driver = driver;

	}

	By MacysClosed = By.xpath("//tbody[1]/tr[1]//input[@name='closed_recently']");
	By MacysCurrent = By.xpath("//tbody[1]/tr[1]//input[@name='open_currently']");
	By MacysNA = By.xpath("//tbody[1]/tr[1]//input[@name='not_applicable']");

	By BBBClosed = By.xpath("//tr[2]//input[@name='closed_recently']");
	By BBBCurrent = By.xpath("//tr[2]//input[@name='open_currently']");
	By BBBNA = By.xpath("//tr[2]//input[@name='not_applicable']");

	By BuyBabyClosed = By.xpath("//tr[3]//input[@name='closed_recently']");
	By BuyBabyCurrent = By.xpath("//tr[3]//input[@name='open_currently']");
	By BuyBabyNA = By.xpath("//tr[3]//input[@name='not_applicable']");

	By ChristmasTreeShopsClosed = By.xpath("//tr[4]//input[@name='closed_recently']");
	By ChristmasTreeShopsCurrent = By.xpath("//tr[4]//input[@name='open_currently']");
	By ChristmasTreeShopsNA = By.xpath("//tr[4]//input[@name='not_applicable']");

	By TuesdayMorningClosed = By.xpath("//tr[5]//input[@name='closed_recently']");
	By TuesdayMorningCurrent = By.xpath("//tr[5]//input[@name='open_currently']");
	By TuesdayMorningNA = By.xpath("//tr[5]//input[@name='not_applicable']");

	By RiteAidClosed = By.xpath("//tr[6]//input[@name='closed_recently']");
	By RiteAidCurrent = By.xpath("//tr[6]//input[@name='open_currently']");
	By RiteAidNA = By.xpath("//tr[6]//input[@name='not_applicable']");

	By JoannFabricsClosed = By.xpath("//tr[7]//input[@name='closed_recently']");
	By JoannFabricsCurrent = By.xpath("//tr[7]//input[@name='open_currently']");
	By JoannFabricsNA = By.xpath("//tr[7]//input[@name='not_applicable']");

	By BigLotsClosed = By.xpath("//tr[8]//input[@name='closed_recently']");
	By BigLotsCurrent = By.xpath("//tr[8]//input[@name='open_currently']");
	By BigLotsNA = By.xpath("//tr[8]//input[@name='not_applicable']");

	By JCPenneyClosed = By.xpath("//tr[9]//input[@name='closed_recently']");
	By JCPenneyCurrent = By.xpath("//tr[9]//input[@name='open_currently']");
	By JCPenneyNA = By.xpath("//tr[9]//input[@name='not_applicable']");

	By NextSeventhQues = By.xpath("//button[.='Next Question']");

	public void SixthQuesText() {

		String SixQues = driver.findElement(By.xpath("//strong[@class='q-text']")).getText();

		if (SixQues.equals(
				"6. In the last 12 months have any of the following tenants closed and/or are any currently operating in your center? *Select N/A if tenant has not been in center in the last 12 months."))

		{
			System.out.println("PASSED  -  Sixth question is visible correctly");
		} else {
			System.out.println("FAILED  -  Question 6 is NOT visible correctly");
		}
	}

	public void Clsd() {
		String Closed = driver
				.findElement(By.xpath("//span[.='Closed within past 12 mos | Cerrado en los últimos 12 meses']"))
				.getText();

		if (Closed.equals("Closed within past 12 mos | Cerrado en los últimos 12 meses"))

		{
			System.out.println("PASSED  -  Closed MSG is visible");
		} else {
			System.out.println("MSG is NOT visible - Test Failed");
		}
	}

	public void Crnt() {
		String Current = driver.findElement(By.xpath("//span[.='Currently operating | Actualmente en funcionamiento']"))
				.getText();

		if (Current.equals("Currently operating | Actualmente en funcionamiento"))

		{
			System.out.println("PASSED  -  Current MSG is visible");
		} else {
			System.out.println("FAILED  -  MSG is NOT visible");
		}
	}

	public void NotAp() {

		String NA = driver.findElement(By.xpath("//span[.='N/A']")).getText();

		if (NA.equals("N/A"))

		{
			System.out.println("PASSED  -  N/A MSG is visible");
		} else {
			System.out.println("FAILED  -  MSG is NOT visible");
		}
	}

	public void MacysText() {

		String Macys = driver.findElement(By.xpath("//td[.=\"Macy's\"]")).getText();

		if (Macys.equals("Macy's"))

		{
			System.out.println("PASSED  -  Macys is visible");
		} else {
			System.out.println("FAILED  -  Macys is NOT visible");
		}

	}

	public void MacysClosedClick() {

		driver.findElement(MacysClosed).click();
	}

	public void MacysCurrentClick() {

		driver.findElement(MacysCurrent).click();
	}

	public void MacysNAClick() {

		driver.findElement(MacysNA).click();

	}

	public void BedBathandBeyondText() {
		String BBB = driver.findElement(By.xpath("//td[.='Bed, Bath, and Beyond']")).getText();
		if (BBB.equals("Bed, Bath, and Beyond"))

		{
			System.out.println("PASSED  -  Bed, Bath, and Beyond is visible");
		} else {
			System.out.println("FAILED  -  Bed, Bath, and Beyond is NOT visible");
		}

	}

	public void BedBathandBeyondCurrent() {
		driver.findElement(BBBCurrent).click();
	}

	public void BedBathandBeyondClosed() {
		driver.findElement(BBBClosed).click();

	}

	public void BedBathandBeyondNA() {
		driver.findElement(BBBNA).click();
	}

	public void BuyBuyBabyText() {
		String BuyBaby = driver.findElement(By.xpath("//td[.='Buy Buy Baby']")).getText();
		if (BuyBaby.equals("Buy Buy Baby"))

		{
			System.out.println("PASSED  -  Buy Buy Baby is visible");
		} else {
			System.out.println("FAILED  -  Buy Buy Baby is NOT visible");
		}
	}

	public void BuyBuyBabyCurrent() {

		driver.findElement(BuyBabyCurrent).click();

	}

	public void BuyBuyBabyClosed() {
		driver.findElement(BuyBabyClosed).click();
	}

	public void BuyBuyBabyNA() {
		driver.findElement(BuyBabyNA).click();

	}

	public void ChristmasTreeShopsText() {
		String ChristmasTreeShops = driver.findElement(By.xpath("//td[.='Christmas Tree Shops']")).getText();

		if (ChristmasTreeShops.equals("Christmas Tree Shops"))

		{
			System.out.println("PASSED  -  Christmas Tree Shops is visible");
		} else {
			System.out.println("FAILED  -  Christmas Tree Shops is NOT visible");
		}
	}

	public void ChristmasTreeShopsCurrent() {

		driver.findElement(ChristmasTreeShopsCurrent).click();
	}

	public void ChristmasTreeShopsClosed() {
		driver.findElement(ChristmasTreeShopsClosed).click();

	}

	public void ChristmasTreeShopsNA() {
		driver.findElement(ChristmasTreeShopsNA).click();

	}

	public void TuesdayMorningText() {
		String TuesdayMorning = driver.findElement(By.xpath("//td[.='Tuesday Morning']")).getText();

		if (TuesdayMorning.equals("Tuesday Morning"))

		{
			System.out.println("PASSED  -  Tuesday Morning is visible");
		} else {
			System.out.println("FAILED  -  Tuesday Morning is NOT visible");
		}
	}

	public void TuesMorningCurrent() {

		driver.findElement(TuesdayMorningCurrent).click();
	}

	public void TuesMorningClosed() {

		driver.findElement(TuesdayMorningClosed).click();
	}

	public void TuesMorningNA() {

		driver.findElement(TuesdayMorningNA).click();
	}

	public void RiteAidText() {

		String RiteAid = driver.findElement(By.xpath("//td[.='Rite Aid']")).getText();

		if (RiteAid.equals("Rite Aid"))

		{
			System.out.println("PASSED  -  Rite Aid is visible");
		} else {
			System.out.println("FAILED  -  Rite Aid is NOT visible");
		}

	}

	public void RiteAdCurrent() {
		driver.findElement(RiteAidCurrent).click();
	}

	public void RiteAdClosed() {
		driver.findElement(RiteAidClosed).click();
	}

	public void RiteAdNA() {
		driver.findElement(RiteAidNA).click();
	}

	public void JoannFabricsText() {

		String JoannFabrics = driver.findElement(By.xpath("//td[.='Joann Fabrics']")).getText();
		if (JoannFabrics.equals("Joann Fabrics"))

		{
			System.out.println("PASSED  -  Joann Fabrics is visible");
		} else {
			System.out.println("FAILED  -  Joann Fabrics is NOT visible");
		}

	}

	public void JoannFabricsCurrentClick() {
		driver.findElement(JoannFabricsCurrent).click();
	}

	public void JoannFabricsClosedClick() {
		driver.findElement(JoannFabricsClosed).click();

	}

	public void JoannFabricsNAClick() {
		driver.findElement(JoannFabricsNA).click();
	}

	public void BigLotsText() {

		String BigLots = driver.findElement(By.xpath("//td[.='Big Lots']")).getText();
		if (BigLots.equals("Big Lots"))

		{
			System.out.println("PASSED  -  Big Lots is visible");
		} else {
			System.out.println("FAILED  -  Big Lots is NOT visible");
		}

	}

	public void BigLotsCurrentClick() {

		driver.findElement(BigLotsCurrent).click();
	}

	public void BigLotsClosedClick() {

		driver.findElement(BigLotsNA).click();

	}

	public void BigLotsNAClick() {

		driver.findElement(BigLotsClosed).click();
	}

	public void JCPenneyText() {
		String JCPenney = driver.findElement(By.xpath("//td[.='JCPenney']")).getText();

		if (JCPenney.equals("JCPenney"))

		{
			System.out.println("PASSED  -  JCPenney is visible");
		} else {
			System.out.println("FAILED  -  JCPenney is NOT visible");
		}
	}

	public void JCPenneyCurrentClick() {

		driver.findElement(JCPenneyCurrent).click();
	}

	public void JCPenneyClosedClick() {

		driver.findElement(JCPenneyClosed).click();
	}

	public void JCPenneyNAClick() {

		driver.findElement(JCPenneyNA).click();
	}

	public void NSeventhQues() {
		driver.findElement(NextSeventhQues).click();

	}

}
