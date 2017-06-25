package com.hdg.action;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hdg.service.AddressService;
import com.hdg.vo.Area;
import com.hdg.vo.City;
import com.hdg.vo.Province;
import com.hdg.vo.Result;
import com.hdg.vo.ResultEnum;

@Controller
@RequestMapping(value="/address")
public class AddressController{
	
	@Autowired
	private AddressService addressService;
	
	@RequestMapping(value="/getProvince")
	@ResponseBody
	public Result getProvince(){
		Set<Province> provinces=addressService.getProvinceAll();
		Result result=processData(provinces);
		return result;
	}
	
	@RequestMapping(value="/getCitys")
	@ResponseBody
	public Result getCitys(String provinceId){
		Set<City> citys=addressService.getCitysByProvinceId(provinceId);
		Result result=processData(citys);
		return result;
	}
	
	@RequestMapping(value="/getAreas")
	@ResponseBody
	public Result getAreas(String cityId){
		Set<Area> areas=addressService.getAreasByCityId(cityId);
		Result result=processData(areas);
		return result;
	}
	
	private Result processData(Object obj){
		System.out.println(obj);
		Result result=new Result();
		if(obj!=null){
			ResultEnum success=ResultEnum.SUCCESS;
			result.setStatus(success.getStatus());
			result.setData(obj);
			result.setMsg(success.getMsg());
		}else{
			ResultEnum error=ResultEnum.ERROR;
			result.setStatus(error.getStatus());
			result.setData(null);
			result.setMsg(error.getMsg());
		}
		return result;
	}
}
