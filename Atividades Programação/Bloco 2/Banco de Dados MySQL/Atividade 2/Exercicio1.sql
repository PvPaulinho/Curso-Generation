create database db_quitandaGeneration;

use db_quitandaGeneration;

create table tb_produtos(
	id bigint auto_increment,
    nome varchar (255),
    preco decimal (4,2),
    tipo varchar (255),
    promocao boolean,
    tipoDeVenda varchar (255),
    
    primary key (id)
);

select * from tb_produtos;

insert into tb_produtos (nome, preco, tipo, promocao, tipoDeVenda) values ("Maça", 10.17, "Fruta", false, "Kg");
insert into tb_produtos (nome, preco, tipo, promocao, tipoDeVenda) values ("Peira", 6.42, "Fruta", false, "Kg");
insert into tb_produtos (nome, preco, tipo, promocao, tipoDeVenda) values ("Morango", 4.61, "Fruta", true, "caixa");
insert into tb_produtos (nome, preco, tipo, promocao, tipoDeVenda) values ("Tomate", 12.65, "Legume", false, "caixa");
insert into tb_produtos (nome, preco, tipo, promocao, tipoDeVenda) values ("Alface", 3.12, "Verdura", false, "unidade");
insert into tb_produtos (nome, preco, tipo, promocao, tipoDeVenda) values ("Cenoura", 8.75, "Verdura", true, "Kg");
insert into tb_produtos (nome, preco, tipo, promocao, tipoDeVenda) values ("Quiabo", 9.37, "Legumes", true, "uniade");
insert into tb_produtos (nome, preco, tipo, promocao, tipoDeVenda) values ("mamão", 5.81, "Fruta", false, "Kg");

select * from tb_produtos where tipo = "Fruta";

select * from tb_produtos where tipo = "Legume";

update tb_produtos set tipo = "Legume" where id = 7;

set sql_safe_updates = 0;

delete from tb_produtos where tipo = "Verdura";

set sql_safe_updates = 1;