create database person-db;
use person-db;

create table person (
emplid bigint auto_increment,
first_name varchar(255), 
last_name varchar(255),
primary key (emplid)
);