create database pokéworld;
use pokéworld;

create table pokédex (
    número int not null primary key,
    nome varchar(255),
    tipos varchar(255),
    evolução varchar(255),
    pré_evolução varchar(255),
    região varchar(255)
);