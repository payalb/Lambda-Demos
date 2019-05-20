package com.java;

import com.amazonaws.services.lambda.runtime.events.S3Event;

public class MyLambdaHandlerSeven {
	
	//Must have no-arg constructor.
	//the AWS Lambda runtime will launch JVM, instantiate your class and then call your handler method for you.
	public void handler(S3Event event) {
		System.out.println("Object name: " + event.getRecords().get(0).getS3().getObject().getKey());
	}

}
