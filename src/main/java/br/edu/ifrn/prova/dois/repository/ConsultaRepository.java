package br.edu.ifrn.prova.dois.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifrn.prova.dois.model.Consulta;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long>{
    
}
