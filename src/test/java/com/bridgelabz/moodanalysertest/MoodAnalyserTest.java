package com.bridgelabz.moodanalysertest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.moodanalyser.MoodAnalyser;
import com.bridgelabz.moodanalyser.MoodAnalysisException;

public class MoodAnalyserTest {
	 @Test
	    public void givenMessage_WhenSad_ShouldReturnSad() {
	        MoodAnalyser moodAnalyser = new MoodAnalyser("I am sad message");
	        String mood;
			try {
				mood = moodAnalyser.analyseMood();
				Assert.assertEquals("SAD" , mood);
			} catch (MoodAnalysisException e) {
				e.printStackTrace();
			}
	        
	    }

	    @Test
	    public void givenMessage_WhenNotSad_ShoulReturnHappy() {
	        MoodAnalyser moodAnalyser = new MoodAnalyser("I am happy message");
	        String mood;
			try {
				mood = moodAnalyser.analyseMood();
				Assert.assertEquals("HAPPY",mood);
			} catch (MoodAnalysisException e) {
				e.printStackTrace();
			}
	        
	    }
	    
	    @Test
	    public void givenNullMood_ShouldReturnHappy() {
	        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
	        String mood;
			try {
				mood = moodAnalyser.analyseMood();
				Assert.assertEquals("HAPPY" , mood);
			} catch (MoodAnalysisException e) {
				e.printStackTrace();
			}
	        
	    }
}
