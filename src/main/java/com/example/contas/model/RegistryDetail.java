package com.example.contas.model;


import com.example.contas.model.enuns.AccountsEnum;
import com.example.contas.model.enuns.StatusEnum;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "registry_detail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegistryDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "registry", referencedColumnName = "id")
    private Registry registry;

    @Column(length = 50, nullable = false)
    private String description;

    @Column( nullable = false)
    private Double value;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private AccountsEnum account;
}
