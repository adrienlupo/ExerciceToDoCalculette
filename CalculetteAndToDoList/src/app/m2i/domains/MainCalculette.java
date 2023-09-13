package app.m2i.domains;

import java.util.Scanner;

import app.m2i.models.Calculette;

import java.util.*;

public class MainCalculette {

	public static void main(String[] args) {
		
		List <Float> list = new ArrayList<Float>() ;
		Scanner sc ;
		String number;
		String operation;
		Calculette calculette = new Calculette();
		
		System.out.println("Choisissez une operation : ");
		System.out.println("1 - Addition ////");
		System.out.println("2 - Soustraction ");
		System.out.println("3 - Division");
		System.out.println("4 - Multiplication");
		System.out.println("5 - Factorielle");
		System.out.println(">");
		
		
		
		sc = new Scanner(System.in);
		operation  = sc.nextLine();
		
		
		System.out.println("Choisissez un nombre");
		sc = new Scanner(System.in);
		number = sc.nextLine();
		
		list.add(Float.parseFloat(number));
		
		
		if (!operation.equals("5")) {
		while (!number.equals("")) {
			System.out.println("Choisissez un autre nombre ou pressez Entrée pour quitter");
			sc = new Scanner(System.in);
			number = sc.nextLine();
			if (!number.equals("")) {
				list.add(Float.parseFloat(number));
			}
			}
		}
		
		switch(operation) {
		case "1":
			System.out.println(calculette.sum(list));
			break;
		case "2":
			System.out.println(calculette.sub(list));
			break;
		case "3":
			try {
				System.out.println(calculette.divide(list));
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		case "4":
			System.out.println(calculette.multiply(list));
			break;
		case "5":
			System.out.println(calculette.factorielle(Float.parseFloat(number)));
			break;
		}
		sc.close();
		System.out.println("over");
		
	
		
		

		
		
		
		
		
		
	}

}
