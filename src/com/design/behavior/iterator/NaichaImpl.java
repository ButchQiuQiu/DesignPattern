package com.design.behavior.iterator;
// 继承需要处理的实体类 然后子类实现迭代器
//或者直接写个内部类实现迭代器接口实现迭代器方法 
public class NaichaImpl extends NaiCha implements Iterator<String>{
	private int index=0;
	@Override
	public boolean hasNext() {
		if(this.index<this.getA().length) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String next() {
		return this.getA()[index++];
	}
}
