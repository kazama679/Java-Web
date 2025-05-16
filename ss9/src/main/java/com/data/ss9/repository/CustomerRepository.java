package com.data.ss9.repository;

import com.data.ss9.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}