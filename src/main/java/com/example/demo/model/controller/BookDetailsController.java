package com.example.demo.model.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BookDetails;
import com.example.demo.repository.BookDetailsRepository;

@RestController


public class BookDetailsController {
	
	@Autowired
	BookDetailsRepository bookrepo;
	
	 @GetMapping("/all")
	    public List<BookDetails> getAll() {
		 List<BookDetails> bookList=new ArrayList<>();
			
			this.bookrepo.findAll().forEach(eachObject -> {
				bookList.add(eachObject);
			
			});	
			
			return bookList;
	    }
	 
}
