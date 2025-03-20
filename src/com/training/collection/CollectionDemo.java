package com.training.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class CollectionDemo {
	//LinkedList

	

	public static void main(String[] args) {
		List <String> names = new ArrayList <String> (); 

		names.add("Ahmed");
		names.add("Hassan");
		names.add("Ali");
		names.add("Fatimah");


		for(String name:names) {
			System.out.println(name);
		}

		

		
		// Set 
		System.out.println("Displaying Set:::");
		Set <String> namesset = new HashSet<String>();
		namesset.add(new String("Anwaar"));
		namesset.add(new String("Mohammed"));
		namesset.add(new String("Ahmed"));
		namesset.add(new String("Noof"));

		

		

		for(String name:namesset) {
			System.out.println(name);
		}

		

		
		System.out.println("Displaying Employee:::");
		Set <Employee> empSet = new HashSet <> ();
		empSet.add (new Employee(101, "Jeanan", "IT", 2000));
		empSet.add (new Employee(102, "Anwaar", "IT", 3000));
		empSet.add (new Employee(103, "Noof", "IT", 4000));
		empSet.add (new Employee(104, "Ahmed", "IT", 4000));
		empSet.add (new Employee(105, "Mohammed", "IT", 4000));


		for(Employee emp: empSet) {
			System.out.println(emp);
		}
		
		
		Map<Integer ,String> empMap = new HashMap<>();
		empMap.put(101, "Mohamed");
		empMap.put(102, "Suleiman");
		empMap.put(103, "FarH");
		empMap.put(101, "Noorie");
		//System.out.println(empMap.get(101));
		//or do the below:
		for(Entry<Integer, String> empEntry: empMap.entrySet()) {
			System.out.println(empEntry.getKey()+ ":" + empEntry.getValue());

		}

	}


//		//2 :collection have itrroter method
		
//		Iterator<String> iter = names.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
	}

 

