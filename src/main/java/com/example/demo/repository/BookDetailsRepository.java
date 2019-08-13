package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BookDetails;

@Repository
public interface BookDetailsRepository extends CrudRepository<BookDetails, Integer> {

}
