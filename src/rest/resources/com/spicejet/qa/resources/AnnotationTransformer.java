package com.spicejet.qa.resources;

import java.lang.reflect.Constructor;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import java.lang.reflect.Method;


public class AnnotationTransformer implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
		
	}
	

}
