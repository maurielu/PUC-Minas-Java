package br.com.aulas.projeto.controller;

import br.com.aulas.projeto.model.Aluno;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/public", produces = MediaType.APPLICATION_JSON_VALUE)
public class PublicController {
    List<Aluno> alunoList = new ArrayList<>();

    // Receber um objeto JSON [Objeto da Classe Aluno (id, nome)] como parametro de entrada no POST
    // Tratar esse objeto json para atributos nulos, caso tenham atributos nulos retornar o erro adequado
    // Caso tudo esteja ok, retornem um status de CRIADO
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity insert(@RequestBody @Validated Aluno aluno) {
        alunoList.add(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    // GET retornar uma Lista de Objetos da Classe Aluno (id, nome) 2 ou mais registros
    // retornar OK

    // PATH as mesmas validações do POST
    // retornar OK

    // DELETE receber como parametro um parametro ID na url
    // caso não parametro não informado, retornar bad request
    // caso o parametro exista, vcs vão retornar o status code adequado.


    // essa lista em questão precisa ser uma lista fixa no codigo java.
    // o delete vai remover dessa lista
    // o post vai incrementar nessa lista
    // o path vai editar o registro caso exista na lista
}
