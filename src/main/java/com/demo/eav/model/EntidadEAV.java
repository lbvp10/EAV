package com.demo.eav.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;



@Entity
@Table(name = "entidad_eav")
@Data
public class EntidadEAV  {

    @Id
    @Column(unique = true, nullable = false)
    @SequenceGenerator(name = "tipos_base_id_generator", sequenceName = "tipos_base_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipos_base_id_generator")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(nullable = true)
    private Boolean activo;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "entidad_eav_id")
    private List<AtributoEAV> atributos = new ArrayList<>();

    @Column(nullable = true)
    private Boolean protegido;

   
}
