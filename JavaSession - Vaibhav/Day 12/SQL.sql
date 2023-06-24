create database shoppingAPP

use shoppingAPP

create table productlist
(
	pId int primary key,
	pName varchar(20),
	pCategory varchar(20),
	pPrice int,
	pIsInStock bit
)

insert into productlist values(101,'Iphone','Smart-Phone',2200,1)
insert into productlist values(102,'Latte','Smart-Coffee',3,1)
insert into productlist values(103,'Apple Watch','Watch',600,0)
insert into productlist values(104,'Dell lattitude','Electronics',1200,1)
insert into productlist values(105,'Pepsi','Cold-Drink',2,0)

