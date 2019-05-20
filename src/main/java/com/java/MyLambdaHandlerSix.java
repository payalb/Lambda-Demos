package com.java;

import com.java.dto.Employee;

public class MyLambdaHandlerSix {
	
	//Must have no-arg constructor.
	//the AWS Lambda runtime will launch JVM, instantiate your class and then call your handler method for you.
	public void handler(Employee input) {
		
		System.out.println("Id is: "+ input.getId());
	}

}
/*sample input
{
    "id": 1,
    "name": "Payal",
    "company": "freelancer",
    "address": "10R delhi road"
}*/