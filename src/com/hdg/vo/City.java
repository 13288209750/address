package com.hdg.vo;

public class City {
	private Integer id;
	private String cityId;
	private String cityName;
	private String provinceId;
	public City() {
		super();
	}
	public City(Integer id, String cityId, String cityName, String provinceId) {
		super();
		this.id = id;
		this.cityId = cityId;
		this.cityName = cityName;
		this.provinceId = provinceId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", cityId=" + cityId + ", cityName=" + cityName + ", provinceId=" + provinceId + "]";
	}
}
