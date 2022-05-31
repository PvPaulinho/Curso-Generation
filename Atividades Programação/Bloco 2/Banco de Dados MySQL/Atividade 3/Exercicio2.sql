create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categorias (
	id bigint auto_increment,
    nome_categoria varchar(255),
    meio_a_meio boolean,
    
    primary key (id)
);

create table tb_pizzas (
	id bigint auto_increment,
    nome varchar(255),
    preco decimal (4,2),
    borda boolean,
    acrescimo varchar(255),
    categoria_id bigint,
    
    primary key (id),
    foreign key (categoria_id) REFERENCES tb_categorias(id)
);

select * from tb_pizzas;
select * from tb_categorias;

INSERT INTO tb_categorias(nome_categoria, meio_a_meio) VALUES ("Salgada", false);
INSERT INTO tb_categorias(nome_categoria, meio_a_meio) VALUES ("Doce", false);
INSERT INTO tb_categorias(nome_categoria, meio_a_meio) VALUES ("Doce", true);
INSERT INTO tb_categorias(nome_categoria, meio_a_meio) VALUES ("Especial", false);
INSERT INTO tb_categorias(nome_categoria, meio_a_meio) VALUES ("Salgada", false);

INSERT INTO tb_pizzas(nome, preco, borda, acrescimo, categoria_id) VALUES ("Frango", 40.50, true, "bacon", 1);
INSERT INTO tb_pizzas(nome, preco, borda, acrescimo, categoria_id) VALUES ("Milho com Bacon", 46.99, true, "Sem acréscimo", 1);
INSERT INTO tb_pizzas(nome, preco, borda, acrescimo, categoria_id) VALUES ("Titoe", 55.89, true, "bacon", 4);
INSERT INTO tb_pizzas(nome, preco, borda, acrescimo, categoria_id) VALUES ("Marguerita", 40.49, true, "sem acréscimo", 1);
INSERT INTO tb_pizzas(nome, preco, borda, acrescimo, categoria_id) VALUES ("Brigadeiro", 58.71, true, "sem acréscimo", 2);
INSERT INTO tb_pizzas(nome, preco, borda, acrescimo, categoria_id) VALUES ("Chocolate", 54.89, true, "coco", 2);
INSERT INTO tb_pizzas(nome, preco, borda, acrescimo, categoria_id) VALUES ("Moda", 45.99, true, "bacon", 1);
INSERT INTO tb_pizzas(nome, preco, borda, acrescimo, categoria_id) VALUES ("Lombinho", 43.45, true, "cheddar", 1);

SELECT * from tb_pizzas where preco > 45.00;
SELECT * from tb_pizzas where preco > 50.00 and preco < 100.00;

SELECT * from tb_pizzas where nome LIKE "%M%";

SELECT * FROM tb_pizzas INNER JOIN tb_categorias ON tb_categorias.id = tb_pizzas.categoria_id;

SELECT * FROM tb_pizzas INNER JOIN tb_categorias ON tb_categorias.id = tb_pizzas.categoria_id where tb_categorias.nome_categoria = "Salgada";
