package br.com.aulas.projeto.service;

import br.com.aulas.projeto.model.Aluno;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PublicService {
    List<Aluno> alunoList = new ArrayList<>();

    public ResponseEntity insert(Aluno aluno) {
        alunoList.add(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
