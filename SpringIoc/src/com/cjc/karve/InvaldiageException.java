package com.cjc.karve;

public class InvaldiageException extends RuntimeException{

	
	String msg="not age";
	
	public  InvaldiageException()
	{
		System.out.println(msg);
	}

	public InvaldiageException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "InvaldiageException [msg=" + msg + "]";
	}
	
	
}
