package br.edu.ifrn.prova.dois.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.edu.ifrn.prova.dois.model.Consulta;
import br.edu.ifrn.prova.dois.repository.ConsultaRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("consultas")
public class ConsultaController {
    
    @Autowired
    private ConsultaRepository repository;

    @Transactional
    @PostMapping
    public ResponseEntity<Object> cadastrar(@RequestBody @Valid Consulta consulta, UriComponentsBuilder uriBuilder) {
        Consulta consultaLocal = repository.save(consulta);
        var uri = uriBuilder.path("/consultas/{id}").buildAndExpand(consultaLocal.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<Object> detalhar(@PathVariable Long id) {
        var consulta = repository.getConsultaById(id);
        return ResponseEntity.ok(consulta);
    }

    @GetMapping
    public ResponseEntity<Page<Consulta>> listar(@PageableDefault(size = 4, sort = { "diagnostico" }) Pageable paginacao) {
        var consultas = repository.findAll(paginacao);
        return ResponseEntity.ok(consultas);
    }

    
}
