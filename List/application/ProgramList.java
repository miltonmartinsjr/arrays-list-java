package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");
		
		System.out.println("Length of the list: " + list.size());
		System.out.println();

		
		for(String names : list) {
			System.out.print(names + " \n");
		}
		
		System.out.println("------------------------");
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String names : list) {
			System.out.print(names + " \n");
		}
		
		System.out.println("------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String names : result) {
			System.out.println(names);
		}
		
		System.out.println("------------------------");
		String names = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		System.out.println(names);
		
		
		
	}

}
