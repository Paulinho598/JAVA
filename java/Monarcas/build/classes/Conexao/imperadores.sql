drop database if exists líderes;

-- Banco
create database líderes character set utf8mb4 collate utf8mb4_unicode_ci;
use líderes;


-- Tabela 1
create table imp_alemão(
id int not null auto_increment primary key,
nome varchar(255),
nascimento date,
morte date null,
idade int
)character set utf8mb4 collate utf8mb4_unicode_ci;

-- Tabela 2
create table imp_brasileiro(
id int not null auto_increment primary key,
nome varchar(255),
nascimento date,
morte date null,
idade int
)character set utf8mb4 collate utf8mb4_unicode_ci;

create table imp_austriacos(
id int not null auto_increment primary key,
nome varchar(255),
nascimento date,
morte date null,
idade int
);

-- Dados Inseridos

insert into imp_alemão(nome,nascimento,morte)
values
('Guilherme I','1797-03-22','1888-03-09'),
('Frederico III','1831-10-18','1888-06-18'),
('Guilherme II','1859-01-27','1941-06-03');

insert into imp_brasileiro(nome,nascimento,morte)
values
('Pedro I','1798-10-12','1834-09-24'),
('Pedro II','1825-12-02','1891-12-05');

insert into imp_austriacos(nome,nascimento,morte)
values
('Franciso I','1768-02-12','1835-03-02'),
('Fernando I','1793-04-19','1875-06-29'),
('Francisco José I','1830-08-18','1916-11-21'),
('Carlos I','1887-08-17','1922-04-01');

-- Seletores

select * from imp_alemão;
select * from imp_brasileiro;
select * from imp_austriacos;