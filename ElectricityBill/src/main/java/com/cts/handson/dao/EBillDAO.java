package com.cts.handson.dao;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.TransactionStatus;
//import org.springframework.transaction.support.DefaultTransactionDefinition;
//
//import com.cts.handson.model.EBill;
//
//@Service
//@ComponentScan("com.cts.handson")
//public class EBillDAO {
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//	@Autowired
//	PlatformTransactionManager txManager;
//	
//	public void deleteBill(long...billNumbers) {
//		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
//		TransactionStatus status = txManager.getTransaction(def);
//		try {
//			//delete business logic here
//		}catch(Exception ex) {
//			//roll back logic here
//		}
//	}
//
//	public List<EBill> getAllBill() {
//		//retrieve business logic here
//	}
//}

import com.cts.handson.model.EBill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.util.List;

@Repository
public class EBillDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private PlatformTransactionManager transactionManager;

    @Transactional
    public void deleteBill(long... billNumbers) throws Exception {
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        TransactionStatus status = transactionManager.getTransaction(def);

        try {
            for (long billNumber : billNumbers) {
                if (billNumber >= 100) {
                    jdbcTemplate.update("DELETE FROM EBILL WHERE BILL_NUMBER = ?", billNumber);
                } else {
                    throw new Exception("Bill number less than 100 found: " + billNumber);
                }
            }
            transactionManager.commit(status);
        } catch (Exception e) {
            transactionManager.rollback(status);
            throw e; // Rethrow exception after rollback
        }
    }

    public List<EBill> getAllBill() {
        return jdbcTemplate.query("SELECT * FROM EBILL", new BeanPropertyRowMapper<EBill>(EBill.class));
    }
}
