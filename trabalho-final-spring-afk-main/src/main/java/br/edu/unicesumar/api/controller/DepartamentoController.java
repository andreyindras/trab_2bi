package br.edu.unicesumar.api.controller;

import br.edu.unicesumar.api.dto.DepartamentoRelatorioDTO;
import br.edu.unicesumar.api.entity.Departamento;
import br.edu.unicesumar.api.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoService;

    @GetMapping
    public ResponseEntity<List<Departamento>> listarDepartamentos() {
        List<Departamento> departamentos = departamentoService.listarTodos();
        return ResponseEntity.ok(departamentos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Departamento> buscarDepartamento(@PathVariable Long id) {
        Departamento departamento = departamentoService.buscarPorId(id);
        return ResponseEntity.ok(departamento);
    }

    @PostMapping
    public ResponseEntity<Departamento> criarDepartamento(@RequestBody Departamento departamento) {
        Departamento novoDepartamento = departamentoService.criar(departamento);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoDepartamento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Departamento> atualizarDepartamento(@PathVariable Long id, @RequestBody Departamento departamento) {
        Departamento departamentoAtualizado = departamentoService.atualizar(id, departamento);
        return ResponseEntity.ok(departamentoAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarDepartamento(@PathVariable Long id) {
        departamentoService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}/report")
    public ResponseEntity<DepartamentoRelatorioDTO> gerarRelatorio(@PathVariable Long id) {
        DepartamentoRelatorioDTO relatorio = departamentoService.gerarRelatorio(id);
        return ResponseEntity.ok(relatorio);
    }
}