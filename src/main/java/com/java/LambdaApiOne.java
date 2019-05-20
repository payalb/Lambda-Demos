package com.java;

import com.java.dto.One;

public class LambdaApiOne {
	
	public One handler(String input) {
		One response= new One();
		response.setBody("Hello "+ input);
		response.setStatus("200");
		return response;
	}

}
