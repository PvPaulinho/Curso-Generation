create database db_brecho;

use db_brecho;

create table tb_produtos (
	id bigint auto_increment,
    nome varchar (255),
    cor varchar (255),
    marca varchar (255),
    tamanho int,
    preco decimal (6,2),

	primary key (id)
);

select * from tb_produtos;

insert into tb_produtos (nome, cor, marca, tamanho, preco) values ("Camisa", "Azul", "Adidas", 3, 399.99);
insert into tb_produtos (nome, cor, marca, tamanho, preco) values ("Camisa", "Branco", "Nike", 4, 187.50);
insert into tb_produtos (nome, cor, marca, tamanho, preco) values ("Camisa", "Preto", "Adidas", 3, 45.88);
insert into tb_produtos (nome, cor, marca, tamanho, preco) values ("Calça", "Preto", "Adidas", 42, 87.46);
insert into tb_produtos (nome, cor, marca, tamanho, preco) values ("Calça", "Branco", "Nike", 40, 103.37);
insert into tb_produtos (nome, cor, marca, tamanho, preco) values ("Tenis", "Preto", "Nike", 40, 199.80);
insert into tb_produtos (nome, cor, marca, tamanho, preco) values ("Chinelo", "Branco", "Havaianas", 41, 44.56);
insert into tb_produtos (nome, cor, marca, tamanho, preco) values ("Terno", "Azul", "Desconhecida", 3, 1215.43);

select * from tb_produtos where preco > 50;

select * from tb_produtos where preco < 50;

select * from tb_produtos where id = 2;

update tb_produtos set tamanho = 3 where id = 2;

delete from tb_produtos where id = 2;

delete from tb_produtos where id = 3;