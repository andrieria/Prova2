CREATE TABLE paciente (
    /*Paciente: Com atributos como id, nome, CPF e histórico médico. */
    id INT AUTO_INCREMENT PRIMARY KEY, 
    nome VARCHAR(300),
    cpf VARCHAR (14),
    historicoMedico VARCHAR(800)
);