package br.com.caelum.vraptor.exemplo.controllers;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

@Controller
public class PrimeiroController {

	@Inject
	private Result result;
	
	@Get("/")
	public void index() {
		System.out.println("Passou aqui!!!");
	}

	@Get("/home")
	public void home() {
		result.include("mensagem", "Olá, VRaptor 4!");
	}
	
}