create database db_ecommerce;

use db_ecommerce;

create table tb_produtos (
	id bigint auto_increment,
    nome varchar(255), -- Equivale ao Spring
    valor decimal(10,2), -- Equivale ao double
    marca varchar (255),
    quantidade int,
    cor varchar(255),
    categoria varchar(255),
    
    primary key (id)
);

select*from tb_produtos;

insert into tb_produtos (nome, valor, marca, quantidade, cor, categoria) values ("Camisa", 19.99, "Nike", 5, "Vermelho", "Vestuario");
insert into tb_produtos (nome, valor, marca, quantidade, cor, categoria) values ("Calça", 49.99, "Nike", 5, "Vermelho", "Vestuario");
insert into tb_produtos (nome, valor, marca, quantidade, cor, categoria) values ("Camisa", 9.99, "Adidas", 10, "Preto", "Vestuario");
insert into tb_produtos (nome, valor, marca, quantidade, cor, categoria) values ("Calça", 29.99, "Adidas", 10, "Preto", "Vestuario");
insert into tb_produtos (nome, valor, marca, quantidade, cor, categoria) values ("Bermuda", 15.99, "Nike", 15, "Vermelho", "Vestuario");
insert into tb_produtos (nome, valor, marca, quantidade, cor, categoria) values ("Bermuda", 12.99, "Adidas", 20, "Preto", "Vestuario");
insert into tb_produtos (nome, valor, marca, quantidade, cor, categoria) values ("Bola de futbol", 518.99, "Nike", 3, "Branco", "Esporte");
insert into tb_produtos (nome, valor, marca, quantidade, cor, categoria) values ("Bola de futbol", 529.99, "Adidas", 1, "Preto", "Esporte");

select*from tb_produtos where valor > 500;

select*from tb_produtos where valor < 500;

update tb_produtos set nome = "Skate" where id =  8;