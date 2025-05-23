package com.example.pedidobackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@ToString
@Table(name = "cliente")
public class Cliente extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long id;

    @Column(name = "ape_paterno", length = 50)
    private String apePaterno;

    @Column(name = "ape_materno", length = 50)
    private String apeMaterno;

    @Column(name = "nombres", length = 50)
    private String nombres;

    @Column(name = "tipo_documento", length = 50)
    private String tipoDocumento;

    @Column(name = "numero_documento", length = 50)
    private String numeroDocumento;

    @Column(name = "numero_celular", length = 50)
    private String numeroCelular;

    @Column(name = "direccion", length = 50)
    private String direccion;

    @Column(name = "correo_electronico", length = 50)
    private String correoElectronico;


}
