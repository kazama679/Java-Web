create database ss9Java;
use ss9Java;

create table customer(
    id int auto_increment primary key,
    username varchar(200),
    password varchar(200),
    phone varchar(20),
    address varchar(20),
    gender varchar(20),
    email varchar(20)
);

delimiter //
create procedure find_all_customer()
begin
    select * from customer;
end //
delimiter //

create table movie(
                         id int auto_increment primary key,
                         title varchar(200),
                         director varchar(200),
                         genre varchar(200),
                         description varchar(200),
                         duration varchar(200),
                         language varchar(200)
);

delimiter //
create procedure find_all_movie()
begin
    select * from movie;
end //

create procedure find_by_id_movie(id_in int)
begin
    select * from movie where id = id_in;
end ;
delimiter //


create table screenroom(
                      id int auto_increment primary key,
                      screenRoomName varchar(200),
                      totalSeat int
);

delimiter //
create procedure find_all_screenroom()
begin
    select * from screenroom;
end //

create table schedule(
                      id int auto_increment primary key,
                      movieId int,
                      showTime varchar(200),
                      screenRoomId int,
                      availableSeats int,
                      format varchar(200),
    foreign key (movieId) references movie(id),
    foreign key (screenRoomId) references screenroom(id)
);

delimiter //
create procedure find_all_schedule()
begin
    select * from schedule;
end //
