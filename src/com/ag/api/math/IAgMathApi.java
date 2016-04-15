package com.ag.api.math;

public class IAgMathApi {

	static {
        System.loadLibrary("IAgMathApi");
    }
	
	public native int  add(int a, int b);
}
