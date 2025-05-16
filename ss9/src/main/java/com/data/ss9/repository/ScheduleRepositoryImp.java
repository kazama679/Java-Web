package com.data.ss9.repository;

import com.data.ss9.connection.ConnectionDB;
import com.data.ss9.model.Schedule;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ScheduleRepositoryImp implements ScheduleRepository {
    @Override
    public List<Schedule> findAll() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Schedule> schedules = new ArrayList<>();
        try{
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call find_all_schedule()}");
            ResultSet rs = callSt.executeQuery();
            while(rs.next()){
                Schedule schedule = new Schedule();
                schedule.setId(rs.getInt("id"));
                schedule.setMovieId(rs.getInt("movieId"));
                schedule.setShowTime(rs.getString("showTime"));
                schedule.setScreenRoomId(rs.getInt("screenRoomId"));
                schedule.setAvailableSeats(rs.getInt("availableSeats"));
                schedule.setFormat(rs.getString("format"));
                schedules.add(schedule);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return schedules;
    }
}
