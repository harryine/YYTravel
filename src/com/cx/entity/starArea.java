package com.cx.entity;

import java.util.List;

public class starArea {

private Integer id;
	
	//varchar2(20) - String
	private String areaName;
	
	//一个区域拥有多个明星 - 不要出现在toString方法中
	private List<star> star;
	
	public starArea() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	@Override
	public String toString() {
		return "starArea [id=" + id + ", areaName=" + areaName + "]";
	}
	
	
	
	
}
