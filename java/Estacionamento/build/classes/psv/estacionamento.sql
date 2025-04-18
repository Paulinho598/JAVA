create database estacionamento;

use estacionamento;

create table carro(
placa char(255) not null,
cor varchar(255),
descricao varchar(255) primary key
);