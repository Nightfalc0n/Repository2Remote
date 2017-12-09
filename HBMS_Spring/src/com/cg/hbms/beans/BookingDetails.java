package com.cg.hbms.beans;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Booking_Details")
public class BookingDetails implements Serializable{
private static final long serialVersionUID = 1L;

//booking_id varchar(4),room_id varchar(4),user_id varchar(4),booked_from date,booked_to date,no_of_adults number(5),no_of_children number(5),
//amount number(6,2)

	@Id
	@Column(name="booking_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String bookingId;
	
	
	@Column(name="room_id")
	private String roomId;
	
	
	@Column(name="user_id")
	private String userId;
	
	
	@Column(name="booked_from")
	private Date bookedFrom;
	
	
	@Column(name="booked_to")
	private Date bookedTo;
	
	
	@Column(name="no_of_adults")
	private int noOfAdults;
	
	
	@Column(name="no_of_children")
	private int noOfChildren;
	
	
	@Column(name="amount")
	private float amount;
	
	
	
	public BookingDetails() {
		super();
	}

	public BookingDetails(String bookingId, String roomId, String userId,
			Date bookedFrom, Date bookedTo, int noOfAdults, int noOfChildren,
			float amount)
	{
		super();
		this.bookingId = bookingId;
		this.roomId = roomId;
		this.userId = userId;
		this.bookedFrom = bookedFrom;
		this.bookedTo = bookedTo;
		this.noOfAdults = noOfAdults;
		this.noOfChildren = noOfChildren;
		this.amount = amount;
	}

	public BookingDetails(String roomId, String userId, Date bookedFrom,
			Date bookedTo, int noOfAdults, int noOfChildren, float amount) {
		super();
		this.roomId = roomId;
		this.userId = userId;
		this.bookedFrom = bookedFrom;
		this.bookedTo = bookedTo;
		this.noOfAdults = noOfAdults;
		this.noOfChildren = noOfChildren;
		
	}
	
	public BookingDetails(String roomId, String userId, Date bookedFrom,
			Date bookedTo, int noOfAdults, int noOfChildren) {
		super();
		this.roomId = roomId;
		this.userId = userId;
		this.bookedFrom = bookedFrom;
		this.bookedTo = bookedTo;
		this.noOfAdults = noOfAdults;
		this.noOfChildren = noOfChildren;
	}

	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getBookedFrom() {
		return bookedFrom;
	}
	public void setBookedFrom(Date bookedFrom) {
		this.bookedFrom = bookedFrom;
	}
	public Date getBookedTo() {
		return bookedTo;
	}
	public void setBookedTo(Date bookedTo) {
		this.bookedTo = bookedTo;
	}
	public int getNoOfAdults() {
		return noOfAdults;
	}
	public void setNoOfAdults(int noOfAdults) {
		this.noOfAdults = noOfAdults;
	}
	public int getNoOfChildren() {
		return noOfChildren;
	}
	public void setNoOfChildren(int noOfChildren) {
		this.noOfChildren = noOfChildren;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "BookingDetails [bookingId=" + bookingId + ", roomId=" + roomId
				+ ", userId=" + userId + ", bookedFrom=" + bookedFrom
				+ ", bookedTo=" + bookedTo + ", noOfAdults=" + noOfAdults
				+ ", noOfChildren=" + noOfChildren + ", amount=" + amount + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(amount);
		result = prime * result
				+ ((bookedFrom == null) ? 0 : bookedFrom.hashCode());
		result = prime * result
				+ ((bookedTo == null) ? 0 : bookedTo.hashCode());
		result = prime * result
				+ ((bookingId == null) ? 0 : bookingId.hashCode());
		result = prime * result + noOfAdults;
		result = prime * result + noOfChildren;
		result = prime * result + ((roomId == null) ? 0 : roomId.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookingDetails other = (BookingDetails) obj;
		if (Float.floatToIntBits(amount) != Float.floatToIntBits(other.amount))
			return false;
		if (bookedFrom == null) {
			if (other.bookedFrom != null)
				return false;
		} else if (!bookedFrom.equals(other.bookedFrom))
			return false;
		if (bookedTo == null) {
			if (other.bookedTo != null)
				return false;
		} else if (!bookedTo.equals(other.bookedTo))
			return false;
		if (bookingId == null) {
			if (other.bookingId != null)
				return false;
		} else if (!bookingId.equals(other.bookingId))
			return false;
		if (noOfAdults != other.noOfAdults)
			return false;
		if (noOfChildren != other.noOfChildren)
			return false;
		if (roomId == null) {
			if (other.roomId != null)
				return false;
		} else if (!roomId.equals(other.roomId))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	
	
}
