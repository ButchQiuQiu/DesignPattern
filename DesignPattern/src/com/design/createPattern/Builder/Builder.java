package com.design.createPattern.Builder;
//建造者 声明具体建造者方法的抽象层
public interface Builder {
	public void builderSpeed();
	public void builderPrice();
	public void builderName();
	public Car getCar();
}
