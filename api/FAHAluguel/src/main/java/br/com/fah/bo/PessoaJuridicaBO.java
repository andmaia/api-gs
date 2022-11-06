package br.com.fah.bo;

import br.com.fah.dao.PessoaJuridicaDAO;
import br.com.fah.model.PessoaJuridicaTO;

public class PessoaJuridicaBO {
	PessoaJuridicaDAO pjd = new PessoaJuridicaDAO();
	
	public void Inserir(PessoaJuridicaTO pj) {
		pjd.inset(pj);
	}
}
