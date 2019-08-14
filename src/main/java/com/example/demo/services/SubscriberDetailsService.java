package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.BookDetails;
import com.example.demo.model.SubscriberDetails;
import com.example.demo.repository.BookDetailsRepository;
import com.example.demo.repository.SubscriberDetailsRepository;

@Service
public class SubscriberDetailsService {

	@Autowired
	SubscriberDetailsRepository subsRepo;
	
	public SubscriberDetails issueBook(SubscriberDetails entity) {
		
		return subsRepo.save(entity);
	}
	public Iterable<SubscriberDetails> findAll(){
		return subsRepo.findAll();
	}
	
//	public void deleteBookById(SubscriberDetails entity)
//	{
//
//		subsRepo.deleteById(entity.getSubscriberID());
//	}
	
	

}
