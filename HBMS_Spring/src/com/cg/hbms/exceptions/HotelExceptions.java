package com.cg.hbms.exceptions;

public class HotelExceptions extends Exception {
private static final long serialVersionUID = 1L;

//	Add logger. Exception should not be visible to the user.
//	Remove unused constructors

	public HotelExceptions() {
	}

	public HotelExceptions(String arg0) {
		super(arg0);
	}

	public HotelExceptions(Throwable arg0) {
		super(arg0);
	}

	public HotelExceptions(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public HotelExceptions(String arg0, Throwable arg1, boolean arg2,boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
