package bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Produit {
	Connection con =null;
	Statement stm =null;
	ResultSet res=null ;
	public Produit() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore","root","root");
			}catch (ClassNotFoundException e) {} catch (SQLException e) {
				
				e.printStackTrace();
			}
	}
	//la methode calculate totale Price 
	float calculateTotalePrice (int qte,float untPrice) {
		//resultat de la methode 
		return (qte*untPrice);
	}
	public int insertBook() throws SQLException {
		
		String req="";
		req="insert into book(title,athor,price,releaseDate) values ('livre','editeur','17,2001-01-01')";
		stm=con.createStatement();
	return stm.executeUpdate(req);
	}
	public void display() throws SQLException {
		
		try {
	    	stm =  con.createStatement(); 
	    	 String req1="select *from book "; 
	    ResultSet rs = stm.executeQuery(req1);
	    
	    while (rs.next()) {
	        System.out.println("id : " + rs.getInt("id"));
	        System.out.println("title : " + rs.getString("title"));
	        System.out.println("Author : " + rs.getString("author"));
	        System.out.println("price : " + rs.getDouble("price"));
	        System.out.println("date: " + rs.getDate("releaseDate"));
	    }}
	    catch(SQLException e)
	    {
	    	e.printStackTrace();
	    }
	    }	
	

}

	


	
	


