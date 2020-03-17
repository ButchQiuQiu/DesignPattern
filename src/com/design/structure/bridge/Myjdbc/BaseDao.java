package com.design.structure.bridge.Myjdbc;

import java.util.List;
//桥接模式 分为两个维度 可以减少类的数量和扩展的能力

//所有接口的父类 有2个通用方法 如果某张表需求独特的功能就写在对应的接口上 
public interface BaseDao<T>{
	//查
	public List<T>  ExecuteQueryBySql(Class<T> cs,String sql,Object... values);
	//增删改
	public boolean ExecuteUpdateBySql(String sql,Object... values);
}
