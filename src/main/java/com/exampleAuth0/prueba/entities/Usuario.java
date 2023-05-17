package com.exampleAuth0.prueba.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Usuario extends Base {
    @Column(name = "usuario", nullable = false)
    private String usuario;

    @Column(name = "clave", nullable = false)
    private String clave;

    @Column(name = "rol", nullable = false)
    private String rol;
}