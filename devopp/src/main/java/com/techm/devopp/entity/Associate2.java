package com.techm.devopp.entity;

import org.springframework.stereotype.Component;

@Component
public class Associate2 {

	private String gid;
	private String name;
	
	
	
	public Associate2() {
		
	}

	


	public Associate2(String gid, String name) {
		super();
		this.gid = gid;
		this.name = name;
	}


	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Associate2 [gid=" + gid + ", name=" + name + "]";
	}




	
	
	
	
}
