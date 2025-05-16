package com.data.ss9.service;

import com.data.ss9.model.Schedule;
import com.data.ss9.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImp implements ScheduleService {
    @Autowired
    private ScheduleRepository scheduleRepository;
    @Override
    public List<Schedule> findAll() {
        return scheduleRepository.findAll();
    }
}
