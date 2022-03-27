package com.campus.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.campus.myapp.service.DataService;

@RestController
public class MapController {
	
	@GetMapping("/front/carousel")
	public ModelAndView carouselPage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("front/carousel");
		return mav;
	}
	@GetMapping("/front/googleMapGeocoder")
	public ModelAndView mapPage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("front/googleMapGeocoder");
		return mav;
	}
	
}
