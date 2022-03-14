package com.example.Marvel;

import java.util.LinkedList;
import java.util.List;

public class Players 
{
	// Avengers characters names and thier powerlevels are stored in  linked list data structure
	LinkedList<String> avengersNames = new LinkedList<String>(List.of("Iron man","Captain America","Spider man","Black Panther","Vision","Hawk eye"));
	LinkedList<Integer> avengersPowerLevel = new LinkedList<Integer>(List.of(60,68,58,68,50,30));
	
	// Anti heroes characters names and thier powerlevels are stored in  linked list data structure
	LinkedList<String> antiHeroesNames = new LinkedList<String>(List.of("Mandrin","Thanos","Galactus","Hela","Ego","Dr. Doom"));
	LinkedList<Integer> antiHeroespowerLevel = new LinkedList<Integer>(List.of(70,80,95,75,50,78));
	
	// Mutant characters names and thier powerlevels are stored in  linked list data structure
	LinkedList<String> mutantNames = new LinkedList<String>(List.of("Apocalypse","Professor X","Dark Pheonix","Magneto","Wolverin","Mystique"));
	LinkedList<Integer> mutantPowerlevel = new LinkedList<Integer>(List.of(80,75,90,78,64,66));
	
	
	String playerCategory = "";// it is used to store the player category type
	LinkedList<String> playerName = new LinkedList<String>();	//	it is used to store the player name in linked list
	LinkedList<Integer> playerPowerlevel = new LinkedList<Integer>();	//	it is used to store the player power level in linked list

	//These boolean arrays are used to check the players name which is called by the user is already in the player list are not 
	LinkedList<Boolean> avengersFirstTime = new LinkedList<Boolean>(List.of(false,false,false,false,false,false));
	LinkedList<Boolean> antiHeroesFirstTime = new LinkedList<Boolean>(List.of(false,false,false,false,false,false));
	LinkedList<Boolean> mutantFirstTime = new LinkedList<Boolean>(List.of(false,false,false,false,false,false));
	
	// This method is used to check the players in the character or not
	public void playerCall(String player)
	{
		CheckPlayers p1 = new CheckPlayers();//	crate the object for CheckPlayers class
		boolean res = false;// check players is present in the any category
	
		if(playerName.contains(player) == false)//	it returns false if the player is not present in the player name linked list
		{
			res = p1.checkAvengers(player);// it returns true if the player is present in Avengers
			if(res == false)//
			{
				res = p1.checkAntiheroes(player);// it returns true if the player is present in Anti Heroes
				if(res == false)
				{
					res = p1.checkMutants(player);// it returns true if the player is present in in Mutants
					if(res == false)
						System.out.println("Enter Player name not match with the characters");
				}
			}
			p1.printPlayers();//  print the players
		}
		else	//	if the player is present in the player name linked list
		{
			int playerIndex = 0;
			int characterIndex = 0;
			String pname = "";
			if(avengersNames.contains(player))	// it will check the player present in Avengers
			{
				playerIndex = playerName.indexOf(player);
				playerName.remove(player);					//	it will remove the player name in the player name linked list
				playerPowerlevel.remove(playerIndex);		//	it will remove the player power level in the player power level linked list

				characterIndex = avengersNames.indexOf(player);
				playerName.offer(player);				//   it will add the player name last in the player name linked list
				playerPowerlevel.offer(avengersPowerLevel.get(characterIndex));	//	it will add the player power level last in the player power level linked list
				pname = "Avengers";
			}
			else if(antiHeroesNames.contains(player))	// it will check player is present in Anti Heroes
			{
				playerIndex = playerName.indexOf(player);
				playerName.remove(player);					//	it will remove the player name in the player name linked list
				playerPowerlevel.remove(playerIndex);		//	it will remove the player power level in the player power level linked list

				characterIndex = antiHeroesNames.indexOf(player);
				playerName.offer(player);					//   it will add the player name last in the player name linked list
				playerPowerlevel.offer(antiHeroespowerLevel.get(characterIndex));	//it will add the player power level last in the player power level linked list	
				pname = "Anti Heroes";
			}
			else if(mutantNames.contains(player))	// it will check player is present in Mutants
			{
				playerIndex = playerName.indexOf(player);
				playerName.remove(player);					//	it will remove the player name in the player name linked list
				playerPowerlevel.remove(playerIndex);		//	it will remove the player power level in the player power level linked list
				characterIndex = mutantNames.indexOf(player);
				playerName.offer(player);						//   it will add the player name last in the player name linked list
				playerPowerlevel.offer(mutantPowerlevel.get(characterIndex));	//it will add the player power level last in the player power level linked list
				pname = "Mutant";
			}
			else
			{
				System.out.println("Entered player does not match with characters");
			}
			System.out.println("Player category    : " + pname);						//print the player category
			System.out.println("Player name        : " + playerName.getLast());			//print the player name
			System.out.println("Player powerlevel  : " + playerPowerlevel.getLast());	//print the player powerlevel
		}
	}
}
