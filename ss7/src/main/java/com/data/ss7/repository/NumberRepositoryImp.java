package com.data.ss7.repository;

import org.springframework.stereotype.Repository;

@Repository
public class NumberRepositoryImp implements NumberRepository {
    @Override
    public int getTotal(int a, int b) {
        return a+b;
    }
}
