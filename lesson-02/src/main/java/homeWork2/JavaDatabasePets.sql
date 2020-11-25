drop database  if exists pets;
create database pets char set utf8;
use pets;

create table owner_of_pet(
id int not null primary key auto_increment,
first_name varchar(60) not null,
 last_name varchar(60) not null,
 gender_id int not null default 1,
 age int not null default 1,
 adress text,
 kind_of_pet_id int not null default 1);
 
 create table gender(
 id int not null primary key auto_increment,
 gender varchar (10) not null unique);
 
  alter table owner_of_pet add foreign key (gender_id) references gender(id);
  
  create table pet(
  id int not null primary key auto_increment,
name_of_pet varchar(60) not null,
type_of_pet varchar(40) not null,
gender_id int not null,
age int not null);

 alter table pet add foreign key (gender_id) references gender(id);
 alter table owner_of_pet add foreign key (kind_of_pet_id) references pet(id);
  insert into	gender( gender)  values("male"),("female");
  insert into pet(name_of_pet, type_of_pet, gender_id, age)
	values 
		("Bonya", "Dog",2,3),
        ("Molly", "Dog",2,3);
        
insert into owner_of_pet(first_name, last_name, gender_id, age, adress, kind_of_pet_id)
	values
		("Vova", "Fedorko", 1, 23, "London, dkdjj 12", 1);
  select * from owner_of_pet;
 
