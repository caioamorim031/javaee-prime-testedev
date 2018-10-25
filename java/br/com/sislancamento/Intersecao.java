package br.com.sislancamento;

public class Intersecao implements  {

	private int val_1;
	private int val_2;
	private int val_3;
	private int val_4;
	
	public int getvalor1() {
		return val_1;
	}
	
	public void setvalor1(int val_1) {
		this.val_1 = val_1;
	}
	
	public int getvalor2() {
		return val_2;
	}
	
	public void setvalor2(int val_2) {
		this.val_2 = val_2;
	}
	
	public int getvalor3() {
		return val_3;
	}
	
	public void setvalor3(int val_3) {
		this.val_3 = val_3;
	}
	
	public int getvalor4() {
		return val_4;
	}
	
	public void setvalor4(int val_4) {
		this.val_4 = val_4;
	}
	
	public String verificarIntersecao(String valor1, String valor2, String valor3, String valor4) {
		val_1 = Integer.parseInt(valor1);
		val_2 = Integer.parseInt(valor2);
		val_3 = Integer.parseInt(valor3);
		val_4 = Integer.parseInt(valor4);

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
