package br.edu.ifrn.prova.dois.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name="consulta")
@Data
@EqualsAndHashCode(of = "id")

public class Consulta {
    /*Consulta: Que relaciona um Paciente a um Médico, incluindo atributos como id, data da
consulta, diagnóstico e prescrição. */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
    private String dataConsulta;

    private String diagnostico;
    private String prescricao;

    private int paciente_id;
    private int medico_id;
}
