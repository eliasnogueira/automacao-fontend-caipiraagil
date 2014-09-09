package com.eliasnogueira.selenium.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.eliasnogueira.selenium.po.PaginaCategoria;
import com.eliasnogueira.selenium.po.PaginaLogin;
import com.eliasnogueira.selenium.po.PaginaMenu;
import com.eliasnogueira.selenium.po.PaginaNovaCategoria;

/*
 * O teste com Page Objects fica mais legível apresentando o código como um fluxo de teste.
 * A manutenção é feita no Page Objects para não impactar na manutenção de cada teste.
 */
public class TesteCategoriaComPageObjects {

	private WebDriver driver;
	
	@Before
	public void preCondicao() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void posCondicao() {
		driver.quit();
	}
	
	@Test
	public void testeCadastrarNovaCategoria() {
		driver.get("http://www.planned.by/quickloja");
		
		PaginaLogin paginaLogin = new PaginaLogin(driver);
		paginaLogin.preencherUsuario("elias.nogueira");
		paginaLogin.preencherSenha("123");
		paginaLogin.clicarEmEntrar();
		assertEquals("Entrou como Elias Nogueira | Sair", paginaLogin.pegarNomeUsuario());
		
		PaginaMenu paginaMenu = new PaginaMenu(driver);
		paginaMenu.clicarEmGerenciarModulos().clicarEmCategorias();
		
		PaginaCategoria paginaCategoria = new PaginaCategoria(driver);
		paginaCategoria.clicarEmNovaCategoria();
		
		PaginaNovaCategoria paginaNovaCategoria = new PaginaNovaCategoria(driver);
		paginaNovaCategoria.preencherCategoria("Categoria do Elias");
		paginaNovaCategoria.clicarEmGravar();
	}

}
