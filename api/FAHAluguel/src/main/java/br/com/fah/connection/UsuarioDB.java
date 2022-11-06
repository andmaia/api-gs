package br.com.fah.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UsuarioDB {
	public Connection ConectarDB() {
		Connection conn=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","rm96030","110803");
			
			if(conn!=null) {
				System.out.println("Conexão feita com sucesso");
				
			}else {
				System.out.println("Conexão falha");
			}
			
			
			
		}catch(SQLException e) {
		       System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
	