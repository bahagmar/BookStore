package bookstore;

import java.util.Scanner;

public class Main {
	//la methode main

	public static void main(String[] args) {
		//entrer les variables a partitr de l'utilisateur 
		Scanner c=new Scanner(System.in);
		//entrer le premier variable qte
		System.out.println("entrez la quantité");
		//lire le variable
		int qte=c.nextInt();
		//entrer le premier variable prix
		System.out.println("entrez le prix");
		//lire le variable
		float untPrice=c.nextFloat();
		//instanciation de la classe Produit
		Produit p=new Produit();
		//l'affichage du resultat
		System.out.println("le totale est "+p.calculateTotalePrice(qte, untPrice));

	}

}
