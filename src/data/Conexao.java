package data;

import java.sql.*;

public class Conexao{
	{
	
	try{
		String connectionUrl = "jdbc:sqlserver://localhost:1433;databasename=ProjetoAgenda";

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		
		Connection conn = DriverManager.getConnection(connectionUrl,"sa","12345");

		System.out.println("Conexao obtida com sucesso");
		
		conn.close();

	}catch(SQLException e) {
		e.printStackTrace();
	}catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
	}


}}
