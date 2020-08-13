package data;

import java.sql.*;

public class Conexao{
	String connectionUrl = "jdbc:sqlserver://localhost:1433;databasename=ProjetoAgenda";
	String user = "sa";
	String pass= "12345";
	Connection conn = null;
	
	public Conexao() throws SQLException{
		conn = DriverManager.getConnection(connectionUrl,user,pass);
	}
	
	public boolean executeSql(String sql) throws SQLException {
		Statement st = conn.createStatement();
		st.executeQuery("SELECT * FROM tbl_contato");
		
		ResultSet rs = st.getResultSet();
		
		while(rs.next()) {
			System.out.println(rs.getString("nome"));
		}
		conn.close();
		return true;
	}
}
