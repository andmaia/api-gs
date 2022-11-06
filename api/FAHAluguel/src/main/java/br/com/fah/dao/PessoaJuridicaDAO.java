package br.com.fah.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fah.connection.UsuarioDB;
import br.com.fah.model.PessoaJuridicaTO;

public class PessoaJuridicaDAO {
	
	public void inset(PessoaJuridicaTO pj) {
		UsuarioDB ub = new UsuarioDB();
		
		Connection conn = ub.ConectarDB();
		PreparedStatement ps;
		
		try {
			ps=conn.prepareStatement("Insert into t_fah_pessoa values(sq_fah_pessoa.nextval,?)");
			ps.setString(1,pj.getLogin().getLogin());
			
			ps.executeQuery();
			
		}catch(SQLException e){
			System.out.print(e.getMessage());
		}
		
		
		
	
	}
	
}
