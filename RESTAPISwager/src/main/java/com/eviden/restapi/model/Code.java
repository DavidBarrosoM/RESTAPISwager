package com.eviden.restapi.model;

import java.io.Serializable;

public class Code implements Serializable{
	private long id;
	private String Package;
	private String File; 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPackage() {
		return Package;
	}
	public void setPackage(String package1) {
		Package = package1;
	}
	public String getFile() {
		return File;
	}
	public void setFile(String file) {
		File = file;
	}
}
