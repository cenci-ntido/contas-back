package com.example.contas.model;

import com.example.contas.model.enuns.PeopleEnum;
import com.example.contas.model.enuns.StatusEnum;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "registry")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Registry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String period;

    @Column(length = 50, nullable = false)
    private String description;

    @Column( nullable = false)
    private Double value;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusEnum status;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PeopleEnum person;
}
