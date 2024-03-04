package br.com.instituicao.alunocurso.controller;

import br.com.instituicao.alunocurso.model.CursoModel;
import br.com.instituicao.alunocurso.service.AlunoService;
import br.com.instituicao.alunocurso.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cursos")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<CursoModel> get() {
        return cursoService.buscarTodos();
    }

    @PostMapping
    public CursoModel post(@RequestBody CursoModel curso) throws Exception {
        return cursoService.salvar(curso);
    }
}