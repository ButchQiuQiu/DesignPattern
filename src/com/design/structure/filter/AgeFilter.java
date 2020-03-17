package com.design.structure.filter;

import java.util.ArrayList;
import java.util.List;

public class AgeFilter extends Filter {

	@Override
	public List<Person> FilterPerson(List<Person> persons, String str) {
		List<Person> newPersons=new ArrayList<Person>();
		for(Person tempPerson:persons) {
			if(str.equals(Integer.toString(tempPerson.getAge()))==false) {
				newPersons.add(tempPerson);
			}
		}
		return newPersons;
	}

}
