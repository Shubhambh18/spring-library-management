package com.example.demo.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class SubscriberDetails {

	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "book_id", referencedColumnName = "book_id")
	 private int bookId;
	 private int subscriberId;
	 private String subscriberName; 
	 private Date issueDate;
	 private Date returnDate;
	 private double penalty;
 
 
}



