package com.xworkz.XworkzHoliday.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xworkz.XworkzHoliday.Entity.IPLEntity;
import com.xworkz.XworkzHoliday.Service.IPLService;

@Component
@RequestMapping("/")
public class IPLController {
	@Autowired
	IPLService iplService;

	public IPLController() {
		System.out.println("created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/onRegister.do")
	public String onRegister(@ModelAttribute IPLEntity iplEntity, ModelMap model) {
		System.out.println("invoked onRegister");

		boolean vaidation = this.iplService.validateAndSave(iplEntity);
		if (vaidation) {
			System.out.println("DETAILS=" + iplEntity.toString());
			model.addAttribute("details", iplEntity.toString());
		} else {
			String failMsg = "Can't able to register,Please enter void detail";
			model.addAttribute("faild", failMsg);
		}
		return "Success";
	}
}
