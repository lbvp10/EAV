package com.demo.eav.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;



/**
 * Entity implementation class for Entity: AtributoTipBase
 *
 */
@Entity
@Data
public class AtributoEAV {

    @Id
    @Column(unique=true, nullable=false)
    @SequenceGenerator(name = "atributo_eav_id_generator", sequenceName = "atributo_eav_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "atributo_eav_id_generator")
    private Long id;

    private String nombre;
    

    private String tipoDato;
    
    @Column(nullable=true)
    private Boolean activo;
    
    @Column(nullable=true)
    private Boolean protegido;
    
   
}
