package com.data.ss9.repository;

import com.data.ss9.connection.ConnectionDB;
import com.data.ss9.model.Customer;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepositoryImp implements CustomerRepository {
    @Override
    public List<Customer> findAll() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Customer> customers = new ArrayList<>();
        try{
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call find_all_customer()}");
            ResultSet rs = callSt.executeQuery();
            while(rs.next()){
                Customer customer = new Customer();
                customer.setId(rs.getInt("id"));
                customer.setUsername(rs.getString("username"));
                customer.setPassword(rs.getString("password"));
                customer.setPhone(rs.getString("phone"));
                customer.setAddress(rs.getString("address"));
                customer.setGender(rs.getString("gender"));
                customer.setEmail(rs.getString("email"));
                customers.add(customer);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return customers;
    }
}