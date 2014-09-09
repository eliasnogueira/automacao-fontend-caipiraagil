package com.eliasnogueira.selenium.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaLogin {

	private WebDriver driver;
	
	public PaginaLogin(WebDriver driver) {
		this.driver = driver;
	}
	
	public void preencherUsuario(String usuario) {
		driver.findElement(By.id("usuariologin")).sendKeys(usuario);
	}
	
	public void preencherSenha(String senha) {
		driver.findElement(By.id("usuariosenha")).sendKeys(senha);
	}
	
	public void clicarEmEntrar() {
		driver.findElement(By.cssSelector(".btn.btn-medium.btn-primary")).click();
	}
	
	public String pegarNomeUsuario() {
		return driver.findElement(By.cssSelector(".navbar-text.pull-right")).getText();
	}
}


