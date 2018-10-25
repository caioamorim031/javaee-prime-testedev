package br.com.syslancamento.testdev.model;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.syslancamento.testdev.model.Lancamento;

@Entity
@Table(name = "lancamento")
public class Lancamento implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1857043732753067454L;

	@Id
	@Column(name = "oid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer oid;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_inicial", nullable = false)
	private Calendar dataInicial;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_final", nullable = false)
	private Calendar dataFinal;
	
	@Column(name = "vl_total", nullable = false)
	private int valorTotal;
	
	@Column(name = "observacao", nullable = true, length = 1000)
	private String observacao;

	@ManyToMany
	@JoinTable(name = "lancamento_item", joinColumns = { @JoinColumn(name = "oid_lancamento") }, inverseJoinColumns = {
			@JoinColumn(name = "oid_item") })
	private List<Item> item;

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public Calendar getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Calendar dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Calendar getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Calendar dataFinal) {
		this.dataFinal = dataFinal;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public List<Item> getItem() {
		return this.item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}
}
