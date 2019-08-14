package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BookDetails;
import com.example.demo.model.SubscriberDetails;

@Repository
public interface SubscriberDetailsRepository extends CrudRepository<SubscriberDetails, Long> {


}