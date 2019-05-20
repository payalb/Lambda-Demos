package com.java;

public class MyLambdaHandler {
	
	//Must have no-arg constructor.
	//the AWS Lambda runtime will launch JVM, instantiate your class and then call your handler method for you.
	public void handler(String input) {
		String message= String.format("Hello, %s", input);
		System.out.println(message);
	}

}
