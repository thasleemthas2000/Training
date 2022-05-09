package com.training.model;
import static java.util.stream.Collectors.toList;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
public class Table {

	public static List<Streams> getStreams(){
		
		Streams places1 = new Streams("US", "Texas", 12345456L);
		Streams places2 = new Streams("Russia", "Berlin", 1020203L);
		Streams places3 = new Streams("USA", "Tampa", 4569873L);
		Streams places4 = new Streams("India", "Delhi", 1300200L);
		Streams places5 = new Streams("UAE", "Saudi Arabia", 258456123L);
		Streams places6 = new Streams("Japan", "Tokyo", 852963789L);
		
		
		
		ArrayList<Streams> streamsst = new ArrayList<Streams>();
		
		streamsst.add(places1);
		streamsst.add(places2);
		streamsst.add(places3);
		streamsst.add(places4);
		streamsst.add(places5);
		streamsst.add(places6);
		
		return streamsst;
	
	}
	
}
