package com.samuel.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView; 

import com.samuel.model.StudentModel;

@Controller 
public class AdmissionController {
	
	@RequestMapping(value="/admissionform", method=RequestMethod.GET)
	public String getAdmissionDetails() {
		//ModelAndView modelview= new ModelAndView("admissionform");
		return "admissionform";
	}
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-mm-dd");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));
	}
	@ModelAttribute
	public void addingCommonObjects(Model modelview) {
		modelview.addAttribute("headerMessage", "SoftBlue Digital Academy");
	}
	
	@RequestMapping(value="/submitform", method=RequestMethod.POST)
	public ModelAndView postAdmissionDetails( @Valid @ModelAttribute("students") StudentModel students, BindingResult result) {
		
		if(result.hasErrors()) {
			ModelAndView modelview= new ModelAndView("admissionform");
			return modelview;
		}else {
		ModelAndView modelview= new ModelAndView("admissionsuccess");
		
		return modelview;
		}
	}

}
