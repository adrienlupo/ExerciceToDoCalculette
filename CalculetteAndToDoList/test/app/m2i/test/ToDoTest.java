package app.m2i.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


import app.m2i.bdd.GestBDD;

class ToDoTest {
	
	public static GestBDD bdd = new GestBDD();
	public static Connection connection;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/todolist", "root", null);
		//lien connexion base de Adrien
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		connection.close();
		// supprimer les elements qui ont été ajouté
		// Remttre les elements qui ont été supprimé
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	// Affiche une tache 
		// Est ce qu'il y a le bon nombre de tache ? (Si il y a n taches dans ma BDD est ce que ma méthode 'affiche tache" affiche n taches)
		// Afficher la première ligne
	// Ajouter une Tache
		// Ajouter une tache par défaut, et comparer la taille de la BDD avant et après
			// 4 element dans ma base avant >> 5 elemenr 
			// Est ce que quand tu ajoute une tache la string qui correpond est égale à la string donné par l'utilisateur
			// Tester l'exception : vérifier que "faire dodo" n'ajoute pas une nouvelle tache
	// Supprimer une tache
		// Commeencer par ajouter : regarder le nombre 
	   // meme test mais à l'inverse
	// avant manip == apres manip

}
