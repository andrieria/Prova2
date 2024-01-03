CREATE TABLE consulta (
    /*Consulta: Que relaciona um Paciente a um Médico, incluindo atributos como id, data da
consulta, diagnóstico e prescrição. */
    id INT AUTO_INCREMENT PRIMARY KEY,
    dataConsulta TIMESTAMP, 
    diagnostico VARCHAR(200),
    prescricao VARCHAR(200),
    paciente_id INT,
    medico_id INT
);