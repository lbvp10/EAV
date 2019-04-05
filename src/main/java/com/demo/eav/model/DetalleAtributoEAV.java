package com.demo.eav.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.Data;


@Entity
@Data
public class DetalleAtributoEAV {



    @Id
    @Column(unique = true, nullable = false)
    @SequenceGenerator(name = "detalle_atributo_id_generator", sequenceName = "detalle_atributo_id_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "detalle_atributo_id_generator")
    private Long id;

    @ManyToOne
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "tipo_base_id")
    private EntidadEAV tipoBase;

    @ManyToOne
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "atributo_tipo_base_id")
    private AtributoEAV atributoTipoBase;

    private String valor;

    private Long tupla;

  

}
