package com.example.contas.dto;


import com.example.contas.dto.generic.GenericDTO;
import com.example.contas.model.Registry;
import com.example.contas.model.enuns.AccountsEnum;
import com.example.contas.model.enuns.PeopleEnum;
import com.example.contas.model.enuns.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistryDetailDTO extends GenericDTO {

    private String description;

    private Double value;

    private Registry registry;

    private AccountsEnum account;
}
