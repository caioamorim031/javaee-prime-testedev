package br.com.syslancamento.testedev.controller;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "intersecaoBean")
@RequestScoped
public class IntersecaoController {

	private int valor1;
	private int valor2;
	private int valor3;
	private int valor4;

	public int getvalor1() {
		return valor1;
	}

	public void setvalor1(int valor1) {
		this.valor1 = valor1;
	}

	public int getvalor2() {
		return valor2;
	}

	public void setvalor2(int valor2) {
		this.valor2 = valor2;
	}

	public int getvalor3() {
		return valor3;
	}

	public void setvalor3(int valor3) {
		this.valor3 = valor3;
	}

	public int getvalor4() {
		return valor4;
	}

	public void setvalor4(int valor4) {
		this.valor4 = valor4;
	}

	public String verificarIntersecao() {

		if (this.valor3 > this.valor1 && this.valor3 < this.valor2) {
			FacesContext.getCurrentInstance().addMessage("form:button",
					new FacesMessage("Existe interseção entre as faixas 1 e 2."));
			return null;
		} else if (this.valor4 > this.valor1 && this.valor4 < this.valor2) {
			FacesContext.getCurrentInstance().addMessage("form:button",
					new FacesMessage("Existe interseção entre as faixas 1 e 2."));
			return null;

		} else if (this.valor1 > this.valor3 && this.valor1 < this.valor4) {
			FacesContext.getCurrentInstance().addMessage("form:button",
					new FacesMessage("Existe interseção entre as faixas 1 e 2."));

		} else if (this.valor2 > this.valor3 && this.valor2 < this.valor4) {
			FacesContext.getCurrentInstance().addMessage("form:button",
					new FacesMessage("Existe interseção entre as faixas 1 e 2."));
			return null;
		} else {
			FacesContext.getCurrentInstance().addMessage("form:button",
					new FacesMessage("Não existe interseção entre as faixas 1 e 2."));
		}
		return null;
	}
}