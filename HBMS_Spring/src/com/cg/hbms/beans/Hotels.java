package com.cg.hbms.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


	@Entity
	@Table(name="Hotel")
	public class Hotels implements Serializable{
		
		
	@Override
		public String toString()
		{
			return "Hotels [hotelId=" + hotelId + ", roomDtls=" + roomDtls
					+ "]";
		}

	public List<RoomDetails> getRoomDtls()
		{
			return roomDtls;
		}

		public void setRoomDtls(List<RoomDetails> roomDtls)
		{
			this.roomDtls = roomDtls;
		}

	private static final long serialVersionUID = 1L;
		
	@Id
	@Column(name="hotel_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String hotelId;
	
	@OneToMany
	@JoinColumn(name="hotel_id")
	private List<RoomDetails> roomDtls;
	
	@Column(name="city")
	private String city;
	
	@Column(name="hotel_name")
	private String hotelName;
	
	@Column(name="address")
	private String address;
	
	@Column(name="description")
	private String description;
	
	@Column(name="avg_rate_per_night")
	private float avgRatePerNight;
	
	@Column(name="phone_no1")
	private String phoneNo1;
	
	@Column(name="phone_no2")
	private String phoneNo2;
	
	@Column(name="rating")
	private String rating;
	
	@Column(name="email")
	private String email;
	
	@Column(name="fax")
	private String fax;
	
	public Hotels(){
		super();
	}
	
	public Hotels(String hotelId, String city, String hotelName,
			String address, String description, float avgRatePerNight,
			String phoneNo1, String phoneNo2, String rating, String email,
			String fax) {
		super();
		this.hotelId = hotelId;
		this.city = city;
		this.hotelName = hotelName;
		this.address = address;
		this.description = description;
		this.avgRatePerNight = avgRatePerNight;
		this.phoneNo1 = phoneNo1;
		this.phoneNo2 = phoneNo2;
		this.rating = rating;
		this.email = email;
		this.fax = fax;
	}

	
	
	public Hotels(String city,String hotelName, String address, String description,float avgRatePerNight, String phoneNo1, String phoneNo2,String rating, String email, String fax) {
		super();
		this.city = city;
		this.hotelName = hotelName;
		this.address = address;
		this.description = description;
		this.avgRatePerNight = avgRatePerNight;
		this.phoneNo1 = phoneNo1;
		this.phoneNo2 = phoneNo2;
		this.rating = rating;
		this.email = email;
		this.fax = fax;
	}

	public Hotels(String hotelName, String address, String description,float avgRatePerNight, String phoneNo1, String phoneNo2,String rating, String email, String fax) {
		super();
		
		this.hotelName = hotelName;
		this.address = address;
		this.description = description;
		this.avgRatePerNight = avgRatePerNight;
		this.phoneNo1 = phoneNo1;
		this.phoneNo2 = phoneNo2;
		this.rating = rating;
		this.email = email;
		this.fax = fax;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getAvgRatePerNight() {
		return avgRatePerNight;
	}

	public void setAvgRatePerNight(float avgRatePerNight) {
		this.avgRatePerNight = avgRatePerNight;
	}

	public String getPhoneNo1() {
		return phoneNo1;
	}

	public void setPhoneNo1(String phoneNo1) {
		this.phoneNo1 = phoneNo1;
	}

	public String getPhoneNo2() {
		return phoneNo2;
	}

	public void setPhoneNo2(String phoneNo2) {
		this.phoneNo2 = phoneNo2;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	

}
