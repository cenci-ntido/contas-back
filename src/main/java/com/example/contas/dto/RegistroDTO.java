package com.example.contas.dto;


import com.example.contas.dto.generic.GenericDTO;
import com.example.contas.model.enuns.Pessoas;
import com.example.contas.model.enuns.Status;
import com.example.contas.model.enuns.Tipos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistroDTO extends GenericDTO {
    private Long id;
    private String description;
    private Double value;
    private Date dataVencimento;
    private Status status;
    private Pessoas responsavelPagamento;
    private Tipos tipo;
}
