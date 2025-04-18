drop database if exists projetojava;

create database projetojava;
use projetojava;

CREATE TABLE usuario (
id bigint(10) auto_increment primary key,
nome varchar(255),
cpf varchar(255),
email varchar(255),
telefone varchar(255),

endereco varchar(255),
sexo varchar(255),
habilitado enum("Sim","Não"),
RG varchar(255)
);

select * from usuario;