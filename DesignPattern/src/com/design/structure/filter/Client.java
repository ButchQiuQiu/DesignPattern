package com.design.structure.filter;

import java.util.ArrayList;
import java.util.List;

//过滤器模式，针对一个实体类的多个过滤器。 每一个过滤器都实现自己的过滤逻辑。
public class Client {
	public static void main(String[] args) {
		List<Person> persons=new ArrayList<Person>();
		persons.add(new Person("球球","女","广东中山", 23));
		persons.add(new Person("布奇","男","湖南张家界", 25));
		persons.add(new Person("琥珀","女","广东广州", 1));
		persons.add(new Person("张三","男","广东深圳", 22));
		persons.add(new Person("李四","女","湖南长沙", 23));
//		Filter filter=new SexFilter();
//		persons=filter.FilterPerson(persons, "女");
//		Filter filter=new NameFilter();
//		persons=filter.FilterPerson(persons, "张三");
		Filter filter=new AddressFilter();
		persons=filter.FilterPerson(persons, "广东");
		System.out.println(persons);
	}
}
