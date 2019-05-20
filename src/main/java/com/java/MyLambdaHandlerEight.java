package com.java;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MyLambdaHandlerEight {
	
	//Must have void return type.
	//To return a value, just write it to the output stream.
	public void handler(InputStream input, OutputStream output) throws IOException {
		int char1= input.read();
		while(char1!= -1) {
			output.write(Character.toUpperCase(char1));
			char1= input.read();
		}
		
		
	}/*Sample input:"hello there! "*/

}
