package br.com.aulas.projeto.controller;

import br.com.aulas.projeto.model.Aluno;
import br.com.aulas.projeto.service.AlunoService;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/aluno", produces = MediaType.APPLICATION_JSON_VALUE)
public class AlunoController {
    private AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    // Receber um objeto JSON [Objeto da Classe Aluno (id, nome)] como parametro de entrada no POST
    // Tratar esse objeto json para atributos nulos, caso tenham atributos nulos retornar o erro adequado
    // Caso tudo esteja ok, retornem um status de CRIADO
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity insert(@RequestBody @Valid Aluno aluno) {
        return alunoService.insert(aluno);
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
