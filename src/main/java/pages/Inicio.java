package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Inicio {

	WebDriver driver;
	
	@FindBy(css = "[name='q']")
	WebElement barraPesquisa;
	
	@FindBy(css = "[name='btnK']")
	WebElement botaoPesquisa;
	
	public Inicio(WebDriver driver) {
		
		this.driver = driver;		
		PageFactory.initElements(driver, this);
	}
	
	public void digitarPesquisa(String texto) {
		barraPesquisa.sendKeys(texto);
	}
	
	public void clicarPesquisar() {
		botaoPesquisa.click();
	}
}
