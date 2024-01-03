package br.edu.ifrn.prova.dois.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name="paciente")
@Data
@EqualsAndHashCode(of = "id")


public class Paciente {
    /*Paciente: Com atributos como id, nome, CPF e histórico médico. */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    @Column(name="historico_medico")
    private String historicoMedico;

    @OneToMany(mappedBy = "paciente")
    private List<Consulta> consultas;
}
