package edu.asu.diging.tutorial.spring.domain;

public class Mood {
	 
    private String feeling;
    
    private String reasonOfFeeling;
    
    public Mood(String mood, String reason) {
    	feeling = mood;
    	reasonOfFeeling = reason;
    }
    
    public String getFeeling() {
        return feeling;
    }
 
    public void setFeeling(String feeling) {
        this.feeling = feeling;
    }
    
    public String getReasonOfFeeling() {
    	return reasonOfFeeling;
    }
    
    public void setReasonOfFeeling(String reason) {
    	this.reasonOfFeeling = reason;
    }
}