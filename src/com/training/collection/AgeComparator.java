package com.training.collection;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getAge() > o2.getAge()) {
			return 1;
		}
		else if(o1.getAge() < o2.getAge()) {
			return -1;
		}
		else {
			return 0;
		}
	}

}

// Create an Employee class with empId, empName, and salary field
// Add 5 employees in a collection and sort them based on the descending order or their salaries. 
