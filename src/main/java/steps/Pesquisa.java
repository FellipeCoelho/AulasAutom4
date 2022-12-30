package steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Inicio;
import pages.Resultados;

public class Pesquisa {
	
	WebDriver driver = null;
	
	@Given("que estou com o browser aberto")
		public void que_estou_com_o_browser_aberto() {
		
		WebDriverManager.chromedriver().driverVersion("108.0.5359.125").setup(); //versão do browser que queremos testar
		
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com.br/");		
		
	}
	
	@And("entro com o endereco")
		public void entro_com_o_endereco() {
		
		//pass
		
	}
	
	@When("^eu informo o conteudo da pesquisa (.*)$")
		public void eu_informo_o_conteudo_da_pesquisa(String texto) {
		
		Inicio inicio = new Inicio(driver);
		inicio.digitarPesquisa(texto);
		inicio.clicarPesquisar();
		
	}
	
	@Then("sera retornado alguma coisa")
		public void sera_retornado_alguma_coisa() {
		
		Resultados resultado = new Resultados(driver);
		resultado.apareceResultado();
		
	}
	
}