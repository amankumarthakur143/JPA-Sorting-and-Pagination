package com.boot;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.boot.dao.AmazonOrder;
import com.boot.dao.OrderOperation;

@SpringBootApplication
public class Jpa3SortingApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(Jpa3SortingApplication.class, args);
      OrderOperation op   =  context.getBean(OrderOperation.class);
   //  op.insertIntoTable();  
	//op.sortbyEmail();
	//op.sortBYDecending();
     //op.viewAllData();
      //op.firstPagination();
	//op.getPageWiseDataa();
     // op.getpagewithsort();
      op.getpagewithdescending();
	}
	

}
