package com.cg.hbms.controller;


import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.hbms.beans.BookingDetails;
import com.cg.hbms.beans.Hotels;
import com.cg.hbms.beans.RoomDetails;
import com.cg.hbms.beans.Users;
import com.cg.hbms.services.HBMSServices;

@Controller
public class FrontController {

	@Autowired
	private HBMSServices hbmsServices;
	
	
	@RequestMapping(value="/index")
	public String getLoginPage(Model model){
		model.addAttribute("user", new Users());
		return "index";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String getHomePage(@ModelAttribute("user") Users user , Model model){ 
		String role=hbmsServices.authenticateUser(user);
		if(role.equalsIgnoreCase("User Id Does not Exist"))
		{
			String message="User Id Does not Exist";
			model.addAttribute("msg", message);
			return "index";
		}
		else if(role.equalsIgnoreCase("Wrong password")){
			String message="Wrong Password";
			model.addAttribute("msg", message);
			return "index";
		}
		else
			model.addAttribute("bookingDetails",new BookingDetails());
			model.addAttribute("Hotel",new Hotels());
			model.addAttribute("City",new String[]{"Delhi","Mumbai","Bangalore","Chennai","Kolkata"});
			return "HomePage";
	}
	
	@RequestMapping(value="/Book")
	public String getStock(@ModelAttribute("Hotel") Hotels hotel,@RequestParam("bookingTo") Date bookingTo,@RequestParam("bookingFrom") Date bookingFrom, Model model){
		if(bookingTo.compareTo(bookingFrom)>0){
			ArrayList<Hotels> hotelList = (ArrayList<Hotels>)hbmsServices.loadAll(hotel.getCity());
			model.addAttribute("City",new String[]{"Delhi","Mumbai","Bangalore","Chennai","Kolkata"});
			model.addAttribute("hotelList", hotelList);
			return "HomePage";
		}
		else{
			String msg="Enter Correct Dates";
			model.addAttribute("msg",msg);
			model.addAttribute("City",new String[]{"Delhi","Mumbai","Bangalore","Chennai","Kolkata"});
			return "HomePage";
		}
	}
	
	@RequestMapping(value="/Booking")
	public String getBookingPage(@RequestParam("hotelId") String hotelId,Model model){
		System.out.println(hotelId);
		Hotels roomList = (Hotels)hbmsServices.loadAllRooms(hotelId);
		System.out.println(roomList);
		model.addAttribute("roomList", roomList);
		model.addAttribute("hotelId", hotelId);
		return "Booking";
	}
	
	@RequestMapping(value="/register")
	public String getRegisterPage(Model model){
		model.addAttribute("user", new Users());
		model.addAttribute("role",new String[]{"EMP","CUST"});
		return "Register";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") Users user, Model model){
		Users user1;
		user1 =  hbmsServices.save(user);
		model.addAttribute("message","User with id "+user1.getUserId()+"added successfully!");
		return "Usersave";
	}
	
}
