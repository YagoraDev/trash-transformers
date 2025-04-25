INSERT INTO tb_aluno (nome, matricula, turma, turno, semestre) VALUES ('Ana Clara Martins', 20230001, 'A1', 'Manhã', 1);
INSERT INTO tb_aluno (nome, matricula, turma, turno, semestre) VALUES ('Bruno Henrique Lopes', 20230002, 'B2', 'Tarde', 2);
INSERT INTO tb_aluno (nome, matricula, turma, turno, semestre) VALUES ('Camila Torres Silva', 20230003, 'C3', 'Noite', 3);
INSERT INTO tb_aluno (nome, matricula, turma, turno, semestre) VALUES ('Diego Ramos Costa', 20230004, 'D1', 'Manhã', 1);
INSERT INTO tb_aluno (nome, matricula, turma, turno, semestre) VALUES ('Eduarda Lima Faria', 20230005, 'E2', 'Tarde', 4);

INSERT INTO tb_curso (nome_curso) VALUES ('Engenharia de Software');
INSERT INTO tb_curso (nome_curso) VALUES ('Direito');
INSERT INTO tb_curso (nome_curso) VALUES ('Medicina');
INSERT INTO tb_curso (nome_curso) VALUES ('Arquitetura');

INSERT INTO tb_entrega (data_hora) VALUES ('2025-04-24 15:45:00');
INSERT INTO tb_entrega (data_hora) VALUES ('2025-04-25 09:00:00');
INSERT INTO tb_entrega (data_hora) VALUES ('2025-04-26 20:30:00');

INSERT INTO tb_item_Entrega (quantidade_kg) VALUES (5);
INSERT INTO tb_item_Entrega (quantidade_kg) VALUES (12);
INSERT INTO tb_item_Entrega (quantidade_kg) VALUES (8);

INSERT INTO tb_residuo (nome_residuo) VALUES ('Papel');
INSERT INTO tb_residuo (nome_residuo) VALUES ('Plástico');
INSERT INTO tb_residuo (nome_residuo) VALUES ('Vidro');

INSERT INTO tb_unidade (nome_unidade) VALUES ('Kg');
INSERT INTO tb_unidade (nome_unidade) VALUES ('Litro');
INSERT INTO tb_unidade (nome_unidade) VALUES ('Unidade');

INSERT INTO tb_usuario (email, senha) VALUES ('usuario1@example.com', 'senha123');
INSERT INTO tb_usuario (email, senha) VALUES ('usuario2@example.com', 'senha456');
INSERT INTO tb_usuario (email, senha) VALUES ('usuario3@example.com', 'senha789');
