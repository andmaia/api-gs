package br.com.fah.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PessoaJuridicaTO {
	private float nrCnpj;
	private int nrIe;
	private String nmFantasia;
	private String dtFundacacao;
	private LoginTO login;
	
	public PessoaJuridicaTO(float nrCnpj, int nrIe, String nmFantasia, String dtFundacacao, LoginTO login) {
		super();
		this.nrCnpj = nrCnpj;
		this.nrIe = nrIe;
		this.nmFantasia = nmFantasia;
		this.dtFundacacao = dtFundacacao;
		this.login = login;
	}
	
	public PessoaJuridicaTO() {
		
	}

	public float getNrCnpj() {
		return nrCnpj;
	}

	public void setNrCnpj(float nrCnpj) {
		this.nrCnpj = nrCnpj;
	}

	public int getNrIe() {
		return nrIe;
	}

	public void setNrIe(int nrIe) {
		this.nrIe = nrIe;
	}

	public String getNmFantasia() {
		return nmFantasia;
	}

	public void setNmFantasia(String nmFantasia) {
		this.nmFantasia = nmFantasia;
	}

	public String getDtFundacacao() {
		return dtFundacacao;
	}

	public void setDtFundacacao(String dtFundacacao) {
		this.dtFundacacao = dtFundacacao;
	}

	public LoginTO getLogin() {
		return login;
	}

	public void setLogin(LoginTO login) {
		this.login = login;
	}
	
	
	
	
	
	
	
}
