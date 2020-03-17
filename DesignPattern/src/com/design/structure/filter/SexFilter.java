package com.design.structure.filter;

import java.util.ArrayList;
import java.util.List;

public class SexFilter extends Filter {
	@Override
	public List<Person> FilterPerson(List<Person> persons,String str) {
		List<Person> newPersons=new ArrayList<Person>();
		for(Person tempPerson:persons) {
			if(str.equals(tempPerson.getSex())==false) {
				newPersons.add(tempPerson);
			}
		}
		return newPersons;
	}
}
