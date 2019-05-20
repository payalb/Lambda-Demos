package com.java;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLambdaHandlerFive {

	private static final Logger log = LoggerFactory.getLogger(MyLambdaHandlerFive.class);

	public Map<Integer,Map<Integer, Integer>> handler(List<Map<Integer, Integer>> input) {
		log.info("Inside method");
		Map<Integer,Map<Integer, Integer>> map= new HashMap<>();
		IntStream.range(0, input.size()).forEach(i-> map.put(i, input.get(i)));
		return map;
	}
}
/*[{
    "12":  "12",
    "23" : "23"
},
    {
  "2": "22",
  "53": "53"
}
]

output: {
  "0": {
    "12": 12,
    "23": 23
  },
  "1": {
    "2": 22,
    "53": 53
  }
}*/