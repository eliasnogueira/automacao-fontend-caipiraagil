package com.eliasnogueira.selenium.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaMenu {

	
	private WebDriver driver;
	
	public PaginaMenu(WebDriver driver) {
		this.driver = driver;
	}
	
	public PaginaMenu clicarEmGerenciarModulos() {
		driver.findElement(By.linkText("Gerenciar módulos")).click();
		return this;
	}
	
	public void clicarEmCategorias() {
		driver.findElement(By.linkText("Categorias")).click();
	}
	
}
