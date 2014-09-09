package com.eliasnogueira.selenium.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaNovaCategoria {

	private WebDriver driver;
	
	public PaginaNovaCategoria(WebDriver driver) {
		this.driver = driver;
	}
	
	public void preencherCategoria(String nomeCategoria) {
		driver.findElement(By.name("categorianome")).sendKeys(nomeCategoria);
	}
	
	public void clicarEmGravar() {
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
	}
}
