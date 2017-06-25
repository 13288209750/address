package com.hdg.dao;

import java.util.Set;

import org.springframework.stereotype.Component;

import com.hdg.vo.Area;
import com.hdg.vo.City;
import com.hdg.vo.Province;

public interface AddressDao {
	Set<Province> getProvinces();

	Set<City> getCitys(String provinceId);

	Set<Area> getAreas(String cityId);
}
