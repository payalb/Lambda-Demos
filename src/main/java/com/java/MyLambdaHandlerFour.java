package com.java;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLambdaHandlerFour {

	private static final Logger log = LoggerFactory.getLogger(MyLambdaHandlerFour.class);

	public Set<Entry<Integer, Integer>> handler(Map<Integer, Integer> input) {
		log.info("Inside method");
		return input.entrySet().stream().map(entry -> {
			entry.setValue(entry.getValue() * 2);
			return entry;
		}).collect(Collectors.toSet());
	}
}
/*{
"12":  "12",
"23" : "23"
}*/