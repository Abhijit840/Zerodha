package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 {
	@FindBy(xpath = "//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement CNTBTN;
	
	public Pom2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterPIN(String pinvalue) {
		PIN.sendKeys(pinvalue);
	}
	public void clickCNTBTN() {
		CNTBTN.click();
	}

}
