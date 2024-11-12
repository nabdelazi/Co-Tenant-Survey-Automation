package pages.survey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StorePage {

	WebDriver driver;

	public StorePage(WebDriver driver) {
		this.driver = driver;

	}

	By StoreTab = By.id("numericInput");

	By ConfirmBtn = By.cssSelector(".confirm-store-btn");

	public void InputStore() {
		driver.findElement(StoreTab).click();
	}

	public void StoreNum(String Store) {
		driver.findElement(StoreTab).sendKeys(Store);
	}

	public void ConfirmBtn() {

		driver.findElement(ConfirmBtn).click();

	}
}
