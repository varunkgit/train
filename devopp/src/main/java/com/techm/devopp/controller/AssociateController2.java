package com.techm.devopp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techm.devopp.entity.Associate2;

@RestController
public class AssociateController2 {

	@Autowired
	private Associate2 associate;
	
	/*@RequestMapping(value="/",method=RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("associate", associate);
		 return "index";
	}*/
	
	
	@RequestMapping(value="addAssociate",method=RequestMethod.POST)
	public ResponseEntity<Associate2> submitAssociate(@RequestBody Associate2 associate){
		/*associate.setGid("467711");
		associate.setName("varun");*/
		System.out.println(associate);
		return new ResponseEntity<Associate2>(associate, HttpStatus.OK);
	}
	
}
