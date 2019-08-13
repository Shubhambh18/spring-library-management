package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.BookDetails;

public interface BookDetailsRepository extends CrudRepository<BookDetails, Integer> {

}
