package com.example.demo.model.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BookDetails;
import com.example.demo.model.SubscriberDetails;
import com.example.demo.services.SubscriberDetailsService;

@RestController
public class SubscriberDetailsController {

	@Autowired
	private SubscriberDetailsService subService;
	
	@PostMapping(value="/addSubs",produces="application/json",consumes="application/json")
	public SubscriberDetails issueBook(SubscriberDetails entity) {
		return this.subService.issueBook(entity);
	}
	
	@GetMapping(value="/getAllSubs")
	public List<SubscriberDetails> getAll(){
		
		List<SubscriberDetails> subsList=new ArrayList<>();
		
		this.subService.findAll().forEach(eachObject -> {
			subsList.add(eachObject);
		
		});	
		
		return subsList;
		
	}
	
//	@PostMapping(value= "/deleteSubscriber" )
//	public void deleteBook(@RequestBody SubscriberDetails entity)
//	{
//	  this.subService.deleteBookById(entity);
//	}
	
	
	
	
	
}
