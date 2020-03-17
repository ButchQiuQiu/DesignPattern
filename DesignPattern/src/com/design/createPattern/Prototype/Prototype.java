package com.design.createPattern.Prototype;

import java.io.Serializable;

public abstract class Prototype implements Cloneable ,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected Object clone()  {
		// TODO Auto-generated method stub
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
