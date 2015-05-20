package com.billy.StockWatcher.client;

import java.io.Serializable;

public class NotLoggedInException extends Exception implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3413081318575985261L;

	public NotLoggedInException() {
		super();
	}

	public NotLoggedInException(String message) {
		super(message);
	}

}
