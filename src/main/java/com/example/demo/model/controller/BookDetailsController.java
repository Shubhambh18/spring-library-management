package com.example.demo.model.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BookDetails;
import com.example.demo.services.BookDetailService;

@RestController

public class BookDetailsController {
	
	@Autowired
	private BookDetailService bookService;
	
	
	@PostMapping(value="/addBooks",produces="application/json",consumes="application/json")
	public BookDetails add(BookDetails entity) {
		return this.bookService.save(entity);
	}
	
	
	@GetMapping(value="/getAllBooks")
	public List<BookDetails> getAll(){
		
		List<BookDetails> bookList=new ArrayList<>();
		
		this.bookService.findAll().forEach(eachObject -> {
			bookList.add(eachObject);
		
		});	
		
		return bookList;
		
	}
	
	@PostMapping(value= "/deleteBook" )
	public void deleteBook(@RequestBody BookDetails entity)
	{
	  this.bookService.deleteBookById(entity);
	}

	
	
}
