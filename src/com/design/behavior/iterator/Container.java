package com.design.behavior.iterator;
//实体类接口
public interface Container {
	public <T>Iterator<T> getIterator();
}
