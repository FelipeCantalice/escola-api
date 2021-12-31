# escola-api

    Implementação de uma API RESTful para a escola.	

## Entidades

* Escola (id, nome)
* Serie (id, nome)
* Salas (id, numero, serieId)
* Materias (id, nome)
* Professor (id, nome, cpf, email)
* Aluno (id, nome, email, telefone)


- ProfessorLeciona(id, idProfessor, idMateria)
- AulasAlunos (id, tempo, diaDaSemana, idSala, idMateria, idProfessor)
- Notas dos alunos (id, nota, aluno, atividade, ano)

## Relacionamentos

* Uma escola pode ter 1 ou mais series
* Uma serie precisa de 1 sala para dar aulas
* Toda aula, precisa de 1 uma matéira e um professor que atue naquela área.