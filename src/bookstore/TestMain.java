package bookstore;
import java.util.Scanner;

public class TestMain {
	 
	private static Scanner c;
	//Affecter la methode main
	public static void main(String[] args) {
		
		//try-catch block
		try {
		
		        c = new Scanner(System.in);
		        //entrer le premier variable: qte
		System.out.println("Saisir la quantit� SVP: ");
		          //lire le variable qte
		int qte=c.nextInt();
		            //entrer le premier variable: prix
		System.out.println("Saisir le prix SVP:");
		        //lire le variable de prix
		float unitPrice=c.nextFloat();
		
		       //instanciation les classes 
		Produit p=new Produit();
		 //l'affichage du r�sultat
		System.out.println("Le prix totale de l'achat est "+p.calculateTotalePrice(qte, unitPrice)+" Dinars");
		//connect a la base de donnees 
		p.dataBaseConnection();
		    //ajouter des livres dans la base de donnes bookstore
		p.addDataBase();
		        //afficher les livres dans la base
		p.displaybook();
		  
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
			}
		}
	}
