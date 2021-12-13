--users table
create table users(user_id int primary key not null,user_firstname varchar(32) not null,user_lastname varchar2(32) not null,phonenumber int not null,
email varchar2(40) UNIQUE not null,address varchar(100) not null,wallet int not null ,password varchar2(32) not null);  
select * from users;

--admins table
create table admins(admin_id int primary key not null,admin_name varchar2(32) not null,password varchar2(12) not null);
select * from admins;

--products table
create table products(product_id int primary key not null,product_name varchar2(32) not null,product_size varchar2(32) not null,
price int not null );  
select * from products;

--order_items table
create table orders_items(item_id int primary key not null,product_id int not null,quantity int not null,unit_price int not null, 
FOREIGN KEY (product_id) REFERENCES products(product_id));
select * from orders_items;
drop table orders_items;

--order table 
create table orders(order_id int primary key not null,user_id int not null,item_id int not null,status varchar2(15) not null,employee_id varchar2(32) not null,
order_date date not null,foreign key(item_id) references orders_items(item_id));
select * from orders;

--cart
create table cart(cart_id int not null,user_id int not null,product_id int not null,
FOREIGN key (user_id) REFERENCES users(user_id),FOREIGN key (product_id) REFERENCES products(product_id));
select * from cart;

--invoice bill
create table bill(bill_id int primary key not null,user_id int not null,product_id int not null,quantity int not null,
total_amount int not null,purchase_date date not null,FOREIGN key(user_id) REFERENCES users(user_id),FOREIGN key (product_id) REFERENCES products(product_id)); 
select * from bill;
