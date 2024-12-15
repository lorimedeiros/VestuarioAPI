package com.vestuario.lori.curso.vestuario;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Veste")
@Table(name = "Vestuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Veste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String marca;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    private String cor;
    private Integer quantidade;
    private Double preco;

}