package br.edu.ifrn.prova.dois.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifrn.prova.dois.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{
    
}
