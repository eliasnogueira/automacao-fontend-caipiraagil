package com.eliasnogueira.selenium.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Neste classe estamos visualizando um teste sem Page Objects.
 * Ele implica em grande manutenção pois se tiveremos testes duplicados (e teremos isso em parte)
 * se toda vez efetuarmos o login, por exemplo, teremos que alterar todos os testes que contenham
 * o login na aplicação
 */
public class TesteLoginSemPageObjetcs {

	@Test
	public void testeLoginComSucesso() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.planned.by/quickloja/");
		
		driver.findElement(By.id("usuariologin")).sendKeys("elias.nogueira");
		driver.findElement(By.id("usuariosenha")).sendKeys("123");
		driver.findElement(By.cssSelector(".btn.btn-medium.btn-primary")).click();
		
		String textoBoasVindas = driver.findElement(By.cssSelector(".navbar-text.pull-right")).getText();
		assertEquals("Entrou como Elias Nogueira | Sair", textoBoasVindas);
		
		driver.findElement(By.linkText("Sair")).click();
		
		driver.quit();
	}

}
