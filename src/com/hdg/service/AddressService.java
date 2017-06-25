package com.hdg.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdg.dao.AddressDao;
import com.hdg.vo.Area;
import com.hdg.vo.City;
import com.hdg.vo.Province;

@Service
public class AddressService {
	@Autowired
	private AddressDao addressDao;
	
	public Set<Province> getProvinceAll() {
		Set<Province> provinces=addressDao.getProvinces();
		if(provinces!=null&&provinces.size()!=0){
			return provinces;
		}else{
			return null;
		}
	}

	public Set<City> getCitysByProvinceId(String provinceId) {
		Set<City> citys=addressDao.getCitys(provinceId);
		if(citys!=null&&citys.size()!=0){
			return citys;
		}else{
			return null;
		}
	}

	public Set<Area> getAreasByCityId(String cityId) {
		Set<Area> areas=addressDao.getAreas(cityId);
		if(areas!=null&&areas.size()!=0){
			return areas;
		}else{
			return null;
		}
	}
}
