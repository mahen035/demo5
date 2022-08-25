package com.training.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionSort {

	public static void main(String[] args) {
		
		Set<String> names = new HashSet<>();
		
		List<Student> studList = new ArrayList<>();
		
		studList.add(new Student("John", 105, 23));
		studList.add(new Student("Kevin", 102, 24));
		studList.add(new Student("Adam", 101, 22));
		//studList.add(new Student("John", 101, 23));
		
		Collections.sort(studList, new AgeComparator());
		
		for(Student stud:studList) {
			System.out.println(stud.getName()+":"+stud.getRollNo());
		}
		
		/*
		 * names.add("John"); names.add("Kevin"); names.add("Kelly");
		 * names.add("Kelly");
		 * 
		 * for(String name : names) { System.out.println(name); }
		 */
	}

}
