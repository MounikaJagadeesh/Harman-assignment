package com.example.Marvel;

import java.util.Arrays;

public class CheckPlayers extends Players
{
	public void checkSize(String player) 	// method for the check  player size
	{
		if(playerName.size()>15)			// it will work when player linked list size is greater than 15  or not 
		{
			int index = 0; 
			boolean first;
			int min = 0;
			int minIndex = 0;
			if(avengersNames.contains(player))	//	it will check the player already is present in the avengers linked list or not
			{
				index = avengersNames.indexOf(player);
				first = avengersFirstTime.get(index); 	// it return the player is first time called by the player or not
				if(first == true)						// this will work when the player is first time called by the player	
				{
					Object[] array = playerPowerlevel.toArray();
					Integer[] array1 = Arrays.copyOf(array,array.length,Integer[].class);
					for(int i = 0;i <=array1.length-1;i++)
					{
						if(array1[i]<min)
						{
							min = array1[i];
							minIndex = i;
						}
					}
					playerName.remove(minIndex);	//	it remove the least power level player
					playerPowerlevel.remove(minIndex);	//	it remove least power level 
				}
			}
			else if(antiHeroesNames.contains(player))	//	it will check the player already is present in the avengers linked list or not
			{
				index = antiHeroesNames.indexOf(player);
				first = antiHeroesFirstTime.get(index);		// it return the player is first time called by the player or not
				if(first == true)							// this will work when the player is first time called by the player
				{
					Object[] array = playerPowerlevel.toArray();
					Integer[] array1 = Arrays.copyOf(array,array.length,Integer[].class);
					for(int i = 0;i <=array1.length-1;i++)
					{
						if(array1[i]<min)
						{
							min = array1[i];
							minIndex = i;
						}
					}
					playerName.remove(minIndex);	//	it remove the least power level player
					playerPowerlevel.remove(minIndex);	//	it remove least power level 
				}
			}
			else if(mutantNames.contains(player))	//	it will check the player already is present in the avengers linked list or not
			{
				index = mutantNames.indexOf(player);
				first = mutantFirstTime.get(index);// it return the player is first time called by the player or not
				if(first == true)					// this will work when the player is first time called by the player
				{
					Object[] array = playerPowerlevel.toArray();
					Integer[] array1 = Arrays.copyOf(array,array.length,Integer[].class);
					for(int i = 0;i <=array1.length-1;i++)
					{
						if(array1[i]<min)
						{
							min = array1[i];
							minIndex = i;
						}
					}
					playerName.remove(minIndex);	//	it remove the least power level player
					playerPowerlevel.remove(minIndex);	//	it remove least power level
				}
			}
			playerName.removeFirst();				// it remove the least used player
			playerPowerlevel.removeFirst();			//	it remove least used player power level
		}
	}
	public boolean checkAvengers(String player)		//it will check the player already is present in the avengers linked list or not
	{
		checkSize(player);
		if(avengersNames.contains(player))
		{
			int index = 0; 
			playerCategory = "Avengers";
			index = avengersNames.indexOf(player);
			avengersFirstTime.set(index,true);
			playerName.offer(player);				// it add the avenger player to the player list
			playerPowerlevel.offer(avengersPowerLevel.get(index));	// it add the avenger player power level to the player power level list
			return true;
		}
		else
			return false;
	}
	public boolean checkAntiheroes(String player)	//it will check the player already is present in the anti heroes linked list or not
	{
		if(antiHeroesNames.contains(player))
		{
			int index = 0; 
			playerCategory = "Anti Heroes";
			index = antiHeroesNames.indexOf(player);
			antiHeroesFirstTime.set(index,true);
			playerName.offer(player);				// it add the anti heroes player to the player list
			playerPowerlevel.offer(antiHeroespowerLevel.get(index));	// it add the anti heroes player power level to the player power level list
			return true;
		}
		else
			return false;
	}
	public boolean checkMutants(String player)	//it will check the player already is present in the mutant linked list or not
	{
		if(mutantNames.contains(player))
		{
			int index = 0; 
			playerCategory = "Mutant";
			index = mutantNames.indexOf(player);
			mutantFirstTime.set(index,true);
			playerName.offer(player);			// it add the mutant player to the player list
			playerPowerlevel.offer(mutantPowerlevel.get(index));	// it add the mutant player power level to the player power level list
			return true;
		}
		else
			return false;
	}
	public void printPlayers()
	{
		System.out.println("Player category        :   " + playerCategory);	// it will print the player category
		System.out.println("Player name            :   " + playerName.getLast());	// it will print the player name
		System.out.println("Player power level     :   " + playerPowerlevel.getLast());	// it will print the player power level 
		System.out.println();
	}
}
