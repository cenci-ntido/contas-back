package com.example.contas.dto;


import com.example.contas.dto.generic.GenericDTO;
import com.example.contas.model.enuns.PeopleEnum;
import com.example.contas.model.enuns.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistryDTO extends GenericDTO {

    private String period;

    private String description;

    private Double value;

    private StatusEnum status;

    private PeopleEnum person;
}
