package com.bridgelabz.moodanalysertest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.moodanalyser.MoodAnalyser;

public class MoodAnalyserTest {
	 @Test
	    public void givenMessage_WhenSad_ShouldReturnSad() {
	        MoodAnalyser moodAnalyser = new MoodAnalyser();
	        String mood = moodAnalyser.analyseMood("this is a sad message");
	        Assert.assertEquals("SAD" , mood);
	    }

	    @Test
	    public void givenMessage_WhenNotSad_ShoulReturnHappy() {
	        MoodAnalyser moodAnalyser = new MoodAnalyser();
	        String mood = moodAnalyser.analyseMood("This is a happy message");
	        Assert.assertEquals("HAPPY" , mood);
	    }
}
