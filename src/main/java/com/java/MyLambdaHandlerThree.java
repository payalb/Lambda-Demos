package com.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLambdaHandlerThree {

	private static final Logger log= LoggerFactory.getLogger(MyLambdaHandlerThree.class);
	
	public int handler(int input) {
		log.info("Inside method");
		return  input*input;
	}
}
