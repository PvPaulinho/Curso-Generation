create database db_rh;

create table tb_funcionarios (
	id bigint auto_increment,
    nome varchar (255),
    idade int,
    salario decimal (7,2),
    funcao varchar (255),
    anoAdimicao int,
    
    primary key (id)
);

select * from tb_funcionarios;

insert into tb_funcionarios (nome, idade, salario, funcao, anoAdimicao) Values ("Paulo", 27, 4800.56, "Programador", 2020);
insert into tb_funcionarios (nome, idade, salario, funcao, anoAdimicao) Values ("Victor", 28, 15678.94, "PO", 2022);
insert into tb_funcionarios (nome, idade, salario, funcao, anoAdimicao) Values ("Luis", 26, 1923.45, "Vendedor", 2020);
insert into tb_funcionarios (nome, idade, salario, funcao, anoAdimicao) Values ("Felipe", 27, 5432.10, "Gerente", 2022);
insert into tb_funcionarios (nome, idade, salario, funcao, anoAdimicao) Values ("Gabriel", 18, 1200.54, "Auxiliar", 2022);

select * from tb_funcionarios where salario > 2000;

select * from tb_funcionarios where salario < 2000;

update tb_funcionarios set salario = 1876.54 where id =  3;