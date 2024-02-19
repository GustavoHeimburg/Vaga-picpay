create database person;
use person;

create table client(

    id bigint (15) AUTO_INCREMENT not null,
    name varchar (45) unique not null,
    idade int (10) not null,
    senha int (60) unique not null

);