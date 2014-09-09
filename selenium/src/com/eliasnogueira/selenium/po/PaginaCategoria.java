package com.eliasnogueira.selenium.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaCategoria {

	private WebDriver driver;
	
	public PaginaCategoria(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clicarEmNovaCategoria() {
		driver.findElement(By.linkText("Nova categoria")).click();
	}
}
