use JeffersonvilleFootball;


Create TABLE Users (
	id int primary key auto_increment,
    user_serial varchar(20) unique, 
    firstName varchar(20),
    lastName varchar(40),
    userName varchar(20),
    password varchar(20),
    email varchar(30)
    
);
CREATE TABLE Items (
	id int primary key auto_increment,
    item_serial varchar(40) unique,
    category_id int,
    title varchar(40),
    size varchar(20),
    price decimal,
    description varchar(255)
);
CREATE TABLE Images (
	id int primary key auto_increment,
    originalName varchar(50),
    fileName varchar(50),
    category_id varchar(20),
    size varchar(30),
    extension varchar(100)
    
);
CREATE TABLE Orders (
	id int primary key auto_increment,
    order_serial varchar(20) unique,
    userId int not null,
    status int,
    totalPrice decimal(2)
    
);
CREATE TABLE Roles (
	id int primary key auto_increment,
    type varchar(30)
    
);

CREATE TABLE Categories (
	id int primary key auto_increment,
    type varchar(40)
   
);
CREATE TABLE Addresses (
	id int primary key auto_increment,
    userId int not null,
    street varchar(100),
    city varchar(40),
    state varchar(2),
    zip varchar(10),
    country varchar(100),
    phoneNumber varchar(15)
);
CREATE TABLE Inventory (
	id int primary key auto_increment,
    itemId int not null,
    imageId int not null,
    quanity int,
    sold int
    
);

CREATE TABLE Permissions (
	id int primary key auto_increment,
    userId int not null,
    roleId int not null
    
);



CREATE TABLE OrderSummary (
	id int primary key auto_increment,
    orderId int not null,
    userId int not null,
    itemId int not null,
    quanity int not null,
    pricePerItem decimal(2)
    
);



