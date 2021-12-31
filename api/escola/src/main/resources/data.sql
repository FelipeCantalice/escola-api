
CREATE TABLE aluno(
    id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome varchar(120) NOT NULL,
    email varchar(80) NOT NULL,
    telefone varchar(12) NOT NULL
);

INSERT INTO aluno(nome, email, telefone) VALUES ('Felipe', 'f@gmail.com', '237484');
INSERT INTO aluno(nome, email, telefone) VALUES ('João', 'j@gmail.com', '64322');
INSERT INTO aluno(nome, email, telefone) VALUES ('Pedro', 'p@gmail.com', '12124');
INSERT INTO aluno(nome, email, telefone) VALUES ('Alto', 'a@gmail.com', '98765');
INSERT INTO aluno(nome, email, telefone) VALUES ('Bety', 'b@gmail.com', '103942');

CREATE TABLE escola(
    id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome varchar(120) NOT NULL
);

INSERT INTO escola(nome) VALUES ('Teste escola');

CREATE TABLE serie(
    id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome varchar(120) NOT NULL
);

INSERT INTO serie(nome) VALUES ('1 ano A');
INSERT INTO serie(nome) VALUES ('1 ano B');
INSERT INTO serie(nome) VALUES ('2 ano A');
INSERT INTO serie(nome) VALUES ('3 ano A');
INSERT INTO serie(nome) VALUES ('3 ano B');
INSERT INTO serie(nome) VALUES ('4 ano A');
INSERT INTO serie(nome) VALUES ('5 ano A');


CREATE TABLE materia(
    id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome varchar(120) NOT NULL
);

INSERT INTO materia(nome) VALUES ('Matemática');
INSERT INTO materia(nome) VALUES ('Fisica');
INSERT INTO materia(nome) VALUES ('Quimica');
INSERT INTO materia(nome) VALUES ('Português');
INSERT INTO materia(nome) VALUES ('Filosofia');
INSERT INTO materia(nome) VALUES ('Sociologia');

CREATE TABLE professor(
    id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome varchar(120) NOT NULL,
    email varchar(80) NOT NULL,
    cpf varchar(12) NOT NULL
);


INSERT INTO professor(nome, email, cpf) VALUES ('Marcos', 'm@gmail.com', '375285939393');
INSERT INTO professor(nome, email, cpf) VALUES ('José', 'j2@gmail.com', '375285939393');
INSERT INTO professor(nome, email, cpf) VALUES ('Abrão', 'a@gmail.com', '375285939393');
INSERT INTO professor(nome, email, cpf) VALUES ('Jarvis', 'j@gmail.com', '375285939393');
INSERT INTO professor(nome, email, cpf) VALUES ('Davi', 'd@gmail.com', '375285939393');
INSERT INTO professor(nome, email, cpf) VALUES ('Navi', 'n@gmail.com', '375285939393');
INSERT INTO professor(nome, email, cpf) VALUES ('Marcos', 'm@gmail.com', '375285939393');

CREATE TABLE sala(
    id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    numero varchar(5) NOT NULL,
    id_serie integer,
    FOREIGN KEY(id_serie) REFERENCES serie(id)
);


INSERT INTO sala(numero) VALUES ('01');
INSERT INTO sala(numero) VALUES ('02');
INSERT INTO sala(numero) VALUES ('03');
INSERT INTO sala(numero) VALUES ('04');
INSERT INTO sala(numero) VALUES ('05');
INSERT INTO sala(numero) VALUES ('06');


CREATE TABLE notas_alunos(
    id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nota INTEGER NOT NULL,
    atividade varchar(80) NOT NULL,
    ano varchar(4) NOT NULL,
    id_aluno integer NOT NULL,
    id_serie integer NOT NULL,
    id_professor integer NOT NULL,
    FOREIGN KEY(id_aluno) REFERENCES aluno(id),
    FOREIGN KEY(id_serie) REFERENCES serie(id),
    FOREIGN KEY(id_professor) REFERENCES professor(id)
);

CREATE TABLE aulas_alunos(
    id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    tempo INTEGER NOT NULL,
    id_sala integer NOT NULL,
    id_materia integer NOT NULL,
    id_professor integer NOT NULL,
    FOREIGN KEY(id_sala) REFERENCES sala(id),
    FOREIGN KEY(id_materia) REFERENCES materia(id),
    FOREIGN KEY(id_professor) REFERENCES professor(id)
);
