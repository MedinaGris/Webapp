package unsis.edu.mx.webApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity//permite que esta clase se traduce a tabla en base de datos
@Table(name = "materia")//renombrar la tabka en la base de datos
@Data //getter y setter 

@NoArgsConstructor  
@AllArgsConstructor
public  class Materia {
	@Id//llave primaria de la bd
	@GeneratedValue(strategy=GenerationType.IDENTITY)//serial
	@Column(name="id")//asi esta nombrado en la base 	
	private long idMateria;
	@Column(name="codigo",length=4,nullable=true)
	private String codigo;
	@Column(name="nombre",length=100,nullable=true)
	private String nombre;
	@Column(name="parcial1",nullable=true)
	private double parcial1;
	@Column(name="parcial2",nullable=true)
	private double parcial2;
	@Column(name="parcial3",nullable=true)
	private double parcial3;
	@Column(name="promedio",nullable=true)
	private double promedio;
}

//TERMINAR CLASE CON 	 Y AGREGAR LOMBOK