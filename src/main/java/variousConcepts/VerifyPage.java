package variousConcepts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class VerifyPage extends BasePage {

	WebDriver driver;
	
	public VerifyPage(WebDriver driver) {
		
		
	}

	@FindBy(how = How.NAME, using = "allbox")
	WebElement CheckBox_Element;

	@FindBy(how = How.XPATH, using = "(//input[@value='Remove'])[1]")
	WebElement Remove_Element;

	public void clickCheckBox() {
		CheckBox_Element.click();
		System.out.println("The checkbox is selection state is - " + CheckBox_Element.isSelected());
	}

	public void RemoveButton() {
		Remove_Element.click();
		System.out.println("The RemoveButton selection state is - " + Remove_Element.isEnabled());

	}

	public void ComboKeys() {
		boolean isSelected = CheckBox_Element.isSelected();
		
		if(isSelected == false) {
			CheckBox_Element.click();
		}
			
	else System.out.println("item could be removed using the remove button ");
		
		
	}

}
