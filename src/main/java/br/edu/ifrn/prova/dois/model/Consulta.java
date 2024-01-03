package br.edu.ifrn.prova.dois.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    
    @Column(name="data_consulta")
    /*@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")*/
    private String dataConsulta;

    private String diagnostico;
    private String prescricao;

    @ManyToOne
    @JoinColumn(name="paciente_id")
    private Paciente paciente;
 
    @ManyToOne
    @JoinColumn(name="medico_id")
    private Medico medico;
}
