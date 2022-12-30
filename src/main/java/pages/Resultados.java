package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Resultados {
	
	WebDriver driver;
	
	@FindBy(id = "result-stats")
	WebElement numeroResultados;
	
	
	public Resultados(WebDriver driver) {
		
		this.driver = driver;		
		PageFactory.initElements(driver, this);
	}
	
	public void apareceResultado() {
		
		Boolean resultados = numeroResultados.isDisplayed();
		assertEquals(resultados,true); 
	
	}

}
