package com.training;
import static java.util.stream.Collectors.toList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import com.training.model.Streams;
import com.training.model.Table;

public class StreamTables {

	public static void main(String[] args) {
		List<Streams> tableList =Table.getStreams();
	     Scanner sc = new Scanner(System.in);
		System.out.println("Enter place to find its country");
		String a=sc.next();
		
		
		Function<Streams,String> mapc =e->e.getCountry();
		Predicate<Streams> place1 =r->r.getPlace().equals(a);
		List<String> tableName = (List<String>) tableList.stream().filter(place1).map(mapc).collect(toList());
		tableName.forEach(System.out::println);
		
		System.out.println("Enter the Country and find its Count");
		String b = sc.next();
		long list =tableList.stream().filter(e->e.getCountry().equals(b)).count();
		System.out.println(b +" "+list);
		
		System.out.println("Enter the country to find population");
		String c = sc.next();
		Function<Streams,Long> people =e->e.getPopulation();
		Predicate<Streams> area =r->r.getCountry().equals(c);
		List<Long> table1 = tableList.stream().filter(area).map(people).collect(toList());
		table1.forEach(System.out::println);
		sc.close();
	}
}
