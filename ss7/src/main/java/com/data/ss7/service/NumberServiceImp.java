package com.data.ss7.service;

import com.data.ss7.repository.NumberRepository;
import org.springframework.stereotype.Service;

@Service
public class NumberServiceImp implements NumberService{
    private NumberRepository numberRepo;

    @Override
    public int getTotal(int a, int b) {
        return numberRepo.getTotal(a, b);
    }
}