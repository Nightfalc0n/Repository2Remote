package com.cg.hbms.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


import org.springframework.stereotype.Repository;

import com.cg.hbms.beans.BookingDetails;
import com.cg.hbms.beans.Hotels;
import com.cg.hbms.beans.RoomDetails;
import com.cg.hbms.beans.Users;


@Repository
public class HBMSDaoImpl implements HBMSDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public BookingDetails save(BookingDetails bookDtls) {
		System.out.println(bookDtls);
		entityManager.persist(bookDtls);
		entityManager.flush();	
		
		return bookDtls;
	}
	
	@Override
	public Users save(Users user) {
		System.out.println(user);
		entityManager.persist(user);
		entityManager.flush();	
		
		return user;
	}
	
	@Override
	public Users getUserById(String id) {
		Users user = entityManager.find(Users.class, id);
		return user;
	}
	
	@Override
	public BookingDetails update(BookingDetails bookDtls) {
		System.out.println(bookDtls);
		entityManager.merge(bookDtls);
		entityManager.flush();	
		
		return bookDtls;
	}
	
	@Override
	public BookingDetails delete(BookingDetails bookDtls) {
		entityManager.remove(bookDtls);
		entityManager.flush();
		return bookDtls;
	}
	
	@Override
	public List<Hotels> loadAll(String City) {
		TypedQuery<Hotels> query = entityManager.createQuery("SELECT h FROM Hotels h where city=:city", Hotels.class);
		query.setParameter("city", City);
		return query.getResultList();
	}
	
	@Override
	public Hotels loadAllRooms(String HotelId) {
		TypedQuery<Hotels> query = entityManager.createQuery("SELECT r FROM Hotels r where hotelId=:hotelId", Hotels.class);
		query.setParameter("hotelId", HotelId);
		return query.getSingleResult();
	}

}
