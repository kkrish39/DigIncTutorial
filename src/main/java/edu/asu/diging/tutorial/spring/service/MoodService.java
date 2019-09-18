package edu.asu.diging.tutorial.spring.service;
 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
 
import edu.asu.diging.tutorial.spring.domain.Mood;
 
@Service("moodService")
public class MoodService implements IMoodService{
 

	private List<String> listOfFeelings;
	
    private Map<String, String> feelingToReasonMap;
    
	@PostConstruct
    private void init() {
    	listOfFeelings = new ArrayList<>();
    	listOfFeelings.add("Happy");
    	listOfFeelings.add("Sad");
    	listOfFeelings.add("Sorrow");
    	listOfFeelings.add("gloomy");
    	
    	feelingToReasonMap = new HashMap<>();
    	feelingToReasonMap.put("Happy", "Because he had coffee today");
    	feelingToReasonMap.put("Sad", "Because he didn't have coffee today");
    	feelingToReasonMap.put("Sorrow", "Because he didn't go to gym");
    	feelingToReasonMap.put("gloomy", "Because he was not feeling well");
    }
	
    public Mood getCurrentMood() {
    	Random randomFeeling = new Random();
    	Integer feelValue = randomFeeling.nextInt(listOfFeelings.size());
    	
    	String currentFeeling = listOfFeelings.get(feelValue);
        return new Mood(currentFeeling, feelingToReasonMap.get(currentFeeling));
    }
}