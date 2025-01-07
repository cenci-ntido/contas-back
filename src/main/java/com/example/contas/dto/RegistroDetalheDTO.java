package com.example.contas.dto;


import com.example.contas.dto.generic.GenericDTO;
import com.example.contas.model.Registro;
import com.example.contas.model.enuns.Contas;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistroDetalheDTO extends GenericDTO {
    private String descricao;
    private Double valor;
    private Date dataPagamento;
    private Registro registro;
    private Contas conta;
}
