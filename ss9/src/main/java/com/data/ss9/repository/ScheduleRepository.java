package com.data.ss9.repository;

import com.data.ss9.model.Schedule;

import java.util.List;

public interface ScheduleRepository {
    List<Schedule> findAll();
}
