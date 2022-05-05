package metodosdez;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosDeTeste {

	WebDriver driver;

	/**
	 * Metodo para abrir navegador Chrome e FireFox
	 * 
	 * @author claudio
	 * @param navegador
	 * @param url
	 */

	public void abrirNavegador(String navegador, String url) {

		if (navegador.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (navegador.equalsIgnoreCase("FIREFOX")) {

		} else {

			System.err.print("Navegador indisponivel digite CHROME ou FIREFOX");

		}

		driver.manage().window().maximize();
		driver.get("https://www.amazon.com.br");
		System.out.println("--------------- Teste Iniciado ------------------");
	}

	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void fecharNavegador() {
		driver.quit();
		System.out.println("----------------Teste Encerrado---------------");
	}

}
