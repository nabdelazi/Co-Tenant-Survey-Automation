package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import pages.survey.FifthQuestionPage;
import pages.survey.FirstQuestionPage;
import pages.survey.ForthQuestionPage;
import pages.survey.SecondQuestionPage;
import pages.survey.SeventhQuestionPage;
import pages.survey.SixthQuestionPage;
import pages.survey.StartSurveyPage;
import pages.survey.StorePage;
import pages.survey.SubmitPage;
import pages.survey.ThankYouPage;
import pages.survey.ThirdQuestionPage;

public class RunSurvey {

	WebDriver driver = new ChromeDriver();

	StorePage Store = new StorePage(driver);
	StartSurveyPage StartSurvey = new StartSurveyPage(driver);
	FirstQuestionPage FirstQuestion = new FirstQuestionPage(driver);
	SecondQuestionPage SecondQuestion = new SecondQuestionPage(driver);
	ThirdQuestionPage ThirdQuestion = new ThirdQuestionPage(driver);
	ForthQuestionPage ForthQuestion = new ForthQuestionPage(driver);
	FifthQuestionPage FifthQuestion = new FifthQuestionPage(driver);
	SixthQuestionPage SixthQuestion = new SixthQuestionPage(driver);
	SeventhQuestionPage SeventhQuestion = new SeventhQuestionPage(driver);
	SubmitPage Submit = new SubmitPage(driver);
	ThankYouPage ThankYou = new ThankYouPage(driver);

