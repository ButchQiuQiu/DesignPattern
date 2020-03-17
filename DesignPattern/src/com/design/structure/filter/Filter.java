package com.design.structure.filter;

import java.util.List;

public abstract class Filter {
	public abstract List<Person> FilterPerson(List<Person> persons,String str);
}
