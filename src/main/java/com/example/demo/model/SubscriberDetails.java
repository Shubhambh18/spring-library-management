package com.example.demo.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="subscriber_detail")
@Entity
public class SubscriberDetails {
	
	@Id
	private long subscriberID;
	private String subscriberName;	
	private String issueDate;
	private String returnDate;
	private long penalty;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "book_id")
	private BookDetails bookDetails;

	

}