	@BeforeTest
	public void BeforeExc() {

		driver.get("https://ew-dwstrsurvey1.win.coat.com:9443/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		

	}

	@Test(enabled = true)
	public void SlowExcution() throws InterruptedException {

		Store.InputStore();
		Thread.sleep(1000);
		Store.StoreNum("677");
		Thread.sleep(1000);
		Store.ConfirmBtn();
		Thread.sleep(1000);
		StartSurvey.TakeSurvey();
		Thread.sleep(1000);
		FirstQuestion.FirstQuesText();
		FirstQuestion.ClickRoss();
		FirstQuestion.ClickTJMaxx();
		FirstQuestion.ClickHomeGoods();
		FirstQuestion.ClickMarshalls();
		FirstQuestion.ClickMichaels();
		FirstQuestion.ClickHobbyLobby();
		FirstQuestion.ClickBestBuy();
		FirstQuestion.ClickDSG();
		FirstQuestion.ClickTarget();
		FirstQuestion.ClickPetSmart();
		FirstQuestion.ClickOther();
		FirstQuestion.ClickNone();
		Thread.sleep(1000);
		FirstQuestion.AnchorTenants("Test");
		FirstQuestion.NSecQues();
		SecondQuestion.SecondQuesText();
		SecondQuestion.NoAnswer();
		Thread.sleep(1000);
		SecondQuestion.YesAnswer();
		SecondQuestion.AddTenant();
		Thread.sleep(1000);
		SecondQuestion.TenantNumber("4");
		Thread.sleep(1000);
		SecondQuestion.ClickSave();
		SecondQuestion.NThirdQues();
		ThirdQuestion.ThirdQuesText();
		ThirdQuestion.ClickYes();
		ThirdQuestion.VacanciesNum("5");
		ThirdQuestion.ClickNo();
		ThirdQuestion.NForthQues();
		ForthQuestion.ForthQuesText();
		ForthQuestion.AnswerYes();
		ForthQuestion.DDown();
		Thread.sleep(1000);
		ForthQuestion.AnswerNo();
		ForthQuestion.NFifthQues();
		Thread.sleep(1000);
		FifthQuestion.FifthQuesText();
		FifthQuestion.YY();
		FifthQuestion.NN();
		FifthQuestion.NSixthQues();
		Thread.sleep(1000);
		SixthQuestion.SixthQuesText();
		SixthQuestion.Clsd();
		Thread.sleep(1000);
		SixthQuestion.Crnt();
		SixthQuestion.NotAp();
		Thread.sleep(1000);
		SixthQuestion.MacysText();
		SixthQuestion.MacysClosedClick();
		Thread.sleep(1000);
		SixthQuestion.MacysCurrentClick();
		SixthQuestion.MacysNAClick();
		Thread.sleep(1000);
		SixthQuestion.BedBathandBeyondText();
		SixthQuestion.BedBathandBeyondClosed();
		Thread.sleep(1000);
		SixthQuestion.BedBathandBeyondNA();
		SixthQuestion.BedBathandBeyondCurrent();
		Thread.sleep(1000);
		SixthQuestion.BuyBuyBabyText();
		SixthQuestion.BuyBuyBabyNA();
		Thread.sleep(1000);
		SixthQuestion.BuyBuyBabyCurrent();
		SixthQuestion.BuyBuyBabyClosed();
		Thread.sleep(1000);
		SixthQuestion.ChristmasTreeShopsText();
		SixthQuestion.ChristmasTreeShopsNA();
		Thread.sleep(1000);
		SixthQuestion.ChristmasTreeShopsClosed();
		SixthQuestion.ChristmasTreeShopsCurrent();
		Thread.sleep(1000);
		SixthQuestion.TuesdayMorningText();
		SixthQuestion.TuesMorningCurrent();
		Thread.sleep(1000);
		SixthQuestion.TuesMorningClosed();
		SixthQuestion.TuesMorningNA();
		Thread.sleep(1000);
		SixthQuestion.RiteAidText();
		SixthQuestion.RiteAdCurrent();
		Thread.sleep(1000);
		SixthQuestion.RiteAdClosed();
		SixthQuestion.RiteAdNA();
		Thread.sleep(1000);
		SixthQuestion.JoannFabricsText();
		SixthQuestion.JoannFabricsCurrentClick();
		Thread.sleep(1000);
		SixthQuestion.JoannFabricsNAClick();
		SixthQuestion.JoannFabricsClosedClick();
		Thread.sleep(1000);
		SixthQuestion.BigLotsText();
		Thread.sleep(1000);
		SixthQuestion.BigLotsCurrentClick();
		Thread.sleep(1000);
		SixthQuestion.BigLotsNAClick();
		SixthQuestion.BigLotsClosedClick();
		SixthQuestion.JCPenneyText();
		SixthQuestion.JCPenneyCurrentClick();
		Thread.sleep(1000);
		SixthQuestion.JCPenneyNAClick();
		SixthQuestion.JCPenneyClosedClick();
		Thread.sleep(1000);
		SixthQuestion.NSeventhQues();
		SeventhQuestion.SeventhQuesText();
		SeventhQuestion.TypeAComment();
		SeventhQuestion.AfterConfirmation();
		Submit.CompleteSurv();
		ThankYou.ThankYouText();
		ThankYou.SubmissionText();
		Thread.sleep(1000);
		ThankYou.StartNewSurvey();
		driver.quit();

	}

	@Test(enabled = true)
	public void QuickExcution() throws InterruptedException {

		Store.InputStore();
		Store.StoreNum("677");
		Store.ConfirmBtn();
		StartSurvey.TakeSurvey();
		FirstQuestion.FirstQuesText();
		FirstQuestion.ClickRoss();
		FirstQuestion.ClickTJMaxx();
		FirstQuestion.ClickHomeGoods();
		FirstQuestion.ClickMarshalls();
		FirstQuestion.ClickMichaels();
		FirstQuestion.ClickHobbyLobby();
		FirstQuestion.ClickBestBuy();
		FirstQuestion.ClickDSG();
		FirstQuestion.ClickTarget();
		FirstQuestion.ClickPetSmart();
		FirstQuestion.ClickOther();
		FirstQuestion.ClickNone();
		FirstQuestion.AnchorTenants("Test");
		FirstQuestion.NSecQues();
		SecondQuestion.SecondQuesText();
		SecondQuestion.NoAnswer();
		SecondQuestion.YesAnswer();
		SecondQuestion.AddTenant();
		Thread.sleep(1000);
		SecondQuestion.TenantNumber("4");
		SecondQuestion.ClickSave();
		SecondQuestion.NThirdQues();
		ThirdQuestion.ThirdQuesText();
		ThirdQuestion.ClickYes();
		ThirdQuestion.VacanciesNum("5");
		ThirdQuestion.ClickNo();
		ThirdQuestion.NForthQues();
		ForthQuestion.ForthQuesText();
		ForthQuestion.AnswerYes();
		ForthQuestion.DDown();
		ForthQuestion.AnswerNo();
		ForthQuestion.NFifthQues();
		FifthQuestion.FifthQuesText();
		FifthQuestion.YY();
		FifthQuestion.NN();
		FifthQuestion.NSixthQues();
		SixthQuestion.SixthQuesText();
		SixthQuestion.Clsd();
		SixthQuestion.Crnt();
		SixthQuestion.NotAp();
		SixthQuestion.MacysText();
		SixthQuestion.MacysClosedClick();
		SixthQuestion.MacysCurrentClick();
		SixthQuestion.MacysNAClick();
		SixthQuestion.BedBathandBeyondText();
		SixthQuestion.BedBathandBeyondClosed();
		SixthQuestion.BedBathandBeyondNA();
		SixthQuestion.BedBathandBeyondCurrent();
		SixthQuestion.BuyBuyBabyText();
		SixthQuestion.BuyBuyBabyNA();
		SixthQuestion.BuyBuyBabyCurrent();
		SixthQuestion.BuyBuyBabyClosed();
		SixthQuestion.ChristmasTreeShopsText();
		SixthQuestion.ChristmasTreeShopsNA();
		SixthQuestion.ChristmasTreeShopsClosed();
		SixthQuestion.ChristmasTreeShopsCurrent();
		SixthQuestion.TuesdayMorningText();
		SixthQuestion.TuesMorningCurrent();
		SixthQuestion.TuesMorningClosed();
		SixthQuestion.TuesMorningNA();
		SixthQuestion.RiteAidText();
		SixthQuestion.RiteAdCurrent();
		SixthQuestion.RiteAdClosed();
		SixthQuestion.RiteAdNA();
		SixthQuestion.JoannFabricsText();
		SixthQuestion.JoannFabricsCurrentClick();
		SixthQuestion.JoannFabricsNAClick();
		SixthQuestion.JoannFabricsClosedClick();
		SixthQuestion.BigLotsText();
		SixthQuestion.BigLotsCurrentClick();
		SixthQuestion.BigLotsNAClick();
		SixthQuestion.BigLotsClosedClick();
		SixthQuestion.JCPenneyText();
		SixthQuestion.JCPenneyCurrentClick();
		SixthQuestion.JCPenneyNAClick();
		SixthQuestion.JCPenneyClosedClick();
		SixthQuestion.NSeventhQues();
		SeventhQuestion.SeventhQuesText();
		SeventhQuestion.TypeAComment();
		SeventhQuestion.AfterConfirmation();
		Submit.CompleteSurv();
		ThankYou.ThankYouText();
		ThankYou.SubmissionText();
		ThankYou.StartNewSurvey();
	}

	@AfterTest
	public void close() {

		driver.quit();
	}

}
