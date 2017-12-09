package com.cg.hbms.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name="Room_Details")
public class RoomDetails implements Serializable{
public String getHotelId()
	{
		return hotelId;
	}

	public void setHotelId(String hotelId)
	{
		this.hotelId = hotelId;
	}

	public String getRoomType()
	{
		return roomType;
	}

	public void setRoomType(String roomType)
	{
		this.roomType = roomType;
	}

private static final long serialVersionUID = 1L;

/*	@JoinColumn(name="hotel_id")	//changed here from hotelId to hotel_id
	private Hotels hotel;*/
	
	

	@Id
	@Column(name="room_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String roomId;
	
	@Column(name="room_no")
	private String roomNo;
	
	@Column(name="hotel_id")
	private String hotelId;
	
	@Column(name="room_type")
	private String roomType;
	
	@Column(name="per_night_rate")
	private float perNightRate;
	
	@Column(name="availability")
	private String availability;
	
	@OneToMany
	@JoinColumn(name="room_id")
	private List<BookingDetails> bookingDetails;
	
	public RoomDetails() {
		super();
	}

	public RoomDetails(String roomId, String roomNo,
			String roomtype, float perNightRate, String availability) {
		super();
		this.roomId = roomId;
		this.roomNo = roomNo;
		this.roomType = roomtype;
		this.perNightRate = perNightRate;
		this.availability = availability;
	}
	
	public RoomDetails(String roomNo,String roomtype, float perNightRate,String availability) {
		super();
		this.roomNo = roomNo;
		this.roomType = roomtype;
		this.perNightRate = perNightRate;
		this.availability = availability;
	}
	
	public RoomDetails(String roomtype, float perNightRate, String availability, String roomId) {
		super();
		this.roomType = roomtype;
		this.perNightRate = perNightRate;
		this.availability = availability;
		this.roomId = roomId;
	}


	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomtype() {
		return roomType;
	}
	public void setRoomtype(String roomtype) {
		this.roomType = roomtype;
	}
	public float getPerNightRate() {
		return perNightRate;
	}
	public void setPerNightRate(float perNightRate) {
		this.perNightRate = perNightRate;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	@Override
	public String toString() {
		return "RoomDetails [ roomId=" + roomId
				+ ", roomNo=" + roomNo + ", roomtype=" + roomType
				+ ", perNightRate=" + perNightRate + ", availability="
				+ availability + "]";
	}
	
	
	



}
