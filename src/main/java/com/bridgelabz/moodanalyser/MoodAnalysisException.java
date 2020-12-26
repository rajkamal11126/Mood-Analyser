package com.bridgelabz.moodanalyser;

public class MoodAnalysisException extends Exception {
	 enum exceptionType {
	        ENTERED_NULL,ENTERED_EMPTY;
	    }
	    exceptionType type;
	    public MoodAnalysisException(exceptionType type , String message) {
	        super(message);
	        this.type = type;
	    }
}
