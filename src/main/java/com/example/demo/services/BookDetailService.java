package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.BookDetails;
import com.example.demo.repository.BookDetailsRepository;

public class BookDetailService {

	@Autowired
	BookDetailsRepository bookrepo;
	
	public Iterable<BookDetails> findAll(){
		return bookrepo.findAll();
	}

}
