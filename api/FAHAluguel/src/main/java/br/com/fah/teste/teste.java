package br.com.fah.teste;

import br.com.fah.bo.PessoaJuridicaBO;
import br.com.fah.model.LoginTO;
import br.com.fah.model.PessoaJuridicaTO;

public class teste {

	public static void main(String[] args) {
		LoginTO lt = new LoginTO("a@","Vasco");
		PessoaJuridicaTO pjt = new PessoaJuridicaTO(1234, 432,"vaaaaai","11/09/2021", lt);
		
		PessoaJuridicaBO pjd = new PessoaJuridicaBO();
		
		pjd.Inserir(pjt);
		

	}

}
