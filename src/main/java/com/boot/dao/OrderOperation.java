package com.boot.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

@Component
public class OrderOperation {
      @Autowired
	AmazonOrderRepository amazonorderrepository;
	
      public void insertIntoTable() {
    	  List<AmazonOrder> ama = new ArrayList<>();
    	  
    	  AmazonOrder a1 = new AmazonOrder();
    	  a1.setOid(1014);
    	  a1.setAmount(104300.00);
    	  a1.setGender("Male");
    	  a1.setEmail("dfan@gmail");
    	  a1.setCity("Hyderabad");
    	  a1.setNo_of_items(127);
    	  a1.setPincode(500032);
    	 
    	  AmazonOrder a2 = new AmazonOrder();
    	  a2.setOid(1015);
    	  a2.setAmount(97000.43);
    	  a2.setGender("Male");
    	  a2.setEmail("y@gmail");
    	  a2.setCity("Kolkata");
    	  a2.setNo_of_items(46);
    	  a2.setPincode(30054);
    	  AmazonOrder a3 = new AmazonOrder();
    	  a3.setOid(1015);
    	  a3.setAmount(13000.00);
    	  a3.setGender("Female");
    	  a3.setEmail("E@gmail");
    	  a3.setCity("Banglore");
    	  a3.setNo_of_items(276);
    	  a3.setPincode(656453);
    	  AmazonOrder a4 = new AmazonOrder();
    	  a4.setOid(1016);
    	  a4.setAmount(74000.00);
    	  a4.setGender("Female");
    	  a4.setEmail("ia@gmail");
    	  a4.setCity("London");
    	  a4.setNo_of_items(233);
    	  a4.setPincode(132321);
    	 amazonorderrepository.saveAll(List.of(a1,a2,a3,a4));
    	  
    	  
      }
	public void sortbyEmail() {
		
		List<AmazonOrder> order= amazonorderrepository.findAll(Sort.by("oid"));
		order.forEach(System.out::println);
		
	}
	
	
	
	
	public void sortBYDecending() {
		
		
		List<AmazonOrder> order=amazonorderrepository.findAll(Sort.by(Direction.DESC,"email"));
               System.out.println(order);
	}
	
	public void viewAllData() {
		
	List<AmazonOrder> order        =	amazonorderrepository.findAll();
	order.forEach(System.out::println);
		}
	
	//pagination 
	
	public void firstPagination() {
	    Page<AmazonOrder> order =	amazonorderrepository.findAll(Pageable.ofSize(4));
		order.forEach(System.out::println);
	}
	// get page number
	
	public void getPageWiseDataa() {
		Pageable page = PageRequest.of(4, 3);
		Page<AmazonOrder> order = amazonorderrepository.findAll(page);
		order.forEach(System.out::println);
	}
	// pagination and sorting
	public void getpagewithsort(){
		Pageable page = PageRequest.of(2, 4, Sort.by("email"));
		Page<AmazonOrder> order = amazonorderrepository.findAll(page);
	  order.forEach(System.out::println);
	}
	//pagination with descending order
	public void getpagewithdescending() {
		Pageable page = PageRequest.of(2,4 ,Sort.by(Direction.DESC, "email"));
		 Page<AmazonOrder> order = amazonorderrepository.findAll(page);
		 order.forEach(System.out::println);
	}
	
}
