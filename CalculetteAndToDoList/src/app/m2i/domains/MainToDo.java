package app.m2i.domains;

import app.m2i.bdd.GestBDD;

public class MainToDo {

	public static void main(String[] args) {

		GestBDD bdd = new GestBDD();
		bdd.connection();
		bdd.afficherToDo();
		//bdd.AjoutDansBdd("Faire le ménage");
		bdd.SuppDansBdd(8);
		bdd.afficherToDo();
	}

}
