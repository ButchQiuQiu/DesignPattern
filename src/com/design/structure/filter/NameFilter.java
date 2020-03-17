package com.design.structure.filter;

import java.util.ArrayList;
import java.util.List;

public class NameFilter extends Filter {

	@Override
	public List<Person> FilterPerson(List<Person> persons, String str) {
		List<Person> newPersons=new ArrayList<Person>();
		for(Person tempPerson:persons) {
			if(str.equals(tempPerson.getName())==false) {
				newPersons.add(tempPerson);
			}
		}
		return newPersons;
	}

}
