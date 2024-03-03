package br.com.instituicao.alunocurso.service;

import br.com.instituicao.alunocurso.model.CursoModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    public List<CursoModel> buscarTodos() {
        return CursoModel.getCursos();

    }

    public CursoModel salvar(CursoModel curso) throws Exception {
        if (validar(curso)) {
            return CursoModel.adicionar(curso);
        }
        return null;
    }

    private boolean validar(CursoModel curso) throws Exception {
        if (curso.getNome() == null || curso.getNome().isBlank()) {
            throw new Exception("Nome é obrigatório!");
        }

        if(curso.getCargaHoraria() == null) {
            throw new Exception("Carga Horaria é obrigatório!")
        }

        return true;
    }

}
