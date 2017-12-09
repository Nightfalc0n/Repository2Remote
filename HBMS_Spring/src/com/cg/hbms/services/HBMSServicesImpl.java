package com.cg.hbms.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hbms.beans.BookingDetails;
import com.cg.hbms.beans.Hotels;
import com.cg.hbms.beans.RoomDetails;
import com.cg.hbms.beans.Users;
import com.cg.hbms.dao.HBMSDao;


@Service
@Transactional
public class HBMSServicesImpl implements HBMSServices
{

	@Autowired
	private HBMSDao hbmsRepository;

	@Override
	public BookingDetails save(BookingDetails bookDtls) {
		return hbmsRepository.save(bookDtls);
	}

	@Override
	public BookingDetails update(BookingDetails bookDtls) {
		return hbmsRepository.update(bookDtls);
	}

	@Override
	public BookingDetails delete(BookingDetails bookDtls) {
		return hbmsRepository.delete(bookDtls);
	}

	@Override
	public Users save(Users user) {
		return hbmsRepository.save(user);
	}

	@Override
	public Users getUserById(String id) {
		return hbmsRepository.getUserById(id);
	}
	
	@Override
	public String authenticateUser(Users user){
		Users user1=new Users();	
		user1=hbmsRepository.getUserById(user.getUserId());
		if(user1==null){
		return "User Id Does not Exist";
		}
		else if(user.getPassword().equals(user1.getPassword())){
		return user1.getRole();
		}
		else{
		return "wrong password";
		}
	}

	@Override
	public List<Hotels> loadAll(String City) {
		return hbmsRepository.loadAll(City);
	}

	@Override
	public Hotels loadAllRooms(String hotelId) {
		return hbmsRepository.loadAllRooms(hotelId);
	}

}
