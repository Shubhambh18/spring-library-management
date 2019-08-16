package com.example.demo.model.controller;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
//	@PostMapping(value="/addSubs",produces="application/json",consumes="application/json")
//	
//	public SubscriberDetails issueBook(SubscriberDetails entity) {
//		return this.subService.issueBook(entity);
//	}
	
	@PostMapping(value= "/issueBook" , produces="application/json", consumes="application/json")
	public SubscriberDetails sendSubscriberDetails(@RequestBody  SubscriberDetails entity)
	{
		String from_date=entity.getIssueDate();
		LocalDate f_date=LocalDate.parse(from_date);
		String to_date=entity.getReturnDate();
		LocalDate t_date=LocalDate.parse(to_date);
		
		 Period intervalPeriod = Period.between(f_date, t_date);
		 System.out.println(intervalPeriod.getDays());
		 long penalty= intervalPeriod.getDays();
		 if(penalty>15)
		 {
			 penalty=penalty-15;
		 }
		 else
		 {
			 penalty=0;
		 }
		 entity.setPenalty(penalty);
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
	@GetMapping(value="/getSubscriber/{id}")
	 public SubscriberDetails showSubscriber(@PathVariable("id") long id)
	{
	return this.subService.showDetails(id).get();
	}
	
//	
	@PostMapping(value= "/deleteSubscriber" )
	public void deleteBook(@RequestBody SubscriberDetails entity)
	{
	  this.subService.deleteBookById(entity);
	}
//	
	
	
	
	
}
