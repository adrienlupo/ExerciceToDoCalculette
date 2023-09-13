package app.m2i.domains;

import java.util.Scanner;

import app.m2i.bdd.GestBDD;
import app.m2i.models.MenuToDo;



public class MainToDo {

	public static void main(String[] args) {

		Scanner scanner;
		String choix = "init";
		
		GestBDD bdd = new GestBDD();
		bdd.connection();		
			
		
		MenuToDo menu = new MenuToDo();
		menu.afficherMenu();
		
		//Scanner scanner = new Scanner(System.in);
		//String choix = scanner.nextLine();
		
		while(!choix.equals("")) {
			scanner = new Scanner(System.in);
			choix = scanner.nextLine();
			
		//}
		
		
		switch (choix) {
		case "1":
			bdd.afficherToDo();
			menu.afficherMenu();
			break;
		case "2":	
			System.out.println("Que souhaitez-vous ajouter comme tâche ? ");
			scanner = new Scanner(System.in);
			choix = scanner.nextLine();
				try {
					bdd.AjoutDansBdd(choix);
			
				}catch (Exception err) {
					System.out.println(err.getMessage());
				}
			menu.afficherMenu();
			break;
		case "3":
			System.out.println("Quel ID tâche souhaitez-vous supprimer ? ");
			scanner = new Scanner(System.in);
			int choixId = scanner.nextInt();					
			bdd.SuppDansBdd(choixId);
			menu.afficherMenu();
			break;
		}
			
		}
			System.out.println("Programme terminé... à bientôt !");
	}
}


