package com.example.Marvel;

import java.util.Scanner;

public class MainMarvel 
{
	public static void main(String[] args) 
	{
		/*You can select from the below names
		 * String avengersNames[] = { "Iron man","Captain America","Spider man","Black Panther","Vision","Hawk eye"};
		String antiHeroesNames[] = {"Mandrin","Thanos","Galactus","Hela","Ego","Dr. Doom"};
		String mutantNames[] = {"Apocalypse","Professor X","Dark Pheonix","Magneto","Wolverin","Mystique"};
		*/
		
		// create a object for Players class which contains the playerCall method
		Players player= new Players();
		Scanner sc = new Scanner(System.in);
		player.playerCall("Iron man");//directly pass value in the method
		player.playerCall("Ego");//directly pass value in the method
		System.out.println("Enter a string");
		String name = sc.nextLine();// get the input from user
		player.playerCall(name);// pass the user input value
	}

}
