package com.example.Marvel;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarvelApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(MarvelApplication.class, args);
			
		//JSON parser object to parse read file
		JSONParser parser = new JSONParser();
			
		try
		{
			//Read JSON file
			JSONObject avengersobject =(JSONObject) parser.parse(new FileReader("src/main/java/com/example/Marvel/Avengers.json"));
			JSONObject antiheroesobject =(JSONObject) parser.parse(new FileReader("src/main/java/com/example/Marvel/Mutant.json"));
			JSONObject mutantobject =(JSONObject) parser.parse(new FileReader("src/main/java/com/example/Marvel/Mutant.json"));
			
			String avengersCategory = (String) avengersobject.get("name"); 
	        System.out.println(avengersCategory);
	        JSONArray characters = (JSONArray)avengersobject.get("character");
	        System.out.println(characters);
	        String antiheroesCategory = (String) antiheroesobject.get("name"); 
	        System.out.println(antiheroesCategory);
	        JSONArray antiheroescharacters = (JSONArray)antiheroesobject.get("character");
	        System.out.println(antiheroescharacters);
	        String mutantCategory = (String) mutantobject.get("name"); 
	        System.out.println(mutantCategory);
	        JSONArray mutantcharacters = (JSONArray)mutantobject.get("character");
	        System.out.println(mutantcharacters);
//	        JSONArray avengersPowerLevel = (JSONArray)avengersobject.get("po");    
//	        //System.out.println(powerlevel);
	        parseEmployeeObject(avengersobject);
								
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
	        e.printStackTrace();
	    } 
		catch (ParseException e) 
		{
            e.printStackTrace();
        }
			
	}
		
	private static void parseEmployeeObject(JSONObject avengersobject) 
    {
		//Get player object within list
        JSONObject character = (JSONObject) avengersobject.get("characters");
        //Get player category
	    String category = (String) character.get("firstName");    
	    System.out.println(category);
	    //Get player name
	    String name = (String) character.get("lastName");  
	    System.out.println(name);
	    //Get player power level
	    String powerlevel = (String) character.get("website");    
	    System.out.println(powerlevel);
	}
}
