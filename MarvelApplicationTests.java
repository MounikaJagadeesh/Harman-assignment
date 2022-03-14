package com.example.Marvel;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
class MarvelApplicationTests 
{
	public static void main(String[] args) 
	{
		//SpringApplication.run(MarvelApplicationTests.class,args);
		
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
	        
	        JSONArray avengersPowerLevel = (JSONArray)avengersobject.get("po");    
	        //
	        //System.out.println(powerlevel);
							
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
	
	private static void parseEmployeeObject(JSONObject employee) 
    {
        //Get player object within list
        JSONObject character = (JSONObject) employee.get("characters");
         
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
