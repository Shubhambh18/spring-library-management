package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.example.demo.model.BookDetails;
import com.example.demo.repository.BookDetailsRepository;

@Service
public class BookDetailService {

	@Autowired
	BookDetailsRepository bookrepo;
	

	public BookDetails save(BookDetails entity) {
		
		return bookrepo.save(entity);
	}
	
	public Iterable<BookDetails> findAll(){
		return bookrepo.findAll();
	}
	
	public void deleteBookById(BookDetails entity)
	{

		bookrepo.deleteById(entity.getBookId());
	}
	
	
	

}
