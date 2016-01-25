/**
 * 
 */
package com.clea.zuul.commons;

/**
 * @author vickrame
 *
 */
public enum MethodName {

	GET(1,"get"),
	POST(2,"post"),
	PRE(3,"PRE");
	
	private int code;
	private String label;
	
	private MethodName(final int code, final String label){
		this.code=code;
		this.label=label;
		
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	
	
}
