package com.example.contas.model;


import com.example.contas.model.enuns.Contas;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;


@Entity
@Table(name = "registro_detalhe")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegistroDetalhe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "registro", referencedColumnName = "id")
    private Registro registro;

    @Column(length = 50, nullable = false)
    private String descricao;

    @Column( nullable = false)
    private Double valor;

    @Column( nullable = false)
    private Date dataPagamento;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Contas conta;
}
