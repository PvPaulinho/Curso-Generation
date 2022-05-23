create database db_escola;

use db_escola;

create table tb_escola (
	id bigint auto_increment,
    nome varchar(255),
    idade decimal(10,2),
    serie int,
    turma varchar (255),
    nota decimal (5,2),
    
    primary key (id)
);

select*from tb_escola;

insert into tb_escola (nome, idade, serie, turma, nota) values ("Paulo", 27, 8, "A", 6.0);
insert into tb_escola (nome, idade, serie, turma, nota) values ("Victor", 28, 7, "B", 10);
insert into tb_escola (nome, idade, serie, turma, nota) values ("Luis", 26, 8, "A", 8.5);
insert into tb_escola (nome, idade, serie, turma, nota) values ("Felipe", 27, 7, "B", 6.3);
insert into tb_escola (nome, idade, serie, turma, nota) values ("Gabriel", 18, 8, "C", 3.2);
insert into tb_escola (nome, idade, serie, turma, nota) values ("Augusto", 19, 7, "C", 4.9);
insert into tb_escola (nome, idade, serie, turma, nota) values ("Francine", 25, 8, "A", 9.3);
insert into tb_escola (nome, idade, serie, turma, nota) values ("Cine", 24, 7, "B", 7.6);

select*from tb_escola where nota > 7.0;

select*from tb_escola where nota < 7.0;

update tb_escola set nota = 7.8 where id =  1;
