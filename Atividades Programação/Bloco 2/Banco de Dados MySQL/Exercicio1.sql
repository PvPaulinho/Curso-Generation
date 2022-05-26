create database db_generation_game_online;

use db_generation_game_online;

create table tb_classes (
	id bigint auto_increment,
    nome_classe varchar (255),
    arma varchar (255),
    
    primary key (id)
);

create table tb_personagens (
	id bigint auto_increment,
    nome varchar (255),
    lvl int,
    poder decimal,
    classe_id bigint default null,
    
    primary key (id),
    foreign key (classe_id) references tb_classes (id)
);

alter table tb_personagens;
-- Foi feito a alteração de pode decimal para 8.2, de forma manual

select * from tb_classes;
select * from tb_personagens;

insert into tb_classes (nome_classe, arma) Values ("Taoista", "orbe");
insert into tb_classes (nome_classe, arma) Values ("Maga", "Cajado");
insert into tb_classes (nome_classe, arma) Values ("Assacino", "Adaga");
insert into tb_classes (nome_classe, arma) Values ("Arqueira", "Arco");
insert into tb_classes (nome_classe, arma) Values ("Monge", "Bastão");

insert into tb_personagens (nome, lvl, poder, classe_id) Values ("Paulo", 5, 1876, 1);
insert into tb_personagens (nome, lvl, poder, classe_id) Values ("Victor", 62, 70123.45, 3);
insert into tb_personagens (nome, lvl, poder, classe_id) Values ("PauloCine", 81, 107456.78, 1);
insert into tb_personagens (nome, lvl, poder, classe_id) Values ("PV", 48, 50000.32, 3);
insert into tb_personagens (nome, lvl, poder, classe_id) Values ("Batatinha", 150, 186975.13, 2);
insert into tb_personagens (nome, lvl, poder, classe_id) Values ("PvBatatinha", 127, 150321.08, 2);
insert into tb_personagens (nome, lvl, poder, classe_id) Values ("Porão", 150, 199875.64, 4);
insert into tb_personagens (nome, lvl, poder, classe_id) Values ("PvPorão", 94,118544.12 , 3);

select * from tb_personagens where poder > 2000.00;
select * from tb_personagens where poder > 1000.00 and poder < 2000;
select * from tb_personagens where nome like "%c%" ;

select nome, lvl, poder, nome_classe, arma from tb_personagens inner join tb_classes on tb_classes.id = tb_personagens.classe_id;

select nome, lvl, poder, nome_classe, arma from tb_personagens inner join tb_classes on tb_classes.id = tb_personagens.classe_id where tb_classes.nome_classe = "Taoista";
