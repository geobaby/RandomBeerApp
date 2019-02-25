package com.test.beerapp;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Random;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;

@RestController
public class BeerController {
	
	@RequestMapping(value="/beers", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public String GetBeer() throws IOException	{
		
		ClassLoader classLoader = new BeerController().getClass().getClassLoader();
		File jsonFile = new File(classLoader.getResource("config/beers.json").getFile());
		String fileContent = new String(Files.readAllBytes(jsonFile.toPath()));
		
		Random rand = new Random();
		int n = rand.nextInt(10);
		
		Gson gson = new Gson();
		BeerModel[] beers = gson.fromJson(fileContent, BeerModel[].class);
		 
		String jsonString = gson.toJson(beers[n]);
		return jsonString;
	}
}

