create database jetpulse;
use jetpulse;


create table adminlogin(Username varchar(30),Password varchar(15));
desc adminlogin;
Insert into adminlogin (Username, Password) values ("admin","admin@123");
select *from adminlogin;




create table addflight(FlightNumber int  primary key, FlightName varchar(15), Source varchar(15), Destination varchar(15), Capacity int, Classname varchar(20) ,Price int);
desc addflight;
select * from addflight;

select FlightNumber from addflight where Source = 'Patna' and Destination ='Delhi';

create table addemployee(FirstName varchar(20), LastName varchar(20), Gender varchar(15), Email varchar(25), Contact int, Salary int);
desc addemployee;
select * from addemployee;
 
alter table addemployee add column Empid int auto_increment primary key;
alter table addemployee   auto_increment = 1021;
alter table addemployee modify column Salary bigint;

create table employeelogin(Username varchar(30),Password varchar(15));
desc employeelogin;
Insert into employeelogin (Username,Password) values("kamal","kamal@123");
select*from employeelogin;



create table addpassenger( Name varchar(25), Age int,  Address varchar(35), Phone int, Email varchar(35), Nationality varchar(35), Gender varchar(20), Passport varchar(30));
desc addpassenger;
select*from addpassenger;
alter table addpassenger modify column Phone bigint;
alter table addpassenger drop column DateOfBirth;
alter table addpassenger modify column passport varchar(25) primary key;




create table bookflight(TicketId varchar(16) primary key, Name varchar(20), Source varchar(20), Destination varchar(20), Class varchar(20), Price int, FlighCode int, FlightName varchar(30), JourneyDate date, JourneyTime datetime);


select*from bookflight;
alter table bookflight modify column JourneyTime varchar(10);

create table cancelflight(TicketId varchar(16) primary key, Name varchar(20), Source varchar(20), Destination varchar(20), Class varchar(20), Price int, FlighCode int, FlightName varchar(30), JourneyDate varchar(12), JourneyTime varchar(10));
select*from cancelflight;