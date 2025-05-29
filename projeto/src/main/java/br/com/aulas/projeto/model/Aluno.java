package br.com.aulas.projeto.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Aluno {
    @NotNull
    private Long id;

    @NotBlank
    private String nome;
}
