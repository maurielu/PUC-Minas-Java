package br.com.aulas.projeto.service;

import br.com.aulas.projeto.model.Aluno;
import br.com.aulas.projeto.repository.AlunoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AlunoService {
    private AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @Transactional
    public ResponseEntity insert(Aluno aluno) {
        alunoRepository.save(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Transactional
    public List<Aluno> getList() {
        return alunoRepository.findAll();
    }
}
