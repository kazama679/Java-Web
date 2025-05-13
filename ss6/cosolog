create database ss6BaiTap;
use ss6BaiTap;

# bài 1
create table books(
    book_id int auto_increment primary key,
    title varchar(255),
    author varchar(100),
    category varchar(100),
    quantity int
);

delimiter //
create procedure add_books(title_in varchar(255), author_in varchar(100), category_in varchar(100), quantity_in int)
begin
    insert into books(title, author, category, quantity)
        values(title_in, author_in, category_in, quantity_in);
end;

create procedure find_all_books()
begin
    select * from books;
end;

create procedure find_by_id(id_in int)
begin
    select * from books
        where book_id = id_in;
end;

create procedure delete_book(id_in int)
begin
    delete from books where book_id = id_in;
end;

create procedure update_book(id_in int, title_in varchar(255), author_in varchar(100), category_in varchar(100), quantity_in int)
begin
    update books
        set title = title_in,
            author = author_in,
            category = category_in,
            quantity = quantity_in
    where book_id = id_in;
end;
delimiter //
# end-bài 1

# bài 2
create table users(
                      user_id int auto_increment primary key,
                   username varchar(255),
                   password varchar(100),
                   email varchar(100),
                   phone varchar(20)
);

delimiter //
create procedure add_users(username_in varchar(255), password_in varchar(100), email_in varchar(100), phone_in varchar(20))
begin
    insert into users(username, password, email, phone)
    values(username_in, password_in, email_in, phone_in);
end;

create procedure find_all_users()
begin
    select * from users;
end;

create procedure find_by_id_user(id_in int)
begin
    select * from users
    where user_id = id_in;
end;
delimiter //
# end-bài 2

# bài 4
create table employees (
                           id int primary key auto_increment,
                           name varchar(100) not null,
                           birthday varchar(20),
                           phone varchar(20),
                           email varchar(100),
                           salary varchar(20),
                           position varchar(50)
);

delimiter //
create procedure add_employee(
    name_in varchar(100),
    birthday_in varchar(20),
    phone_in varchar(20),
    email_in varchar(100),
    salary_in varchar(20),
    position_in varchar(50)
)
begin
    insert into employees(name, birthday, phone, email, salary, position)
    values(name_in, birthday_in, phone_in, email_in, salary_in, position_in);
end //
create procedure find_all_employees()
begin
    select * from employees;
end;

create procedure update_employee(
    id_in int,
    name_in varchar(100),
    birthday_in varchar(20),
    phone_in varchar(20),
    email_in varchar(100),
    salary_in varchar(20),
    position_in varchar(50)
)
begin
    update employees
    set name = name_in,
        birthday = birthday_in,
        phone = phone_in,
        email = email_in,
        salary = salary_in,
        position = position_in
    where id = id_in;
end //

create procedure delete_employee(id_in int)
begin
    delete from employees where id = id_in;
end;
delimiter ;
# end-bài 4

