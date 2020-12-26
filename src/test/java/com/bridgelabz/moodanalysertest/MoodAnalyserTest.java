package com.bridgelabz.moodanalysertest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.moodanalyser.MoodAnalyser;

public class MoodAnalyserTest {
	 @Test
	    public void givenMessage_WhenSad_ShouldReturnSad() {
	        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a sad message");
	        String mood = moodAnalyser.analyseMood();
	        Assert.assertEquals("SAD" , mood);
	    }

	    @Test
	    public void givenMessage_WhenNotSad_ShoulReturnHappy() {
	        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a happy message");
	        String mood = moodAnalyser.analyseMood();
	        Assert.assertEquals("HAPPY",mood);
	    }
}
