package com.hdg.vo;

public class Area {
	private Integer id;
	private String areaId;
	private String areaName;
	private String cityId;
	public Area() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	@Override
	public String toString() {
		return "Area [id=" + id + ", areaId=" + areaId + ", areaName=" + areaName + ", cityId=" + cityId + "]";
	}
	
	
}
