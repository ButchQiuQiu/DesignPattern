/**
 * 
 */
package com.design.structure.bridge.normal;

/**
 * @author QiuQiu
 *
 */
public abstract class AbstractPen {
	public void draw(Color color) {
		System.out.println("我在用"+color.getDetail()+"颜色的"+this.getpenDetail()+"画画");
	};
	protected abstract String getpenDetail();
}
