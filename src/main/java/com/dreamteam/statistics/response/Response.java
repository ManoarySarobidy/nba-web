package com.dreamteam.statistics.response;

import java.util.HashMap;

public class Response{
	
	HashMap<String, Object> data = new HashMap<String, Object>();
	HashMap<String, Object> error = new HashMap<String, Object>();

	public Response addData( String label, Object data ){
		this.getData().put(label, data);
		return this;
	}

	public HashMap<String, Object> getData(){
		return this.data;
	}


	public Response addError( String label, Object error ){
		this.getError().put(label, data);
		return this;
	}

	public HashMap<String, Object> getError(){
		return this.error;
	}

}