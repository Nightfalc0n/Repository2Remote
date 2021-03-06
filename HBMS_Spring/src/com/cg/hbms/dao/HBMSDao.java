package com.cg.hbms.dao;


import java.util.List;

import com.cg.hbms.beans.BookingDetails;
import com.cg.hbms.beans.Hotels;
import com.cg.hbms.beans.RoomDetails;
import com.cg.hbms.beans.Users;

public interface HBMSDao 
{
	public List<Hotels> loadAll(String City);
	public BookingDetails save(BookingDetails bookDtls);
	public BookingDetails update(BookingDetails bookDtls);
	public BookingDetails delete(BookingDetails bookDtls) ;
	public Users save(Users user);
	public Users getUserById(String id);
	public Hotels loadAllRooms(String hotelId);
}
