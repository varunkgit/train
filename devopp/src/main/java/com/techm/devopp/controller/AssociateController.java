package com.techm.devopp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.techm.devopp.entity.Associate;

@RestController
public class AssociateController {

	/*@Autowired
	private Associate associate;*/
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("associate", new Associate());
		 return "index";
	}
	
	
	@RequestMapping(value="saveAssociateDetails",method=RequestMethod.POST)
	public ModelAndView submitAssociate(@ModelAttribute("associate") Associate associate){
	ModelAndView mav = new ModelAndView("confirm");
	mav.addObject("associate", associate);
	return mav;
	}
	
	
	
	
	
	@RequestMapping(value="getJsonNames",method=RequestMethod.GET)
	public List<Associate> getJsonNames(){
		List<Associate> associateList = new ArrayList<Associate>();
		associateList.add(new Associate("varun","reddy"));
		associateList.add(new Associate("abc","123"));
		associateList.add(new Associate("def","345"));
      
      
		return associateList;
		
		
	}
	
}
