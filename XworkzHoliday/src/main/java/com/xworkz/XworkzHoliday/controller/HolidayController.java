package com.xworkz.XworkzHoliday.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class HolidayController {
	public HolidayController() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/addHoliday")
	public String addHoliday(@RequestParam String holidayDate, @RequestParam String holidayType,
			@RequestParam String paid, @RequestParam String numOfDays, ModelMap model) {
	
		System.out.println("invoked addHoliday() of HolidayController");
		System.out.println("holidayDate:" + holidayDate);
		System.out.println("holidayType:" + holidayType);
		System.out.println("paid:" + paid);
		System.out.println("NumOfDays:" + numOfDays);
		if (!holidayDate.isEmpty()) {
			String message1 = "Holiday added successfully";
			model.addAttribute("HolidayMessage", message1);

		}
		return "AddHoliday";
	}
}
