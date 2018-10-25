package br.com.sislancamento;

public class Intersecao implements  {

	private int valor_1;
	private int valor_2;
	
	public int getvalor1() {
		return valor_1;
	}
	
	public int getvalor2() {
		return valor_2;
	}

	public void setvalor1(int valor_1) {
		this.valor_1 = valor_1;
	}
	
	public void setvalor2(int valor_2) {
		this.valor_2 = valor_2;
	}
	
	public String verificarIntersecao(String valor1, String valor2, String valor3, String valor4) {
		Integer val_1 = Integer.parseInt(valor1);
		Integer val_2 = Integer.parseInt(valor2);
		Integer val_3 = Integer.parseInt(valor3);
		Integer val_4 = Integer.parseInt(valor4);

		if (val_3 > val_1 && val_3 < val_2) {
			FacesContext.getCurrentInstance().addMessage("form:button", new FacesMessage("Existe interseção entre as faixas 1 e 2."));
			
		} else if (val_4 > val_1 && val_4 < val_2) {
			FacesContext.getCurrentInstance().addMessage("form:button", new FacesMessage("Existe interseção entre as faixas 1 e 2."));
			
		} else if (val_1 > val_3 && val_1 < val_4) {
			FacesContext.getCurrentInstance().addMessage("form:button", new FacesMessage("Existe interseção entre as faixas 1 e 2."));
			
		} else if (val_2 > val_3 && val_2 < val_4) {
			FacesContext.getCurrentInstance().addMessage("form:button", new FacesMessage("Existe interseção entre as faixas 1 e 2."));
			
		} else {
			FacesContext.getCurrentInstance().addMessage("form:button", new FacesMessage("Não existe interseção entre as faixas 1 e 2."));
			
		}
	}
}
