package com.bridgelabz.moodanalyser;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserReflector {
	public static MoodAnalyser createMoodAnalyser() {
		MoodAnalyser result = null;
		try {
			Class<?> moodAnalyserClass = Class.forName("com.bridgelabz.moodanalyser.MoodAnalyser");
			Constructor<?> moodConstructor = moodAnalyserClass.getConstructor();
			Object moodObj = moodConstructor.newInstance();
			return (MoodAnalyser) moodObj;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static MoodAnalyser createMoodAnalyserObject(String s) throws MoodAnalysisException {
		try {
			Class<?> moodAnalyserClass = Class.forName("com.bridgelabz.moodanalyser.MoodAnalyser");
			Constructor<?> moodConstructor = moodAnalyserClass.getConstructor(String.class);
			Object moodObj = moodConstructor.newInstance(s);
			return (MoodAnalyser) moodObj;
		} catch (ClassNotFoundException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_CLASS,
					"NO_SUCH_CLASS_ERROR_FOUND");
		} catch (NoSuchMethodException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_METHOD, "NO_SUCH_METHOD");
		} catch (IllegalAccessException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_ACCESS, "NO_ACCESS");
		} catch (InstantiationException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_CLASS, "NO_SUCH_CLASS_ERROR");
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Object invokeMethod(Object moodAnalyserObject, String methodName) throws MoodAnalysisException {
		try {
			return moodAnalyserObject.getClass().getMethod(methodName).invoke(moodAnalyserObject);
		} catch (IllegalAccessException | InvocationTargetException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.METHOD_INVOCATION_ISSUE,
					"Invocation issue");
		} catch (NoSuchMethodException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_METHOD,
					"Define Proper Method Name");
		}
	}
}
