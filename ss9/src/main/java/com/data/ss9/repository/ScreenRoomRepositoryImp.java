package com.data.ss9.repository;

import com.data.ss9.connection.ConnectionDB;
import com.data.ss9.model.Schedule;
import com.data.ss9.model.ScreenRoom;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ScreenRoomRepositoryImp implements ScreenRoomRepository {
    @Override
    public List<ScreenRoom> findAll() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<ScreenRoom> screenRooms = new ArrayList<>();
        try{
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call find_all_screenroom()}");
            ResultSet rs = callSt.executeQuery();
            while(rs.next()){
                ScreenRoom screenRoom = new ScreenRoom();
                screenRoom.setId(rs.getInt("id"));
                screenRoom.setScreenRoomName(rs.getString("screenRoomName"));
                screenRoom.setTotalSeat(rs.getInt("totalSeat"));
                screenRooms.add(screenRoom);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return screenRooms;
    }
}