package br.com.instituicao.alunocurso.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
public class CursoModel {

    private static Integer proximoId = 1;
    @Getter private static List<CursoModel> cursos = new ArrayList<>();
    
    @Setter(AccessLevel.NONE) private Integer id;
    private String nome;
    private String descricao;
    private Integer cargaHoraria;

    private Integer getProximoId() {
        return proximoId++;
    }

    public static CursoModel adicionar(CursoModel curso) {
        curso.getProximoId();
        cursos.add(curso);
        return curso;
    }
}
