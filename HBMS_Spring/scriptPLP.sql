
drop table users;
drop table hotel cascade constraints;
drop table room_details cascade constraints;
drop table booking_details cascade constraints;

commit

--User Table--
--UserId is PK-- 

create table Users(
	user_id varchar(4) primary key,
	password varchar(10) NOT NULL,
	role varchar(10) NOT NULL,
	user_name varchar(20) NOT NULL,
	mobile_no varchar(10) NOT NULL,
	phone varchar(10),
	address varchar(25) NOT NULL,
	email varchar(50) NOT NULL
);

insert into users values('1','pass','ADM','ADMIN','9009009000','2002002','Airoli','abc1@xyz.com');
insert into users values('3','pass1','CUST','USER','8009009000','2102002','Powai','user2@xyz.com');
insert into users values('4','pass','EMP','ADMIN','9009009000','2002002','Airoli','abc3@xyz.com');
insert into users values('5','pass1','EMP','USER','8009009000','2102002','Powai','user4@xyz.com');
insert into users values('6','pass','ADM','ADMIN','9009009000','2002002','Airoli','abc5@xyz.com');
insert into users values('2','pass1','CUST','USER','8009009000','2102002','Powai','user6@xyz.com');

--Hotel Table--

create table hotel(
	hotel_id varchar(4) primary key,
	city varchar(10)  NOT NULL,
	hotel_name varchar(20) NOT NULL,
	address varchar(25) NOT NULL,
	description varchar(50),
	avg_rate_per_night number(8,2) NOT NULL,
	phone_no1 varchar(10) NOT NULL,
	phone_no2 varchar(10),
	rating varchar(4),
	email varchar(50) NOT NULL,
	fax varchar(15)
);


--Pune, Mumbai, Delhi--

insert into hotel values('H1','Mumbai','Anant Residency','Sector-19 Airoli','Centrally located in the main city centre',123456.11,9988776655,9898979796,'***','ana.r@hbms.com',9122669288899);
insert into hotel values('H2','Mumbai','Manish Residency','Sector-2 Powai','This budget accommodation has spacious rooms',1500,9888776655,9798979796,'****','man.r.@hbms.com',9122559288899);
insert into hotel values('H3','Pune','Tigga Residency','Sector-10 ','This hotel is close to Airport',2000,9788776655,9798979796,'***','tig.r@hms.com',9122449288899);
insert into hotel values('H4','Delhi','Thakur Residency','Sector-10','Superb room with all facilities',5000,9788776655,9798979796,'****','tha.r@hms.com',9122339288899);
insert into hotel values('H5','Delhi','Divyanshu Residency','Sector-19','Special offers available',4500,9588776655,9598979796,'****','div.r@hms.com',9122889288899);


--Room Table--

create table room_details(
	hotel_id varchar(4) references hotel(hotel_id) ON DELETE CASCADE,
	room_id varchar(4) primary key,
	room_no varchar(3),
	room_type varchar(20),
	per_night_rate number(6,2),
	availability varchar(5) check(availability = 'yes' or availability = 'no')
     );

--h1--
insert into room_details values('H1','R12','301','Non A/C room',1200,'yes');
insert into room_details values('H1','R13','302','Standard A/C room',1500,'yes');
insert into room_details values('H1','R14','101','Executive A/C room',2000,'yes');
insert into room_details values('H1','R15','201','Deluxe A/C room ',5000,'yes');
insert into room_details values('H1','R11','112','Deluxe A/C room',4500,'no');

commit

--h2--
insert into room_details values('H2','R22','301','Non A/C room',1200,'yes');
insert into room_details values('H2','R23','302','Standard A/C room',1500,'yes');
insert into room_details values('H2','R24','101','Executive A/C room',2000,'yes');
insert into room_details values('H2','R25','201','Deluxe A/C room ',5000,'yes');
insert into room_details values('H2','R26','104','Deluxe A/C room',4500,'yes');

--h3--
insert into room_details values('H3','R32','301','Non A/C room',1200,'yes');
insert into room_details values('H3','R33','302','Standard A/C room',1500,'yes');
insert into room_details values('H3','R34','101','Executive A/C room',2000,'yes');
insert into room_details values('H3','R35','201','Deluxe A/C room ',5000,'yes');
insert into room_details values('H3','R36','104','Deluxe A/C room',4500,'yes');

--h4--
insert into room_details values('H4','R42','301','Non A/C room',1200,'yes');
insert into room_details values('H4','R43','302','Standard A/C room',1500,'yes');
insert into room_details values('H4','R44','101','Executive A/C room',2000,'yes');
insert into room_details values('H4','R45','201','Deluxe A/C room ',5000,'yes');
insert into room_details values('H4','R46','104','Deluxe A/C room',4500,'yes');

--h5--
insert into room_details values('H5','R52','301','Non A/C room',1200,'yes');
insert into room_details values('H5','R53','302','Standard A/C room',1500,'yes');
insert into room_details values('H5','R54','101','Executive A/C room',2000,'yes');
insert into room_details values('H5','R55','201','Deluxe A/C room ',5000,'yes');
insert into room_details values('H5','R56','104','Deluxe A/C room',4500,'yes');

