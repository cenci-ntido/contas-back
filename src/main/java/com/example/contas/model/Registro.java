package com.example.contas.model;

import com.example.contas.model.enuns.Pessoas;
import com.example.contas.model.enuns.Status;
import com.example.contas.model.enuns.Tipos;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;


@Entity
@Table(name = "registro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String description;

    @Column( nullable = false)
    private Double value;

    @Column(nullable = false)
    private Date dataVencimento;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Pessoas responsavelPagamento;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Tipos tipo;
}
