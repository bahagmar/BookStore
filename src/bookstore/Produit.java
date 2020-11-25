package bookstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Produit {
	Connection con =null;
	Statement stm =null;
	int res;
	ResultSet result=null;
	
	//La methode CalculateTotalPrice pour calculer le prix total des produits
	
	float calculateTotalePrice (int qte,float untPrice) {
			//Résultat du methode 
			return (qte*untPrice);
		}
	
	// methode database connection
	public void dataBaseConnection() {
		
		 
			 try {
				 //chargement de driver 
					Class.forName("com.mysql.jdbc.Driver");
					con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore","root","");
					}
			 catch (ClassNotFoundException e) {
				 e.printStackTrace();
			 } 
			 
			 catch (SQLException e) {
						e.printStackTrace();
					}
	}
	
	public void addDataBase() { 
		
		 try {
				stm=con.createStatement();
				String req=("INSERT INTO `book`(`title`, `author`, `price`, `releaseDate`) VALUES ('Le Bizarre Incident du chien pendant la nuit ','Mark Haddon',18,'2003/09/12')");
				res=stm.executeUpdate(req);
			}catch (SQLException e) {
				e.printStackTrace();
			}
	 }
	
	
	
	public void displaybook() {
		try {
			stm=con.createStatement();
			String req="select * from book";
			result=stm.executeQuery(req);
		while (result.next()) {
			System.out.println(result.getInt(1));
			System.out.println(result.getString(2));
			System.out.println(result.getString(3));
			System.out.println(result.getDouble(4));
			System.out.println(result.getDate(5));
		}
		}
			catch (SQLException e) {
				
			}

	}

}
