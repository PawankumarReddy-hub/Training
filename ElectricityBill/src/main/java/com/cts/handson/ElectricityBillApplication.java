package com.cts.handson;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//
//import com.cts.handson.dao.EBillDAO;
//import com.cts.handson.model.EBill;
//import com.cts.handson.util.DateUtil;
//@ComponentScan("com.cts.handson")
//public class ElectricityBillApplication {
//	public static void main(String[] args) {
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
//		//get dao bean
//		//delete ebill
//		System.out.format("%-5s %-15s %-10s %10s %5s %s\n", "Id","Consumer Id","Month","Reading","Unit","Amount");
//		//display all bills
//	}
//}

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cts.handson.dao.EBillDAO;
import com.cts.handson.model.EBill;
import java.util.List;

public class ElectricityBillApplication {

    public static void main(String[] args) {
        // Initialize the application context
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        
        // Get EBillDAO bean from the context
        EBillDAO eBillDAO = appContext.getBean(EBillDAO.class);

        // Delete specific bills
        try {
            eBillDAO.deleteBill(100, 99); // Example: deleting bills with numbers 100 and 99
        } catch (Exception e) {
            System.err.println("Exception occurred during deletion: " + e.getMessage());
        }

        // Retrieve and display all bills
        List<EBill> bills = eBillDAO.getAllBill();
        System.out.format("%-5s %-15s %-10s %10s %5s %s\n", "Id", "Consumer Id", "Month", "Reading", "Unit", "Amount");
        for (EBill bill : bills) {
            System.out.format("%-5d %-15s %-10s %10.2f %5d %s\n",
                bill.getConsumerId(), bill.getConsumerId(), bill.getBillingMonth(), bill.getReading(), bill.getUnit(), bill.getAmount());
        }
    }
}
