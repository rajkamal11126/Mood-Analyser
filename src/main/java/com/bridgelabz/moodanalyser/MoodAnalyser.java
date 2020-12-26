package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	String message;

    public MoodAnalyser (String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.length() == 0)
                throw new MoodAnalysisException(MoodAnalysisException.exceptionType.ENTERED_EMPTY , "Please enter proper message");
            else if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        }   catch (NullPointerException e) {
                throw new MoodAnalysisException(MoodAnalysisException.exceptionType.ENTERED_NULL , "Please enter proper message");
        }
    }
}
