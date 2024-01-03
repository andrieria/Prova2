package br.edu.ifrn.prova.dois.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name="medico")
@Data
@EqualsAndHashCode(of="id")

public class Medico {

    /* Médico: Com atributos como id, nome, especialidade e CRM.*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String especialidade;
    private String crm; 

    /*@OneToMany(mappedBy = "medico")
    private Consulta consulta; */

    @OneToMany(mappedBy = "medico")
    private List<Consulta> consultas;

    
}