--Booking Details--

create table booking_details(
	booking_id varchar(4) primary key,
	room_id varchar(4) references room_details(room_id) ON DELETE CASCADE,
	user_id varchar(4),
	booked_from date,
	booked_to date,
	no_of_adults number(5),
	no_of_children number(5),
	amount number(8,2)
);

--Booking Details records--

insert into booking_details values('B11','R12','1',to_date('05/20/2018','MM/DD/YYYY'),to_date('05/26/2018','MM/DD/YYYY'),2,3,2520);
insert into booking_details values('B12','R13','2',to_date('06/15/2017','MM/DD/YYYY'),to_date('06/20/2017','MM/DD/YYYY'),1,0,7500);
insert into booking_details values('B13','R14','3',to_date('07/25/2017','MM/DD/YYYY'),to_date('07/30/2017','MM/DD/YYYY'),20000,1,2500);
insert into booking_details values('B14','R15','2',to_date('08/20/2017','MM/DD/YYYY'),to_date('08/22/2017','MM/DD/YYYY'),2,3,35000);
insert into booking_details values('B15','R16','1',to_date('09/18/2017','MM/DD/YYYY'),to_date('09/25/2017','MM/DD/YYYY'),1,1,48000);

insert into booking_details values('B21','R22','1',to_date('05/20/2018','MM/DD/YYYY'),to_date('05/26/2018','MM/DD/YYYY'),2,3,2520);
insert into booking_details values('B22','R23','2',to_date('06/15/2017','MM/DD/YYYY'),to_date('06/20/2017','MM/DD/YYYY'),1,0,7500);
insert into booking_details values('B23','R24','3',to_date('07/25/2017','MM/DD/YYYY'),to_date('07/30/2017','MM/DD/YYYY'),20000,1,2500);
insert into booking_details values('B24','R25','2',to_date('08/20/2017','MM/DD/YYYY'),to_date('08/22/2017','MM/DD/YYYY'),2,3,35000);
insert into booking_details values('B25','R26','1',to_date('09/18/2017','MM/DD/YYYY'),to_date('09/25/2017','MM/DD/YYYY'),1,1,48000);

insert into booking_details values('B31','R32','1',to_date('05/20/2018','MM/DD/YYYY'),to_date('05/26/2018','MM/DD/YYYY'),2,3,2520);
insert into booking_details values('B32','R33','2',to_date('06/15/2017','MM/DD/YYYY'),to_date('06/20/2017','MM/DD/YYYY'),1,0,7500);
insert into booking_details values('B33','R34','3',to_date('07/25/2017','MM/DD/YYYY'),to_date('07/30/2017','MM/DD/YYYY'),20000,1,2500);
insert into booking_details values('B34','R35','2',to_date('08/20/2017','MM/DD/YYYY'),to_date('08/22/2017','MM/DD/YYYY'),2,3,35000);
insert into booking_details values('B35','R36','1',to_date('09/18/2017','MM/DD/YYYY'),to_date('09/25/2017','MM/DD/YYYY'),1,1,48000);

insert into booking_details values('B41','R42','1',to_date('05/20/2018','MM/DD/YYYY'),to_date('05/26/2018','MM/DD/YYYY'),2,3,2520);
insert into booking_details values('B42','R43','2',to_date('06/15/2017','MM/DD/YYYY'),to_date('06/20/2017','MM/DD/YYYY'),1,0,7500);
insert into booking_details values('B43','R44','3',to_date('07/25/2017','MM/DD/YYYY'),to_date('07/30/2017','MM/DD/YYYY'),20000,1,2500);
insert into booking_details values('B44','R45','2',to_date('08/20/2017','MM/DD/YYYY'),to_date('08/22/2017','MM/DD/YYYY'),2,3,35000);
insert into booking_details values('B45','R46','1',to_date('09/18/2017','MM/DD/YYYY'),to_date('09/25/2017','MM/DD/YYYY'),1,1,48000);

insert into booking_details values('B51','R52','1',to_date('05/20/2018','MM/DD/YYYY'),to_date('05/26/2018','MM/DD/YYYY'),2,3,2520);
insert into booking_details values('B52','R53','2',to_date('06/15/2017','MM/DD/YYYY'),to_date('06/20/2017','MM/DD/YYYY'),1,0,7500);
insert into booking_details values('B53','R54','3',to_date('07/25/2017','MM/DD/YYYY'),to_date('07/30/2017','MM/DD/YYYY'),20000,1,2500);
insert into booking_details values('B54','R55','2',to_date('08/20/2017','MM/DD/YYYY'),to_date('08/22/2017','MM/DD/YYYY'),2,3,35000);
insert into booking_details values('B55','R56','1',to_date('09/18/2017','MM/DD/YYYY'),to_date('09/25/2017','MM/DD/YYYY'),1,1,48000);

commit
select * from hotel;

select * from booking_details;

select * from room_details where hotel_id='H1';

ALTER table room_details drop column hotelId; 
